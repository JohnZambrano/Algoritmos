// Pedir al usuario su nombre en mayusculas ,
// si su nombre comienza por la letra A, 
// convertir a minusculas ,caso contrario no convertir

#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

int main(){
	 char nombre[50];
	 char comp[]="BESO";
	 cout<<"Ingrese su nombre en mayusculas:\n "<<endl;
	 gets(nombre); cout<<"\n";
	 
	 if(strcmp(nombre,comp)<0){
	 	strlwr(nombre);
	 	cout<<"Se muetra eL nombre en minusculas:  "<<nombre<<endl;
	 }else{
	 	cout<<"Su nombre no comienza por A"<<endl;
	 }
	
	 getch();
     return 0;
}
