/* Determinar de 5 numeros leidos por teclado
¿Cuantos estan entre 50 y 75?
¿Cuantos son mayores de 80?
¿Cuantos son menores de 30? */

#include<iostream>
#include<stdio.h>

using namespace std;

int main() {

int num,i,a=0,b=0,c=0;

cout<<"Ingresar la cantidad de numeros por leer: "<<endl;
cin>>i;

    while(i>=1) {
    	cout<<"ingrese un numero: ";
    	cin>>num;
	    if((num>=50)and(num<=75)) {
	      a=a+1;	
	       } else if(num>80) {
	    	 b=b+1;
		     }else if(num<30) {
		     	c=c+1;
			     }else {
			     	 cout<<"El numero: "<<num; cout<<"\t No se encuentra en ningun rango"<<endl;
				   }
	
	    i=i-1;
    }
	cout<<"La cantidad de numeros entre [50-75] son: "<<a<<endl;
	cout<<"La cantidad de numeros mayores a [80] son: "<<b<<endl;
	cout<<"la cantidad de numeros menores a [30] son: "<<c<<endl;
	
	getchar();
	return 0;
}
