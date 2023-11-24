/* Pedir al usuario dos cadenas de caracteres de numeros ,
   uno entero y el otro real, convertirlos a sus
    respectivos valores y luego sumarlos */
    
#include<iostream>
#include<conio.h>
#include<string.h>
#include<stdlib.h>

using namespace std;

int main(){
	 char num1[10],num2[10];
	 int num11;
	 float num12,suma=0;
	 
	 cout<<"ingrese la cadena 1 numero entero: "<<endl;
	 cin>>num1;cout<<"\n";
	 
	 cout<<"ingrese la cadena 2 numero real: "<<endl;
	 cin>>num2;cout<<"\n";
 	
 	num11=atoi(num1);
 	num12=atof(num2);
	
 	cout<<num11<<endl;
 	cout<<num12<<"\n\n"<<endl;
 	
 	suma=num11+num12;
 	cout<<"La suma de los numeros es: "<<suma<<endl;
	
	 getch();
	 return 0;
}
