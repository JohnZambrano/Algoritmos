/* Programaci�n ATS: Arreglos din�micos: 

En programaci�n, un array din�mico, m�s apropiadamente llamado arreglo din�mico,
tambi�n llamado inapropiadamente matriz din�mica o tabla din�mica, 
es un arreglo de elementos que crece o mengua din�micamente conforme
los elementos se agregan o se eliminan.
Se suministra como librer�as est�ndar en muchos lenguajes modernos de programaci�n. */

#include<iostream>
#include<conio.h>
#include<stdlib.h>

using namespace std;

//Prototipo de las funciones

void pedirNotas();
void mostrarNotas();

//Variables globales utilizadas

int numCalif, *calif;

int main(){
	//Llamado de las funciones
	
	pedirNotas();
	mostrarNotas();
	
	delete[] calif;//liberando el espacio en bytes utilizado anteriormente
	
	getch();
	return 0;
}

void pedirNotas(){

    cout<<"Digite el numero de calificaciones: "<<endl;
    cin>>numCalif;
    
    calif = new int[numCalif];//Crear un arreglo de tipo dinamico

    for(int i=0; i<numCalif; i++){
        cout<<"\nIngrese una nota: "; cin>>calif[i];
	 }

}

void mostrarNotas(){
	cout<<"\n\nMostrando notas del usuario:\n";
	
	for(int i=0; i<numCalif; i++){
	    cout<<calif[i]<<endl;
	 }
	
}












