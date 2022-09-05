<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add books to bookstore</title>
</head>
<body>
<form action="addBook">
	<label>Name : </label><br>
	<input type="number" name="bookId" placeholder="BookId"><br>
	<label>BookName : </label><br>
	<input type="text" name="bookName" placeholder="BookName"><br>
	<label>AuthorName : </label><br>
	<input type="text" name="authorName" placeholder="AuthorName"><br>
	<label>BookGenre : </label><br>
	<input type="text" name="bookGenre" placeholder="BookGenre"><br>
	<label>BookPrice : </label><br>
	<input type="number" step="0.01" name="bookPrice" placeholder="BookPrice"><br>
	<input type="submit"><br>
</form>
	
</body>
</html>