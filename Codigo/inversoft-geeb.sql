SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;


CREATE TABLE IF NOT EXISTS `administrador` (
  `Pass_Admin` varchar(20) DEFAULT NULL,
  `Nombre_admin` varchar(30) DEFAULT NULL,
  `Apellidos_admin` varchar(30) DEFAULT NULL,
  `Sexo_admin` varchar(20) DEFAULT NULL,
  `alias_admin` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `administrador` (`Pass_Admin`, `Nombre_admin`, `Apellidos_admin`, `Sexo_admin`, `alias_admin`) VALUES
('2334553', 'juan jose', 'gonzalez cuartas', 'Hombre', 'bro'),
('12789', 'cristian david', 'henao hoyos', 'Hombre', 'daddy'),
('1231e', 'daniela', 'hernandes', 'Mujer', 'dani'),
('3242r', 'angie paola', 'albornos gonzalez', 'Mujer', 'geme'),
('12345', 'german', 'gonzalez vargas', 'Hombre', 'gordis'),
('angeli', 'angelica', 'otalvaro castañeda', 'Mujer', 'instru'),
('24581035', 'martha liliana', 'cuartas bermudez', 'Mujer', 'mami'),
('1231231', 'ana maria', 'gonzalez bedoya', 'Mujer', 'mari'),
('brayan', 'gloria', 'bedoya', 'Mujer', 'marleny'),
('999999', 'esleida marley', 'cardenas medina', 'Mujer', 'panda'),
('33334444', 'brayan', 'pinto bedoya', 'Hombre', 'pinino'),
('19971210', 'erika johana', 'gonzalez cuartas', 'Mujer', 'pitufina'),
('909090ahh', 'aura', 'loaiza ojeda', 'Mujer', 'porki'),
('242342e', 'leonardo', 'davincii', 'Hombre', 'vincii');

CREATE TABLE IF NOT EXISTS `cliente` (
  `Nombre_cliente` varchar(30) DEFAULT NULL,
  `apellido_cliente` varchar(30) DEFAULT NULL,
  `telefono_cliebnte` varchar(15) DEFAULT NULL,
  `direccion_cliente` varchar(20) DEFAULT NULL,
  `cedula_cliente` varchar(20) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `factura` (
  `cod_factura` varchar(30) NOT NULL,
  `cedula_cliente` varchar(30) NOT NULL,
  `id_prestamo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `historial` (
  `cedula_cliente` varchar(20) NOT NULL,
  `id_prestamo` varchar(30) NOT NULL,
  `id_libro` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `libro_contable` (
  `Id_prestamo` varchar(30) NOT NULL,
  `cedula_cliente` varchar(20) NOT NULL,
  `id_libro` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `municipio` (
  `Id_municipio` varchar(20) NOT NULL,
  `Nombre_municipio` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `prestamo` (
  `id_prestamo` varchar(20) NOT NULL DEFAULT '',
  `fecha_inicio` date DEFAULT NULL,
  `cantidad_dinero` varchar(50) DEFAULT NULL,
  `numero_cuotas` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


ALTER TABLE `administrador`
 ADD PRIMARY KEY (`alias_admin`);

ALTER TABLE `cliente`
 ADD PRIMARY KEY (`cedula_cliente`);

ALTER TABLE `factura`
 ADD PRIMARY KEY (`cod_factura`);

ALTER TABLE `historial`
 ADD PRIMARY KEY (`id_libro`);

ALTER TABLE `libro_contable`
 ADD PRIMARY KEY (`Id_prestamo`);

ALTER TABLE `municipio`
 ADD PRIMARY KEY (`Id_municipio`);

ALTER TABLE `prestamo`
 ADD PRIMARY KEY (`id_prestamo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
