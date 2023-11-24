/*7. Desarrollar un programa que determine si una matriz es sim�trica o no. Una matriz
es sim�trica si es cuadrada y si es igual a su matriz transpuesta.


|8 1 3|        |8 1 3|
|1 7 4|  -->   |1 7 4| 
|3 4 9|        |3 4 9|

*/

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int numeros[100][100],filas,columnas;
	char band='F';
	
	cout<<"Digite el numero de filas: "; cin>>filas;
	cout<<"Digite el numero de columnas: "; cin>>columnas; cout<<"\n\n";
	
	//Rellenando matriz
	for(int i=0;i<filas;i++){
		for(int j=0;j<columnas;j++){
			cout<<"Digite un numero en la posicion ["<<i+1<<"]["<<j+1<<"]: ";
			cin>>numeros[i][j];
		}cout<<"\n\n";
	}
	
	//Comprobemos si es simetrica
	if(filas==columnas){
		for(int i=0;i<filas;i++){
			for(int j=0;j<columnas;j++){
				if(numeros[i][j] == numeros[j][i]){
					band='V';
				}
			}
		}
	}

	if(band=='V'){
		cout<<"\nEs una matriz simetrica";
	}
	else{
		cout<<"\nNo es una matriz simetrica";
	}
	
	
	getch();
	return 0;
}

