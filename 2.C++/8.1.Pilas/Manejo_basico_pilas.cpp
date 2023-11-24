/*En el siguiente ejemplo se muestra el manejo básico de una pila,
 con las operaciones para insertar y eliminar elementos 
*/
 
#include <iostream> 
#include <iomanip> 
#include <stdlib.h> 

using namespace std; 

struct nodo{ 
   int num; 
   nodo *sig; 
}; 
 
nodo *tope,*nue,*aux; 
 
int mostrar_menu(); 
void insertar_elemento(int n); 
void mostrar_pila(); 
bool borrar_nodo(); 

int main(){ 
  int op,x; 
  bool eliminado; 
  tope=NULL; 
  do { 
  system("cls");  
       op=mostrar_menu(); 
       switch(op){  
          case 1:{ cout<<"Numero: "; 
                 cin>>x; 
                 insertar_elemento(x);                
                 break; 
         } 
 
         case 2:{  
                 eliminado=borrar_nodo(); 
                 if (eliminado) 
                  cout<<"Elemento eliminado exitosamente"<<endl;                
                 break; 
         } 
     } 
     
    mostrar_pila(); 
    system("pause"); 
   } while(op!=3); 
   return 0; 
} 
///////////////////////////////////////// 
int mostrar_menu(){ 
  int opcion; 
  cout<<"Manejo basico de una pila"<<endl<<endl; 
  cout<<"1. Insertar Elemento"<<endl; 
  cout<<"2. Retirar Elemento"<<endl; 
  cout<<"3. Salir "<<endl; 
  cout<<"Escoge una opcion "<<endl; 
  do{ 
    cin>>opcion; 
  }while(opcion<1 || opcion >3); 
  return opcion; 
 } 
///////////////////////////////////////// 



void insertar_elemento(int n){ 
     if(tope==NULL) { 
         tope=new nodo; 
         tope->num=n; 
         tope->sig=NULL; 
     } 
     else{ 
          nue=new nodo; 
          nue->num=n; 
          nue->sig=tope; 
          tope=nue; 
     } 
     cout<<"Elemento "<<n<<" insertado"<<endl<<endl; 
} 
///////////////////////////////////////// 
 
 
void mostrar_pila(){ 
       cout<<endl; 
        if(tope!=NULL){ 
              cout<<"Datos apilados"<<endl; 
              aux=tope; 
              while(aux!=NULL){ 
                  cout<<aux->num<<"->"; 
                  aux=aux->sig; 
              } 
          } 
        cout<<"NULL"<<endl<<endl; 
} 
///////////////////////////////////////// 
bool borrar_nodo(){ 
     bool borrado=false; 
        if(tope!=NULL) { 
      cout<<"Elemento a borrar "<<tope->num<< endl;   
                aux=tope; 
                tope=aux->sig; 
                delete aux; 
                borrado=true;                 
        } 
        else 
   cout<<"Pila vacia"<<endl<<endl;        
               
   return borrado; 
 }
