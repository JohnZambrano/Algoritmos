/* Programaci�n ATS => Ejercicio 5:

Pedir al usuario N n�meros, almacenarlos en un arreglo din�mico posteriormente
ordenar los n�meros en orden ascendente y mostrarlos en pantalla. 
NOTA: Utilizar cualquier m�todo de ordenamiento. */

#include<iostream>
#include<conio.h>
#include<stdlib.h> //Para utilizar new y delete

using namespace std;

//Prototipo de las funciones

void pedirDatos();
void ordenarDatos(int *, int);
void mostrarDatos(int *, int);

int nElementos, *elemento;

int main(){
	
	//Llamado de las funciones
	
	pedirDatos();
	ordenarDatos(elemento,nElementos);
	mostrarDatos(elemento,nElementos);
	
	delete[]  elemento; //Liberara memoria para el arreglo dinamico
	
	getch();
	return 0;
}

void pedirDatos(){
	cout<<"Ingrese el numero de elementos: "; cin>>nElementos;
	
	elemento = new int[nElementos];
	
	for(int i=0; i<nElementos; i++){
		cout<<"\nDigite un numero: ["<<i<<"]: ";  cin>>*(elemento+i);
	}
	
}

void ordenarDatos(int *elemento, int nElementos){
	int aux=0;
	
	for(int i=0; i<nElementos; i++){
		for(int j=0; j<nElementos-1; j++ ){
			if(*(elemento+j) > *(elemento+j+1)){
				aux = *(elemento+j);
				*(elemento+j) = *(elemento+j+1);
				*(elemento+j+1) = aux;
			}
		}
	}	
}

void mostrarDatos(int *elemento, int nElementos){
	cout<<"\n\nMostrar arreglo ordenado: \n\n";
	
	for(int i=0; i<nElementos; i++){
		cout<<*(elemento+i)<<" ";
	}
}




