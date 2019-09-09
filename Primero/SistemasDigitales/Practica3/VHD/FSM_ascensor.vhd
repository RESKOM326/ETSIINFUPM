----------------------------------------------------------------------------------------
--© Este diseño es propietario el autor y puede ser utilizado con fines de estudio
----------------------------------------------------------------------------------------
-- Proyecto: Práctica de Sistemas Digitales
-- Diseño: Máquinas de estados finitos (FSM)
-- Nombre del fichero: FSM_ascensor.vhd
-- Autor: Mark Dervishaj Memi, David Labrado Hernández
-- Fecha: 11/05/2018 -- Versión: 1.0
-- Resumen: Contiene una entidad y una arquitectura
-- en estilo de comportamiento de un modelo de ascensor de 3 pisos -- Actúa por flanco de subida de reloj
-- Se utilizan el tipo de datos STD_LOGIC para todas las señales
-- Excepto para la señal piso_donde_va que será INTEGER --
-- Modificaciones:
--
-- Fecha Autor Versión Descripción del cambio
--========================================================================================
-- -- ========================================================================================

LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.all;

ENTITY FSM_ascensor IS

 PORT(clk : IN STD_LOGIC; -- activo por flanco de subida

    codigo_piso : IN STD_LOGIC_VECTOR(1 DOWNTO 0); -- código binario del Nº de piso pulsado
    sube, baja : OUT STD_LOGIC; -- dirección movimiento del motor
    piso_donde_esta : OUT STD_LOGIC_VECTOR(1 DOWNTO 0) -- código binario del piso donde se encuentra el ascensor
   );

END FSM_ascensor;

ARCHITECTURE FSM_arquitectura OF FSM_ascensor IS

	TYPE estado IS (Piso_0, Piso_1, Piso_2);
		SIGNAL e_futuro: estado;
		SIGNAL e_actual: estado:= Piso_0;

BEGIN
 futuro_salida: PROCESS(e_actual, codigo_piso)
BEGIN 
 CASE e_actual IS
  WHEN Piso_0 => 
   piso_donde_esta <= "00";
    IF codigo_piso = "00" THEN e_futuro <= Piso_0; sube <= '0'; baja <= '0';
    ELSIF codigo_piso = "11" THEN e_futuro <= Piso_0; sube <= '0'; baja <= '0';
    ELSIF codigo_piso = "01" THEN e_futuro <= Piso_1; sube <= '1'; baja <= '0';
    ELSE e_futuro <= Piso_2; sube <= '1'; baja<= '0';
   END IF;

  WHEN Piso_1 =>
   piso_donde_esta <= "01";
    IF codigo_piso = "00" THEN e_futuro <= Piso_0; sube <= '0'; baja <='1';
    ELSIF codigo_piso = "01" THEN e_futuro <= Piso_1; sube <= '0'; baja <='0';
    ELSIF codigo_piso = "10" THEN e_futuro <= Piso_2; sube <= '1'; baja <='0';
    ELSE e_futuro <= Piso_1; sube <= '0'; baja<='0';
   END IF;

  WHEN Piso_2 =>
   piso_donde_esta <= "10";
    IF codigo_piso = "00" THEN e_futuro <= Piso_0; sube <='0'; baja <='1';
    ELSIF codigo_piso = "01" THEN e_futuro <= Piso_1; sube <= '0'; baja <='1';
    ELSIF codigo_piso = "10" THEN e_futuro <= Piso_2; sube <= '0'; baja <='0';
    ELSE e_futuro <= Piso_2; sube <= '0'; baja<='0';
   END IF;

 END CASE;
END PROCESS futuro_salida;
END ARCHITECTURE;
