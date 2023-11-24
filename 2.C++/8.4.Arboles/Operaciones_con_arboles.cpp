#include<iostream>
#include<conio.h>
#include<stdlib.h>

using namespace std;

struct Nodo{
	int dato;
	Nodo *der;
	Nodo *izq;
	Nodo *padre;	
};

//Prototipo de las funciones
void menu();
Nodo *crearNodo(int, Nodo *);
void insertarNodo(Nodo *&, int, Nodo *);
void mostrarArbol(Nodo *, int );
bool busqueda(Nodo *, int);
void preOrden(Nodo *);
void inOrden(Nodo *);
void postOrden(Nodo *);
void eliminar(Nodo *, int);
void eliminarNodo(Nodo *);
Nodo *minimo(Nodo *);
void reemplazar(Nodo *, Nodo *);
void destruirNodo(Nodo *);

Nodo *arbol = NULL;


int main(){
	
	menu();
	
	getch();
	return 0;
	
}

///////////////////////////////////////////////////////////////////////////////

void menu(){
	int dato,opcion,contador=0;
	
	do{
		cout<<"\t.:MENU:."<<endl;
		cout<<"1. Insertar un nuevo nodo "<<endl;
		cout<<"2. Mostrar el arbol completo "<<endl; 
		cout<<"3. Buscar un elemento en el arbol "<<endl;
		cout<<"4. Recorrer el arbol en preOrden "<<endl;
		cout<<"5. Recorrer el arbol en inOrden "<<endl;
		cout<<"6. Recorrer el arbol en postOrden "<<endl;
		cout<<"7. Eliminar un nodo del arbol "<<endl;
		cout<<"8. Salir "<<endl;
		
		cout<<"\nEliga la opcion deseada: "; cin>>opcion;
		
		switch(opcion){
			case 1:{
				cout<<"\nDigite un numero: "; cin>>dato;
				insertarNodo(arbol,dato,NULL);//Insertar nuevo nodo
				cout<<"\n";
				system("pause");
				break;
			}
			case 2:{
				cout<<"\nMostrando el arbol completo:\n\n ";
				mostrarArbol(arbol,contador);
				cout<<"\n";
				system("pause");
				break;
			}
	        case 3:{
	        	cout<<"\nDigite el elemento a buscar: "; cin>>dato;
	        	if(busqueda(arbol,dato) == true){
	        		cout<<"\n El elemento "<<dato<<" a sido encontrado en el arbol \n";	
				}
				else{
					cout<<"\nElemento no encontrado \n";
				}
				cout<<"\n";
				system("pause");
				
				break;
			} 
			case 4:{
				cout<<"\n Recorrido en preOrden: ";
				preOrden(arbol);
				cout<<"\n \n";
				system("pause");
				
				break;
			}
			case 5:{
				cout<<"\nRecorrido en inOrden: ";
				inOrden(arbol);
				cout<<"\n\n";
				system("pause");
				break;
			}
			case 6:{
				cout<<"\nRecorrer en postOrden: ";
				postOrden(arbol);
				cout<<"\n\n";
				system("pause");
				break;
			}
			case 7:{
				cout<<"\nDigite el numero a eliminar: "; cin>>dato;
				eliminar(arbol,dato);
				cout<<"\n\n";
				system("pause");
				break;
			}
		}
		system("cls");
	}while(opcion != 8);
}

///////////////////////////////////////////////////////////////////////////////

Nodo *crearNodo(int n, Nodo *padre){
	Nodo *nuevo_nodo = new Nodo();
	
	nuevo_nodo->dato = n;
	nuevo_nodo->der = NULL;
	nuevo_nodo->izq = NULL;
	nuevo_nodo->padre = padre;
	
	return nuevo_nodo;
}

///////////////////////////////////////////////////////////////////////////////

void insertarNodo(Nodo *&arbol, int n, Nodo *padre){
	if(arbol == NULL){// Sie el arbol esta vacio
		Nodo *nuevo_nodo = crearNodo(n,padre);
		arbol = nuevo_nodo;
	}
	else{// Si el arbol tiene un nodo o más
		int valorRaiz = arbol->dato;// Obtenemos el valor de la raiz
		if(n < valorRaiz){// Si el elemento es menor a la raiz, insertamos en izq
			insertarNodo(arbol->izq,n,arbol);
		}
		else{//Si el elemento es mayor a la raiz, insertamos en der
			insertarNodo(arbol->der,n,arbol);
		}
	}
}

