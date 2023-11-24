/*  Realice un programa que calcule la suma de dos matrices cuadradas de 3x3. */

#include<iostream>
#include<stdio.h>

using namespace std;

int main(){
	 int matrizA[10][10];
 	 int matrizB[10][10];
	 int sumaM[20][20];

       //Se pide los valores de la matrizA
	

		cout<<"Se ingresa los valores de la matrizA: \n\n"; 
		
	  for(int i=0; i<3; i++){
	    	for(int j=0; j<3; j++){
		     cout<<"Ingrese el valor en la posicion ["<<i+1<<"]["<<j+1<<"]: ";
		     cin>>matrizA[i][j];		
	        }
		  cout<<"\n";
	   }
	   
	   //Ahora imprimiremos nuetra  matrizA
	   cout<<"Esta es la matrizA:\n\n";
	   
	   for(int i=0; i<3; i++){
	   	 for(int j=0; j<3; j++){
	   	 cout<<matrizA[i][j]<<" ";
			}
			cout<<"\n";
	   }
	        cout<<"\n\n";
	        
	    //Se pide los valores de la matrizB
	

		cout<<"Se ingresa los valores de la matrizB: \n\n"; 
		
	  for(int i=0; i<3; i++){
	    	for(int j=0; j<3; j++){
		     cout<<"Ingrese el valor en la posicion ["<<i+1<<"]["<<j+1<<"]: ";
		     cin>>matrizB[i][j];		
	        }
		  cout<<"\n";
	   }
	   
	   //Ahora imprimiremos nuetra matrizB
	   cout<<"Esta es la matrizB:\n\n";
	   
	   for(int i=0; i<3; i++){
	   	 for(int j=0; j<3; j++){
	   	 cout<<matrizB[i][j]<<" ";
			}
			cout<<"\n";
	   }
	   
	   //Ahora realizaremos la suma de las dos matrices 
	   
	   for(int i=0; i<3; i++){ 
	      for(int j=0; j<3; j++){
	      	sumaM[i][j]=matrizA[i][j]+matrizB[i][j];
		  }
	   	} cout<<"\n\n";
	   	
	    //Por ultimo se imprime la matriz resultante de la suma
	   	cout<<"Se muetra la suma de las dos matrices: \n\n";
	   	for(int i=0; i<3; i++){
	   	   for(int j=0; j<3; j++){
	   		     cout<<sumaM[i][j]<<"  ";
			   }
			   cout<<"\n";
		   }
	   	
	 getchar();
     return 0;
}
