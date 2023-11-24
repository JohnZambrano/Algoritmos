// Realiza un programa que defina una matriz de 3x3 y escriba
// un ciclo para que muestre la diagonal principal de la matriz.

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
    int numeros[3][3];
         cout<<" \t                          Ingrese los valores de la matriz:\n\n ";
         
         for(int i=0; i<3; i++){
         	for(int j=0; j<3; j++){
         		cout<<"Ingrese un numero a la posicion ["<<i+1<<"]["<<j+1<<"]: ";
         		cin>>numeros[i][j];
			 }
			 cout<<"\n";
		 }
    
    cout<<"Mostrando matriz principal\n"<<endl;
    
	for(int i=0 ;i<3 ;i++){
		for(int j=0 ;j<3 ; j++){
			cout<<numeros[i][j]; cout<<"  ";
		}
		cout<<"\n";
	}
	
	cout<<"Mostrando diagonal principal\n"<<endl;
	
	for(int i=0 ;i<3 ;i++){
		for(int j=0 ;j<3 ;j++){
			if(i==j){
				cout<<numeros[i][j]; cout<<"  ";
			}
		}
	}
	
	
	getch();
	return 0;
}

