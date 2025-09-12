-- Seleccionar la base de datos
USE `bdd-facturacion-prod`;

-- Insertar los productos
INSERT INTO productos (nombre, detalle, precio, fecha_creado) VALUES
(
    'HP All In One',
    'Nueva computadora de escritorio todo en uno, pantalla HD de 27 pulgadas, Ryzen 7, hasta 3.9GHz, 16GB RAM, 1TB SSD, WiFi, BT 6.0, Windows 11 Pro',
    31799.00,
    '2025-09-10 21:03:00'
),
(
    'Dell XPS 15',
    'Laptop premium de 15 pulgadas con procesador Intel Core i9 13ª Gen, 32GB RAM, 1TB SSD NVMe, pantalla OLED 4K táctil, Windows 11 Pro',
    45999.00,
    '2025-09-10 21:05:00'
),
(
    'Lenovo ThinkPad T14',
    'Notebook empresarial con AMD Ryzen 5 Pro, 16GB RAM, 512GB SSD, pantalla FHD 14 pulgadas, teclado retroiluminado, Windows 11 Pro',
    28999.00,
    '2025-09-10 21:07:00'
);
