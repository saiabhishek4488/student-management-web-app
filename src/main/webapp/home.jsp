<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Registration Form</title>

    <!-- Bootstrap 4 CSS -->
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>

    <!-- Navbar -->
    <nav class="navbar navbar-expand-md navbar-dark bg-dark">

        <!-- Logo -->
        <a class="navbar-brand" href="#">MyLogo</a>

        <!-- Mobile Menu Button -->
        <button class="navbar-toggler"
                type="button"
                data-toggle="collapse"
                data-target="#navbarMenu">
            <span class="navbar-toggler-icon"></span>
        </button>

        <!-- Navbar Links -->
        <div class="collapse navbar-collapse" id="navbarMenu">

            <ul class="navbar-nav ml-auto">

                <li class="nav-item">
                    <a class="nav-link" href="#">Home</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="./contact.jsp">Contact</a>
                </li>

            </ul>

        </div>
    </nav>


    <!-- Main Content -->
    <div class="container-fluid">

        <div class="row">

            <!-- First 3 Columns Empty -->
            <div class="col-md-3">
            </div>


            <!-- Middle 6 Columns -->
            <div class="col-12 col-md-6">

                <div class="mt-4 mb-4">

                    <h2 class="text-center mb-4">
                        Home Form
                    </h2>
                    <h1> WELCOME TO <%=session.getAttribute("username") %></h1>
                    <a href="./LogoutServlet">Logout</a>

                   

                        


                        



            <!-- Last 3 Columns Empty -->
            <div class="col-md-3">
            </div>

        </div>

    </div>


    <!-- Footer -->
    <footer class="bg-dark text-white text-center py-3">

        Copyright &copy; 2026

    </footer>


    <!-- Bootstrap 4 JavaScript -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>

    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
    
