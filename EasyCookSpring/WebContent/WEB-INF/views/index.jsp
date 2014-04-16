<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="img/iconEA.png" sizes="32x32" type="image/png">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Easy Cook</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.css" rel="stylesheet">
<link href="font-awesome/css/font-awesome.css" rel="stylesheet">
<!-- Custom CSS for the 'Business Frontpage' Template -->
<link href="css/business-frontpage.css" rel="stylesheet">
<link href="css/half-slider.css" rel="stylesheet">
</head>

<body>
	<c:import url="importNav.jsp" />

<br>
<br>

	<div id="myCarousel" class="carousel slide">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner">
			<div class="item active">
				<div class="fill"
					style="background-image: url('img/principal/canape.jpg');"></div>
				<div class="carousel-caption">
					<h1>Canape</h1>
				</div>
			</div>
			<div class="item">
				<div class="fill"
					style="background-image: url('img/principal/peixe.jpeg');"></div>
				<div class="carousel-caption">
					<h1>Peixe ao molho madeira</h1>
				</div>
			</div>
			<div class="item">
				<div class="fill"
					style="background-image: url('img/principal/salada.jpeg');"></div>
				<div class="carousel-caption">
					<h1>Saladas variadas</h1>
				</div>
			</div>
		</div>




		<!-- Controls -->
		<a class="left carousel-control" href="#myCarousel" data-slide="prev">
			<span class="icon-prev"></span>
		</a> <a class="right carousel-control" href="#myCarousel"
			data-slide="next"> <span class="icon-next"></span>
		</a>
	</div>
<BR>
<br>
<br>
	<!-- <div class="container">
		<hr>
		<i class="fa fa-clock-o fa-5x inline"></i> <i
			class="fa fa-cutlery fa-5x inline"></i>
		<button type="submit" class="btn btn-default">Buscar</button>
		
		<hr>
	</div> -->
	<!-- 
      <div class="row">
        <div class="col-lg-8 col-sm-8">
          <h2>What We Do</h2>
          <p>Here is where you will introduce visitors to the business. Make sure to use clear and informative sentences. Use appropriate keywords here to make sure search engines can find the business.</p>
          <p>When using this template, two decisions will be open to visitors. Decision one will be to use above-the-fold information to interact with the page. Decision two will be to scroll down and see the additional marketing boxes. Either way, the user will get the information they need!</p>
          <p><a class="btn btn-default btn-large" href="#">Call to action &raquo;</a></p>
        </div>
        <div class="col-lg-4 col-sm-4">
          <h2>Contact Us</h2>
		  <address>
  			<strong>Twitter, Inc.</strong><br>
  			795 Folsom Ave, Suite 600<br>
			San Francisco, CA 94107<br>
		  </address>
		  <address>
			<abbr title="Phone">P:</abbr> (123) 456-7890<br>
            <abbr title="Email">E:</abbr> <a href="mailto:#">first.last@example.com</a>
		  </address>
        </div>
      </div> -->


		<div class="row" style="margin-left: 3px;">
			<div class="col-sm-4">
				<img class="img-circle img-responsive text-center"
					src="img/comidas/chocolateQuente.gif">
				<h2>Chocolate Quente</h2>
				<p>These marketing boxes are a great place to put some
					information. These can contain summaries of what the company does,
					promotional information, or anything else that is relevant to the
					company. These will usually be below-the-fold.</p>
			</div>
			<div class="col-sm-4">
				<img class="img-circle img-responsive text-center"
					src="img/comidas/bolinhoDeCamarao.jpg">
				<h2>Bolinho de Camarao</h2>
				<p>These marketing boxes are a great place to put some
					information. These can contain summaries of what the company does,
					promotional information, or anything else that is relevant to the
					company. These will usually be below-the-fold.</p>
			</div>
			<div class="col-sm-4">
				<img class="img-circle img-responsive"
					src="img/comidas/boloDeChocolate.jpg">
				<h2>Bolo de Chocolate</h2>
				<p>Donec id elit non mi porta gravida at eget metus. Fusce
					dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
					ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
					magna mollis euismod. Donec sed odio dui.</p>
			</div>
			<div class="col-sm-4">
				<img class="img-circle img-responsive"
					src="img/comidas/cookieChocolate.jpg">
				<h2>Cookie Chocolate</h2>
				<p>The images are set to be circular and responsive. Fusce
					dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
					ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
					magna mollis euismod. Donec sed odio dui.</p>
			</div>
			<div class="col-sm-4">
				<img class="img-circle img-responsive"
					src="img/comidas/bolinhoDeChuva.jpeg">
				<h2>Bolinho de Chuva</h2>
				<p>The images are set to be circular and responsive. Fusce
					dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
					ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
					magna mollis euismod. Donec sed odio dui.</p>
			</div>
			<div class="col-sm-4">
				<img class="img-circle img-responsive"
					src="img/comidas/bruschetta.jpg">
				<h2>Bruschetta</h2>
				<p>Donec id elit non mi porta gravida at eget metus. Fusce
					dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
					ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
					magna mollis euismod. Donec sed odio dui.</p>
			</div>
		</div>

		<hr>

		<!-- Footer -->
		<c:import url="importRodape.jsp" />
		<!-- /Footer -->

	</div>
	<!-- /container -->


	<!-- JavaScript -->
	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/bootstrap.js"></script>

</body>
</html>