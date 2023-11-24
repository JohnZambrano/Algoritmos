//Realice un algoritmo para determinar el sueldo semanal de un trabajador 
//	con base en las horas trabajadas y el pago por hora, considerando que después 
//	de las 40 horas cada hora se considera como excedente y se paga el doble.
//	Construya el diagrama de flujo, el pseudocodigo
Proceso Sueldosemanal
	Escribir " ingrese horas trabajadas,pago por hora";
	Leer ht,ph;
	Si ht>40 Entonces
		ss<-(ph*2)*ht;
	Sino
		ss<-ph*ht;
	FinSi
	Escribir "el sueldo semanal es",ss;
	
	
FinProceso
