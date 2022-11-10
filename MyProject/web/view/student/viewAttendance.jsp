<%-- 
    Document   : viewAttendance
    Created on : Oct 30, 2022, 9:30:58 PM
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student View Attendance</title>

        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>

        <link rel="stylesheet" href="/AttendanceApp/assets/css/style.css"/>

    </head>
    <body>
        <div class="container">

            <!-- HEADER -->
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

            <!-- Navigation -->
            <div class="mt-2 bg-light header-sc" style="height: 50px;">
                <a href="timetable?studentId=${requestScope.student.studentId}">Home</a>
                <ul>
                    <li>${requestScope.student.studentCode}</li> |
                    <li>CAMPUS:FPTU-Hòa Lạc</li>
                </ul>

            </div>

            <div class="mt-3">
                <h2 class="text-center fs-1">View Attendance</h2>
                <p class="text-center italic fs-3 fst-italic fw-light">for ${requestScope.student.fullName} (${requestScope.student.studentCode})</p>
                <h3 class="text-center">${requestScope.session.group.subject.subjectName} - (${requestScope.session.group.groupName})</h3>

            </div>

            <!-- SCHEDULE TABLE -->

            <table class="table table-bordered">
                <thead class="table-primary">
                    <tr>
                        <th>No</th>
                        <th>Date</th>
                        <th>Slot</th>
                        <th>Room</th>
                        <th>Lecturer</th>
                        <th>Group Name</th>
                        <th>Attendance Status</th>
                        <th>Lecturer's comment</th>                   
                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${requestScope.sessions}" var="s" varStatus="loop">
                        <tr>
                            <td>${loop.index + 1}</td>
                            <td>${s.date}</td>
                            <td>${s.timeSlot.timeSlotId} - (${s.timeSlot.description})</td>
                            <td>${s.room.roomName}</td>
                            <td>${s.lecturer.lecturerCode}</td>
                            <td>${s.group.groupName}</td>
                            <td>
                                <c:forEach items="${s.attendances}" var="a">
                                    <c:if test="${a.status}">
                                        <strong class="text-success">Present</strong>
                                    </c:if>
                                    <c:if test="${!a.status}">
                                        <strong class="text-danger">Absent</strong>
                                    </c:if>
                                </c:forEach>
                            </td>
                            <td>
                                <c:forEach items="${s.attendances}" var="att">
                                    ${att.description}
                                </c:forEach>                      
                            </td>
                        </tr>
                    </c:forEach>              
                </tbody>
            </table>
            <span class="fs-3">PRESENT: <strong>${requestScope.result}%</strong> SO FAR (${requestScope.count} 
                <span class="text-success">PRESENT</span> ON ${requestScope.size} TOTAL) </span> <br/>
                <br/>
                <strong class="text-danger">Note:</strong> If you do not attend 80% of the course, you will not be eligible for the final exam
            <br />
            <!-- FOOTER -->
            <div class="text-center mt-5 footer">
                <strong>Mọi góp ý, thắc mắc xin liên hệ : </strong> Phòng dịch vụ sinh viên: Email <a
                    href="#">dichvusinhvien@fe.edu.vn</a> . Điện thoại: <strong>(024)7308.13.13 </strong>
                <p>© Powered by <a href="#">FPT University</a> | <a href="#">CMS</a> | <a href="#">library</a> | <a
                        href="#">books24x7</a></p>
            </div>
        </div>



    </body>
</html>
