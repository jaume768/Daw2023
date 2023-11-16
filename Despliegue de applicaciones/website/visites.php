<?php
// Comprobamos si la cookie 'visites' está presente
if(isset($_COOKIE['visites'])) {
    // Si la cookie está presente, obtenemos su valor y lo incrementamos en 1
    $visitas = $_COOKIE['visites'] + 1;
} else {
    // Si la cookie no está presente, establecemos el valor del contador a 1
    $visitas = 1;
}

// Establecemos la cookie 'visites' con el nuevo valor y una duración de 1 día (86400 segundos)
setcookie('visites', $visitas, time() + 86400);

// Mostramos el número de visitas
echo "num = " . $visitas;
?>
