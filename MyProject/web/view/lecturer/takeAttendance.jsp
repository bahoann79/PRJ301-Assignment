<%-- 
    Document   : takeAttendance
    Created on : Oct 12, 2022, 9:39:57 PM
    Author     : admin
--%>

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
                <a href="home.jsp">Home</a>
                <ul>
                    <li>sonnt5</li> |
                    <li>CAMPUS:FPTU-Hòa Lạc</li>
                </ul>

            </div>

            <div class="mt-3">
                <h2 class="text-center fs-1">Take Attendance</h2>
                <p class="text-center italic fs-3 fst-italic fw-light">for IOT1601 - PRJ301 (sonnt5)</p>
            </div>
            <!-- END Navigation -->

            <!-- START TABLE -->
            <form>
                <table class="table">

                    <thead>
                        <tr>
                            <th>Index</th>
                            <th>Image</th>
                            <th>Member</th>
                            <th>Code</th>
                            <th>Surname</th>
                            <th>Middle Name</th>
                            <th>Given Name</th>
                            <th>Status</th>
                        </tr>
                    </thead>

                    <tbody>
                        <tr>
                            <td>1</td>
                            <td><img src="../../assets/img/avatar-male.jpg" alt="" style="width: 120px; height: 120px;"></td>
                            <td>HoanNBHE160107</td>
                            <td>HE160107</td>
                            <td>Nguyễn</td>
                            <td>Bá</td>
                            <td>Hoàn</td>
                            <td><input type="radio"></td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td><img src="../../assets/img/avatar-female.jpg" alt="" style="width: 120px; height: 120px;"></td>
                            <td>HoanNBHE160107</td>
                            <td>HE160107</td>
                            <td>Nguyễn</td>
                            <td>Bá</td>
                            <td>Hoàn</td>
                            <td><input type="radio"></td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td><img src="../../assets/img/avatar-male.jpg" alt="" style="width: 120px; height: 120px;"></td>
                            <td>HoanNBHE160107</td>
                            <td>HE160107</td>
                            <td>Nguyễn</td>
                            <td>Bá</td>
                            <td>Hoàn</td>
                            <td><input type="radio"></td>
                        </tr>
                        <tr>
                            <td>4</td>
                            <td><img src="../../assets/img/avatar-male.jpg" alt="" style="width: 120px; height: 120px;"></td>
                            <td>HoanNBHE160107</td>
                            <td>HE160107</td>
                            <td>Nguyễn</td>
                            <td>Bá</td>
                            <td>Hoàn</td>
                            <td><input type="radio"></td>
                        </tr>
                        <tr>
                            <td>5</td>
                            <td><img src="../../assets/img/avatar-male.jpg" alt="" style="width: 120px; height: 120px;"></td>
                            <td>HoanNBHE160107</td>
                            <td>HE160107</td>
                            <td>Nguyễn</td>
                            <td>Bá</td>
                            <td>Hoàn</td>
                            <td><input type="radio"></td>
                        </tr>
                        <tr>
                            <td>6</td>
                            <td><img src="../../assets/img/avatar-female.jpg" alt="" style="width: 120px; height: 120px;"></td>
                            <td>HoanNBHE160107</td>
                            <td>HE160107</td>
                            <td>Nguyễn</td>
                            <td>Bá</td>
                            <td>Hoàn</td>
                            <td><input type="radio"></td>
                        </tr>
                        <tr>
                            <td>7</td>
                            <td><img src="../../assets/img/avatar-male.jpg" alt="" style="width: 120px; height: 120px;"></td>
                            <td>HoanNBHE160107</td>
                            <td>HE160107</td>
                            <td>Nguyễn</td>
                            <td>Bá</td>
                            <td>Hoàn</td>
                            <td><input type="radio"></td>
                        </tr>
                        <tr>
                            <td>8</td>
                            <td><img src="../../assets/img/avatar-female.jpg" alt="" style="width: 120px; height: 120px;"></td>
                            <td>HoanNBHE160107</td>
                            <td>HE160107</td>
                            <td>Nguyễn</td>
                            <td>Bá</td>
                            <td>Hoàn</td>
                            <td><input type="radio"></td>
                        </tr>
                        <tr>
                            <td>9</td>
                            <td><img src="../../assets/img/avatar-male.jpg" alt="" style="width: 120px; height: 120px;"></td>
                            <td>HoanNBHE160107</td>
                            <td>HE160107</td>
                            <td>Nguyễn</td>
                            <td>Bá</td>
                            <td>Hoàn</td>
                            <td><input type="radio"></td>
                        </tr>
                        <tr>
                            <td>10</td>
                            <td><img src="../../assets/img/avatar-female.jpg" alt="" style="width: 120px; height: 120px;"></td>
                            <td>HoanNBHE160107</td>
                            <td>HE160107</td>
                            <td>Nguyễn</td>
                            <td>Bá</td>
                            <td>Hoàn</td>
                            <td><input type="radio"></td>
                        </tr>
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
