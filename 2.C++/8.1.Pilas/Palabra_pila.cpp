/*
Ejemplo: 
Este programa lee una palabra letra por letra y coloca las letras en una pila. 
Después el programa extrae las letras una a una y las escribe en la pantalla. 
Como los datos se extraen de la pila en el orden inverso en el que entran,
la salida muestra la palabra escrita al revés. 
 */
 
#include <iostream> 
#include <iomanip> 
#include <stdlib.h> 
using namespace std; 
struct PilaEstructura{ 
 char dato; 
 PilaEstructura *enlace; 
}; 
 
PilaEstructura *tope,*nue,*aux; 
 
void ingresar(char c); 
void eliminar(); 
 
int main( ){ 
 char siguiente, resp; 
 do{ 
  cout << "Escriba una palabra: "; 
  cin.get(siguiente); 
  while (siguiente != '\n'){ 
   ingresar(siguiente); 
   cin.get(siguiente); 
  } 
  cout << "Escrita al reves es: "; 
  while (tope!=NULL) 
   eliminar(); 
  cout << endl; 
  cout << "De nuevo? (s/n): "; 
  cin >> resp; 
  cin.ignore(); 
 } while (resp != 'n' && resp != 'N'); 
  return 0; 
} 
 
void ingresar(char c){ 
 if(tope==NULL) { 
         tope=new PilaEstructura; 
         tope->dato=c; 
         tope->enlace=NULL; 
     } 
     else{ 
          nue=new PilaEstructura; 
          nue->dato=c; 
          nue->enlace=tope; 
          tope=nue; 
     } 
} 
void eliminar(){ 
     if(tope!=NULL) { 
     cout<<tope->dato;   
           aux=tope; 
           tope=aux->enlace; 
           delete aux; 
                                
        }         
 } 
 
 
