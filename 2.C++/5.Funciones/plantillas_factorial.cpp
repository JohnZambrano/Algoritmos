/* Como crear pantillas de funciones. Sacar el valor absoluto de un numero */

#include<iostream>
#include<conio.h>

using namespace std;

// Prototipo de función

template <class TIPOD>
void mostrarAbs(TIPOD numero);
void datos();

	int num1;
	float num2;
	double num3;

int main(){
	
	datos();
	
	mostrarAbs(num1);
	mostrarAbs(num2);
	mostrarAbs(num3);
	
	
	getch();
	return 0;
}
template <class TIPOD>
void mostrarAbs(TIPOD numero){
    if(numero<0){
    	numero=numero*-1;
	}
	cout<<"El valor absoluto del numero es: "<<numero<<"\n\n";	
}
void datos(){
cout<<"Ingrese un numero entero "<<endl;
	cin>>num1;
	cout<<"Ingrese un numero flotante "<<endl;
	cin>>num2;
	cout<<"Ingrese un numero doble "<<endl;
	cin>>num3;	
	
	cout<<"\n\n";
}
