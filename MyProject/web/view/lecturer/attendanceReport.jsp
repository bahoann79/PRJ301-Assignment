<%-- 
    Document   : attendanceReport
    Created on : Nov 3, 2022, 7:57:12 PM
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attendance Report Page</title>

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
                <a href="home?lecturerId=${requestScope.lecturer.lecturerId}">Home</a>
                <ul>
                    <li>${requestScope.lecturer.lecturerCode}</li> |
                    <li>CAMPUS:FPTU-Hòa Lạc</li>
                </ul>

            </div>

            <div class="mt-3">
                <h2 class="text-center fs-1">Attendance Report</h2>
                <p class="text-center italic fs-3 fst-italic fw-light">for ${requestScope.session.group.groupName} (${requestScope.lecturer.lecturerCode})</p>
            </div>

            <div>
                <strong>Subject: </strong>${requestScope.session.group.subject.subjectName}
                <strong>Duration: </strong> ${requestScope.duration} slot
            </div>
            <!-- END Navigation -->

            <!-- START TABLE -->
            <form>
                <table class="table mt-5">

                    <thead class="table-primary">
                        <tr>
                            <th>No</th>
                            <th>Image</th>
                            <th>Code</th>
                            <th>Full Name</th>
                            <th>Present</th>
                            <th>Status</th>
                        </tr>
                    </thead>

                    <tbody>
                    <c:forEach items="${requestScope.session.attendances}" var="a" varStatus="loop">
                        <tr>
                            <td>${loop.index + 1}</td>
                            <td>
                                <img src="/AttendanceApp/assets/img/user.png" alt="" style="width: 120px; height: 120px;">
                            </td>
                            <td>${a.student.studentCode}</td>
                            <td>${a.student.fullName}</td>
                            <td>${a.quantityPresent}</td>
                            <td>${a.result}%</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

                <strong>Note:</strong> If you do not attend 80% of the course, you will not be eligible for the final exam
                <br />

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
