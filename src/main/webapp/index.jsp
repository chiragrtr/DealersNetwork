<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dealers Network</title>
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>

    <link rel="stylesheet" href="css/normalize.css">

    <link rel="stylesheet" href="css/style.css">

</head>

<body>

<div class="form">

    <ul class="tab-group">
        <li class="tab active"><a href="#login">Log In</a></li>
        <li class="tab "><a href="#signup">Sign Up</a></li>

    </ul>

    <div class="tab-content">
        <div id="login">
            <h1>Welcome Back!</h1>

            <form action="login.do" method="post">

                <div class="field-wrap">
                    <label>
                        Email Address<span class="req">*</span>
                    </label>
                    <input type="email" name="email" required autocomplete="off"/>
                </div>

                <div class="field-wrap">
                    <label>
                        Password<span class="req">*</span>
                    </label>
                    <input type="password" name="password" required autocomplete="off"/>
                </div>
                <input type="hidden" name="sessionId" value=
                    <%=(request.getSession().getId()).toString()%>
                >
                <%
                    if (request.getAttribute("message") != null && request.getAttribute("message").equals("invalid")) {
                %>
                <font color="red">INVALID CREDENTIALS</font>
                <%
                } else if (request.getAttribute("message") != null && request.getAttribute("message").equals("duplicateRegistration")) {
                %>
                <font color="aqua">Your email id is already registered</font>
                <%
                    }
                    if (session.getAttribute("loggedIn") != null && session.getAttribute("loggedIn").toString().equals("true")) {
                        request.getRequestDispatcher("home.jsp").forward(request, response);
                    }
                %>
                <p class="forgot"><a href="#">Forgot Password?</a></p>

                <button class="button button-block"/>
                Log In</button>

            </form>

        </div>
        <div id="signup">
            <h1>Sign Up for Free</h1>

            <form action="register.do" method="post">


                <div class="field-wrap">
                    <label>
                        Name<span class="req">*</span>
                    </label>
                    <input type="text" name="name" required autocomplete="off"/>
                </div>
                <div class="field-wrap">
                    <label>
                        Email Address<span class="req">*</span>
                    </label>
                    <input type="email" name="email" required autocomplete="off"/>
                </div>
                <div class="field-wrap">
                    <label>
                        Contact Number<span class="req">*</span>
                    </label>
                    <input type="number" name="phone" required autocomplete="off"/>
                </div>

                <div class="field-wrap">
                    <label>
                        Set A Password<span class="req">*</span>
                    </label>
                    <input type="password" name="password" required autocomplete="off"/>
                </div>

                <button type="submit" class="button button-block"/>
                Get Started</button>

            </form>

        </div>


    </div><!-- tab-content -->

</div> <!-- /form -->
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

<script src="js/index.js"></script>


</body>
</html>
