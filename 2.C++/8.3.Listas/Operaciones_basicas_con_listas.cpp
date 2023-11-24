//Algoritmos de las operaciones basicas para trabajar con listas.

#include<iostream>
#include<stdlib.h>
#include<conio.h>

using namespace std;

struct Nodo{
 int dato;	
 Nodo *sig;
};

//Prototipo de las funciones
void menu();
void insertarLista(Nodo *&, int);
void mostrarLista(Nodo *);
void buscarLista(Nodo *, int);
void eliminarNodo(Nodo *&, int);
void eliminarLista(Nodo *&, int );

Nodo *lista = NULL;

int main(){
	
    menu();
	cout<<"(*_*) Preciona una tecla para continuar(*_*)";getch();
	return 0;
}

////////////////////////////////////////////////////////////////////
void menu(){
	int opcion,dato;
	
	do{
		cout<<"\t .:MENU:. \n\n\n";
		cout<<"1. Insertar elemento en la lista."<<endl;
        cout<<"2. Mostrar elementos de la lista."<<endl;
        cout<<"3. Buscar un elemento en lista.  "<<endl;
        cout<<"4. Eliminar un nodo de la lista. "<<endl;
        cout<<"5. Dejar vacia la lista. "<<endl;
        cout<<"6. Salir. "<<endl;
        
        cout<<"\nDigite la opcion deseada: "; cin>>opcion;
        
        switch(opcion){
        	case 1:{
        		cout<<"\nDigite un numero:"; cin>>dato;
	            insertarLista(lista,dato);
	            cout<<"\n";
	            system("pause");
				break;
			}
			
			case 2:{
				mostrarLista(lista);
				cout<<"\n";
				system("pause");
				break;
			}
			
			case 3:{
				cout<<"\nDigite un numero a buscar: "; cin>>dato;
				buscarLista(lista,dato);
				cout<<"\n";
				system("pause");
				break;
			}
			
			case 4:{
				cout<<"\nDigite el elemento que desea eliminar: "; cin>>dato;
				eliminarNodo(lista,dato);
				cout<<"\n";
				system("pause");
				break;
			}
			
			case 5:{
				while(lista != NULL){
					eliminarLista(lista,dato);
					cout<<dato<<" -> ";
				}
				cout<<"\n";
				system("pause");
				break;
			}
		}
		system("Cls");
	}while(opcion != 6);
}

///////////////////////////////////////////////////////////////////////////////

void insertarLista(Nodo *&lista, int n){
	Nodo *nuevo_nodo = new Nodo();
	nuevo_nodo->dato = n;
	
	Nodo *aux1 = lista;
	Nodo *aux2;
	
	while((aux1!= NULL) && (aux1->dato < n)){
		aux2 = aux1;
		aux1 = aux1->sig;
	}
	
	if(lista == aux1){
		lista = nuevo_nodo;		
	}
	else{
		aux2->sig = nuevo_nodo;
	}
	
	nuevo_nodo->sig = aux1;
	
	cout<<"\t Elemento "<<n<<" insertado a lista correctamente\n";
	
	
}

///////////////////////////////////////////////////////////////////////////////


void mostrarLista(Nodo *lista){
	Nodo *actual = new Nodo();
	actual = lista;
	
	while(actual != NULL){
		cout<<actual->dato<<" -> ";
		actual = actual->sig;
	}
}

///////////////////////////////////////////////////////////////////////////////

void buscarLista(Nodo *lista, int n){
	bool band = false;
	
	Nodo *actual = new Nodo();
	actual = lista;
	
	while((actual != NULL) && (actual->dato <= n)){
		if(actual->dato == n){
			band = true;
		}
		actual = actual->sig;
	}
	
	if(band == true){
		cout<<"\nElemento "<<n<<" Si a sido encontrado en lista\n";
	}
	else{
		cout<<"\nElemento "<<n<<" No a sido encontrado en lista\n";
		
	}
		
}

///////////////////////////////////////////////////////////////////////////////


void eliminarNodo(Nodo *&lista, int n){
	
	if(lista != NULL){
		Nodo *aux_borrar;
		Nodo *anterior = NULL;
		
		aux_borrar = lista;
	
	
	 while((aux_borrar != NULL) && (aux_borrar->dato != n)){
	 	 anterior = aux_borrar;
		 aux_borrar = aux_borrar->sig;
	   }
	
	  if(aux_borrar == NULL){
		  cout<<"\nEl elemento no existe"<<endl;
	    }
	    else if(anterior == NULL){
	    	lista = lista->sig;
	    	delete aux_borrar;
		}
	    else{
	    	anterior->sig = aux_borrar->sig;
		    delete aux_borrar;
     	}
    }
	
}

///////////////////////////////////////////////////////////////////////////////

void eliminarLista(Nodo *&lista, int n ){
	Nodo *aux = lista;
	n = aux->dato;
	lista = aux->sig;
	delete aux;	
}



