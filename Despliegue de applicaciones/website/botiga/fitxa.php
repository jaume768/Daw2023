<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalles del Producto</title>
    <!-- Enlace a Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
    </style>
</head>

<body>
    <div class="container text-center bg-dark text-white" style="min-height: 100vh;">
        <div class="row bg-primary">
            <div class="col display-4 text-white text-center">
                Header
            </div>
        </div>

        <div class="container mt-5 ">
            <?php
            $codi = $_GET['codi'];

            $servername = "localhost";
            $username = "provauser";
            $password = "contra";
            $dbname = "botiga";

            // Crear conexión
            $conn = new mysqli($servername, $username, $password, $dbname);

            // Verificar la conexión
            if ($conn->connect_error) {
                die("Conexión fallida: " . $conn->connect_error);
            }
        
            $sql = "SELECT * FROM productos WHERE id = $codi";
            $result = $conn->query($sql);
        
            // Paso 5: Mostrar los resultados
            if ($result->num_rows > 0) {
                while ($row = $result->fetch_assoc()) {
                    ?>
                        <div class="row justify-content-center text-center mb-4">
                            <div class="col-md-12">
                                <h1><?= $row["nombre_producto"] ?></h1>
                            </div>
                            <div class="col-md-4 mb-4">
                                <img src="<?= $row["imagen_url"] ?>" alt="Imagen del producto" class="img-fluid">
                            </div>
                            <div class="col-md-8">
                                <p class="mb-4"><?= $row["descripcion"] ?></p>
                                <button class="btn btn-primary mb-2">Comprar</button>
                                <a class="btn btn-success mb-2" href="carreto.php?codi_producto=<?= $codi ?>">Añadir al carrito</a>
                            </div>
                        </div>
                    <?php
                        }
            } else {
                echo "No se encontraron resultados para el código proporcionado.";
            }
            $conn->close();
            ?>
        </div>

        <div class="fixed-bottom w-100">
            <div class="container bg-primary text-center py-3">
                column
            </div>
        </div>
    </div>
    
</body>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</html>
