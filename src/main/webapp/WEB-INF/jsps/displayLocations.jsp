<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Locations</title>
</head>
<body>

<h2>Locations: </h2>
<table>
    <tr>
        <td>id</td>
        <td>code</td>
        <td>name</td>
        <td>type</td>
    </tr>

    <c:forEach items="${locations}" var="location">
    <tr>
        <td>${location.id}</td>
        <td>${location.code}</td>
        <td>${location.name}</td>
        <td>${location.type}</td>
        <td><a href="deleteLocation?id=${location.id}">Delete</a></td>
        <td><a href="showLocation?id=${location.id}">Edit</a></td>
    </tr>
    </c:forEach>
</table>

<a href="showCreate">Add Location</a>

</body>
</html>