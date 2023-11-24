/* Programa que permita comvertir de pesos colombianos 
 a moneda extranjera como (Dolares, Euros, Yen)*/

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
int pc,opc;	
float dolares=0,euros=0,yen=0;

cout<<"Ingrese la cantidad de pesos colombianos a cambiar:"<<endl;
cin>>pc;cout<<"\n";

cout<<"\t                                Comversor de dinero\n"<<endl;
cout<<"1. De pesos Colombianos a Dolares EE.UU\n"<<endl;
cout<<"2. De pesos Colombianos a Euros Europeo\n"<<endl;
cout<<"3. De pesos Colombianos a Yen Chino\n"<<endl;
cout<<"4. Salir"<<endl;
cin>>opc;
switch(opc)	{
case 1:
	dolares=pc*0.00028905735185811;
	cout<<"La cantidada de dolares es $: "<<dolares;break;
case 2:
	euros=pc*0.000261;
	cout<<"La cantidad de euros es €: "<<euros;break;
case 3:
	yen=pc*0.031438207660805;
	cout<<"La cantidad de Yens es ¥: "<<yen;break;
default:break;	
	
}
	
	
getch();
return 0;	
}
