<!DOCTYPE html>
<html lang="ca">
<head>
    <meta charset="UTF-8">
    <title>Detalls del Videojoc</title>
</head>
<body>
    <h1>Detalls del Videojoc</h1>
    <?php
    $gameName = $_GET["nom"];
    $games = json_decode(file_get_contents('games.json'), true);
    foreach ($games as $game) {
        if ($game["Nom"] == $gameName) {
            echo "<p><strong>Nom:</strong> {$game["Nom"]}</p>";
            echo "<p><strong>Desenvolupador:</strong> {$game["Desenvolupador"]}</p>";
            echo "<p><strong>Plataforma:</strong> {$game["Plataforma"]}</p>";
            echo "<p><strong>Data de Llançament:</strong> {$game["Llançament"]}</p>";
            break;
        }
    }
    ?>
    <a href="index.php">Tornar al menú</a>
</body>
</html>
