<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Location</title>
</head>
<body>

    <form action="saveLoc" method="post">
        <pre>
            Code: <input type="text" name="code"/>
            Name: <input type="text" name="name"/>
            Type: Urban<input type="radio" name="type" value="urban"/>
                    Rural<input type="radio" name="type" value="rural"/>
            <input type="submit" value="save"/>
        </pre>
    </form>

    ${msg}

    <a href="displayLocations">Locations</a>

</body>
</html>