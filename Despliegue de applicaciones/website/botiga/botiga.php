<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    
    <div class="container text-center">
        <div class="row bg-primary">
            <div class="col display-4 text-white">
                Header
            </div>
        </div>
        <div class="row min-vh-100 bg-dark d-flex">
            <div class="row d-flex text-white">
            <?php
                $servername = "localhost";
                $username = "provauser";
                $password = "contra";
                $dbname = "botiga";
                
                // Create connection
                $conn = new mysqli($servername, $username, $password, $dbname);
                // Check connection
                if ($conn->connect_error) {
                  die("Connection failed: " . $conn->connect_error);
                }

                $sql = "SELECT * FROM productos";
                $result = $conn->query($sql);

                if ($result->num_rows > 0) {
                    while($row = $result->fetch_assoc()) {
                        echo '<a href="fitxa.php?codi=' . $row["id"] . '">';
                        echo '<div class="col">';
                        echo '<div class="card bg-dark border-primary shadow" style="width: 12rem; margin-top: 10px; margin-left: 10px;">';
                        echo '<img src="' . $row["imagen_url"] . '" class="card-img-top" alt="..." style="height: 200px;">';
                        echo '<div class="card-body">';
                        echo '<h5 class="card-title text-white">' . $row["nombre_producto"] . '</h5>';
                        echo '<p class="card-text text-white">' . $row["descripcion"] . '</p>';
                        echo '<p class="card-text text-white">' . $row["precio"] . '€</p>';
                        echo '<a href="#" class="btn btn-primary">Comprar</a>';
                        echo '</div>';
                        echo '</div>';
                        echo '</div>';
                        echo '</a>';
                    }
                } else {
                    echo "0 results";
                }

                $conn->close();

            ?>
            </div>
        </div>    
        <div class="row bg-primary">
            <div class="col">
                column
            </div>
        </div>
    </div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>