create database botiga;

use botiga

create table productos(
    id int primary key,
    nombre_producto varchar(200),
    imagen_url varchar(200),
    descripcion varchar(200),
    precio float
);

INSERT INTO productos (id, nombre_producto, imagen_url,descripcion,precio) VALUES (1, 'Camiseta', 'img/1.png','Descripción random',10.5);
INSERT INTO productos (id, nombre_producto, imagen_url,descripcion,precio) VALUES (2, 'Deportivas', 'img/2.png','Descripción random',22.5);
INSERT INTO productos (id, nombre_producto, imagen_url,descripcion,precio) VALUES (3, 'Deportivas grises', 'img/3.png','Descripción random',34.4);
INSERT INTO productos (id, nombre_producto, imagen_url,descripcion,precio) VALUES (4, 'Camiseta negra', 'img/4.png','Descripción random',22.1);
INSERT INTO productos (id, nombre_producto, imagen_url,descripcion,precio) VALUES (5, 'Camiseta de tirantes', 'img/5.png','Descripción random',45.1);
INSERT INTO productos (id, nombre_producto, imagen_url,descripcion,precio) VALUES (6, 'Deportivas blancas', 'img/6.png','Descripción random',80.6);
INSERT INTO productos (id, nombre_producto, imagen_url,descripcion,precio) VALUES (7, 'Deportivas nike', 'img/7.png','Descripción random',45.6);
INSERT INTO productos (id, nombre_producto, imagen_url,descripcion,precio) VALUES (8, 'Deportivas air force', 'img/8.png','Descripción random',67.4);