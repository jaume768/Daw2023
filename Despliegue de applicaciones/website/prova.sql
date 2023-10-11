create database prova;

use prova

create table MyGuests(
    id int,
    firstname varchar(200),
    lastname varchar(200)
);

-- Insertar datos en la tabla MyGuests
INSERT INTO MyGuests (id, firstname, lastname) VALUES (1, 'John', 'Doe');
INSERT INTO MyGuests (id, firstname, lastname) VALUES (2, 'Mary', 'Moe');
INSERT INTO MyGuests (id, firstname, lastname) VALUES (3, 'Julie', 'Dooley');
