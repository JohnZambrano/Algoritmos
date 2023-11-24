Proceso Factorial_tabla
	Escribir  "ingrese la cantidad de numeros a los cuales obtendra el factorial y la tabla de multiplicar";
	Leer cant;
	Para i<-1 Hasta cant Con Paso 1 Hacer
		//este es el ciclo que controla la cantidad de numeros
		Escribir  "ingrese el numero al cual desea sacar su factorial y su tabla de multiplicar";
		Leer num;
		
		fact<-1;
		Para j<-1 Hasta num Con Paso 1 Hacer
			//ciclo que efectua el factorial del numero
			fact<-fact*j;
		FinPara
		Escribir "el factorial del numero ",num, " es ",fact;
		Para k<-1 Hasta 10 Con Paso 1 Hacer
			//ciclo que efectua la tabla de multiplicacion de un numero
			tab<-num*k;
			Escribir "la multiplicacion del numero ", num , " * ", k , " es ",tab;
		FinPara
	FinPara
	
FinProceso
