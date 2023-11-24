/*
Punto 4:
7.  Escribir un procedimiento llamado "cambio"  con parametros una matriz  bidimensional
    de 10 filas y 10 columnas y dos variables naturales m y n. El procedimiento intercambia 
    las filas m y n de la matriz.
*/

#include<iostream>
#include<conio.h>
#include<stdlib.h>

using namespace std;

//Prototipo de las funciones
void pedirDatos();
void cambio();

int numeros[10][10];

int main(){
	
    pedirDatos();
    cambio(); 
	
	getch();
	return 0;
}
///////////////////////////////////////////////////////////////////////////////

void pedirDatos(){
	for(int n=0;n<10;n++){
		for(int m=0;m<10;m++){
		    cout<<"Digite un numero en la posicion ["<<n+1<<"]["<<m+1<<"]: ";
			cin>>numeros[n][m];
		}
		cout<<"\n";
	}
	
	cout<<"\nMatriz Normal\n";
	for(int n=0;n<10;n++){
		for(int m=0;m<10;m++){
			cout<<numeros[n][m]<<" ";
		}
		cout<<"\n";
	}
		
}
///////////////////////////////////////////////////////////////////////////////

void cambio(){
	cout<<"\nIntercambia las filas m y n de la matriz.\n";
	for(int n=0;n<10;n++){
		for(int m=0;m<10;m++){
			cout<<numeros[m][n]<<" ";
		}
		cout<<"\n";
	}	
}


