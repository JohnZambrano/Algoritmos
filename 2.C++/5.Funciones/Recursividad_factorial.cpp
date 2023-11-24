// Recursividad

#include<iostream>
#include<conio.h>
#include<D:\gotoxy.h>

using namespace std;

///Prototipo de la función

int factorial(int);
int n,fact=0;
int main(){
	
	
	cout<<"Ingrese un numero para calcular el factorial de este: "<<endl;
	cin>>n;
	
	fact=factorial(n);
	cout<<"El factorial es: "<<fact;
	
	
	getch();
	return 0;
}

int factorial(int n){

	if(n==0){ // Caso base
		n = 1;
	}
	else{ //Caso general
	    n = n * factorial(n-1);
	}
	return n;
}

