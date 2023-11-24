/*
Ejercicio 2: 
Hacer un programa en C++, utilizando Pilas que contenga el siguiente menu: 

 1. Insertar un caracter a la pila
 2. Mostrar todos los elementos de la pila
 3. Salir
 */
 
#include<iostream>
#include<conio.h>
#include<stdlib.h>

using namespace std;

struct Nodo{
 char dato;
 Nodo *siguiente;
	
};

//Prototipo de las funciones
void menu();
void agregarPila(Nodo *&, char);
void sacarPila(Nodo *&, char &);

int op;


int main(){
	Nodo *pila = NULL;
	char dato;
	char rpt;
	int opc;
do{
	
menu();
switch(op){
case 1:{
    do{
      	cout<<"\nDigite un caracter: ";
		cin>>dato;
		agregarPila(pila,dato);
		
		cout<<"\n\nDesea agreagar oto elemento a PILA (s/n): ";
		cin>>rpt;
		
	}while((rpt=='s')||(rpt=='S'));
 }break;
	
case 2:{
	cout<<"\n Sacando todos los elementos de la PILA: ";
	while(pila != NULL){ // Mientras no sea el final de la PILA
	    sacarPila(pila,dato);	
	    if(pila != NULL){
	       cout<<dato<<" , ";		
     	}  
		 else{
		 	cout<<dato<<" . ";
		 }     
    }
    getch();
  }break;
    
case 3:{}break;
    
  }//Final switch
  system("Cls");
  
cout<<"\nDesea continuar?\n";
cout<<"\nMarque 1 si es asi.\n";
cout<<"\nDe lo contraria marque cualquie otra tecla\n";
cout<<"==> ";cin>>opc;
	
} while (opc==1);//Final do while


 getch();
 return 0;
}

//Función para visualizar el munu

void menu(){

 cout<<" \n\n   \t  \t  \t  Menu PILA \n\n";
 
    cout<<"1. Insertar un caracter a la pila \n"; 
    cout<<"2. Mostrar todos los elementos de la pila \n";
    cout<<"3. Salir \n";
	
 cout<<"\n Eliga la opcion que desea: "; 
 cin>>op;
 
   while (op<1 || op>3){
		
		cout<<"\nIngrese nuevamente su opcion";
		cin>>op;
	}

	system("Cls");
}

//función que permite agregar datos a la pila

void agregarPila(Nodo *&pila, char caracter){
	Nodo *nuevo_nodo = new Nodo();
	nuevo_nodo->dato = caracter;
	nuevo_nodo->siguiente = pila;
	pila = nuevo_nodo;
	
	cout<<"\n\t Elemento "<<caracter<<" ha sido agregado a PILA correctamente (-_-)";
}

//Función que permite sacar elementos de la pila

void sacarPila(Nodo *&pila, char &caracter){
	Nodo *aux = pila;
	caracter = aux->dato;
	pila = aux->siguiente;
	delete aux;
	
}


