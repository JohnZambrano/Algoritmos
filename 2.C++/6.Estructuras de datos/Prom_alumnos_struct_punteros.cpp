/*Ejercicio 11:
 Hacer una estructura llamada alumno, en la cual se tendrán los siguientes Campos:
 Nombre, edad, promedio,pedir datos al usuario para 3 alumnos,
 comprobar cuál de los 3 tiene el mejor promedio y posteriormente 
 imprimir los datos del alumno.
NOTA: Usar punteros a estructura*/

#include<iostream>
#include<conio.h>
#include<stdlib.h>

using namespace std;

struct Alumno{
	char nombre[30];
	int edad;
	float promedio;
	
}alumno[3],*puntero_alumno = alumno;// = A *puntero_alumno = &alumno[0];

//Prototipo de la función
void pedirDatos();
void calcularMejorPromedio(Alumno *);

int main(){
	
	pedirDatos();
	calcularMejorPromedio(puntero_alumno);
	
	getch();
	return 0;
}

//Función para pedir los datos de los alumnos

void pedirDatos(){
	
	for(int i=0; i<3; i++){
	
		system("cls");//Para limpiar pantalla
		 
		cout<<"-------------------------------------------------------------------------------"<<endl;
		cout<<"                           \tDatos del alumno "<<i+1<<":"<<endl;
		
		fflush(stdin);//Para limpiar el buffer
		
		cout<<"\nIngrese el nombre del alumno "<<i+1<<":  ";
		cin.getline((puntero_alumno+i)->nombre,30,'\n');
		
		cout<<"\nIngrese la edad del alumno "<<i+1<<":  ";
		cin>>(puntero_alumno+i)->edad;
		
		cout<<"\nIngrse el promedio del alumno "<<i+1<<":  ";
		cin>>(puntero_alumno+i)->promedio;
		
		cout<<"------------------------------------------------------------------------------\n\n";
	}
	
}


void calcularMejorPromedio(Alumno *puntero_alumno){
	
	float mayor = 0.0;
    int	pos = 0; 
	
	for(int i=0; i<3; i++){
	   if((puntero_alumno+i)->promedio>mayor){
	   	mayor =(puntero_alumno+i)->promedio;   // Comprobar el mayor promedio
	   	pos = i;
	   }
    } 
    
    //Imprimiendo el alumno con el mayor promedio
    
    cout<<"El alumno con el mejor promedio es el alumno: "<<pos+1<<endl;
    
    cout<<"\nNombre del alumno: "<<(puntero_alumno+pos)->nombre<<endl;
    cout<<"La edad del alumno es: "<<(puntero_alumno+pos)->edad<<endl;
    cout<<"El promedio del alumno es: "<<(puntero_alumno+pos)->promedio<<endl;
	
}











