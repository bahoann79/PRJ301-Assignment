/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Attendance;
import model.Group;
import model.Lecturer;
import model.Room;
import model.Session;
import model.Student;
import model.Subject;
import model.TimeSlot;

/**
 *
 * @author admin
 */
public class SessionDBContext extends DBContext<Session> {

    /*
        for student view attendance
     */
    public ArrayList<Session> filterStViewAttendance(int studentId, int groupId) {
        try {
            ArrayList<Session> listSession = new ArrayList<>();

            String sql = "SELECT s.session_id, s.[date], s.[index], s.attended,\n"
                    + "	   st.student_id, st.student_code, st.full_name,\n"
                    + "	   ISNULL(a.[status], 0) [status], ISNULL(a.[description], '') [description],\n"
                    + "	   lec.lecturer_id, lec.lecturer_code,\n"
                    + "	   gr.group_id, gr.group_name,\n"
                    + "	   sub.subject_id, sub.subject_code, sub.subject_name,\n"
                    + "	   r.room_id, r.room_name,\n"
                    + "	   tl.time_slot_id, tl.t_description	\n"
                    + "FROM [Session] s INNER JOIN [Group] gr ON s.group_id = gr.group_id\n"
                    + "				 INNER JOIN StudentGroup sg ON sg.group_id = gr.group_id\n"
                    + "				 INNER JOIN Student st ON st.student_id = sg.student_id\n"
                    + "				 LEFT JOIN Attendance a ON a.student_id = st.student_id AND a.session_id = s.session_id\n"
                    + "				 INNER JOIN Lecturer lec ON lec.lecturer_id = s.lecturer_id\n"
                    + "				 INNER JOIN [Subject] sub ON sub.subject_id = gr.subject_id\n"
                    + "				 INNER JOIN Room r ON s.room_id = r.room_id\n"
                    + "				 INNER JOIN TimeSlot tl ON s.time_slot_id = tl.time_slot_id\n"
                    + "				 WHERE st.student_id = ? AND gr.group_id = ?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, studentId);
            stm.setInt(2, groupId);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Session session = new Session();
                Student student = new Student();
                Attendance attendance = new Attendance();
                Lecturer lecturer = new Lecturer();
                Group group = new Group();
                Subject subject = new Subject();
                Room room = new Room();
                TimeSlot timeSlot = new TimeSlot();

                session.setSessionId(rs.getInt("session_id"));
                session.setDate(rs.getDate("date"));
                session.setIndex(rs.getInt("index"));
                session.setAttended(rs.getBoolean("attended"));

                student.setStudentId(rs.getInt("student_id"));
                student.setStudentCode(rs.getString("student_code"));
                student.setFullName(rs.getString("full_name"));
                group.getStudents().add(student);

                attendance.setStudent(student);
                attendance.setSession(session);
                attendance.setStatus(rs.getBoolean("status"));
                attendance.setDescription(rs.getString("description"));
                session.getAttendances().add(attendance);

                lecturer.setLecturerId(rs.getInt("lecturer_id"));
                lecturer.setLecturerCode(rs.getString("lecturer_code"));
                session.setLecturer(lecturer);

                subject.setSubjectId(rs.getInt("subject_id"));
                subject.setSubjectCode(rs.getString("subject_code"));
                subject.setSubjectName(rs.getString("subject_name"));
                group.setSubject(subject);

                group.setGroupId(rs.getInt("group_id"));
                group.setGroupName(rs.getString("group_name"));
                session.setGroup(group);

                room.setRoomId(rs.getInt("room_id"));
                room.setRoomName(rs.getString("room_name"));
                session.setRoom(room);

                timeSlot.setTimeSlotId(rs.getInt("time_slot_id"));
                timeSlot.setDescription(rs.getString("t_description"));
                session.setTimeSlot(timeSlot);

                listSession.add(session);

            }
            return listSession;

        } catch (SQLException ex) {
            Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /*
        for lecturer schedule
     */
    public ArrayList<Session> filterSchedule(int sessionId, Date from, Date to) {
        ArrayList<Session> listSession = new ArrayList<>();
        try {
            String sql = "SELECT s.session_id, s.[date], s.[index], s.attended,\n"
                    + "	   lec.lecturer_id, lec.lecturer_code, lec.lecturer_name,\n"
                    + "	   gr.group_id, gr.group_name,\n"
                    + "	   r.room_id, r.room_name,\n"
                    + "	   tl.time_slot_id, tl.t_description	\n"
                    + "FROM [Session] s INNER JOIN Lecturer lec ON s.lecturer_id = lec.lecturer_id\n"
                    + "				 INNER JOIN [Group] gr ON s.group_id = gr.group_id\n"
                    + "				 INNER JOIN Room r ON s.room_id = r.room_id\n"
                    + "				 INNER JOIN TimeSlot tl ON s.time_slot_id = tl.time_slot_id\n"
                    + "				 WHERE lec.lecturer_id = ? AND s.[date] >= ? AND s.[date] <= ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, sessionId);
            stm.setDate(2, from);
            stm.setDate(3, to);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Session session = new Session();
                Lecturer lecturer = new Lecturer();
                Group group = new Group();
                Room room = new Room();
                TimeSlot timeSlot = new TimeSlot();

                session.setSessionId(rs.getInt("session_id"));
                session.setDate(rs.getDate("date"));
                session.setIndex(rs.getInt("index"));
                session.setAttended(rs.getBoolean("attended"));

                lecturer.setLecturerId(rs.getInt("lecturer_id"));
                lecturer.setLecturerCode(rs.getString("lecturer_code"));
                lecturer.setLecturerName(rs.getString("lecturer_name"));
                session.setLecturer(lecturer);

                group.setGroupId(rs.getInt("group_id"));
                group.setGroupName(rs.getString("group_name"));
                session.setGroup(group);

                room.setRoomId(rs.getInt("room_id"));
                room.setRoomName(rs.getString("room_name"));
                session.setRoom(room);

                timeSlot.setTimeSlotId(rs.getInt("time_slot_id"));
                timeSlot.setDescription(rs.getString("t_description"));
                session.setTimeSlot(timeSlot);

                listSession.add(session);
            }
            return listSession;

        } catch (SQLException ex) {
            Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /*
        for student timetable
     */
    public ArrayList<Session> filterTimetable(int studentId, Date from, Date to) {
        ArrayList<Session> listSession = new ArrayList<>();
        try {
            String sql = "SELECT s.session_id, s.[date], s.[index], s.attended,\n"
                    + "	   st.student_id, st.student_code, st.full_name,\n"
                    + "	   ISNULL(a.[status], 0) [status], ISNULL(a.[description], '') [description],\n"
                    + "	   gr.group_id, gr.group_name,\n"
                    + "	   sub.subject_id, sub.subject_code,\n"
                    + "	   r.room_id, r.room_name,\n"
                    + "	   tl.time_slot_id, tl.t_description	\n"
                    + "FROM [Session] s INNER JOIN [Group] gr ON s.group_id = gr.group_id\n"
                    + "				 INNER JOIN StudentGroup sg ON sg.group_id = gr.group_id\n"
                    + "				 INNER JOIN Student st ON st.student_id = sg.student_id\n"
                    + "				 LEFT JOIN Attendance a ON a.student_id = st.student_id AND a.session_id = s.session_id\n"
                    + "				 INNER JOIN [Subject] sub ON sub.subject_id = gr.subject_id\n"
                    + "				 INNER JOIN Room r ON s.room_id = r.room_id\n"
                    + "				 INNER JOIN TimeSlot tl ON s.time_slot_id = tl.time_slot_id\n"
                    + "				 WHERE st.student_id = ? AND s.[date] >= ? AND s.[date] <= ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, studentId);
            stm.setDate(2, from);
            stm.setDate(3, to);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Session session = new Session();
                Student student = new Student();
                Attendance attendance = new Attendance();
                Group group = new Group();
                Subject subject = new Subject();
                Room room = new Room();
                TimeSlot timeSlot = new TimeSlot();

                session.setSessionId(rs.getInt("session_id"));
                session.setDate(rs.getDate("date"));
                session.setIndex(rs.getInt("index"));
                session.setAttended(rs.getBoolean("attended"));

                student.setStudentId(rs.getInt("student_id"));
                student.setStudentCode(rs.getString("student_code"));
                student.setFullName(rs.getString("full_name"));
                group.getStudents().add(student);

                attendance.setStudent(student);
                attendance.setSession(session);
                attendance.setStatus(rs.getBoolean("status"));
                attendance.setDescription(rs.getString("description"));
                session.getAttendances().add(attendance);

                subject.setSubjectId(rs.getInt("subject_id"));
                subject.setSubjectCode(rs.getString("subject_code"));
                group.setSubject(subject);

                group.setGroupId(rs.getInt("group_id"));
                group.setGroupName(rs.getString("group_name"));
                session.setGroup(group);

                room.setRoomId(rs.getInt("room_id"));
                room.setRoomName(rs.getString("room_name"));
                session.setRoom(room);

                timeSlot.setTimeSlotId(rs.getInt("time_slot_id"));
                timeSlot.setDescription(rs.getString("t_description"));
                session.setTimeSlot(timeSlot);

                listSession.add(session);
            }
            return listSession;

        } catch (SQLException ex) {
            Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /*
        for lecturer home
     */
    public ArrayList<Session> filterHome(int sessionId, Date today) {
        try {
            ArrayList<Session> listSession = new ArrayList<>();

            String sql = "SELECT s.session_id, s.[date], s.[index], s.attended,\n"
                    + "	   lec.lecturer_id, lec.lecturer_code, lec.lecturer_name,\n"
                    + "	   gr.group_id, gr.group_name,\n"
                    + "	   sub.subject_id, sub.subject_name,\n"
                    + "	   r.room_id, r.room_name,\n"
                    + "	   tl.time_slot_id, tl.t_description	\n"
                    + "FROM [Session] s INNER JOIN Lecturer lec ON s.lecturer_id = lec.lecturer_id\n"
                    + "				 INNER JOIN [Group] gr ON s.group_id = gr.group_id\n"
                    + "				 INNER JOIN [Subject] sub ON sub.subject_id = gr.subject_id\n"
                    + "				 INNER JOIN Room r ON s.room_id = r.room_id\n"
                    + "				 INNER JOIN TimeSlot tl ON s.time_slot_id = tl.time_slot_id\n"
                    + "				 WHERE lec.lecturer_id = ? AND s.[date] = ?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, sessionId);
            stm.setDate(2, today);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Session session = new Session();
                Lecturer lecturer = new Lecturer();
                Group group = new Group();
                Subject subject = new Subject();
                Room room = new Room();
                TimeSlot timeSlot = new TimeSlot();

                session.setSessionId(rs.getInt("session_id"));
                session.setDate(rs.getDate("date"));
                session.setIndex(rs.getInt("index"));
                session.setAttended(rs.getBoolean("attended"));

                lecturer.setLecturerId(rs.getInt("lecturer_id"));
                lecturer.setLecturerCode(rs.getString("lecturer_code"));
                lecturer.setLecturerName(rs.getString("lecturer_name"));
                session.setLecturer(lecturer);

                group.setGroupId(rs.getInt("group_id"));
                group.setGroupName(rs.getString("group_name"));
                subject.setSubjectId(rs.getInt("subject_id"));
                subject.setSubjectName(rs.getString("subject_name"));
                group.setSubject(subject);
                session.setGroup(group);

                room.setRoomId(rs.getInt("room_id"));
                room.setRoomName(rs.getString("room_name"));
                session.setRoom(room);

                timeSlot.setTimeSlotId(rs.getInt("time_slot_id"));
                timeSlot.setDescription(rs.getString("t_description"));
                session.setTimeSlot(timeSlot);

                listSession.add(session);

            }
            return listSession;

        } catch (SQLException ex) {
            Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void insert(Session model) {
    }

    /*
        method is used to take attendance for lecturer
     */
    @Override
    public void update(Session model) {

        try {
            connection.setAutoCommit(false);
            String sql = "UPDATE [Session]\n"
                    + "   SET [attended] = 1\n"
                    + " WHERE session_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, model.getSessionId());
            stm.executeUpdate();

            // remove all current attendance with sessionId
            sql = "DELETE FROM Attendance\n"
                    + "      WHERE session_id = ?";
            PreparedStatement stmDelete = connection.prepareStatement(sql);
            stmDelete.setInt(1, model.getSessionId());
            stmDelete.executeUpdate();

            // insert attendance with sessionId
            for (Attendance att : model.getAttendances()) {
                sql = "INSERT INTO [Attendance]\n"
                        + "           ([session_id]\n"
                        + "           ,[student_id]\n"
                        + "           ,[status]\n"
                        + "           ,[description]\n"
                        + "           ,[record_time])\n"
                        + "     VALUES\n"
                        + "           (?\n"
                        + "           ,?\n"
                        + "           ,?\n"
                        + "           ,?\n"
                        + "           ,GETDATE())";
                PreparedStatement stmInsert = connection.prepareStatement(sql);
                stmInsert.setInt(1, model.getSessionId());
                stmInsert.setInt(2, att.getStudent().getStudentId());
                stmInsert.setBoolean(3, att.isStatus());
                stmInsert.setString(4, att.getDescription());
                stmInsert.executeUpdate();
            }
            connection.commit();

        } catch (SQLException ex) {
            try {
                connection.rollback();
                Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex1) {
                Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public void delete(Session model) {
    }

    /*
        method is used to get an object Session with 
        all information related to another table
     */
    @Override
    public Session get(int id) {

        try {
            String sql = "SELECT s.session_id, s.[date], s.[index], s.attended,\n"
                    + "	   tl.time_slot_id, tl.t_description,\n"
                    + "	   r.room_id, r.room_name,\n"
                    + "	   lec.lecturer_id, lec.lecturer_code, lec.lecturer_name,\n"
                    + "	   gr.group_id, gr.group_name, gr.semester, gr.[year],\n"
                    + "	   sub.subject_id, sub.subject_code,\n"
                    + "	   st.student_id, st.student_code,st.full_name,\n"
                    + "	   ISNULL(a.[status], 0) [status], ISNULL(a.[description], '') [description]\n"
                    + "FROM [Session] s INNER JOIN TimeSlot tl ON s.time_slot_id = tl.time_slot_id\n"
                    + "				 INNER JOIN Room r ON r.room_id = s.room_id\n"
                    + "				 INNER JOIN Lecturer lec ON lec.lecturer_id = s.lecturer_id\n"
                    + "				 INNER JOIN [Group] gr ON gr.group_id = s.group_id\n"
                    + "				 INNER JOIN [Subject] sub ON sub.subject_id = gr.subject_id\n"
                    + "				 INNER JOIN StudentGroup sg ON sg.group_id = gr.group_id\n"
                    + "				 INNER JOIN Student st ON st.student_id = sg.student_id\n"
                    + "				 LEFT JOIN Attendance a ON a.student_id = st.student_id AND a.session_id = s.session_id\n"
                    + "				 WHERE s.session_id = ?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            Session session = null;
            while (rs.next()) {
                if (session == null) {
                    session = new Session();

                    TimeSlot timeSlot = new TimeSlot();
                    timeSlot.setTimeSlotId(rs.getInt("time_slot_id"));
                    timeSlot.setDescription(rs.getString("t_description"));
                    session.setTimeSlot(timeSlot);

                    Room room = new Room();
                    room.setRoomId(rs.getInt("room_id"));
                    room.setRoomName(rs.getString("room_name"));
                    session.setRoom(room);

                    Lecturer lecturer = new Lecturer();
                    lecturer.setLecturerId(rs.getInt("lecturer_id"));
                    lecturer.setLecturerCode(rs.getString("lecturer_code"));
                    lecturer.setLecturerName(rs.getString("lecturer_name"));
                    session.setLecturer(lecturer);

                    Group group = new Group();
                    group.setGroupId(rs.getInt("group_id"));
                    group.setGroupName(rs.getString("group_name"));
                    session.setGroup(group);

                    Subject subject = new Subject();
                    subject.setSubjectId(rs.getInt("subject_id"));
                    subject.setSubjectCode(rs.getString("subject_code"));
                    group.setSubject(subject);

                    session.setDate(rs.getDate("date"));
                    session.setIndex(rs.getInt("index"));
                    session.setAttended(rs.getBoolean("attended"));
                }

                // student
                Student student = new Student();
                student.setStudentId(rs.getInt("student_id"));
                student.setFullName(rs.getString("full_name"));
                student.setStudentCode(rs.getString("student_code"));

                // attendance
                Attendance attendance = new Attendance();
                attendance.setStudent(student);
                attendance.setSession(session);
                attendance.setStatus(rs.getBoolean("status"));
                attendance.setDescription(rs.getString("description"));
                session.getAttendances().add(attendance);
            }
            return session;
        } catch (SQLException ex) {
            Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Session> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
