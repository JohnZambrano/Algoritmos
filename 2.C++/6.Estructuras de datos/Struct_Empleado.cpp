/*Estructuras anidadaas en C++, Ejercicio 3 Programación ATS

Ejercicio 3: Realizar un programa que lea un arreglo de estructuras los datos de N empleados
de la empresa y que imprima los datos del empleado con mayor y menor salario.*/


#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

struct empleado{
	char nombre[20];
	float salario;
}emp[100];

int main(){
	
	int n_empleados,posM=0,posm=0;
	float mayor=0,menor=9999999;
	
	
	cout<<"Digite el numero de empleados: ";   cin>>n_empleados;
	
	for(int i=0; i<n_empleados; i++){
		fflush(stdin); // Para limpiar el buffer y digitar nuevos valores
		cout<<"\nDigite el nombre del empleado "<<i+1<<" => ";  cin.getline(emp[i].nombre,20,'\n');
		
		cout<<"Digite el salario del empleado "<<i+1<<" => "; cin>>emp[i].salario;
		
		//Empleado de mayor salario
		
		   if(emp[i].salario > mayor){
		   	mayor = emp[i].salario;
		   	posM = i;
		   }
		   
		//Empleado de menor salario
		if(emp[i].salario < menor){
			menor = emp[i].salario;
			posm = i;
		}
		
		cout<<"\n";	
	}
	
	cout<<"\nDatos del empleado con mayor salario: \n";
	cout<<"Nombre: "<<emp[posM].nombre<<endl;
	cout<<"Salario: "<<emp[posM].salario<<endl;
	
	cout<<"\n\nDatos del empleado con menor salario: \n";
	cout<<"Nombre: "<<emp[posm].nombre<<endl;
	cout<<"Salario: "<<emp[posm].salario<<endl;
	
	getch();
	return 0;
}
