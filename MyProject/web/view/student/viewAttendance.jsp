<%-- 
    Document   : viewAttendance
    Created on : Oct 30, 2022, 9:30:58 PM
    Author     : admin
--%>

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
                <a href="#">Home</a>
                <ul>
                    <li>he160107</li> |
                    <li>CAMPUS:FPTU-Hòa Lạc</li>
                </ul>

            </div>

            <div class="mt-3">
                <h2 class="text-center fs-1">View Attendance</h2>
                <p class="text-center italic fs-3 fst-italic fw-light">for Nguyen Ba Hoan (he160107)</p>
                <h3 class="text-center">Elementary Japanese 1 -(JPD123 - IOT1601)</h3>
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
                    <tr>
                        <td>1</td>
                        <td>Mon 05/09/2022</td>
                        <td>3_(10:50-12:20)</td>
                        <td>DE-416</td>
                        <td>DungLKT</td>
                        <td>IOT1601</td>
                        <td>Present</td>
                        <td>-</td>
                    </tr>

                    <tr>
                        <td>2</td>
                        <td>Wed 07/09/2022</td>
                        <td>3_(10:50-12:20)</td>
                        <td>DE-416</td>
                        <td>DungLKT</td>
                        <td>IOT1601</td>
                        <td>Present</td>
                        <td>-</td>
                    </tr>

                    <tr>
                        <td>3</td>
                        <td>Fri 09/09/2022</td>
                        <td>3_(10:50-12:20)</td>
                        <td>DE-416</td>
                        <td>DungLKT</td>
                        <td>IOT1601</td>
                        <td>Present</td>
                        <td>-</td>
                    </tr>


                </tbody>
            </table>


            <!-- NOTE -->
            <strong>Note: </strong>
            <div>
                <ul>
                    <li>
                        <p class="text-success d-inline">(attended) </p> hoannbhe160107 had attended this activity / Nguyễn
                        Bá Hoàn đã tham gia hoạt động này
                    </li>
                    <li>
                        <p class="text-danger d-inline">(absent) </p> hoannbhe160107 had NOT attended this activity / Nguyễn
                        Bá Hoàn đã vắng mặt buổi này
                    </li>
                    <li>(-): no data was given</li>
                    <li>Các phòng bắt đầu bằng AL thuộc tòa nhà Alpha. VD: AL...</li>
                    <li>Các phòng bắt đầu bằng BE thuộc tòa nhà Beta. VD: BE,..</li>
                    <li>Các phòng bắt đầu bằng G thuộc tòa nhà Gamma. VD: G201,..</li>
                    <li>Các phòng tập bằng đầu bằng R thuộc khu vực sân tập Vovinam.</li>
                    <li>Các phòng bắt đầu bằng DE thuộc tòa nhà Delta. VD: DE,..</li>
                    <li>Little UK (LUK) thuộc tầng 5 tòa nhà Delta</li>
                </ul>

            </div>


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
