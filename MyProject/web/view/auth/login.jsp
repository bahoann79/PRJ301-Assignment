<%-- 
    Document   : login
    Created on : Oct 26, 2022, 8:20:51 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>

        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>

        <style>

            /* Reset CSS */
            * {
                padding: 0;
                margin: 0;
                box-sizing: border-box;
            }

            html {
                font-family: Arial, Helvetica, sans-serif;

                /* tạo hiệu ứng lăn */
                scroll-behavior: smooth;
            }


            .header-sc a {
                line-height: 50px;
                text-decoration: none;
                margin-left: 20px;
                display: inline-block;
            }

            .header-sc ul,
            .header-sc ul > li{
                display: inline-block;

            }

            .header-sc ul > li {
                background-color: #5cb85c;
                border-radius: 5px;
                padding: 3px;
                color: aliceblue;
            }

            .form-date input{
                display: inline-block;
                width: 200px;
            }

            .form-date button {
                margin-bottom: 4px;
            }


            .footer a,
            table a {
                text-decoration: none;
            }

            body {
                background: #f8f8f8;
            }



            /* FIX FLOAT */
            .clear {
                clear: both;
            }

            img {
                max-width: 100%;
            }


            /* HEADER */
            .header {
                font-family: monospace;
            }


            /* CONTENT */
            .content {
                width: 60%;
                margin: 0 auto 44px;
                padding: 0;
                background-color: #fff;
            }



            /* CONTENT LEFT */
            .content .content-left {
                float: left;
                width: 40%;
                height: 444px;
                background-image: url(../..//assets/img/3a-1442393046.jpg);
                background-position: center;
                background-size: cover;
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                -ms-background-size: cover;
            }

            .content .cl-text {
                color: #fff;
                font-size: 14px;
                margin-top: 160px;
                font-weight: bold;
            }

            /* CONTENT RIGHT  */
            .content .content-right {
                float: left;
                width: 60%;
                padding: 0 28px 28px 28px;
                background-color: #fff;
                height: 444px;
            }

            .content-right .cr-text {
                font-family: cursive;

            }

            .content-right .cr-desc {
                opacity: 0.8;
                font-size: 14px;
            }

            .content-right .cr-desc a {
                text-decoration: none;
            }

            .content-right .form-item-checkbox {
                margin-left: 50px;
            }

            .content-right .form-check-label {
                padding: 3px 0 0 4px;
            }

            .content-right a.form-item-forgot {
                float: right;
                text-decoration: none;
            }

        </style>

    </head>
    <body>
        <div class="h1 text-center mt-4 mb-4 header">Login Form</div>

        <div class="content">
            <div class="content-left">
            </div>

            <div class="content-right">
                <div class="h3 text-center mt-5 cr-text">Login to your account</div>
                <p class="text-center cr-desc">Don't have an account? <a href="#">Sign Up Now !</a></p>
                <form action="login" name="" class="mt-4" method="POST">
                    <div class="form-group form-item">
                        <label for="user" class="label-field">User <span class="text-danger">*</span></label>
                        <input type="text" class="form-control " placeholder="Username" id="user" name="user">
                    </div>
                    <div class="form-group mt-3 form-item">
                        <label for="password" class="label-field">Password <span class="text-danger">*</span></label>
                        <input type="password" class="form-control " placeholder="Password" id="password" name="password">
                    </div>

                    <div class="form-check mt-4">
                        <input class="form-check-input form-item-checkbox" type="checkbox" value="" id="remember">
                        <label class="form-check-label" for="remember">
                            Remember Me
                        </label>
                        <a class="form-item-forgot" href="#">Forgot password?</a>
                    </div>


                    <div class="form-group mt-3 form-item-btn">
                        <button type="submit" class="btn btn-primary btn-register form-control"
                                id="register-btn">Login</button>
                    </div>
                </form>

            </div>
            <div class="clear"></div>
        </div>

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
