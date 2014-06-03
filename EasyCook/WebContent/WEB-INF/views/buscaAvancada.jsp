<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Easy Cook - Busca avan&ccedil;ada</title>
<c:import url="importFilesCategoria.jsp" />
</head>

<body>

   	<c:import url="importNav.jsp" />
<br>
<br>
    <div class="container">

    <section id="portfolio">
        <div class="container">
            <div class="row">
            <br><br>
                <div class="col-lg-12 text-center">
                    <h2>Busca avan&ccedil;ada <i class="fa fa-search"></i></h2> 
                    <hr class="star-primary">
                </div>
            </div>
            <div class="row">
                <div class="col-sm-4 portfolio-item">
                        <h3>Categoria <i class="fa fa-tags fa-2x"></i></h3>
                </div>
                <div class="col-sm-4 portfolio-item">
                     	<h3>Tempo de preparo <i class="fa fa-clock-o fa-2x"></i></h3>
                </div>
                <div class="col-sm-4 portfolio-item">
                        <h3>Estilo de vida <i class="fa fa-cutlery fa-2x"></i></h3>
                </div>
                <div class="col-sm-4 portfolio-item">
                        <h3>Categoria <i class="fa fa-tags fa-2x"></i></h3>
                </div>
                <div class="col-sm-4 portfolio-item">
                     	<h3>Tempo de preparo <i class="fa fa-clock-o fa-2x"></i></h3>
                </div>
                <div class="col-sm-4 portfolio-item">
                        <h3>Estilo de vida <i class="fa fa-cutlery fa-2x"></i></h3>
                </div>
                <div class="col-sm-4 portfolio-item">
                    <a href="#portfolioModal4" class="portfolio-link" data-toggle="modal">
                        <img src="img/portfolio/game.png" class="img-responsive" alt="" />
                    </a>
                </div>
                <div class="col-sm-4 portfolio-item">
                    <a href="#portfolioModal5" class="portfolio-link" data-toggle="modal">
                        <img src="img/portfolio/safe.png" class="img-responsive" alt="" />
                    </a>
                </div>
                <div class="col-sm-4 portfolio-item">
                    <a href="#portfolioModal6" class="portfolio-link" data-toggle="modal">
                        <img src="img/portfolio/submarine.png" class="img-responsive" alt="" />
                    </a>
                </div>
            </div>
        </div>
    </section>
        

    </div>
    <!-- /.container -->

    <div class="container">

        <hr>

             	<c:import url="importRodape.jsp" />

    </div>
    <!-- /.container -->



	<!-- JavaScript -->
	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/bootstrap.js"></script>

</body>
</html>
