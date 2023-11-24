//  Programación ATS_Recursividad: Ejercicio 21

#include<iostream>
#include<conio.h>
#include<D:\gotoxy.h>

using namespace std;

//Prototipo de la función
int potencia(int, int);

int main(){
	int base, exponente;
	
	//Pedir daros al usuario
	
	cout<<"Digite la base: "; cin>>base;
	cout<<"Digite el exponente: "; cin>>exponente;
	
	cout<<"\n Potencia de "<<base<<" Elevado a "<<exponente<<" Es: "<<potencia(base,exponente)<<endl;
	
	getch();
	return 0;
}

int potencia(int x, int y){
	
	int pot;
	
	if(y==1){// Caso base
	  pot=x;
	}
	else{// Caso general
		pot=x*potencia(x,y-1);
	}
	
}



