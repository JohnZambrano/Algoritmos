/* Pedir al usuario una cadena de caracteres,almacenarla en un arreglo y
 copiar todo su contenido hacia otro arreglo de caracteres */
 
#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

int main(){
	 
	 char cad1[50];
	 char cad2[50];
	 
	 cout<<"Ingrese una cadena de caracteres: \n"<<endl;
	 gets(cad1); cout<<"\n";
	
 	cout<<"La cadena 1 es: "<<cad1<<"\n";
 	strcpy(cad2,cad1);
 	cout<<"La cadena 2 es: "<<cad2;
	
	 getch();
	 return 0;
}
