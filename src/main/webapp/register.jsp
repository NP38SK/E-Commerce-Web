<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<%@include file="includes/head.jsp"%>
</head>
<body>
	<%@include file="includes/navbar.jsp"%>

	<div class="container">
		<div class="card w-50 mx-auto my-5">
			<div class="card-header text-center">User Registration</div>

			<%
			String regMsg = (String) session.getAttribute("reg-success");
			if (regMsg != null) {
			%>
			<div class="alert alert-success" role="alert"><%=regMsg%>
				Login<a href="login.jsp">Click here</a>
			</div>

			<%
			session.removeAttribute("reg-success");
			}
			%>


			<%
			String failedMsg = (String) session.getAttribute("failed-msg");
			if (failedMsg != null) {
			%>

			<div class="alert alert-danger" role="alert"><%=failedMsg%></div>
			<%
			session.removeAttribute("failed-msg");
			}
			%>

			<div class="card-body">
				<form action="user-registration" method="post">
					<div class="form-group">
						<label>Name</label> <input type="text" name="name"
							class="form-control" placeholder="Enter Name" required>
					</div>

					<div class="form-group">
						<label>Email address</label> <input type="email" name="email"
							class="form-control" placeholder="Enter email" required>
					</div>
					<div class="form-group">
						<label>Mobile Number</label> <input type="number"
							name="mobilenumber" class="form-control"
							placeholder="Enter Mobile Number" required>
					</div>
					<div class="form-group">
						<label>Password</label> <input type="password"
							name="password" class="form-control" placeholder="Password"
							required>
					</div>
					<div class="form-group">
						<label>Address</label> <input type="text" name="address"
							class="form-control" placeholder="Enter Address" required>
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Register</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<%@include file="includes/footer.jsp"%>
</body>
</html>