/*Estructuras anidadaas en C++, Ejercicio 6 Programación ATS

Ejercicio 6:
 Utilizar las 2 estructuras del problema 5, pero ahora pedir los datos para N alumnos,
 y calcular cuál de todos tiene el mejor promedio, e imprimir sus datos.
*/

#include<iostream>
#include<conio.h>

using namespace std;

struct promedio{
	float nota1;
	float nota2;
	float nota3;
};

struct alumno {
	char nombre[20];
	char sexo[10];
	int edad;
	struct promedio prom;
}alum1[100];

int main(){
	int n_alumnos;
	int posM=0;
	float mayor_prom=0,suma=0,pro=0;
	
	//Se pide el numero de alumnos
	
	cout<<"Ingrese el numero de alumnos => ";  cin>>n_alumnos;
	
	
 for(int i=0; i<n_alumnos; i++){
	fflush(stdin);//Para limpiar el buffer
	
	cout<<"\nDigite el nombre del alumno "<<i+1<<" => "; cin.getline(alum1[i].nombre,20,'\n');
	cout<<"\nDigite el sexo del alumno "<<i+1<<" => "; cin.getline(alum1[i].sexo,20,'\n');
	cout<<"\nDigite la edad del alumno "<<i+1<<" => "; cin>>alum1[i].edad;
	
	cout<<"\n\nPidiendo notas del alumno "<<i+1<<" "<<endl;
	
	cout<<"\nNota 1: "; cin>>alum1[i].prom.nota1;
	cout<<"\nNota 2: "; cin>>alum1[i].prom.nota2;
	cout<<"\nNota 3: "; cin>>alum1[i].prom.nota3;
	
	//Calculando el promedio
	suma = alum1[i].prom.nota1 + alum1[i].prom.nota2 + alum1[i].prom.nota3;
	pro = suma/3;
	
	//Calculando el mejor promedio
	if(mayor_prom < pro){
	   mayor_prom = pro;
	   	posM = i;
	}
	
	cout<<"\n";
  }
	//Imprimiendo datos del mejor promedio
	
	cout<<"\n\n El mejor promedio es el del alumno: "<<posM<<" "<<endl;
	
	cout<<"\n\nNombre: "<<alum1[posM].nombre;
	cout<<"\nSexo: "<<alum1[posM].sexo;
	cout<<"\nEdad: "<<alum1[posM].edad;
	
	
	cout<<"\n\nPromedio: "<<mayor_prom;
	
  
	getch();
	return 0;
}


