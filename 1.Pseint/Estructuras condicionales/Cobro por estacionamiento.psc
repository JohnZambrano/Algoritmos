//Cobro por estacionamiento 
Proceso Cobroporestacionamiento
	Escribir "ingrese tiempo";
	Leer TI;
	Si TI<2 Entonces
		Escribir "La tarifa es :",5000;
		
	Sino
		Si (TI>2)Y(TI<=5) Entonces
			Escribir "La tarifa es :",7000;
		Sino
			Si TI>5 Entonces
				Escribir "La tarifa es :",10000;
			Sino
				Escribir "bifurcar a linea 20";
			FinSi
		FinSi
	FinSi
	
FinProceso
