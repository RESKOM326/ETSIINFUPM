-- © Universidad Politécnica de Madrid
-- Se permite copia para fines de estudio
------------------------------------------------------------------------
-- Proyecto           : Ascensor de 3 pisos
--                    : 
-- Diseño             : Test para FSM
-- Nombre del fichero : FSM_ascensor_tb.vhd
-- Autor              : V. Rodellar
-- Fecha              : 10/10/2013
-- Versión            : 1.0
-- Resumen            : Este fichero contiene la entidad y la arquitectura
--                    : para comprobar la funcionalidad de la FSM del ascensor
--                    
--                  
--
--
-- Modificaciones:
--
-- Fecha        Autor        Versión         Descripción del cambio
------------------------------------------------------------------------

-----------------------------------------------------------------------

LIBRARY ieee;
USE ieee.STD_LOGIC_1164.all;

ENTITY FSM_ascensor_test IS
END FSM_ascensor_test;

ARCHITECTURE FSM_arquitectura_test OF FSM_ascensor_test IS

-- Declaración del componente

COMPONENT FSM_ascensor IS
	PORT
	(
		clk				: IN	STD_LOGIC;
		codigo_piso	 		: IN	STD_LOGIC_VECTOR(1 DOWNTO 0);
		sube, baja			: OUT	STD_LOGIC;
		piso_donde_esta		: OUT STD_LOGIC_VECTOR(1 DOWNTO 0)

	);

 
END COMPONENT;


-- Declaración de señales

     	CONSTANT periodo        	:  TIME := 20 ns;
	SIGNAL reloj            	:  STD_LOGIC := '0';				-- Arranque de secuencia del reloj
     	SIGNAL boton	   		:  STD_LOGIC_VECTOR (1 DOWNTO 0);  		-- boton que se activa
     	SIGNAL sube             	:  STD_LOGIC;     	                 	-- ascensor sube
     	SIGNAL baja             	:  STD_LOGIC;             	         	-- ascensor baja
	SIGNAL piso_donde_esta  	:  STD_LOGIC_VECTOR(1 DOWNTO 0);  		-- piso
                           


-- Descripción de la arquitectura 

BEGIN

ascen: FSM_ascensor PORT MAP (clk 		=> reloj,                     	-- reloj
       			codigo_piso 	=> boton,  					-- boton que se activa
       			sube   		=> sube,                      	-- ascensor sube
       			baja   		=> baja,                    		-- ascensor baja
				piso_donde_esta   => piso_donde_esta
       );     

reloj 	<= NOT reloj AFTER periodo/2;


boton			 <= "10",                     -- piso 2
         		"00" AFTER periodo,       	-- piso 0
         		"01" AFTER 2 * periodo,	   	-- piso 1
         		"10" AFTER 3 * periodo,   	-- piso 2
         		"11" AFTER 4 * periodo,    	-- sin marcar piso
         		"11" AFTER 5 * periodo,    	-- se aprietan dos botones a la vez
         		"01" AFTER 6 * periodo,    	-- piso 0
			"10" AFTER 7 * periodo,    	-- piso 2
			"01" AFTER 8 * periodo,    	-- piso 1
			"10" AFTER 9 * periodo,    	-- piso 2
			"01" AFTER 10 * periodo;    	-- piso 0



END FSM_arquitectura_test;


