INSERT INTO tipo_documento (id_tipo_documento, tipo)
VALUES (1, 'DNI'),
       (2, 'Pasaporte'),
       (3, 'Carnet de Extranjería')
    ON CONFLICT (id_tipo_documento) DO NOTHING;

--datos del cliente
INSERT INTO cliente (id_cliente, nombre, apellidos)
VALUES (1, 'Juan', 'Perez'),
       (2, 'Maria', 'Lopez'),
       (3, 'Carlos', 'Gomez')
    ON CONFLICT (id_cliente) DO NOTHING;

INSERT INTO cliente_correos (id_cliente_correo, tipo, correo, id_cliente)
VALUES (1, 'PERSONAL', 'juan.perez@gmail.com', 1),
       (2, 'TRABAJO', 'maria.lopez@empresa.com', 2),
       (3, 'PERSONAL', 'carlos.gomez@hotmail.com', 3)
    ON CONFLICT (id_cliente_correo) DO NOTHING;

INSERT INTO cliente_telefonos (id_cliente_telefono, tipo, numero, id_cliente)
VALUES (1, 'CELULAR', '999888777', 1),
       (2, 'FIJO', '012345678', 2),
       (3, 'TRABAJO', '998877665', 3)
    ON CONFLICT (id_cliente_telefono) DO NOTHING;

INSERT INTO documento_identidad_cliente (id_documento_identidad_cliente, id_tipo_documento, numero, id_cliente)
VALUES (1, 1, 12345678, 1),
       (2, 2, 98765432, 2),
       (3, 3, 76543210, 3)
    ON CONFLICT (id_documento_identidad_cliente) DO NOTHING;

INSERT INTO detalle_bus (id_detalle_bus, asientos, ambiente)
VALUES (1, 40, 'Confort'),
       (2, 30, 'Económico'),
       (3, 50, 'VIP')
    ON CONFLICT (id_detalle_bus) DO NOTHING;

INSERT INTO bus (id_bus, servicio, id_detalle_bus)
VALUES (1, 'Lima - Arequipa', 1),
       (2, 'Cusco - Puno', 2),
       (3, 'Trujillo - Chiclayo', 3)
    ON CONFLICT (id_bus) DO NOTHING;

INSERT INTO empresa (id_empresa, nombre_empresa, ruc, razon_social)
VALUES (1, 'Transportes Emtrafesa', '20512345678', 'Emtrafesa S.A.C.'),
       (2, 'Transportes Andes', '20487654321', 'Andes S.A.'),
       (3, 'Transportes Sol', '20654321876', 'Sol EIRL')
    ON CONFLICT (id_empresa) DO NOTHING;

INSERT INTO ruta (id_ruta, duracion)
VALUES (1, '10 horas'),
       (2, '6 horas'),
       (3, '4 horas')
    ON CONFLICT (id_ruta) DO NOTHING;

INSERT INTO escalas (id_escalas, numero_escalas, id_ruta)
VALUES (1, 2, 1),
       (2, 3, 2),
       (3, 1, 3)
    ON CONFLICT (id_escalas) DO NOTHING;

INSERT INTO itinerario (id_itinerario, id_ruta, id_bus)
VALUES (1, 1, 1),
       (2, 2, 2),
       (3, 3, 3)
    ON CONFLICT (id_itinerario) DO NOTHING;

INSERT INTO pasajero (id_pasajero, nombre, apellido_paterno, apellido_materno, sexo, fecha_nacimiento, id_itinerario)
VALUES (1, 'Jose', 'Perez', 'Lopez', 'M', '1990-05-12', 1),
       (2, 'Ana', 'Garcia', 'Fernandez', 'F', '1985-10-25', 2),
       (3, 'Pedro', 'Ramos', 'Castillo', 'M', '1978-03-15', 3)
    ON CONFLICT (id_pasajero) DO NOTHING;

INSERT INTO pasajero_telefonos (id_pasajero_telefonos, tipo, numero, id_pasajero)
VALUES (1, 'CELULAR', '987654321', 1),
       (2, 'FIJO', '456789123', 2),
       (3, 'TRABAJO', '321654987', 3)
    ON CONFLICT (id_pasajero_telefonos) DO NOTHING;

INSERT INTO documento_identidad_pasajero (id_documento_identidad_pasajero, id_tipo_documento, numero, id_pasajero)
VALUES (1, 1, 87654321, 1),
       (2, 2, 54321987, 2),
       (3, 3, 10987654, 3)
    ON CONFLICT (id_documento_identidad_pasajero) DO NOTHING;

INSERT INTO pago (id_pago, importe, numero_tarjeta, moneda)
VALUES (1, 150.50, '4111111111111111', 'USD'),
       (2, 100.00, '4222222222222222', 'USD'),
       (3, 200.75, '4333333333333333', 'USD')
    ON CONFLICT (id_pago) DO NOTHING;

INSERT INTO pasaje (id_pasaje, id_cliente, id_empresa, fecha_y_hora_salida, id_pago, id_itinerario)
VALUES (1, 1, 1, '2024-09-26 08:00:00', 1, 1),
       (2, 2, 2, '2024-09-26 10:00:00', 2, 2),
       (3, 3, 3, '2024-09-26 12:00:00', 3, 3)
    ON CONFLICT (id_pasaje) DO NOTHING;

INSERT INTO postergacion (id_postergacion, nueva_fecha_salida, nueva_hora_salida)
VALUES
    (1, '2024-10-01', '10:00:00'),
    (2, '2024-10-02', '12:00:00'),
    (3, '2024-10-03', '14:00:00')
    ON CONFLICT (id_postergacion) DO NOTHING;
