create database botiga;

use botiga

create table productos(
    id int,
    nombre_producto varchar(200),
    imagen_url varchar(200),
    descripcion varchar(200)
);

-- Insertar datos en la tabla MyGuests
INSERT INTO productos (id, nombre_producto, imagen_url,descripcion) VALUES (1, 'Camiseta', '','Descripción random');

INSERT INTO productos (id, nombre_producto, imagen_url,descripcion) VALUES (2,'Mi reina preciosa','https://i.pinimg.com/280x280_RS/86/e4/2d/86e42defe7f484f8fdd89705c0a738dd.jpg','La chica de mis ojos');

INSERT INTO productos (id, nombre_producto, imagen_url,descripcion) VALUES (3,'El profe','https://media.licdn.com/dms/image/D4E03AQHZcaUgsbW6Pw/profile-displayphoto-shrink_800_800/0/1694030247977?e=2147483647&v=beta&t=qUf4bxKOvxAulcRDuMrMLeGGH8rI0CETsZ1LDHiRa2o','La leyenda dice que si dices javascript 3 veces se aparece en tu espalda.');
