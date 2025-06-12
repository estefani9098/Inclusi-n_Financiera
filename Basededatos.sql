CREATE DATABASE bdinclusionfinanciera
GO
USE bdinclusionfinanciera;
GO

CREATE TABLE tblUsuario
(
ID_Usuario VARCHAR(8) PRIMARY KEY NOT NULL,
Usu_Nombres VARCHAR(50) NOT NULL,
Usu_Apellidos VARCHAR(50) NOT NULL,
Usu_Gmail VARCHAR(30),
Usu_Contraseña VARCHAR(10) NOT NULL,
Usu_Telefono VARCHAR(11) NOT NULL
)

CREATE TABLE tblMetaAhorro
(
ID_MetaAhorro VARCHAR(8) PRIMARY KEY NOT NULL,
Met_Nombre VARCHAR(30) NOT NULL,
Met_Ahorro DECIMAL(8,2),
Met_Estado VARCHAR(15) NOT NULL,
Met_FechaLimite DATE NOT NULL,
Met_Montoactual DECIMAL(8,2) NOT NULL,
ID_Usuario VARCHAR(8)NOT NULL,
FOREIGN KEY(ID_Usuario) REFERENCES tblUsuario (ID_Usuario),
)

CREATE TABLE tblAhorro
(
ID_Ahorro VARCHAR(8) PRIMARY KEY NOT NULL,
Aho_Monto DECIMAL(8,2) NOT NULL,
Aho_Fecha DATE NOT NULL,
Aho_Progreso VARCHAR(100),
ID_MetaAhorro VARCHAR(8) NOT NULL,
FOREIGN KEY (ID_MetaAhorro) REFERENCES tblMetaAhorro(ID_MetaAhorro)
)

INSERT INTO tblUsuario VALUES
('USU-0001', 'Maria Fernanda', 'López Castro', 'mlopez@gmail.com', '76372mlo','987347623'),
('USU-0002', 'Carlos Alberto', 'Ramírez Díaz', 'carlitoz1@gmail.com', 'carlitoz1', '912345678'),
('USU-0003', 'Andrea Lucia', 'Soto Rojas', 'asoto@gmail.com', 'andre123', '945612378'),
('USU-0004', 'Luis Enrique', 'Valverde Ramos', 'lvalverde@gmail.com', 'luise1234', '987654321'),
('USU-0005', 'Valeria Sofía', 'Ticona Mamani', 'valeriat@gmail.com', 'valsofi20', '943212765'),
('USU-0006', 'Jorge Manuel', 'Zeballos Ponce', 'jorgezp@gmail.com', 'jorge1234', '913456789'),
('USU-0007', 'Karla Milagros', 'Meza Quispe', 'karla.mq@gmail.com', 'karla321', '987312456'),
('USU-0008', 'Alonso Javier', 'Reyes Flores', 'areyesf@gmail.com', 'alonsito', '999111222'),
('USU-0009', 'Ana María', 'Vargas Soto', 'anavargas@gmail.com', 'anita2025', '988888888'),
('USU-0010', 'Pedro Pablo', 'Chávez Luján', 'pedroch@gmail.com', 'pablo456', '921212121'),
('USU-0011', 'Daniela Raquel', 'Núñez Valdivia', 'daniraq@gmail.com', 'dani1234', '945000111'),
('USU-0012', 'José Martín', 'Quispe Arana', 'jquispe@gmail.com', 'martin202', '956789321'),
('USU-0013', 'Lucía Elena', 'Gómez Ortiz', 'luciael@gmail.com', 'lucy2025', '964123789'),
('USU-0014', 'Marco Tulio', 'Huamán Huanca', 'marcohh@gmail.com', 'tuliohuam', '933333333'),
('USU-0015', 'Alejandra Noelia', 'Condori Ríos', 'alecon@gmail.com', 'ale1234', '922222222'),
('USU-0016', 'César Augusto', 'García Mejía', 'cesargm@gmail.com', 'cesar456', '911111111'),
('USU-0017', 'Fabiana Irene', 'Loayza López', 'fabilo@gmail.com', 'fabiana1', '900123456'),
('USU-0018', 'Tomás Eduardo', 'Salazar Ruiz', 'tsalazar@gmail.com', 'tomy098', '987001122'),
('USU-0019', 'Camila Renata', 'Suárez Peña', 'camisuarez@gmail.com', 'cami321', '934567890'),
('USU-0020', 'Bruno Esteban', 'Mendoza Alarcón', 'brunom@gmail.com', 'bruno987', '976543210');

