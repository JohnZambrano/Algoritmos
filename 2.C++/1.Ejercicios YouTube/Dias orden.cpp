/* Partiendo de un numero entero de dias decir cuantos meses semanas y dias son*/

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
int nd,meses=0,Dsemanas=0,semanas,dias;
cout<<"Ingrese una cantidad de dias:"<<endl;
cin>>nd;
meses=nd/30;
Dsemanas=nd%30;
semanas=Dsemanas/7;
dias=Dsemanas%7;
cout<<"Es igual a: "<<meses;cout<<"\tMeses";
cout<<"\tcon  "<<semanas;cout<<"\tSemanas";
cout<<"\ty  "<<dias;cout<<"\tDias"<<endl;

	getch();
	return 0;
}
