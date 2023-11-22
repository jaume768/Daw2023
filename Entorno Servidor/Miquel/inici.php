
<?php 
    echo 'Ejercicio 1:';
    echo '<h1>Hello world</h1>';

    echo 'Ejercicio 3:';
    $random = rand(0, 10);
    echo "<h1>$random</h1>";

    if (($random % 2) == 0) {
        echo '<h2 style="color: green;">Es un número par</h2>';
    } else {
        echo '<h2 style="color: red;">Es un número impar</h2>';
    }

    echo 'Ejercicio 4:';

    $notes = [
        "Miquel" => 5,
        "Bernat" => 2,
        "Carles" => 8,
        "Dani" => 3,
        "Ester" => 9,
        "Francesc" => 4,
        "Pep" => 5,
        "Laura" => 10,
        "Noelia" => 7,
        "Javi" => 6,
        "Joan" => 9,
        "Jaume" => 6,
        "Neus" => 4
    ];


    foreach ($notes as $nomPersona => $nota) {
        echo "<h3>Alumne: $nomPersona, Nota: $nota </h3>";
        if ($nota >= 5) {
            echo '<h3 style="color: green;">Aprovat</h3>';
        } else {
            echo '<h3 style="color: red;">Suspes</h3>';
        }
    }

    echo 'Ejercicio 5:';

    ksort($notes);
    echo 'alfabeticamente';
    foreach ($notes as $nomPersona => $nota) {
        echo "<h3> $nomPersona</h3>";
    }

    arsort($notes);
    echo 'por nota:';
    foreach ($notes as $nomPersona => $nota) {
        echo "<h3> $nomPersona : $nota</h3>";
    }

    $totalEstudiantes = count($notes);
    $aprobados = 0;
    $suspendidos = 0;

    foreach ($notes as $nota) {
        if ($nota > 5) {
            $aprobados++;
        } else {
            $suspendidos++;
        }
    }

    $porcentajeAprobados = ($aprobados / $totalEstudiantes) * 100;
    $porcentajeSuspendidos = ($suspendidos / $totalEstudiantes) * 100;

    echo "Porcentaje de aprobados: " . round($porcentajeAprobados, 2) . "%";
    echo "<h1></h1>";
    echo "Porcentaje de suspendidos: " . round($porcentajeSuspendidos, 2) . "%";

    echo "<h1></h1>";
    echo 'Ejercicio 6:';
    echo "</br>";

    for ($i = 1; $i < 11; $i++) {
        for ($j = 1; $j < 11; $j++) {
            $resultado = $i * $j;
            echo "$resultado ";
        }
        echo "<br>";
    }

    echo "<h1></h1>";
    echo 'Ejercicio 7:';

    $texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt
    ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation
    ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
    reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint
    occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est
    laborum.";

    echo "<br>";
    $longTexto = strlen($texto);
    echo "carácteres del texto: $longTexto";

    strtoupper($texto);
    strtolower($texto);

    $textoMod = "";

    for ($a=0; $a < $longTexto; $a++) {

        $caracter = substr($texto,$a,1);
        if($caracter === "a"){
            $textoMod .= "?";
        } else {
            $textoMod .= $caracter;
        }
    };

    echo $textoMod;

?>    
