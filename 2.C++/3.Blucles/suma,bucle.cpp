/* Ciclo de suma de un numero */

#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
int nv,num,suma=0;
cout<<"Ingrese las veces que se repetira el bucle: "<<endl;	
cin>>nv;
	
	while(nv>0){
	cout<<"Ingrese un numero: "<<endl;
	cin>>num;
	suma=suma+num;
	nv=nv-1;	
	}
	cout<<"La suma es: "<<suma;
	
	getchar();
	return 0;
}
