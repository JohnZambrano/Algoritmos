// Programación ATS.Ejercicio 17: Suma de numeros complejos 

#include<iostream>
#include<conio.h>
#include<D:\gotoxy.h>

using namespace std;

struct complejo{
	float real;
	float imaginario;
}z1,z2;

//Prototipo de la función

void pedirDatos();
complejo suma(complejo, complejo);
void muestra(complejo);

int main(){

	
	pedirDatos();
	
// Defino una variable de tipo complejo
	complejo x=suma(z1,z2);
	
	muestra(x);
	
	getch();
	return 0;
}

void pedirDatos(){
	fflush(stdin); //vasiar el buffer y permitir digitar los valores
	
    cout<<"Digite los numeros para el primer numero complejo:\n "<<endl;	
	cout<<"Parte real: "; cin>>z1.real;
	cout<<"Parte imaginaria: "; cin>>z1.imaginario; 
	
	fflush(stdin); //vasiar el buffer y permitir digitar los valores
	
	cout<<"\n\nDigite los numeros para el segundo numero complejo:\n "<<endl;	
	cout<<"Parte real: "; cin>>z2.real;
	cout<<"Parte imaginaria: "; cin>>z2.imaginario; 
}

complejo suma(complejo z1, complejo z2){
	z1.real+=z2.real;
	z1.imaginario+=z2.imaginario;
	
	return z1;
}

void muestra(complejo x){
	cout<<"\n Resultado de la suma: "<<x.real<<" +- "<<x.imaginario<<"i"<<endl;
		
}


