/* Ejercicio 2: Hacer una estructura llamada alumno, en la cual se tendrán los siguientes Campos:
    Nombre, edad, promedio, pedir datos al usuario para 3 alumnos,
    comprobar cuál de los 3 tiene el mejor promedio  y posteriormente imprimir los datos del alumno.                                          */

#include<iostream>
#include<conio.h>
#include<string.h>
#include<stdlib.h>

using namespace std;

int main(){
   
   int n;
   float mprom=0;
   // Se pide el numero de alumnos
   cout<<"Ingrese el numero de alumnos: "<<endl;
   cin>>n;

   struct alumno{
   	
      char nombre[20];
      int edad;
      float prom;
   		
    }alumno[10]; 
   
   int may=0;
  
    for(int i=0; i<n; i++){
    fflush(stdin); //vasiar el buffer y permitir digitar los valores	
    cout<<"Ingrese  nombre del alumno "<<i+1<<": "<<endl;
    cin.getline(alumno[i].nombre,30,'\n');
    
	cout<<"Ingrese  edad del alumno "<<i+1<<": "<<endl;
    cin>>alumno[i].edad;
    
	cout<<"Ingrese  promedio del alumno "<<i+1<<": "<<endl;
    cin>>alumno[i].prom;
    
    
    cout<<"\n\n";
    
	if(mprom<alumno[i].prom){
		mprom=alumno[i].prom;
		   may=i;
	}
		
	}
	cout<<"El promedio mayor es: "<<mprom; cout<<"\n\n";
	
	
	cout<<"Los datos del alumno con mayor promedio son:  "<<endl;
	
	cout<<"Nombre: "<<alumno[may].nombre<<endl;
	
	cout<<"Edad: "<<alumno[may].edad<<endl;
	
	cout<<"Promedio: "<<alumno[may].prom<<endl;
	
	cout<<"\n\n";
     
  
    getch();
    return 0;
	}
