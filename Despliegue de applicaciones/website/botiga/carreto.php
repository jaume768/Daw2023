<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Carrito de Compras</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<?php
session_start();

$servername = "localhost";
$username = "provauser";
$password = "contra";
$dbname = "botiga";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

?>

<div class="container mt-5">
    <?php
    if(isset($_GET['codi_producto'])){
        $codi_producto = $_GET['codi_producto'];
        if(isset($_SESSION['carrito'])){
            $_SESSION['carrito'][] = $codi_producto;
        } else {
            $_SESSION['carrito'] = array($codi_producto);
        }
    }

    if(isset($_POST['comprar'])) {
        unset($_SESSION['carrito']);
        echo "<div class='alert alert-success' role='alert'>Compra realizada con éxito. El carrito ha sido vaciado.</div>";
    } else {
        $total = 0;

        if(isset($_SESSION['carrito'])){
            echo "<div class='row justify-content-center'>";
            echo "<div class='col-md-8'>";
            echo "<table class='table'>";
            echo "<thead><tr><th scope='col'>Nombre del Producto</th><th scope='col'>Precio</th></tr></thead>";
            echo "<tbody>";

            foreach($_SESSION['carrito'] as $codi_producto){
                $sql = "SELECT nombre_producto, precio FROM productos WHERE id = $codi_producto";
                $result = $conn->query($sql);

                if($result->num_rows > 0){
                    $row = $result->fetch_assoc();
                    $nombre_producto = $row['nombre_producto'];
                    $precio_producto = $row['precio'];
                    echo "<tr><td>$nombre_producto</td><td>$precio_producto €</td></tr>";
                    $total += $precio_producto;
                }
            }

            echo "</tbody></table>";
            echo "<br><p>Total del carrito: " . $total . "€</p>";
            echo "<form method='post' action=''>";
            echo "<input type='submit' name='comprar' value='Comprar' class='btn btn-primary'>";
            echo "</form></div></div>";
        } else {
            echo "<div class='alert alert-info' role='alert'>El carrito está vacío.</div>";
        }
    }
    ?>

</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

<?php
$conn->close();
?>



