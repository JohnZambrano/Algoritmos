/*Estructuras anidadaas en C++, Ejercicio 4 Programación ATS

 Hacer un arreglo de estructura llamada atleta para N atletas que contenga los siguientes campos:
 nombre, país, numero_medallas. 
y devuelva los datos (Nombre, país) del atleta que ha ganado el mayor número de medallas.*/

#include<iostream>
#include<conio.h>
#include<string.h>
#include<stdlib.h>

using namespace std;

struct atleta{
	char nombre[20];
	char pais[10];
	int num_medallas;
}atle[100];

int main(){
	int mayor=0,posM=0;
	int num_atle;
	
	cout<<"Digite el numero de atletas: ";  cin>>num_atle;
	
	for(int i=0; i<num_atle; i++){
		
		fflush(stdin);//Para limpiar el buffer y poder digitar nuevos valores
		cout<<"\n\nIngrrese el nombre del atleta "<<i+1<<" => "; cin.getline(atle[i].nombre,20,'\n');
		
		cout<<"\nIngrese el pais del atleta "<<i+1<<" => ";  cin.getline(atle[i].pais,10,'\n');
		
			fflush(stdin);//Para limpiar el buffer y poder digitar nuevos valores
		cout<<"\nIngrese el numero de medallas del atleta "<<i+1<<" => "; cin>>atle[i].num_medallas;
		
		
		//Encontrando el atleta que ha ganado el mayor numero de medallas
		
		if(atle[i].num_medallas>mayor){
			mayor = atle[i].num_medallas;
			posM = i;
		}
		cout<<"\n\n";
	}
	
	cout<<"\n\nDatos del atleta que ha ganada el mayor numero de medallas: "<<endl;
	cout<<"\n Nombre: "<<atle[posM].nombre<<endl;
	cout<<"\n Pais: "<<atle[posM].pais<<endl;
	
	getch();
	return 0;
}
