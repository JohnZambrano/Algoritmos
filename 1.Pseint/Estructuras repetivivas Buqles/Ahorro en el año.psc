Proceso ahorro
	//Ejercicio 4.5 : Se requiere un algoritmo para determinar cuánto ahorrará
	//en pesos una persona diariamente, y en un año, si ahorra 3¢ el primero de enero,
	//9¢ el dos de enero, 27¢ el 3 de enero y así sucesivamente todo el año.
	suma<-1;
	Para i<-1 Hasta 360 Con Paso 1 Hacer
		escribir "El dia ",i," se ahorro $ : ",suma;
		suma<-suma*3;
	FinPara
	escribir "Al finalizar el año el niño ahorro en total $ : ",suma;
	
FinProceso
