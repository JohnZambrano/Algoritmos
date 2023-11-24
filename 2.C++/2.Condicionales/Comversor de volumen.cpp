/* Solicite al usuario una cantidad de liquido en centimetros cubicos
y permita convertir en varias opciones como litros ,pies cubicos,galones mililitros*/

#include<iostream>
#include<stdio.h>

using namespace std;
int main(){
	int opc;
	float lcm,litros=0,pie=0,galones=0,milm=0;
	cout<<"\t           Ingrese una cantidad de liquido en centimetros cubicos"<<endl;
	cin>>lcm;
	cout<<"\t           A que unidad de medida quiere convertir los centimetros cubicos\n"<<endl;
	
	cout<<"1. Para convertir a litros \n"<<endl;
    cout<<"2. Para convertir a pies cubicos \n"<<endl;
	cout<<"3. Para convertir a galones \n"<<endl;
    cout<<"4. Para convertir a mililitros\n"<<endl;
	cout<<"5. Salir"<<endl;
	cin>>opc;
	switch(opc){
		case 1:
		litros=lcm/1000;
		cout<<"La cantidad de cm^3 en litros es: "<<litros;break;
			
		case 2:pie=lcm/28316.847;
		cout<<"La cantidad de cm^3 en pies cubicos  es: "<<pie;break;	
			
		case 3:galones=lcm/3785.412;
		cout<<"La cantidad de cm^3 en galones  cubicos  es: "<<galones;break;
			
		case 4:milm=lcm;
		cout<<"La cantidad de cm^3 en mililitros  cubicos  es: "<<milm;break;
					
		default :break;			
	}
	
	getchar();
	return 0;
}
