// Crear una cadena que tenga la siguiente frase "Hola que tal", 
// luego crear otra cadena para preguntarle al usuario su nombre,
// por ultimo añadir el nombre al final de la primera cadena y
// mostrar el mensaje ejemplo "hola que tal(nombre del usuario)"

#include<iostream>
#include<stdio.h>
#include<string.h>

using namespace std;

int main(){
	
 	char cad1[]={"Hola que tal "};
 	char cad2[20],cad3[30];
 	
 	cout<<"Ingre su nombre: "<<endl;
 	gets(cad2);cout<<"\n";
 	
 	strcpy(cad3,cad1);
 	strcat(cad3,   cad2);
 	
 	cout<<"La cadena 3 es: "<<cad3;
	
 	getchar();
	 return 0;
}
