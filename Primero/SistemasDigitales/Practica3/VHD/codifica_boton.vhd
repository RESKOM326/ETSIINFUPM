---------------------------------------------------------------------------
--Este diseño es propietario el autor y puede ser utilizado con fines de -----
--estudio
---------------------------------------------------------------------------
--Proyecto: Primera práctica de Sistemas Digitales
--Diseño: Codificador
--Nombre del fichero: codifica_boton.vhd
--Autor: Mark Dervishaj Memi y David Labrado Hernández
--Fecha: 09/03/2018
--Versión: 1.1
--Resumen: Contiene una entidad y una arquitectura de un
-- codificador.
--Se utilizan el tipo de datos STD_LOGIC_VECTOR para todas las señales.
--La arquitectura se realiza en estilo comportamiento.
--
--Modificaciones: Añadida la cabecera.
--
--Fecha: 15/03/2018 Autor: Mark Dervishaj Memi y David Labrado Hernández Versión: 1.1 Descripción del cambio: Añadida la cabecera.
-- ========================================================================
--
--
-- ========================================================================
LIBRARY ieee;
USE ieee.STD_LOGIC_1164.all;


ENTITY codifica_boton IS
PORT(
piso_donde_va: IN STD_LOGIC_VECTOR (2 DOWNTO 0);
	codigo_piso: 	OUT STD_LOGIC_VECTOR (1 DOWNTO 0)
);	
END codifica_boton;	

ARCHITECTURE arquitectura_cod_boton OF codifica_boton IS
--Declarativa
BEGIN
PROCESS(piso_donde_va)
--Declarativa
BEGIN
CASE piso_donde_va IS
WHEN"001"=>codigo_piso<="00";
WHEN"010"=>codigo_piso<="01";
WHEN"100"=>codigo_piso<="10";
WHEN OTHERS=>codigo_piso<="11";
END CASE;
END PROCESS;
END arquitectura_cod_boton;
