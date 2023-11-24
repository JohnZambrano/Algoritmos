// Ganancia en la venta de uva con dos clases de tipos y dos clases de tamaños 
Proceso GananciaVentaDeUvas
	//si tipo de uva es A entonces escrivir 0, y si tipo de uva es B entonces escrivir 1
	Escribir "ingrese precio uvas";
		Leer P;
		Escribir " ingrese kilos producidos";
		Leer k;
		Escribir " ingres tipo de uva.si tipo de uva es A entonces escrivir 0, y si tipo de uva es B entonces escrivir 1";
		Leer TI;
		Escribir " ingrese tamaño de uva";
		Leer TA; 
	Si TI="A" Entonces
		Si TA="1" Entonces
			P<-P+0.20;
		Sino
			P<-P+0.30;
		FinSi
	Sino
		Si TA="1" Entonces
			P<-P-0.30;
		Sino
			P<-P-0.50;
		FinSi
	FinSi
	GA<-P*K;
	Escribir "la_ganancia_es: ",GA;
FinProceso
