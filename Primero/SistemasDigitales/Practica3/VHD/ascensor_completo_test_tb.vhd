----------------------------------------------------------------------------------------
--© Este diseño es propietario el autor y puede ser utilizado con fines de estudio
----------------------------------------------------------------------------------------
-- Proyecto: Práctica de Sistemas Digitales
-- Diseño: Máquinas de estados finitos (FSM)
-- Nombre del fichero: ascensor_completo_tb.vhd
-- Autor: Mark Dervishaj, David Labrado Hernández
-- Fecha: 20/05/2018 -- Versión: 10
-- Resumen: Contiene una entidad y una arquitectura
-- en estilo de comportamiento de un modelo de ascensor de 3 pisos -- Actúa por flanco de subida de reloj
-- Se utilizan el tipo de datos STD_LOGIC para todas las señales
-- Excepto para la señal piso_donde_va que será INTEGER --
-- Modificaciones:
--
-- Fecha Autor Versión Descripción del cambio
--========================================================================================
-- -- ========================================================================================

LIBRARY ieee;
USE ieee.STD_LOGIC_1164.all;

ENTITY ascensor_completo_test IS
END ascensor_completo_test;

ARCHITECTURE ascensor_completo_arquitectura_test OF ascensor_completo_test IS

-- Declaraci?n del componente

COMPONENT ascensor_completo IS
	PORT
	(
		clk				: IN	STD_LOGIC;
		piso_donde_va	 		: IN	STD_LOGIC_VECTOR(2 DOWNTO 0);
		sube, baja			: OUT	STD_LOGIC;
		piso_donde_esta		: OUT STD_LOGIC_VECTOR(1 DOWNTO 0)

	);

 
END COMPONENT;


-- Declaraci?n de se?ales

     	CONSTANT periodo        	:  TIME := 20 ns;
	SIGNAL reloj            	:  STD_LOGIC := '0';				-- Arranque de secuencia del reloj
     	SIGNAL piso_donde_va	   		:  STD_LOGIC_VECTOR (2 DOWNTO 0);  		-- boton que se activa
     	SIGNAL sube             	:  STD_LOGIC;     	                 	-- ascensor sube
     	SIGNAL baja             	:  STD_LOGIC;             	         	-- ascensor baja
	SIGNAL piso_donde_esta  	:  STD_LOGIC_VECTOR(1 DOWNTO 0);  		-- piso
                           


-- Descripci?n de la arquitectura 

BEGIN

ascen: ascensor_completo PORT MAP (clk 		=> reloj,                     	-- reloj
       			piso_donde_va 	=> piso_donde_va,  					-- boton que se activa
       			sube   		=> sube,                      	-- ascensor sube
       			baja   		=> baja,                    		-- ascensor baja
				piso_donde_esta   => piso_donde_esta
       );     

reloj 	<= NOT reloj AFTER periodo/2;


piso_donde_va			 <= "010",                     -- piso 2
         		"000" AFTER periodo,       	-- piso 0
         		"001" AFTER 2 * periodo,	   	-- piso 1
         		"010" AFTER 3 * periodo,   	-- piso 2
         		"100" AFTER 4 * periodo,    	-- sin marcar piso
         		"111" AFTER 5 * periodo,    	-- se aprietan dos botones a la vez
         		"000" AFTER 6 * periodo,    	-- piso 0
			"010" AFTER 7 * periodo,    	-- piso 2
			"001" AFTER 8 * periodo,    	-- piso 1
			"010" AFTER 9 * periodo,    	-- piso 2
			"000" AFTER 10 * periodo;    	-- piso 0



END ascensor_completo_arquitectura_test;