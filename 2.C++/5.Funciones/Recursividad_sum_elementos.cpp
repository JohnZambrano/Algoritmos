//  Programaci�n ATS_Recursividad: Ejercicio 19

#include<iostream>
#include<conio.h>
#include<D:\gotoxy.h>

using namespace std;

//Prototipo de la funci�n

int sumar(int);

int main(){
	int n;
	
	do{
		cout<<"Digite el numero de elementos: ";
		cin>>n;
	}while(n<=0);
	
	cout<<"\nLa suma es: "<<sumar(n)<<endl;
	
   getch();
   return 0;	
	
}

// Funci�n recursiva

int sumar(int n){
int suma = 0;

if(n==1){
  suma = 1;
	
}	
 else{
   suma = n+sumar(n-1);
 }	
   
   return suma;	
	
}

