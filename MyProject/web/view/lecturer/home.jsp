<%-- 
    Document   : home
    Created on : Oct 12, 2022, 9:36:15 PM
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

        <link rel="stylesheet" href="/MyProject/assets/css/style.css"/>

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
                <a href="schedule?lecturerId=${requestScope.lecturer.lecturerId}">Schedule</a>
                <ul>
                    <li>${requestScope.lecturer.lecturerCode}</li> |
                    <li>CAMPUS:FPTU-Hòa Lạc</li>
                </ul>
                <a href="../logout" class="logout">Logout</a>
            </div>

            <div class="mt-3">
                <h2 class="text-center fs-1">Today activity (${requestScope.today})</h2>
                <p class="text-center fs-3 fst-italic fw-light">for ${requestScope.lecturer.lecturerName}</p>
            </div>

            <c:if test="${requestScope.size eq 0}">
                <div class="alert alert-success text-center">Take a rest ! You don't have anything todo ...</div>
            </c:if>
            <!-- END Navigation -->

            <table class="table mt-5 table-bordered">
                <thead class="table-primary">
                    <tr>
                        <th>SLOT</th>
                        <th>TIME SLOT</th>
                        <th>SUBJECT</th>
                        <th>GROUP</th>
                        <th>ROOM</th>
                        <th>CAMPUS</th>
                        <th>TAKE ATTENDANCE</th>
                        <th>EDIT ATTENDANCE</th>
                        <th>VIEW ATTENDANCE</th>
                    </tr>
                </thead>

                <tbody>

                    <c:forEach items="${requestScope.timeSlots}" var="timeSlot">
                        <tr>
                            <td>${timeSlot.timeSlotId}</td>
                            <td>${timeSlot.description}</td>

                            <c:forEach items="${requestScope.sessions}" var="s">
                                <c:if test="${timeSlot.timeSlotId eq s.timeSlot.timeSlotId}">
                                    <td>${s.group.subject.subjectName}</td>
                                    <td>${s.group.groupName}</td>
                                    <td>${s.room.roomName}</td>
                                    <td>FU - HL</td>
                                    <td>
                                        <c:if test="${s.attended}">
                                            <strong class="text-success">Taken</strong>
                                        </c:if>
                                        <c:if test="${!s.attended}">
                                            <strong class="text-danger">Closing</strong>
                                        </c:if>
                                    </td>
                                    <td><a href="takeAttendance?sessionId=${s.sessionId}">Edit</a></td>
                                    <td><a href="#">View</a></td>
                                </c:if>                             
                            </c:forEach>
                        </tr>
                    </c:forEach>

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
