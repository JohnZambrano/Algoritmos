//El 14 de febrero una persona desea comprarle un regalo al ser querido que m�s aprecia en ese momento,
//su dilema radica en qu� regalo puede hacerle, las alternativas que tiene son las siguientes:
//Regalo Costo Tarjeta $10.00 o menos Chocolates $11.00 a $100.00 Flores $101.00 a $250.00 Anillo M�s de $251.00 
//Se requiere un diagrama de flujo con el algoritmo que ayude a determinar qu� regalo se le puede comprar
//a ese ser tan especial por el d�a del amor y la amistad
Proceso Regalo14defebrero
	Escribir "ingrse dinero disponible";
	Leer dd;
	Si dd<=10.00 Entonces
		Escribir "el regalo es targeta";
	Sino
		Si (dd>=11.00)Y(dd<=100.00) Entonces
			Escribir "el regalo es chocolates";
		Sino
			Si (dd>=101.00)Y(dd<=250.00) Entonces
				Escribir "el regalo es flores";
			Sino
				Escribir "el regalo es anillo";
			FinSi
		FinSi
	
	FinSi
	
FinProceso
