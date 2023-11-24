//Ingresando elementos a la pila y luego sacandolos
/*
Para insertar elementos en la pila, solo hay que seguir 4 pasos:

1. Crear el espacio en memoria para almacenar un nodo.
2. Cargar el valor dentro del nodo(dato).
3. Cargar el puntero pila dentro del nodo(*siguiente).
4. Asignar el nuevo nodo a pila.
*/

/*
Para quitar elementos de una Pila, igualmente hay que seguir 4 Pasos:

1. Crear una variable *aux de tipo Nodo
2. Igualar el n a aux-dato
3. Pasar pila a siguiente nodo
4. Eliminar aux
*/

#include <iostream>
#include <conio.h>
#include <stdlib.h>

using namespace std;

struct Nodo{
	int dato;
	Nodo *siguiente;
};

//Prototipo de las funciones

void agregarPila(Nodo *&,int);
void sacarPila(Nodo *&,int &);

int main(){
	Nodo *pila = NULL;
	int dato;
	
    cout<<"\nDigite un numero: ";
    cin>>dato;
    agregarPila(pila,dato);
	
    cout<<"\nDigite otro numero: ";
    cin>>dato;
    agregarPila(pila,dato);
	
	cout<<"\n\n\nSacando los elementos de la pila: ";
	while(pila != NULL){
		sacarPila(pila,dato);
		if(pila != NULL){
			cout<<dato<<" , ";
		}
		else{
			cout<<dato<<".";
		}
	}
	
	getch();
	return 0;
	
}

// Función para agregar elementos a la pila

void agregarPila(Nodo *&pila,int n){	
    Nodo *nuevo_nodo = new Nodo();	
    nuevo_nodo->dato = n;
    nuevo_nodo->siguiente = pila;
    pila = nuevo_nodo;
    
   cout<<"\nElemento "<<n<<" agregado a PILA correctamente "<<endl;
}

//Función para sacar elemento de la pila

void sacarPila(Nodo *&pila,int &n){
	Nodo *aux = pila;
	n = aux->dato;
	pila = aux->siguiente;
	delete aux;
}


