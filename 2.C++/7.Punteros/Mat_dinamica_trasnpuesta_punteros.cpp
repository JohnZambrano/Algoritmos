/* Ejercicio 10: 
Realice un programa que lea una matriz dinámica de NxM y cree su matriz traspuesta. 
Nota: La matriz traspuesta es aquella en la que la columna i era la fila i de la matriz original.
Ejemplo:    |1 2 3|       |1 4 7|
            |4 5 6|  -->  |2 5 8|
            |7 8 9|       |3 6 9|  */

#include<iostream>
#include<conio.h>
#include<stdlib.h>

using namespace std;

int **puntero_Mat, nFil, nCol;

//Prototipo de las funciones
 void pedir_Datos();
 void mostrar_Mat_Traspuesta();
 
 int main(){
 	
    pedir_Datos();
    mostrar_Mat_Traspuesta();
    
    //Liberando la memoria utilizada
    
    for(int i=0; i<nFil; i++){
    	delete[] puntero_Mat[i];
	}
	delete[] puntero_Mat;
	
   getch();
   return 0;
 }
 
 // Funcion para ingresar los datos
 
void pedir_Datos(){
    cout<<"Digite el numero de filas de la matriz: ";
    cin>>nFil;
    
    cout<<"Digite el numero de columnas de la matriz: ";
    cin>>nCol;
    
    // Reservando memoria para la matriz
    
    puntero_Mat = new int*[nFil];//Reservando memoria para las filas
    for(int i=0; i<nFil; i++){
    	puntero_Mat[i] = new int[nCol];//Reservando memoria para las columnas
    }
   	
    cout<<"\n\nDigite los elementos para la primera matriz:\n\n";
    
    for(int i=0;i<nFil;i++){
		for(int j=0;j<nCol;j++){
		    cout<<"Digite el elemento de la posicion ["<<i+1<<"]["<<j+1<<"]: ";
			cin>>*(*(puntero_Mat+i)+j);
		}
		cout<<"\n";
	}
  	
  }
  
  //Función para mostrar la matriz original y la matriz traspuesta
  
  void mostrar_Mat_Traspuesta(){
  	
    cout<<"Mostrando la matriz original: \n";
    
    for(int i=0;i<nFil;i++){
		for(int j=0;j<nCol;j++){
			cout<<*(*(puntero_Mat+i)+j)<<" ";
		}
		cout<<"\n";
	}
	
	cout<<"\nMostrando la matriz transpuesta: \n";
	
	for(int i=0;i<nFil;i++){
		for(int j=0;j<nCol;j++){
			cout<<*(*(puntero_Mat+j)+i)<<" ";
		}
		cout<<"\n";
	}
	
  }

 


