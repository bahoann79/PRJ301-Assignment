<%-- 
    Document   : takeAttendance
    Created on : Oct 12, 2022, 9:39:57 PM
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lecturer Take Attendance</title>
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
                    <h1><span>FPT University Academic Portal</span></h1>
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
                <a href="home?lecturerId=${requestScope.session.lecturer.lecturerId}">Home</a>
                <ul>
                    <li>${requestScope.session.lecturer.lecturerCode}</li> |
                    <li>CAMPUS:FPTU-Hòa Lạc</li>
                </ul>

            </div>

            <div class="mt-3">
                <h2 class="text-center fs-1">Take Attendance</h2>
                <p class="text-center italic fs-3 fst-italic fw-light">for ${requestScope.session.group.groupName} (${requestScope.session.lecturer.lecturerCode})</p>
            </div>

            <div>
                <p><strong>Subject: </strong>${requestScope.session.group.subject.subjectCode}</p>
                <p><strong>Room: </strong> ${requestScope.session.room.roomName}</p>
                <p><strong>Date: </strong> ${requestScope.session.date}</p>
                <p><strong>Slot: </strong> ${requestScope.session.timeSlot.description}</p>
                <p><strong>Attended: </strong> <span class="text-danger">${requestScope.session.attended ? "Taken" : "Not Yet"}</span></p>        
            </div>
            <!-- END Navigation -->

            <!-- START TABLE -->
            <form action="takeAttendance" method="POST">
                <input type="hidden" name="sessionId" value="${param.sessionId}"/>
                <input type="hidden" name="lecturerId" value="${param.lecturerId}">
                <input type="hidden" name="sesDate" value="${session.date}">
                <table class="table mt-5">

                    <thead class="table-primary">
                        <tr>
                            <th>No.</th>
                            <th>Image</th>
                            <th>Code</th>
                            <th>Full Name</th>                      
                            <th>Present</th>
                            <th>Absent</th>
                            <th>Description</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach items="${requestScope.session.attendances}" var="a" varStatus="loop">
                            <tr>
                                <td>${loop.index+1}</td>
                                <td><img src="/MyProject/assets/img/user.png" alt="" style="width: 120px; height: 120px;"></td>
                                <td>${a.student.studentCode}
                                    <input type="hidden" name="listStId" value="${a.student.studentId}"/>

                                </td>
                                <td>${a.student.fullName}</td>
                                <td>
                                    <input type="radio"
                                           <c:if test="${a.status}">
                                               checked="checked"
                                           </c:if>  
                                           name="status${a.student.studentId}" value="present"  />
                                </td>
                                <td>
                                    <input type="radio"
                                           <c:if test="${!a.status}">
                                               checked="checked"
                                           </c:if>  
                                           name="status${a.student.studentId}" value="absent"  />
                                </td>
                                <td>
                                    <input type="text" name="description${a.student.studentId}" value="${a.description}" />
                                </td>

                            </tr>
                        </c:forEach>

                    </tbody>

                </table>
                <button type="submit" class="btn btn-primary">Save</button>
                <button type="reset" class="btn btn-primary ">Reset</button>
            </form>



            <!-- END TABLE -->




            <!-- START FOOTER -->
            <div class="text-center mt-5 footer">
                <strong>Mọi góp ý, thắc mắc xin liên hệ : </strong> Phòng dịch vụ sinh viên: Email <a
                    href="#">dichvusinhvien@fe.edu.vn</a> . Điện thoại: <strong>(024)7308.13.13 </strong>
                <p>© Powered by <a href="#">FPT University</a> | <a href="#">CMS</a> | <a href="#">library</a> | <a
                        href="#">books24x7</a></p>
            </div>
            <!-- END FOOTER -->

        </div>
    </body>
</html>
