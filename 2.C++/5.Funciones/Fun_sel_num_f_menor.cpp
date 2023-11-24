//Ejercicio 16: Realice una función que dada una matriz y un número de fila
//de la matriz devuelva el menor de los elementos almacenados en dicha fila.

#include<iostream>
#include<conio.h>
#include<D:\gotoxy.h>
#include<stdlib.h>

using namespace std;

//Prototipo de la función
void IngresarMatriz(int m[][100],int ,int );
void MostrarMatriz(int m[][100],int ,int );

int m[100][100],fil,col,n;

int main(){
int mat[100][100];

	cout<<"Ingrese el numero de filas de la matriz: "<<endl;
	cin>>fil;
	
	cout<<"Ingrese el numero de columnas de la matriz: "<<endl;
	cin>>col;
	
//   Se realiza el llamado de las funciones

	IngresarMatriz(m,fil,col);
	
	MostrarMatriz(m,fil,col);
	
	
	
	getch();
	return 0;
}

void IngresarMatriz(int m[][100],int fil,int col){
	
	
	for(int i=0; i<fil; i++){
		for(int j=0; j<col; j++){
			
			cout<<"Ingrese el elemento ["<<i+1<<"] ["<<j+1<<"]: ";
			cin>>m[i][j];
		}
		cout<<"\n";	
	}
	
}

void MostrarMatriz(int m[][100],int fil,int col){  

     cout<<"Ingrese el numero de la fila a mostrar: "<<endl;
     cin>>n;
	for(int i=n-1; i<=n-1; i++){
	   for(int j=0; j<col; j++){
			cout<<m[i][j]<<" ";
		}
		cout<<"\n";	
	}

}

























