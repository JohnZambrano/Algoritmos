/* Programación ATS => Ejercicio 6: 
Hacer una función para almacenar N números en un arreglo dinámico, 
posteriormente en otra función buscar un número en particular. 
NOTA: Puedes utilizar cualquier método de búsqueda(Secuencial o Binaria) */

#include<iostream>
#include<conio.h>
#include<stdlib.h> //Para utilizar new y delete

using namespace std;

//Prototipo de las funciones

void pedirDatos();
void buscarNum();

//Declaración de variables

int nElementos, *elemento;
int inf,sup,mitad,dato,i;
char band='F';

int main(){
	
	// Se llama a las funciones
	pedirDatos();
	buscarNum();
	
	delete[] elemento;//liberando el espacio en bytes utilizado anteriormente
	
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

void buscarNum(){
	
	dato = nElementos;
	inf=0;
	sup=nElementos;
	i=0;
	while((inf<=sup)&&(i<nElementos)){
		mitad = (inf+sup)/2;
		if(*(elemento+i)== dato){
			band='V';
			break;
		}
		if(*(elemento+i)>dato){
			sup = mitad;
			mitad = (inf+sup)/2;
		}
		if(*(elemento+i)<dato){
			inf = mitad;
			mitad = (inf+sup)/2;
		}
		i++;
	}
	
	if(band == 'V'){
		cout<<"\nEl numero se encontro en la pos: "<<mitad<<endl;
	}
	else{
		cout<<"\nEl numero NO se encontro";
	}
	
}






