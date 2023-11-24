Proceso Divicion
	Escribir "ingrese el numero de veces que se efectuara la divición";
	Leer n;
	r<-0;
	Mientras n>0 Hacer
		Escribir " ingrese a";
		Leer a;
		Escribir " ingrese b";
		Leer b;
		r<-a/b;
		Si b==0 Entonces
			Escribir "la divición es indeterminada";
		Sino
			Escribir "el resultado de la divicion es ",r;
		FinSi
		n<-n-1;
	FinMientras
	
	
FinProceso
