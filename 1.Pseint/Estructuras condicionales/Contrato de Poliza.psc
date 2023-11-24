//compañia de seguros 
Proceso Seguros
	CTP<-0;
	CL<-0;
	CA<-0;
	CE<-0;
	CV<-0;
	CP<-0;
	Escribir "ingrese tipo de poliza si es A coloque 1 y si es B coloque 2:";
	Leer Tipo;
	Si Tipo="1" Entonces
		Cbase<-1200;
	Sino
		Cbase<-950;
	FinSi
	Escribir "si bebe alcohol colque 1 y si no bebe alcohol coloque 2:";
	Leer Alcohol;
	Si Alcohol="1" Entonces
		c<-Cbase*0.10;
		CA<-Cbase+c;
	Sino
	FinSi
	Escribir "si utiliza lentes coloque 1 y si no utiliza lentes coloque 2:";
	Leer Lentes;
	Si Lentes="1" Entonces
		c<-Cbase*0.05;
		CL<-Cbase+c;
	Sino
	FinSi
	Escribir "si padece alguna enfermedad como diavetes o deficiencia cardiaca coloque 1 y si no padece ninguna enfermedad coloque 2:";
	Leer Enfermedad;
	Si Enfermedad="1" Entonces
		c<-Cbase*0.05;
		CE<-Cbase+c;
	Sino
	FinSi
	Escribir "si tiene mas de cuarenta años coloque 1 y si no tiene mas de cuarenta años coloque 2:";
	Leer Vejes;
	Si Vejes="1" Entonces
		c<-Cbase*0.20;
		CV<-Cbase+c;
	Sino
		c<-Cbase*0.10;
		Cbase<-Cbase+c;
		
	FinSi
	CTP<-Cbase+CA+CL+CE+CV+CP;
	Escribir "el contrato de la poliza es: ",CTP;
FinProceso