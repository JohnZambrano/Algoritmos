/* Escriba un programa que calcule el valor de: 1!+2!+3!+...+n! (suma de factoriales). */

#include<iostream>
#include<stdlib.h>

using namespace std;
int main(){
	
 	int n,num,suma=0;
 	
 	cout<<"Ingrese la cantidad de numeros a los que quiere sacar el factorial"<<endl;
 	cin>>n;
   	 for(int i=1; i<=n ;i++){
	 	
		 cout<<"Ingrese un numero para sacar el factorial"<<endl;
	 	 cin>>num;
	 	 int factorial=1;
	 	 
	 	   for(int j=1; j<=num; j++){
	 	   	factorial=factorial*j;
			}
		    cout<<"El factorial "<<i; cout<<"\t es: "<<factorial<<endl;
		    suma=suma+factorial;
	     }
	    
	     cout<<"La suma de los los factoriales es: "<<suma<<endl;
	    
	 system("pause");
 	 return 0;
}
