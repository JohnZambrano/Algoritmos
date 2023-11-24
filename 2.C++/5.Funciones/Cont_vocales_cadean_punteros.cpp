/* Ejercicio 8: 
Pedir una cadena de caracteres (string) al usuario, 
e indicar cuantas veces aparece la vocal a,e,i,o,u; 
en la cadena de caracteres.
NOTA: Usar punteros. */

#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

//Prototipo de la función

void pedirDatos();
int contarVocales(char *);

char cadena[30];


int main(){
	
	pedirDatos();
	cout<<"\nEl numero de vocales de la cadena es: "<<contarVocales(cadena)<<endl;
	
	getch();
	return 0;
}

void pedirDatos(){
	cout<<"Ingrese un texto: "<<endl;
	cin.getline(cadena,30,'\n');
	
	strlwr(cadena);// Para transformar a minusculas 
	
}

int contarVocales(char *cadena){
	int cont=0;
	
	while(*cadena){//Mientras cadena no sea nulo 
		switch(*cadena){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':cont++;
		}
		cadena++;
	}
	return cont;
}



