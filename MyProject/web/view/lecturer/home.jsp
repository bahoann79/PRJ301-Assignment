<%-- 
    Document   : home
    Created on : Oct 12, 2022, 9:36:15 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lecturer Home Page</title>

        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>

        <link rel="stylesheet" href="../../assets/css/studentSchedule.css"/>
    </head>
    <body>
        <div class="container">

            <!-- START HEADER -->
            <div class="row">
                <div class="col-md-8">
                    <h1><span>FPT University Academic Portal</span>
                    </h1>

                </div>
                <div class="col-md-4">
                    <table>
                        <tr>
                            <td colspan="2" class="auto-style1"><strong>FAP mobile app (myFAP) is ready at</strong></td>
                        </tr>
                        <tr>
                            <td><a href="https://apps.apple.com/app/id1527723314">
                                    <img src="https://fap.fpt.edu.vn/images/app-store.svg"
                                         style="width: 120px; height: 40px" alt="apple store" /></a></td>
                            <td><a href="https://play.google.com/store/apps/details?id=com.fuct">
                                    <img src="https://fap.fpt.edu.vn/images/play-store.svg"
                                         style="width: 120px; height: 40px" alt="google store" /></a></td>
                        </tr>
                    </table>
                </div>
            </div>
            <!-- END HEADER -->

            <!-- START Navigation -->
            <div class="mt-2 bg-light header-sc" style="height: 50px;">
                <a href="#">Home</a>
                <a href="../student/schedule.jsp">Schedule</a>
                <ul>
                    <li>sonnt5</li> |
                    <li>CAMPUS:FPTU-Hòa Lạc</li>
                </ul>

            </div>

            <div class="mt-3">
                <h2 class="text-center fs-1">Today activity (13/10/2002)</h2>
            </div>
            <!-- END Navigation -->

            <table class="table mt-5 table-bordered">
                <thead class="table-primary">
                    <tr>
                        <th>SLOT</th>
                        <th>START</th>
                        <th>END</th>
                        <th>SUBJECT</th>
                        <th>STUDENT</th>
                        <th>ROOM</th>
                        <th>CAMPUS</th>
                        <th>TAKE ATTENDANCE</th>
                        <th>VIEW ATTENDANCE</th>
                        <th>EDIT ATTENDANCE</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>1</td>
                        <td>7:30</td>
                        <td>9:00</td>
                        <td>Java Web Application Development</td>
                        <td>IOT1601</td>
                        <td>DE-420</td>
                        <td>FU-HL</td>
                        <td>Taken</td>
                        <td><a href="takeAttendance.jsp">View</a></td>
                        <td><a href="takeAttendance.jsp">Edit</a></td>
                    </tr>

                    <tr>
                        <td>2</td>
                        <td>9:10</td>
                        <td>10:40</td>
                        <td>Java Web Application Development</td>
                        <td>SE1601</td>
                        <td>DE-420</td>
                        <td>FU-HL</td>
                        <td>Closing</td>
                        <td><a href="takeAttendance.jsp">View</a></td>
                        <td><a href="takeAttendance.jsp">Edit</a></td>
                    </tr>

                    <tr>
                        <td>3</td>
                        <td>10:50</td>
                        <td>12:20</td>
                        <td>OOP with Java Lab</td>
                        <td>SE1602</td>
                        <td>BE-201</td>
                        <td>FU-HL</td>
                        <td>Closing</td>
                        <td><a href="takeAttendance.jsp">View</a></td>
                        <td><a href="takeAttendance.jsp">Edit</a></td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>12:50</td>
                        <td>14:20</td>
                        <td>OOP with Java Lab</td>
                        <td>SE1603</td>
                        <td>DE-208</td>
                        <td>FU-HL</td>
                        <td>Closing</td>
                        <td><a href="takeAttendance.jsp">View</a></td>
                        <td><a href="takeAttendance.jsp">Edit</a></td>
                    </tr>
                    <tr>
                        <td>5</td>
                        <td>14:30</td>
                        <td>16:00</td>
                        <td>Java Web Application Development</td>
                        <td>SE1604</td>
                        <td>AL-301</td>
                        <td>FU-HL</td>
                        <td>Closing</td>
                        <td><a href="takeAttendance.jsp">View</a></td>
                        <td><a href="takeAttendance.jsp">Edit</a></td>
                    </tr>
                    <tr>
                        <td>6</td>
                        <td>16:10</td>
                        <td>17:40</td>
                        <td>Java Web Application Development</td>
                        <td>SE1605</td>
                        <td>BE-310</td>
                        <td>FU-HL</td>
                        <td>Closing</td>
                        <td><a href="takeAttendance.jsp">View</a></td>
                        <td><a href="takeAttendance.jsp">Edit</a></td>
                    </tr>
                    <tr>
                        <td>7</td>
                        <td>17:50</td>
                        <td>19:20</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                    </tr>
                    <tr>
                        <td>8</td>
                        <td>19:30</td>
                        <td>21:00</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                    </tr>
                </tbody>
            </table>

            <!-- START FOOTER -->
            <div class="text-center mt-5 footer">
                <strong>Mọi góp ý, thắc mắc xin liên hệ : </strong> Phòng dịch vụ sinh viên: Email <a
                    href="#">dichvusinhvien@fe.edu.vn</a> . Điện thoại: <strong>(024)7308.13.13 </strong>
                <p>© Powered by <a href="#">FPT University</a> | <a href="#">CMS</a> | <a href="#">library</a> | <a
                        href="#">books24x7</a></p>
            </div>
            <!-- END FOOTER -->


    </body>
</html>
