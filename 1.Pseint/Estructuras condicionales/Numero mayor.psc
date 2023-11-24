//Determinar cual es el mayor de tre s numeros
Proceso Numeromayor 
	Escribir "ingresar Num1,Num2,Num3:";
	Leer N1,N2,N3;
	Si (N1>N2)Y(N1>N3) Entonces
		Escribir "el numero mayor es :",N1;
	Sino
		Si N2>N3 Entonces
			Escribir "el numero mayor es :",N2;
		Sino
			Escribir "EL NUMERO MAYOR ES :",N3;
		FinSi
	FinSi
FinProceso
