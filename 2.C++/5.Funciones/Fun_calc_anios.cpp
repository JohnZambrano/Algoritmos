// Ejercicio 10: Funciones programación ATS

#include<iostream>
#include<conio.h>
#include<D:\gotoxy.h>
#include<stdlib.h>

using namespace std;

// Prototipo de la función
void calc_anios(int td, int& d, int&m, int& a);

int main(){
	int td,a,m,d;
	
	gotoxy(30,2); cout<<"Ingrese el total de dias "<<endl;
	gotoxy(30,3); cout<<"=> "; cin>>td;
	
	// Se llama la función calculo de años
	
	calc_anios(td,d,m,a);
	
	gotoxy(32,6); cout<<"El equivalente de los dias ingresados es: "<<endl;
	gotoxy(32,8); cout<<d<<"/"<<m<<"/"<<a+2000<<endl;
	
	getch();
	return 0;
}
// Función calculo del año

void calc_anios(int td, int& d, int&m, int& a){
	a=td/365;
	td%=365;
	
	m=td/30;
	
	d=td%30;
		
}
