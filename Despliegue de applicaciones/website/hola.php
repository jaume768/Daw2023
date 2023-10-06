<!DOCTYPE html>
<html>
<head>
    <title>Página de prueba</title>
</head>
<body>
    <h1>HOLA <?php echo isset($_GET['nom']) ? $_GET['nom'] : 'Invitado'; ?></h1>
</body>
</html>