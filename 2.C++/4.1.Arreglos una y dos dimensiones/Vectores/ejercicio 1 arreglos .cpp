// Ejercicio 1 arreglos
 
#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int numeros[100];
	cout<<"Se muestran los numeros en orden ascendente del 1 al 100\n\n";
	for(int i=0; i<100; i++){
		numeros[i]=i+1;
		cout<<numeros[i]<<"  ";
	}cout<<"\n\n";
	
	cout<<"se muetran los numeros en orden decendente del 100 al 1\n\n";
	
	for(int i=100; i>0; i--){
		numeros[i]=i;
		cout<<numeros[i]<<"  ";
	}
	cout<<"\n\n";
	
	
	 getch();
	 return 0;
}
