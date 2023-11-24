/*
El siguiente código muestra el funcionamiento de las operaciones básicas de una cola: 
insertar,atender y buscar elemento.
*/

#include <iostream> 
#include <iomanip> 
#include <stdlib.h> 
using namespace std; 
 
struct nodo{ 
  char dato; 
  nodo *sig; 
}; 

nodo *cab,*nue,*aux,*fin; 
 
void insertar_nuevo(char car){ 
 if(cab==NULL){ 
   cab=new nodo; 
   cab->dato=car; 
   cab->sig=NULL; 
   fin=cab; 
 } 
 else{ 
    nue=new  nodo; 
    nue->dato=car; 
    nue->sig=NULL; 
    fin->sig=nue; 
    fin=nue; 
  } 
} 
/////////////////////////////////////////// 
 
void mostrar_datos(){  
 if(cab!=NULL){ 
   cout<<"\n\nLa cola es:\n\n"; 
   aux=cab; 
   while(aux!=NULL){ 
   cout<<aux->dato<<"->"; 
  aux=aux->sig; 
   } 
 } 
 cout<<"NULL"<<endl<<endl; 
} 
/////////////////////////////////////////// 
char atender_nodo(){ 
  char letra;  
  letra=cab->dato;   
  aux=cab; 
  cab=aux->sig; 
  delete aux; 
  return letra; 
} 
 
/////////////////////////////////////////// 

bool buscar(char car){ 
  bool enc=false;  
  aux=cab; 
  while((aux!=NULL)&&(enc==false)){ 
    if(car!=aux->dato) 
         aux=aux->sig; 
    else 
        enc=true; 
 }     
  return enc; 
} 

/////////////////////////////////////////// 
 
int menu(){ 
  int opcion; 
  cout<<endl; 
  cout<<"1. Hacer Fila"<<endl; 
  cout<<"2. Atender "<<endl; 
  cout<<"3. Turno "<<endl; 
  cout<<"4. salir"<<endl; 
  cout<<"\nDigite el numero de la opcion deseada: "; 
 do{ 
    cin>>opcion; 
  }while(opcion<1 || opcion >4); 
  return opcion; 
} 

/////////////////////////////////////////// 
 
int main(){ 
  int op; 
  cab=NULL; 
  fin=NULL; 
  char valor; 
  
  do { 
     system ("cls"); 
     op=menu(); 
     switch(op){  
  case 1:{ 
    cout<<"\nCaracter a insertar  "; 
    cin.ignore(); 
    cin.get(valor); 
        insertar_nuevo(valor); 
         break; 
   } 
 
 
   case 2:{ 
        if(cab!=NULL){    
     valor=atender_nodo(); 
     cout<<"\nEl caracter "<< valor<<" salió de la fila "<<endl; 
        } 
        else 
     cout<<"\nLa cola está vacía"<<endl; 
        break; 
    } 
   case 3:{ 
        if(cab!=NULL){ 
    cout<<"\nCaracter a buscar  "; 
     cin.ignore(); 
        cin.get(valor); 
     bool turno=buscar(valor); 
     if (turno) 
      cout<<endl<<"\nEl elemento "<<valor<<" se encuentra en la fila"<<endl; 
   else 
    cout<<endl<<"El elemento no esta en la fila"<<endl;   
   }    
    break; 
    }   
  }//fin switch 
 mostrar_datos(); 
    system("pause"); 
 }while(op!=4); 
 return 0; 
}
