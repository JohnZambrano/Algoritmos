//Hacer una matriz preguntando al usuario el numero de filas y columnas,llenarla de números aleatorios,
// copiar el contenido a otra matriz y por último mostrarla en pantalla.

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	 int matriz1[10][10],matriz2[10][10],filas,columnas;
	 
	 cout<<"Ingrese el numero de filas de la matriz:\n "<<endl;
	 cin>>filas;cout<<"\n";
	 cout<<"Ingrese el numero de columnas de la matriz:\n"<<endl;
	 cin>>columnas;cout<<"\n";
	 
	 //Se pide los valores de la matriz
	 
	 for(int i=0 ;i<filas ;i++){
	 	 for(int j=0 ;j<columnas ;j++){
	 		  cout<<"ingrese el valor de la posicion ["<<i+1<<"]["<<j+1<<"]:  ";
	 		  cin>>matriz1[i][j];
		     }
		     cout<<"\n";
	   }
	         cout<<"Se visualiza la matriz 1\n"<<endl;
	         for(int i=0 ;i<filas ;i++) {
		   	        for(int j=0 ;j<columnas ;j++){
		   	   	       cout<<matriz1[i][j]<<" ";
				     }
				     cout<<"\n";
				}
	         // Pasa el valor de la matriz1 a la matriz2
	         
		      for(int i=0 ;i<filas ;i++) {
		   	        for(int j=0 ;j<columnas ;j++){
		   	   	       matriz2[i][j]=matriz1[i][j];
				     }
				}
				cout<<"\n";
			 //	Se visualiza el valor tranferido a la matriz2
				cout<<"Se visualiza el valor tranferido a la matriz 2\n"<<endl;
				for(int i=0 ;i<filas ;i++) {
					for(int j=0 ;j<columnas ;j++){
						cout<<matriz2[i][j]<<" ";
					 }
					 cout<<"\n";
				}      
	
	
	
    	getch();
    	return 0;
}
