<%-- 
    Document   : schedule
    Created on : Oct 9, 2022, 3:00:17 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Schedule Page</title>

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
                    <li>hoannbhe160107</li> |
                    <li>CAMPUS:FPTU-Hòa Lạc</li>
                </ul>

            </div>

            <div class="mt-3">
                <h2 class="text-center fs-1">Your Schedule</h2>
                <p class="text-center italic fs-3 fst-italic fw-light">for Nguyen Ba Hoan (HE160107)</p>
            </div>

            <!-- SCHEDULE TABLE -->
            <table class="table mt-5 table-bordered" >
                <thead class="table-primary">
                    <tr>
                        <th rowspan="2">

                            <span class="d-block text-center">
                                Year
                                <select>
                                    <option value="2020">2020</option>
                                    <option value="2021">2021</option>
                                    <option value="2022">2022</option>
                                    <option value="2023">2023</option>
                                </select>
                            </span>

                            <span class="d-block text-center mt-2">
                                Week
                                <select>
                                    <c:forEach items="${requestScope.listDow}" var="dayOfWeek"> 
                                        <option value="1">${dayOfWeek.dayStart} To ${dayOfWeek.dayEnd}</option>
                                    </c:forEach>
                                </select>
                            </span>
                        </th>
                        <th>MON</th>
                        <th>TUE</th>
                        <th>WED</th>
                        <th>THU</th>
                        <th>FRI</th>
                        <th>SAT</th>
                        <th>SUN</th>
                    </tr>

                    <tr>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>Slot 0</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                    </tr>

                    <tr>
                        <td>Slot 1</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>

                    <tr>
                        <td>Slot 2</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>

                    <tr>
                        <td>Slot 3</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>

                    <tr>
                        <td>Slot 4</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>

                    <tr>
                        <td>Slot 5</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>

                    <tr>
                        <td>Slot 6</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>

                    <tr>
                        <td>Slot 7</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>

                    <tr>
                        <td>Slot 8</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
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
