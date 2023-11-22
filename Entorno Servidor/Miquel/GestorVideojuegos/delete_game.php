<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $games = json_decode(file_get_contents('games.json'), true);
    $selectedGame = $_POST["joc"];
    foreach ($games as $key => $game) {
        if ($game["Nom"] == $selectedGame) {
            unset($games[$key]);
        }
    }
    file_put_contents('games.json', json_encode(array_values($games)));
    header("Location: index.php");
}
?>

<!DOCTYPE html>
<html lang="ca">
<head>
    <meta charset="UTF-8">
    <title>Eliminar Videojoc</title>
</head>
<body>
    <h1>Eliminar Videojoc</h1>
    <form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
        <select name="joc" required>
            <?php
            $games = json_decode(file_get_contents('games.json'), true);
            foreach ($games as $game) {
                echo "<option value='{$game["Nom"]}'>{$game["Nom"]}</option>";
            }
            ?>
        </select>
        <input type="submit" value="Eliminar">
    </form>
</body>
</html>
