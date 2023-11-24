// Ejercicio 9: Funciones programación ATS

#include<iostream>
#include<conio.h>
#include<D:\gotoxy.h>
#include<stdlib.h>

using namespace std;

// Prototipo de la función

void tiempo(int , int& , int& , int& );

int main(){
	int totalseg=0,h=0,m=0,s=0;
	

	cout<<"\n ----------------------------------------------------------------"<<endl;
	system( "color 03 ");
	gotoxy(10,2); cout<<"Ingrese el total de segundos "<<endl;
    gotoxy(10,3); cout<<"=> "; cin>>totalseg;
    
	cout<<"\n ----------------------------------------------------------------"<<endl;
	//Se llama a la funcion tiempo
	
    tiempo(totalseg,h,m,s);
    
	gotoxy(10,6); cout<<"Tiempo equivalente al ingresado en segundos "<<endl;
	cout<<"\ ----------------------------------------------------------------"<<endl;
	gotoxy(10,8); cout<<"HORAS => "<<h<<endl;
	gotoxy(10,10); cout<<"MINUTOS => "<<m<<endl;
	gotoxy(10,12); cout<<"SEGUNDOS => "<<s<<endl;
	
	cout<<"\n ----------------------------------------------------------------"<<endl;
	getch();
	gotoxy(10,20); return 0;
}

void tiempo(int totalseg, int& h, int& m, int& s){
  h=totalseg/3600;
  totalseg%=3600;	

  m=totalseg/60;   

  s=totalseg%60;

}


