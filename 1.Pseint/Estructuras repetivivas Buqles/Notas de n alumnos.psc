Proceso Nota
	a<-0;
	Escribir "ingresen el numero de calificaciones";
	Leer nc;
	
	Para i<-1 Hasta nc Con Paso 1 Hacer
		Escribir "ingrese la nota ";
		Leer n;
		
		Si n>=3 Entonces
			a<-a+1;
		FinSi
	FinPara
	Escribir "el numero de estudiantes que aprovaron fueron: ",a;
FinProceso
