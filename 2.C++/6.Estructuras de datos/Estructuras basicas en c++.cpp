// Estructuras basicas en C++

#include<iostream>
#include<conio.h>

using namespace std;

struct persona{
	char nombre[30];
	char apellido[30];
	int edad;
	
}persona1;

int main(){
	cout<<"datos de la persona: \n\n";
	
	cout<<"Ingrese el nombre:\n";
	cin.getline(persona1.nombre,30,'\n'); cout<<"\n";
	
	cout<<"Igrese el apellido:\n";
	cin.getline(persona1.apellido,30,'\n'); cout<<"\n";
	
	cout<<"Ingrese la edad:\n";
	cin>>persona1.edad; cout<<"\n\n";
	
	cout<<"Imprimiendo los datos de la persona :\n\n";
	
	cout<<"Nombre: "<<persona1.nombre<<endl;
	cout<<"Apellido: "<<persona1.apellido<<endl;
	cout<<"Edad: "<<persona1.edad<<"  Años"<<endl;
	
	cout<<"\n";
	
   getch();
   return 0;
}
