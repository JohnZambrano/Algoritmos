/* Escriba un programa que lea de entrada est�ndar un car�cter he indique en la salida est�ndar 
si el car�cter es una vocal may�scula,es una vocal minuscula o no es una vocal */

#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
	
	char letra;
	
	cout<<"ingrese un caracter: ";
	cin>>letra;
	
	switch(letra) {
	case 'a':	
	case 'e':	
	case 'i':	
	case 'o':
	case 'u':cout<<" Es una vocal minuscula";break;
	default	:cout<<" No es una vocal minuscula";break;
	}
	switch(letra){
	case 'A':	
	case 'E':	
	case 'I':	
	case 'O':
	case 'U':cout<<" Es una vocal Mayuscula";break;
	default	:cout<<" No es una vocal minuscula";break;	
		
	}

	getchar();
	return 0;
}

