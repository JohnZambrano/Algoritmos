/*Escribe un programa que defina un vector de números y muestre en la 
salida estándar el vector en orden inverso—del último al primer elemento.*/

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int numeros[]={1,2,3,4,5};
	for(int i=5; i>=0; i--){
	cout<<numeros[i]<<endl;
	}
	
	cout<<"\n\n";
	
	getch();
	return 0;
}
