/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Feature;
import model.Lecturer;
import model.Role;
import model.Student;

/**
 *
 * @author admin
 */
public class AccountDBContext extends DBContext<Account> {

    public Account getAccount(String user, String password) {

        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT a.[user],\n"
                    + "	   r.role_id, r.role_name,\n"
                    + "	   f.feature_id, f.feature_name, f.[url],\n"
                    + "	   s.student_id, s.student_code,\n"
                    + "	   lec.lecturer_id, lec.lecturer_code\n"
                    + "FROM Account a LEFT JOIN Role_Account ra ON a.[user] = ra.[user]\n"
                    + "			   LEFT JOIN [Role] r ON r.role_id = ra.role_id\n"
                    + "			   LEFT JOIN Role_Feature rf ON rf.role_id = r.role_id\n"
                    + "			   LEFT JOIN Feature f ON f.feature_id = rf.feature_id\n"
                    + "			   LEFT JOIN Student s ON s.student_code = a.[user]\n"
                    + "			   LEFT JOIN Lecturer lec ON lec.lecturer_code = a.[user]\n"
                    + "			   WHERE a.[user] = ? AND a.[password] = ? ";
            stm = connection.prepareStatement(sql);
            stm.setString(1, user);
            stm.setString(2, password);
            rs = stm.executeQuery();

            Account account = null;
            Role role = new Role();

            while (rs.next()) {
                if (account == null) {
                    account = new Account();
                    account.setUser(user);
                   
                }

                int roleId = rs.getInt("role_id");
                if (roleId == 1) {

                    Student student = new Student();
                    role.setRoleId(rs.getInt("role_id"));
                    role.setRoleName(rs.getString("role_name"));

                    student.setStudentId(rs.getInt("student_id"));
                    student.setStudentCode(rs.getString("student_code"));

                    account.getStudents().add(student);
                    account.getRoles().add(role);

                } else {

                    Lecturer lecturer = new Lecturer();
                    role.setRoleId(rs.getInt("role_id"));
                    role.setRoleName(rs.getString("role_name"));

                    lecturer.setLecturerId(rs.getInt("lecturer_id"));
                    lecturer.setLecturerCode(rs.getString("lecturer_code"));

                    account.getLecturers().add(lecturer);
                    account.getRoles().add(role);

                }

                int featureId = rs.getInt("feature_id");
                if (featureId != 0) {
                    Feature feature = new Feature();
                    feature.setFeatureId(rs.getInt("feature_id"));
                    feature.setFeatureName(rs.getString("feature_name"));
                    feature.setUrl(rs.getString("url"));

                    role.getFeatures().add(feature);

                }
            }

            return account;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null)
                try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (stm != null)
                try {
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (connection != null)
                try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;

    }

    @Override
    public void insert(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Account get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Account> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
