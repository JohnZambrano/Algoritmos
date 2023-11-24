/*Programación ATS-->Matrices dinamicas */

#include<iostream>
#include<stdlib.h>
#include<conio.h>

using namespace std;

//Prototipo de la función
void pedir_datos();
void mostrar_matriz(int **, int, int);

int **puntero_matriz,nFil,nCol;

int main(){
	
	pedir_datos();
	mostrar_matriz(puntero_matriz,nFil,nCol);
	
	//Liberar la memoria que hemos utilizado en la matriz
    for(int i=0; i<nFil; i++){
        delete[] puntero_matriz[i];
	}
	
	delete[] puntero_matriz;
	
	
	
	getch();
	return 0;
}

void pedir_datos(){
	cout<<"Digite el numero de filas: ";
	cin>>nFil;
	
	cout<<"Digite el numero de columnas: ";
	cin>>nCol;
	
	//Reservar memoria para la matriz dinamica
	
	puntero_matriz = new int*[nFil];//Reservando memoria para las filas
	
	for(int i=0; i<nFil; i++){
		puntero_matriz[i] = new int[nCol];//Reservando memoria para las columnas
	}
	
	cout<<"\nDigite los elementos de la matriz: \n\n";
	for(int i=0; i<nFil; i++){
		for(int j=0; j<nCol; j++){
			cout<<"Digite un numero["<<i<<"]["<<j<<"]:";
			cin>>*(*(puntero_matriz+i)+j);
		}
		cout<<"\n";
	}
}

void mostrar_matriz(int **puntero_matriz, int nFil, int nCol ){
	cout<<"\n\nImprimiendo matriz:\n\n";
	for(int i=0; i<nFil; i++){
		for(int j=0; j<nCol; j++){
			cout<<*(*(puntero_matriz+i)+j)<<" ";
		}
		cout<<"\n";
	}
}





