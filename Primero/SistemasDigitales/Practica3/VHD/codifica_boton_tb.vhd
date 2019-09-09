-- © Universidad Politécnica de Madrid
-- Se permite copia para fines de estudio
------------------------------------------------------------------------
-- Proyecto           : Ascensor 3 pisos
--                    : 
-- Diseño             : Test para el codificador del boton
-- Nombre del fichero : codifica_boton_tb.vhd
-- Autor              : V. Rodellar
-- Fecha              : 1/11/2013
-- Versión            : 1.0
-- Resumen            : Este fichero contiene la entidad y la arquitectura
--                    : para comprobar la funcionalidad del codificador del boton
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

ENTITY codifica_boton_test IS
END codifica_boton_test;

ARCHITECTURE arquitectura_boton_test OF codifica_boton_test IS

-- Declaración del componente

COMPONENT codifica_boton IS
	PORT
	(
		piso_donde_va	 	: IN	STD_LOGIC_VECTOR (2 DOWNTO 0); -- selección de piso 
		codigo_piso			: OUT STD_LOGIC_VECTOR (1 DOWNTO 0)	-- codigo generado
	);
 
END COMPONENT;


-- Declaración de señales

	CONSTANT periodo        	:  TIME := 20 ns;
     	SIGNAL piso_donde_va   		:  STD_LOGIC_VECTOR (2 DOWNTO 0);  		-- boton que se activa
     	SIGNAL codigo_piso		:  STD_LOGIC_VECTOR(1 DOWNTO 0);        	-- codigo generado
                             


-- Configuración de la arquitectura

BEGIN

boton: codifica_boton PORT MAP (
       			piso_donde_va 	=> piso_donde_va,  			-- boton que se activado	
				codigo_piso   	=> codigo_piso				-- codigo generado

       );     

piso_donde_va <= "100",                          	-- piso 2
         		"001" AFTER periodo,       		-- piso 0
         		"010" AFTER 2 * periodo,	   	-- piso 1
         		"100" AFTER 3 * periodo,   		-- piso 2
         		"000" AFTER 4 * periodo,    		-- sin marcar piso
         		"111" AFTER 5 * periodo,    		-- se aprietan tres botones a la vez
         		"001" AFTER 6 * periodo,    		-- piso 0
			"100" AFTER 7 * periodo,    		-- piso 2
			"010" AFTER 8 * periodo,    		-- piso 1
			"100" AFTER 9 * periodo,    		-- piso 2
			"001" AFTER 10 * periodo;    		-- piso 0

END arquitectura_boton_test;


