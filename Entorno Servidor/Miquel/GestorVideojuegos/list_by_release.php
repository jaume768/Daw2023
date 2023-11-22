<!DOCTYPE html>
<html lang="ca">
<head>
    <meta charset="UTF-8">
    <title>Llistar per Llançament</title>
</head>
<body>
    <h1>Llistar per Llançament</h1>
    <?php
    $games = json_decode(file_get_contents('games.json'), true);
    echo "<p>Hi ha " . count($games) . " jocs guardats.</p>";
    echo "<ul>";
    foreach ($games as $game) {
        echo "<li><a href='game_details.php?nom={$game["Nom"]}'>{$game["Nom"]} ({$game["Llançament"]})</a></li>";
    }
    echo "</ul>";
    ?>
    <a href="index.php">Tornar al menú</a>
</body>
</html>
