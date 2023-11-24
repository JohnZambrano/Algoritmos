//8. Realice un programa que calcule el producto de dos matrices cuadradas de 3x3.

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int A[3][3];
	int B[3][3];
	int C[3][3];
	
	cout<<"Se ingresa los valores de la matriz A: \n\n"; 
		
	  for(int i=0; i<3; i++){
	    	for(int j=0; j<3; j++){
		     cout<<"Ingrese el valor en la posicion ["<<i+1<<"]["<<j+1<<"]: ";
		     cin>>A[i][j];		
	        }
		  cout<<"\n";
		  
	   }cout<<"\n\n";
	   
	   
	cout<<"Se ingresa los valores de la matriz B: \n\n"; 
		
	  for(int i=0; i<3; i++){
	    	for(int j=0; j<3; j++){
		     cout<<"Ingrese el valor en la posicion ["<<i+1<<"]["<<j+1<<"]: ";
		     cin>>B[i][j];		
	        }
		  cout<<"\n";
	   }
	
	//Multiplicando las matrices
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			C[i][j]=0;
			for(int k=0;k<3;k++){
				C[i][j] = C[i][j] + A[i][k]*B[k][j];
			}
		}
	}
	cout<<"\n\n";
	//Resultado de la multiplicacion
	cout<<"Se muestra el producto de A*B :\n"<<endl;
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			cout<<C[i][j]<<"   ";
		}
		cout<<"\n";
	}	
	
	getch(); 
	return 0;
}

