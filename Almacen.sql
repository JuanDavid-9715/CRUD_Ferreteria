-- --------------------------------------------
-- crear y utilizar la base de datos Ferreteria
-- --------------------------------------------
create schema if not exists `Ferreteria`;
use `Ferreteria`;

-- -------------
-- table Almacen
-- -------------
create table if not exists `Store`(
	`id` int primary key not null,
    `name` varchar(30) not null,
    `category` enum("Tornillo", "Pvc", "Herramienta", "Pisos"),
    `purchaseValue` double(9,2) not null,
    `seleValue` double(9,2) not null,
    `quantity` int not null
);


insert into `Store` value (101, "tornillo cola", "Tornillo", 100000.00, 10000.00, 20);
insert into `Store` value (102, "martillo", "Herramienta", 500000.00, 50000.00, 10);
insert into `Store` value (103, "tubo de 1/4pulgadas x 1m", "Pvc", 300000.00, 10000.00, 5);
select * from `Store`;
-- drop database ferreteria;