///////////////////////////////////////////////////////////////////////////////

void mostrarArbol(Nodo *arbol, int cont ){
	if(arbol == NULL){//Si el arbol esta vacio
		return;
	}
	else{
		mostrarArbol(arbol->der,cont+1);
		for(int i=0; i<cont; i++){
			cout<<"   ";
		}
		cout<<arbol->dato<<endl;
		mostrarArbol(arbol->izq,cont+1);
	}
	
}

///////////////////////////////////////////////////////////////////////////////

bool busqueda(Nodo *arbol, int n){
	if(arbol == NULL){// Si el arbol esta vacio
	return false;
	}
	else if(arbol->dato == n){// Si el nodo es igual al elemento
		return true;
	}
	else if(n < arbol->dato){
		return busqueda(arbol->izq,n);
	}
	else{
		return busqueda(arbol->der,n);
	}
}

///////////////////////////////////////////////////////////////////////////////

void preOrden(Nodo *arbol){
	if(arbol == NULL){
		return;
	}
	else{
		cout<<arbol->dato<<" - ";
		preOrden(arbol->izq);
		preOrden(arbol->der);
	}
}

///////////////////////////////////////////////////////////////////////////////

void inOrden(Nodo *arbol){
	if(arbol == NULL){
		return;
	}
	else{
		inOrden(arbol->izq);
		cout<<arbol->dato<<" - ";
		inOrden(arbol->der);
	}
}

///////////////////////////////////////////////////////////////////////////////

void postOrden(Nodo *arbol){
	if(arbol == NULL){
		return;
	}
	else{
		postOrden(arbol->izq);
		postOrden(arbol->der);
		cout<<arbol->dato<<" - ";
	}
}

///////////////////////////////////////////////////////////////////////////////

void eliminar(Nodo *arbol, int n){
	if(arbol == NULL){
		return;
	}
	else if(n < arbol->dato){
		eliminar(arbol->izq,n);
	}
	else if(n > arbol->dato){
		eliminar(arbol->der,n);
	}
	else{
		eliminarNodo(arbol);
	}
	
}

///////////////////////////////////////////////////////////////////////////////

Nodo *minimo(Nodo *){
	if(arbol == NULL){
		return NULL;
	}
	if(arbol->izq){// Si tiene hijo izquierdo
		return minimo(arbol->izq);//Buscamos la parte mas izquierda posible
	}
	else{//Si no tiene hijo
		return arbol;// Retornamos el mismo nodo
	}
}

///////////////////////////////////////////////////////////////////////////////

void reemplazar(Nodo *arbol, Nodo *nuevoNodo ){
	if(arbol->padre){
		//arbol->padre hay que asignarle su nuevo hijo
		if(arbol->dato == arbol->padre->izq->dato){
			arbol->padre->izq = nuevoNodo;
		}
		else if(arbol->dato == arbol->padre->der->dato){
			arbol->padre->der = nuevoNodo;
		}
	}
	if(nuevoNodo){
		//Procedemos a asignarle su nuevo padre
		nuevoNodo->padre = arbol->padre;
	}
}

///////////////////////////////////////////////////////////////////////////////

void destruirNodo(Nodo *nodo ){
	nodo->izq = NULL;
	nodo->der = NULL;
	
	delete nodo;
}

///////////////////////////////////////////////////////////////////////////////

void eliminarNodo(Nodo *nodoEliminar){
	if(nodoEliminar->izq && nodoEliminar->der){// Si el nodo tiene hijo
		Nodo *menor = minimo(nodoEliminar->der);
		nodoEliminar->dato = menor->dato;
		eliminarNodo(menor);
	}
	else if(nodoEliminar->izq){// Si tiene hijo izq
		reemplazar(nodoEliminar,nodoEliminar->izq);
		destruirNodo(nodoEliminar);
	}
	else if(nodoEliminar->der){
		reemplazar(nodoEliminar,nodoEliminar->der);
		destruirNodo(nodoEliminar);
	}
	else{//No tiene hijos
		reemplazar(nodoEliminar, NULL);
		destruirNodo(nodoEliminar);
	}
}


















