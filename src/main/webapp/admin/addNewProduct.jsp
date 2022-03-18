<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
<%@include file="adminHeader.jsp" %>
</head>
<body>
<%@include file="adminnavbar.jsp" %>
	<div class="container">
		<div class="card w-50 mx-auto my-5">
			<div class="card-header text-center">Add New Products</div>
			<div class="card-body">
				<form action="ProductServlet" method="post">
					<div class="form-group">
						<label>Products Name</label> <input type="text" name="name"
							class="form-control" placeholder="Enter Name" required>
					</div>
					<div class="form-group">
						<label>Products Category</label> <input type="text" name="category"
							class="form-control" placeholder="Enter Product Category" required>
					</div>
					<div class="form-group">
						<label>Products Price</label> <input type="number" name="price"
							class="form-control" placeholder="Enter Product Price" required>
					</div>
					<div class="form-group">
						<label>Products Images</label> <input type="file" name="images"
							class="form-control" placeholder="Enter Product Images" required>
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Add Product</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>