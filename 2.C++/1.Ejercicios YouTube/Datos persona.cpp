/* Realice un programa que lea la entrada estandar de los datos de una persona :

Edad : Dato de tipo entero.
Sexo : Dato de tipo caracter.
Altura en metros : Dato de tipo real.

Tras haver leido los datos, el programa debe mostrarlos en la salida entándar. */

#include<iostream>
#include<conio.h>
using namespace std;
int main () {
	
	int edad;
	char sexo[10];
	float altura;
	
	cout<<"digite su edad:\n ";  cin>>edad;
	
	cout<<"digite su sexo:\n ";  cin>>sexo;
	
	cout<<"digite su altura en metros:\n ";  cin>>altura;
	
	cout<<"\n edad: "<< edad<<endl;
	
	cout<<"\n sexo: "<< sexo<<endl;
	
	cout<<"\n altura: "<< altura<<endl;
	
	
	getch();
	return 0;
}
