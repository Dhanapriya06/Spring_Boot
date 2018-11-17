<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">



<link
	href='https://fonts.googleapis.com/css?family=Product+Sans:400,400i,700,700i'
	rel='stylesheet' type='text/css'>



<link rel="stylesheet" href="../css/sim_custom.css">



<title>InfyTel</title>

</head>

<body>

	<header id="header"> <nav
		class="navbar navbar-light bg-faded navbar-fixed-top">

	<div class="container-fluid" id="cont2">

		<b>

			<div class="navbar-header">

				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#st-navbar-collapse">

					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>

				</button>



				<a class="navbar-brand" href="">InfyTel</a>

			</div>



			<div class="collapse navbar-collapse" id="st-navbar-collapse">

				<div class="">

					<ul class="nav navbar-nav navbar-right">



						<li><a href="">Home</a></li>

						<li><a href="#">Shop</a></li>

						<li><a href="#">Prepaid Plans</a></li>

						<li><a href="#">Find a Retailer</a></li>



						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">More<span class="caret"></span></a>

							<ul class="dropdown-menu">

								<li><a href="#">Special Offers</a></li>

							</ul></li>

						<li><a href="#contact" id="contid">Help</a></li>



					</ul>

				</div>



			</div>

		</b>

	</div>

	<!-- /.navbar-collapse --> </nav>



	<div class="container-fluid">

		<div class="row" style="color: white; background-color: #337ab7;">

			<h6 id='redhd'>Creating new user</h6>

		</div>

		<div class="row">

			<div class="col-sm-5" style="border: 1px">

				<h1>Welcome to InfyTel</h1>

				<h4>India's Favourite Network.</h4>

				<h5>InfyTel is the first company to have an automated online

					verification process. Follow the steps to continue and activate

					your SIM.</h5>

				<br> <br>

				<h5>Explore our special offers for new users to get more

					benefits at lower costs.</h5>

				<br> <br>

				<!-- h5>

                                                                                                Tip for testing:<br> Use SIM Number : 9999999999999 Service

                                                                                                Number : 9999999999 Email ID : a@b.c DOB : 12-12-1990 First Name :

                                                                                                Mihir Last Name : Khandekar Aadhaar ID : 12345

                                                                                </h5-->

			</div>

			<div class="col-sm-7">

				<div id="carousel-example-generic" class="carousel slide"
					data-ride="carousel" data-interval="false">

					<!-- Indicators -->

					<ol class="carousel-indicators">

						<li data-target="#carousel-example-generic" class="active"></li>

						<li data-target="#carousel-example-generic"></li>

						<li data-target="#carousel-example-generic"></li>

						<li data-target="#carousel-example-generic"></li>

						<li data-target="#carousel-example-generic"></li>

						<li data-target="#carousel-example-generic"></li>

						<li data-target="#carousel-example-generic"></li>

						<li data-target="#carousel-example-generic"></li>

						<li data-target="#carousel-example-generic"></li>



					</ol>



					<!-- Wrapper for slides -->

					<form:form method="GET" action="simValidation"
						modelAttribute="command">

						<div class="carousel-inner" role="listbox">

							<div class="item active">

								<h1>Thank you for purchasing a InfyTel SIM card.</h1>

								<h2>Let's get connected.</h2>



								<br>

								<h3>Please keep your SIM kit and identification documents

									ready.</h3>

								<input type="submit" class="btn btn-primary"
									value="Get Connected" />



							</div>

						</div>

					</form:form>

				</div>

			</div>

		</div>

	</div>

	</header>

</body>

</html>

