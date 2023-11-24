/* Mostrar los meses del año, pidiéndole al usuario un número entre (1-12),
 y mostrar el mes al que corresponde.*/
 
#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
	
	int numero;
	cout<<"ingrese un numero entre [1-12] :  \n";
	cin>>numero;
	
	switch(numero) {
		case 1: cout<<"es enero"; break;
		case 2: cout<<"es febrero"; break;
		case 3: cout<<"es marzo"; break;
		case 4: cout<<"es abril"; break;
		case 5:	cout<<"es mayo"; break;
		case 6:	cout<<"es junio"; break;
		case 7:	cout<<"es julio"; break;
		case 8:	cout<<"es agosto"; break;
		case 9:	cout<<"es septiembre"; break;
		case 10: cout<<"es octubre"; break;	
		case 11: cout<<"es nobiembre"; break;
		case 12: cout<<"diciembre"; break;
		default: cout<<"por favor ingresa un numero entre [1-12]"; break;	
			
			
	}
	
	getchar();
	return 0;
}
