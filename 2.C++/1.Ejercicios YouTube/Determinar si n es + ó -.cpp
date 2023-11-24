/* Realizar un programa que determine tras leer un número si es positivo o negativo. */

#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
	
	int numero;
	
	cout<<"Ingrese un numero: ";
	cin>>numero;
	
	if (numero>=0) {
		
	cout<<" El numero es positivo";
	
	}else {
		
		cout<<"El numero es negativo";
	}
	getchar();
	return 0;
}
