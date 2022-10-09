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

        <<link rel="stylesheet" href="../../assets/css/studentSchedule.css"/>


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
                                    <option value="1">03/01 To 09/01</option>
                                    <option value="2">10/01 To 16/01</option>
                                    <option value="3">17/01 To 23/01</option>
                                    <option value="4">24/01 To 30/01</option>
                                    <option value="5">31/01 To 06/02</option>
                                    <option value="6">07/02 To 13/02</option>
                                    <option value="7">14/02 To 20/02</option>
                                    <option value="8">21/02 To 27/02</option>
                                    <option value="9">28/02 To 06/03</option>
                                    <option value="10">07/03 To 13/03</option>
                                    <option value="11">14/03 To 20/03</option>
                                    <option value="12">21/03 To 27/03</option>
                                    <option value="13">28/03 To 03/04</option>
                                    <option value="14">04/04 To 10/04</option>
                                    <option value="15">11/04 To 17/04</option>
                                    <option value="16">18/04 To 24/04</option>
                                    <option value="17">25/04 To 01/05</option>
                                    <option value="18">02/05 To 08/05</option>
                                    <option value="19">09/05 To 15/05</option>
                                    <option value="20">16/05 To 22/05</option>
                                    <option value="21">23/05 To 29/05</option>
                                    <option value="22">30/05 To 05/06</option>
                                    <option value="23">06/06 To 12/06</option>
                                    <option value="24">13/06 To 19/06</option>
                                    <option value="25">20/06 To 26/06</option>
                                    <option value="26">27/06 To 03/07</option>
                                    <option value="27">04/07 To 10/07</option>
                                    <option value="28">11/07 To 17/07</option>
                                    <option value="29">18/07 To 24/07</option>
                                    <option value="30">25/07 To 31/07</option>
                                    <option value="31">01/08 To 07/08</option>
                                    <option value="32">08/08 To 14/08</option>
                                    <option value="33">15/08 To 21/08</option>
                                    <option value="34">22/08 To 28/08</option>
                                    <option value="35">29/08 To 04/09</option>
                                    <option value="36">05/09 To 11/09</option>
                                    <option value="37">12/09 To 18/09</option>
                                    <option value="38">19/09 To 25/09</option>
                                    <option value="39">26/09 To 02/10</option>
                                    <option value="40">03/10 To 09/10</option>
                                    <option value="41">10/10 To 16/10</option>
                                    <option value="42">17/10 To 23/10</option>
                                    <option value="43">24/10 To 30/10</option>
                                    <option value="44">31/10 To 06/11</option>
                                    <option value="45">07/11 To 13/11</option>
                                    <option value="46">14/11 To 20/11</option>
                                    <option value="47">21/11 To 27/11</option>
                                    <option value="48">28/11 To 04/12</option>
                                    <option value="49">05/12 To 11/12</option>
                                    <option value="50">12/12 To 18/12</option>
                                    <option value="51">19/12 To 25/12</option>
                                    <option value="52">26/12 To 01/01</option>
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
                        <th>10/1</th>
                        <th>2/1</th>
                        <th>3/5</th>
                        <th>4/6</th>
                        <th>5/8</th>
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
