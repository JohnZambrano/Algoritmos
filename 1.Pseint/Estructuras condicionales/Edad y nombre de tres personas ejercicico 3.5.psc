//Se tiene el nombre y la edad de tres personas. 
//Se desea saber el nombre y la edad de la persona de menor edad.
//Realice el algoritmo correspondiente y represéntelo con un diagrama de flujo, pseudocódigo 
Proceso Nombreyedaddetrespersonas
	my<-0;
	
	
	Escribir "ingrese el nombre ,la edad de la persona uno";
	Leer n,ep1;
	
	Escribir "ingrese el nombre ,la edad de la persona dos";
	Leer n,ep2;
	
	Escribir "ingrese el nombre , la edad de la persona tres";
	Leer n,ep3;
	Si ep1<ep2 Entonces
		Si ep1<ep3 Entonces
			Escribir "la persona menor tiene  " ,ep1, "el nombre de la persona es " ,n;
		Sino
			Escribir "la persona menor tiene  " ,ep3, "el nombre de la persona es " ,n;
		FinSi
	Sino
		Si ep2<ep3 Entonces
			Escribir "la persona menor tiene  " ,ep2, "el nombre de la persona es " ,n;
		Sino
			Escribir "la persona menor tiene" ,ep3, "el nombre de la persona es",n;
		FinSi
	FinSi

	
	
	
FinProceso
