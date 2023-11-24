/* Estructuras anidadaas en C++, Ejercicio 1 Programación ATS

Ejercicio 1: Hacer una estructura llamada corredor, en la cual se tendrán los siguientes campos: 
Nombre, edad, sexo, club, pedir datos al usuario para un corredor, y asignarle una categoría de competición:
- Juvenil menor o = 18 años
- Señor menor o = 40 años
- Veterano mayor a 40 años
Posteriormente imprimir todos los datos del corredor, incluida su categoría de competición.*/

#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

struct corredor{
	char nombre[20];
	int edad;
	char sexo[10];
	char club[20];
}c1;// Declarando variable de tipo corredor

int main(){
	char categoria[20];
	
	fflush(stdin); // Vasiar el buffer y permitir digitar los valores
	cout<<"Nombre: ";  cin.getline(c1.nombre,20,'\n');
	
	cout<<"\nEdad: ";   cin>>c1.edad;
	
	fflush(stdin);  //vasiar el buffer y permitir digitar los valores
	cout<<"\nSexo: ";   cin.getline(c1.sexo,10,'\n');

	cout<<"\nClub: ";   cin.getline(c1.club,20,'\n');

	
	//Asignación de categoria segun la edad del corredor
	
	if(c1.edad <= 18){
		strcpy(categoria,"Juvenil");
	}
	else if(c1.edad <= 40){
		strcpy(categoria,"Senior");
	}
	else{
		strcpy(categoria,"Veterano");
	}
	
	//Imprimiendo datos de el corredor
	
	cout<<"\nDatos del corredor: "<<endl;
	cout<<"\nNombre: "<<c1.nombre<<endl;
	cout<<"Edad: "<<c1.edad<<endl;
	cout<<"Sexo: "<<c1.sexo<<endl;
	cout<<"Club: "<<c1.club<<endl;
	cout<<"Categoria: "<<categoria<<endl;
	
	
	getch();
	return 0;
}
