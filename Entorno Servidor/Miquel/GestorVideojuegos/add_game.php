<?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $nom = $_POST["nom"];
        $desenvolupador = $_POST["desenvolupador"];
        $plataforma = $_POST["plataforma"];
        $llançament = $_POST["llançament"];
    
        $newGame = [
            "Nom" => $nom,
            "Desenvolupador" => $desenvolupador,
            "Plataforma" => $plataforma,
            "Llançament" => $llançament
        ];
    
        $gamesJson = file_get_contents('games.json');
        $games = json_decode($gamesJson, true) ?: [];
    
        $games[] = $newGame;
    }
?>

<!DOCTYPE html>
<html lang="ca">
<head>
    <meta charset="UTF-8">
    <title>Afegir Videojoc</title>
</head>
<body>
    <h1>Afegir Videojoc</h1>
    <form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
        Nom: <input type="text" name="nom" required><br>
        Desenvolupador: <input type="text" name="desenvolupador" required><br>
        Plataforma: <input type="text" name="plataforma" required><br>
        Llançament: <input type="date" name="llançament" required><br>
        <input type="submit" value="Afegir">
    </form>
</body>
</html>
