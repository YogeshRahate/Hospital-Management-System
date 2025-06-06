<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-success">
	<div class="container-fluid">
		<a class="navbar-brand" href="index.jsp"><i
			class="fa-regular fa-hospital"></i> City Hospital</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">

				<c:if test="${empty userObj}">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="Admin_login.jsp"><i
							class="fa-solid fa-right-to-bracket"></i> Admin</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="Doctor_login.jsp
          "><i
							class="fa-solid fa-user-doctor"></i> Doctor</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="user_appointment.jsp"><i
							class="fa-regular fa-calendar-check"></i> Appointment</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="User_login.jsp"><i
							class="fa-regular fa-user"></i> User</a></li>
				</c:if>



				<c:if test="${not empty userObj }">

					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="user_appointment.jsp"><i
							class="fa-regular fa-calendar-check"></i> Appointment</a></li>

					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="view_appointment.jsp"><i
							class="fa-regular fa-calendar-check"></i> View Appointment</a></li>
					<li class="nav-item dropdown active"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							<i class="fa-solid fa-circle-user"></i> ${userObj.fullname }
					</a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="change_password.jsp">Change
									Password</a></li>
							<li><a class="dropdown-item" href="userLogout">Log Out</a></li>

						</ul></li>

				</c:if>







			</ul>

		</div>
	</div>
</nav>