INSERT INTO tblMetaAhorro VALUES
('MET-0001', 'Viaje a Cusco', 1500.00, 'En progreso', '2025-12-31', 300.00, 'USU-0001'),
('MET-0002', 'Laptop nueva', 2500.00, 'Pendiente', '2026-01-15', 0.00, 'USU-0002'),
('MET-0003', 'Fondo de emergencia', 1000.00, 'En progreso', '2025-10-01', 450.00, 'USU-0003'),
('MET-0004', 'Curso en línea', 500.00, 'Completado', '2025-03-10', 500.00, 'USU-0004'),
('MET-0005', 'Celular nuevo', 1200.00, 'En progreso', '2025-11-20', 350.00, 'USU-0005'),
('MET-0006', 'Mochila de viaje', 300.00, 'Pendiente', '2025-07-10', 0.00, 'USU-0006'),
('MET-0007', 'Concierto', 200.00, 'Completado', '2025-05-20', 200.00, 'USU-0007'),
('MET-0008', 'Regalo para mamá', 350.00, 'En progreso', '2025-08-01', 150.00, 'USU-0008'),
('MET-0009', 'Aro dental', 800.00, 'Pendiente', '2025-12-01', 0.00, 'USU-0009'),
('MET-0010', 'Mesa de estudio', 600.00, 'En progreso', '2025-09-15', 200.00, 'USU-0010'),
('MET-0011', 'Ropa de invierno', 700.00, 'Completado', '2025-06-30', 700.00, 'USU-0011'),
('MET-0012', 'Pasajes navideños', 900.00, 'En progreso', '2025-12-15', 300.00, 'USU-0012'),
('MET-0013', 'TV para la sala', 1500.00, 'Pendiente', '2026-02-10', 0.00, 'USU-0013'),
('MET-0014', 'Bicicleta', 1000.00, 'En progreso', '2025-11-10', 400.00, 'USU-0014'),
('MET-0015', 'Curso de inglés', 650.00, 'En progreso', '2025-10-01', 150.00, 'USU-0015'),
('MET-0016', 'Teclado mecánico', 350.00, 'Pendiente', '2025-09-01', 0.00, 'USU-0016'),
('MET-0017', 'Cámara fotográfica', 1200.00, 'En progreso', '2026-01-01', 500.00, 'USU-0017'),
('MET-0018', 'Libros universitarios', 450.00, 'Completado', '2025-04-10', 450.00, 'USU-0018'),
('MET-0019', 'Implante dental', 2000.00, 'Pendiente', '2026-03-01', 0.00, 'USU-0019'),
('MET-0020', 'Horno eléctrico', 750.00, 'En progreso', '2025-12-05', 250.00, 'USU-0020');

INSERT INTO tblAhorro VALUES
('AHR-0001', 150.00, '2025-01-10', 'Inicio del ahorro', 'MET-0001'),
('AHR-0002', 150.00, '2025-02-10', 'Segundo depósito', 'MET-0001'),
('AHR-0003', 250.00, '2025-03-01', 'Inicio', 'MET-0003'),
('AHR-0004', 200.00, '2025-03-20', 'Pago adicional', 'MET-0003'),
('AHR-0005', 500.00, '2025-02-01', 'Pago completo', 'MET-0004'),
('AHR-0006', 150.00, '2025-04-10', 'Ahorro mensual', 'MET-0005'),
('AHR-0007', 100.00, '2025-05-10', 'Primer ahorro', 'MET-0005'),
('AHR-0008', 300.00, '2025-06-01', 'Regalo de cumpleaños', 'MET-0008'),
('AHR-0009', 200.00, '2025-06-20', 'Depósito especial', 'MET-0010'),
('AHR-0010', 350.00, '2025-07-05', 'Sueldo guardado', 'MET-0012'),
('AHR-0011', 150.00, '2025-08-01', 'Incentivo', 'MET-0014'),
('AHR-0012', 150.00, '2025-08-15', 'Nuevo ahorro', 'MET-0014'),
('AHR-0013', 100.00, '2025-09-10', 'Pago inicial', 'MET-0015'),
('AHR-0014', 50.00,  '2025-10-01', 'Pequeño ahorro', 'MET-0015'),
('AHR-0015', 250.00, '2025-11-01', 'Ingreso eventual', 'MET-0017'),
('AHR-0016', 250.00, '2025-11-20', 'Aguinaldo', 'MET-0017'),
('AHR-0017', 450.00, '2025-03-10', 'Pago final', 'MET-0018'),
('AHR-0018', 200.00, '2025-09-05', 'Inicio de ahorro', 'MET-0020'),
('AHR-0019', 50.00,  '2025-09-15', 'Pequeña contribución', 'MET-0020'),
('AHR-0020', 200.00, '2025-10-01', 'Tercera parte', 'MET-0020');

