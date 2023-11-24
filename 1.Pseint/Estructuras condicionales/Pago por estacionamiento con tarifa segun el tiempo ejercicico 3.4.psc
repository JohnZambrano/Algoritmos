//El dueño de un estacionamiento requiere un diagrama de flujo con el algoritmo que le permita determinar 
//cuánto debe cobrar por el uso del estacionamiento a sus clientes. Las tarifas que se tienen son las siguientes:
	//	Las dos primeras horas a $5.00 c/u. Las siguientes tres a $4.00 c/u. Las cinco siguientes a $3.00 c/u. 
	//Después de diez horas el costo por cada una es de dos pesos.
Proceso Cobroporestacionamiento
	Escribir "ingrese el tiempo de estacionamiento";
	Leer ti;
	Si ti<=2 Entonces
		tf<-5.00;
		pag<-ti*5.00;
	Sino
		Si ti<=5 Entonces
			tf<-4.00;
			pag<-(ti-2)*4.00+10.00;
		Sino
			Si ti<=10 Entonces
				tf<-3.00;
				pag<-(ti-5)*3.00+22.00;
			Sino
				tf<-2;
				pag<-(ti-10)*2.00+37.00;
			FinSi
		FinSi
	FinSi
	Escribir " el pago por uso de estacionamiento es",pag;
	
FinProceso
