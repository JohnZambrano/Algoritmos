#include<iostream>
#include<stdlib.h>
#include<conio.h>

using namespace std;

int main(){
	int a,b,suma=0;
	// Donde se manejan numeros exadecimales del 1 al F el primer
	// numero es el color de fondo y el segundo es el color de texto 
	system("color 30\n");
	cout<<"Hola jhon \n\n";
	
	cout<<"ingrese dos numeros \n\n";
	cin>>a; cin>>b;
	suma=a+b;
	
	cout<<"la suma es: "<<suma;
	
	getch();
    return (0);
}
