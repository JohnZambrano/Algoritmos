// Hacer un programa que lea 5 números en un arreglo, los copie a 
// otro arreglo multiplicados por 2 y muestre el segundo arreglo.

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	 int numeros[5];
	 int numeros2[5];
	 for(int i=0; i<5; i++){
	     cout<<"ingrese un  numero: "<<endl;
     	 cin>>numeros[i];
     	 numeros2[i] = numeros[i]*2;
       }
 
        for(int i=0; i<5; i++) {	
          cout<<"La posicion: "<<i<<"  "<<"multiplicado por dos es igual a: "<<numeros2[i]<<endl;	
         }
     	 	
	
	  getchar();
	 return 0;
}
