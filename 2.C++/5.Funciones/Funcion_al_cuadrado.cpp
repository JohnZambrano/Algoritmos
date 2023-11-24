// Funcion al cuadrado, que sea capas de trabajar con numeros flotantes

#include<iostream>
#include<conio.h>

using namespace std;

//Prototipo de la función
void al_cuadrado(float );
void datos();
float num1;

int main(){

	datos();
	al_cuadrado(num1);
	
	
	getch();
	return 0;
}
void datos(){
cout<<"Ingrese un numero "<<endl;
cin>>num1;	
}
void al_cuadrado(float n){
	
float res=0;
res=num1*num1;
cout<<" El numero al cuadrado es: "<<res;		
}













