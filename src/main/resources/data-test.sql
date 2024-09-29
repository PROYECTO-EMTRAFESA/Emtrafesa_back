-- Insertar en tipo_documento
INSERT INTO tipo_documento (tipo)
VALUES ('DNI'),
       ('Pasaporte'),
       ('Carnet de Extranjería')
    ON CONFLICT DO NOTHING;

-- Insertar datos de cliente
INSERT INTO cliente (nombre, apellidos)
VALUES ('Juan', 'Perez'),
       ('Maria', 'Lopez'),
       ('Carlos', 'Gomez')
    ON CONFLICT DO NOTHING;

-- Insertar en cliente_correos
INSERT INTO cliente_correos (tipo, correo, id_cliente)
VALUES ('PERSONAL', 'juan.perez@gmail.com', 1),
       ('TRABAJO', 'maria.lopez@empresa.com', 2),
       ('PERSONAL', 'carlos.gomez@hotmail.com', 3)
    ON CONFLICT DO NOTHING;

-- Insertar en cliente_telefonos
INSERT INTO cliente_telefonos (tipo, numero, id_cliente)
VALUES ('CELULAR', '999888777', 1),
       ('FIJO', '012345678', 2),
       ('TRABAJO', '998877665', 3)
    ON CONFLICT DO NOTHING;

-- Insertar en documento_identidad_cliente
INSERT INTO documento_identidad_cliente (id_tipo_documento, numero, id_cliente)
VALUES (1, 12345678, 1),
       (2, 98765432, 2),
       (3, 76543210, 3)
    ON CONFLICT DO NOTHING;

-- Insertar en detalle_bus
INSERT INTO detalle_bus (asientos, ambiente)
VALUES (40, 'Confort'),
       (30, 'Económico'),
       (50, 'VIP')
    ON CONFLICT DO NOTHING;

-- Insertar en bus
INSERT INTO bus (servicio, id_detalle_bus)
VALUES ('Lima - Arequipa', 1),
       ('Cusco - Puno', 2),
       ('Trujillo - Chiclayo', 3)
    ON CONFLICT DO NOTHING;

-- Insertar en empresa
INSERT INTO empresa (nombre_empresa, ruc, razon_social)
VALUES ('Transportes Emtrafesa', '20512345678', 'Emtrafesa S.A.C.'),
       ('Transportes Andes', '20487654321', 'Andes S.A.'),
       ('Transportes Sol', '20654321876', 'Sol EIRL')
    ON CONFLICT DO NOTHING;

-- Insertar en ruta
INSERT INTO ruta (duracion)
VALUES ('10 horas'),
       ('6 horas'),
       ('4 horas')
    ON CONFLICT DO NOTHING;

-- Insertar en escalas
INSERT INTO escalas (numero_escalas, id_ruta)
VALUES (2, 1),
       (3, 2),
       (1, 3)
    ON CONFLICT DO NOTHING;

-- Insertar en itinerario
INSERT INTO itinerario (id_ruta, id_bus)
VALUES (1, 1),
       (2, 2),
       (3, 3)
    ON CONFLICT DO NOTHING;

-- Insertar en pasajero
INSERT INTO pasajero (nombre, apellido_paterno, apellido_materno, sexo, fecha_nacimiento, id_itinerario)
VALUES ('Jose', 'Perez', 'Lopez', 'M', '1990-05-12', 1),
       ('Ana', 'Garcia', 'Fernandez', 'F', '1985-10-25', 2),
       ('Pedro', 'Ramos', 'Castillo', 'M', '1978-03-15', 3)
    ON CONFLICT DO NOTHING;

-- Insertar en pasajero_telefonos
INSERT INTO pasajero_telefonos (tipo, numero, id_pasajero)
VALUES ('CELULAR', '987654321', 1),
       ('FIJO', '456789123', 2),
       ('TRABAJO', '321654987', 3)
    ON CONFLICT DO NOTHING;

-- Insertar en documento_identidad_pasajero
INSERT INTO documento_identidad_pasajero (id_tipo_documento, numero, id_pasajero)
VALUES (1, 87654321, 1),
       (2, 54321987, 2),
       (3, 10987654, 3)
    ON CONFLICT DO NOTHING;

-- Insertar en pago
INSERT INTO pago (importe, numero_tarjeta, moneda)
VALUES (150.50, '4111111111111111', 'USD'),
       (100.00, '4222222222222222', 'USD'),
       (200.75, '4333333333333333', 'USD')
    ON CONFLICT DO NOTHING;

-- Insertar en pasaje
INSERT INTO pasaje (id_cliente, id_empresa, fecha_y_hora_salida, id_pago, id_itinerario)
VALUES (1, 1, '2024-09-26 08:00:00', 1, 1),
       (2, 2, '2024-09-26 10:00:00', 2, 2),
       (3, 3, '2024-09-26 12:00:00', 3, 3)
    ON CONFLICT DO NOTHING;

-- Insertar en postergacion
INSERT INTO postergacion (nueva_fecha_salida, nueva_hora_salida)
VALUES ('2024-10-01', '10:00:00'),
       ('2024-10-02', '12:00:00'),
       ('2024-10-03', '14:00:00')
    ON CONFLICT DO NOTHING;
