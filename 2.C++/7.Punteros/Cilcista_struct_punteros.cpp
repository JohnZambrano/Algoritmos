/*Ejercicio 12:
 Defina una estructura que indique el tiempo empleado por un ciclista en recorrer una etapa.
 La estructura debe tener tres campos: horas, minutos y segundos.
 Escriba un programa que dado 3 etapas calcule el tiempo total empleado en correr todas
 las etapas.
NOTA: Usar punteros.*/


#include<iostream>
#include<conio.h>
#include<stdlib.h>

using namespace std;

struct Tiempo{
	int horas;
	int minutos;
	int segundos;
}etapa[3], *puntero_etapa = etapa;

    int totalHoras = 0;
	int totalMin = 0;
	int totalSeg = 0;
	

//Prototipo de la función

void pedirDatos();
void tiempoTotal();




int main(){
	
	pedirDatos();
	tiempoTotal();
	
	getch();
	return 0;
}

//Función para la entrada de datos

void pedirDatos(){
	
	
	for(int i=0; i<3; i++){
	system("cls");//Para limpiar pantalla
		cout<<"\n\n      \t  Ingrese los datos de tiempo del ciclista en la etapa "<<i+1<<":";
		
		cout<<"\n\nIngrese las horas empleadas:  ";
		cin>>(puntero_etapa+i)->horas;
		
		cout<<"\nIngrese los minutos empleados:  ";
		cin>>(puntero_etapa+i)->minutos;
		
		cout<<"\nIngrese los segundos empleados:  ";
		cin>>(puntero_etapa+i)->segundos;
		
		cout<<"\n\n";
	}
	
}

//Función que calcula el tiempo total empleado en correr todas las etapas

void tiempoTotal(){
	
	for(int i=0; i<3; i++){
		totalHoras += (puntero_etapa+i)->horas;
		totalMin += (puntero_etapa+i)->minutos;
		if(totalMin >= 60){
			totalMin -= 60;
			totalHoras ++;
		}
		totalSeg += (puntero_etapa+i)->segundos;
		if(totalSeg >= 60){
			totalSeg -= 60;
			totalMin ++;
		}
	}
	
	cout<<"El tiempo total empleado en las 3 etapas por el ciclista es: "<<endl;
	
	cout<<"\nHoras totales: "<<totalHoras;
	cout<<"\nMinutos totales:  "<<totalMin;
	cout<<"\nSegundos totales:  "<<totalSeg;
	
}



