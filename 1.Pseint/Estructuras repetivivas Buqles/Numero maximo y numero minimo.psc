
Proceso maximo_minimo
	nma<-1;
	nmi<-1;
	Para i<-1 Hasta 20 Con Paso 1 Hacer
		Escribir "ingrese el numero";
		Leer n;
		Si n>nma Entonces
			nma<-n;
		Sino
			Si n<nmi Entonces
				nmi<-n;
			FinSi
		FinSi
		Escribir "el numero maximo es ",nma;
		Escribir " el numero minimo es ",nmi;
	FinPara
	
FinProceso
