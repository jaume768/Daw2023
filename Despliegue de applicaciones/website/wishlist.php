<?php
session_start();

if (!isset($_SESSION['wishlist'])) {
    $_SESSION['wishlist'] = array();
}

if(isset($_GET['nom']) && !empty($_GET['nom'])) {
    $cosaDeseada = $_GET['nom'];
    
    if(!in_array($cosaDeseada, $_SESSION['wishlist'])) {
        $_SESSION['wishlist'][] = $cosaDeseada;
    }
}
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Deseos</title>
</head>
<body>
    <h1>Añadir a la Lista de Deseos</h1>
    <form action="wishlist.php" method="get">
        <label for="nom">Nombre de la cosa deseada:</label>
        <input type="text" id="nom" name="nom" required>
        <input type="submit" value="Añadir a la lista de deseos">
    </form>

    <?php
    if(isset($_SESSION['wishlist']) && count($_SESSION['wishlist']) > 0) {
        echo "<h2>Lista de deseos:</h2>";
        echo "<ul>";
        foreach($_SESSION['wishlist'] as $cosa) {
            echo "<li>$cosa</li>";
        }
        echo "</ul>";
    } else {
        echo "<p>No hay elementos en la lista de deseos.</p>";
    }
    ?>
</body>
</html>
