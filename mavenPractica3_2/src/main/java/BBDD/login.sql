-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-10-2023 a las 15:05:45
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `login`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `usuario` varchar(15) NOT NULL,
  `contrasenia` varchar(15) NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `apellidos` varchar(30) DEFAULT NULL,
  `fechaNac` varchar(15) DEFAULT NULL,
  `correo` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`usuario`, `contrasenia`, `nombre`, `apellidos`, `fechaNac`, `correo`) VALUES
('isra', '1234', '0', '', '', ''),
('isra', '1234', '0', '', '', ''),
('isra2', '12345', '0', '', '', ''),
('', '', '0', '', '', ''),
('David', '1234', NULL, NULL, NULL, NULL),
('Victor', '1234', NULL, NULL, NULL, NULL),
('pedro', 'pedro', NULL, NULL, NULL, NULL),
('israisra', '1234', NULL, NULL, NULL, NULL),
('pisha', '1234', 'israel', 'ramirez', NULL, 'isra@gmail.com');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
