CREATE DATABASE Hotel_SuCarnet;

USE Hotel_SuCarnet;

-- Tabla hotel
CREATE TABLE hotel (
  codigoHotel INT PRIMARY KEY auto_increment ,
  Nombre VARCHAR(100),
  Direccion VARCHAR(100),
  sitioWeb VARCHAR(100)
);

-- Tabla reservacion
CREATE TABLE reservacion (
  codigoReserva INT PRIMARY KEY auto_increment ,
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
  codigoHabitacion INT PRIMARY KEY auto_increment,
  codigoHotel INT,
  tipo VARCHAR(50),
  precio DECIMAL(8,2),
  FOREIGN KEY (codigoHotel) REFERENCES hotel(codigoHotel)
);

-- Tabla huesped
CREATE TABLE huesped (
  codigoHuesped INT PRIMARY KEY auto_increment,
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



-- Modificar la tabla hotel para hacer la llave primaria autoincremental
ALTER TABLE hotel MODIFY COLUMN codigoHotel INT AUTO_INCREMENT;

-- Modificar la tabla reservacion para hacer la llave primaria autoincremental
ALTER TABLE reservacion MODIFY COLUMN codigoReserva INT AUTO_INCREMENT;

-- Modificar la tabla habitacion para hacer la llave primaria autoincremental
ALTER TABLE habitacion MODIFY COLUMN codigoHabitacion INT AUTO_INCREMENT;

-- Modificar la tabla huesped para hacer la llave primaria autoincremental
ALTER TABLE huesped MODIFY COLUMN codigoHuesped INT AUTO_INCREMENT;



INSERT INTO hotel (Nombre, Direccion, sitioWeb)
VALUES
  ('Hotel A', 'Dirección A', 'www.hotela.com'),
  ('Hotel B', 'Dirección B', 'www.hotelb.com'),
  ('Hotel C', 'Dirección C', 'www.hotelc.com');
  
  
  INSERT INTO reservacion (codigoHotel, codigoHuesped, codigoHabitacion, fechaInicio, fechaFin)
VALUES
  (1, 1, 1, '2023-07-30', '2023-08-05'),
  (2, 2, 2, '2023-08-10', '2023-08-15'),
  (3, 3, 3, '2023-09-01', '2023-09-10');
  
  
  INSERT INTO habitacion (codigoHotel, tipo, precio)
VALUES
  (1, 'Individual', 100.00),
  (2, 'Doble', 150.00),
  (3, 'Suite', 250.00);
  
  
  INSERT INTO huesped (nombre, email, direccion, telefono)
VALUES
  ('Juan Perez', 'juan@example.com', 'Calle 123', '1234567890'),
  ('Maria Lopez', 'maria@example.com', 'Avenida 456', '9876543210'),
  ('Pedro Ramirez', 'pedro@example.com', 'Carretera 789', '5555555555');