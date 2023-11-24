/* El dueño de un estacionamiento requiere un programa que le permita determinar el cobro
por el uso del estacionamiento a sus clientes . Las tarifas son las siguientes .
Menos de 2 horas =$5000, entre 2 y 5 horas =$7000, más de 5 horas =$10000    */


#include<iostream>
#include<stdio.h>
using namespace std;

int main() {
int ti,a=5000,b=7000,c=10000;

cout<<" Ingrese el tiempo de estacionamiento en horas : \n";
cin>>ti;

if (ti<2) {
cout<<" La tarifa es de:$ "<<a<<endl;
		
}	
else if ((ti>=2)and(ti<=5))	{
	
cout<<"La tarifa es de:$ "<<b<<endl;
}
else if (ti>5)	{
	
cout<<" La tarifa es de:$ "	<<c<<endl;
}
	
	
	
getchar();	
return 0;	
}
