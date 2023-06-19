CREATE DATABASE Hotel_SuCarnet;

USE Hotel_SuCarnet;

-- Tabla hotel
CREATE TABLE hotel (
  codigoHotel INT PRIMARY KEY,
  Nombre VARCHAR(100),
  Direccion VARCHAR(100),
  sitioWeb VARCHAR(100)
);

-- Tabla reservacion
CREATE TABLE reservacion (
  codigoReserva INT PRIMARY KEY,
  codigoHotel INT,
  codigoHuesped INT,
  codigoHabitacion INT,
  fechaInicio DATE,
  fechaFin DATE,
  FOREIGN KEY (codigoHotel) REFERENCES hotel(codigoHotel),
  FOREIGN KEY (codigoHuesped) REFERENCES huesped(codigoHuesped),
  FOREIGN KEY (codigoHabitacion) REFERENCES habitacion(codigoHabitacion)
);

-- Tabla habitacion
CREATE TABLE habitacion (
  codigoHabitacion INT PRIMARY KEY,
  codigoHotel INT,
  tipo VARCHAR(50),
  precio DECIMAL(8,2),
  FOREIGN KEY (codigoHotel) REFERENCES hotel(codigoHotel)
);

-- Tabla huesped
CREATE TABLE huesped (
  codigoHuesped INT PRIMARY KEY,
  nombre VARCHAR(100),
  email VARCHAR(100),
  direccion VARCHAR(100),
  telefono VARCHAR(20)
);


INSERT INTO hotel (codigoHotel, Nombre, Direccion, sitioWeb)
VALUES (1, 'Hotel A', 'Dirección A', 'www.hotela.com');

INSERT INTO hotel (codigoHotel, Nombre, Direccion, sitioWeb)
VALUES (2, 'Hotel B', 'Dirección B', 'www.hotelb.com');
INSERT INTO habitacion (codigoHabitacion, codigoHotel, tipo, precio)
VALUES (1, 1, 'Individual', 100.00);

INSERT INTO habitacion (codigoHabitacion, codigoHotel, tipo, precio)
VALUES (2, 1, 'Doble', 150.00);
INSERT INTO huesped (codigoHuesped, nombre, email, direccion, telefono)
VALUES (1, 'Juan Pérez', 'juan@example.com', 'Dirección 1', '123456789');

INSERT INTO huesped (codigoHuesped, nombre, email, direccion, telefono)
VALUES (2, 'María Gómez', 'maria@example.com', 'Dirección 2', '987654321');
INSERT INTO reservacion (codigoReserva, codigoHotel, codigoHuesped, codigoHabitacion, fechaInicio, fechaFin)
VALUES (1, 1, 1, 1, '2023-06-20', '2023-06-25');

INSERT INTO reservacion (codigoReserva, codigoHotel, codigoHuesped, codigoHabitacion, fechaInicio, fechaFin)
VALUES (2, 2, 2, 2, '2023-07-10', '2023-07-15');