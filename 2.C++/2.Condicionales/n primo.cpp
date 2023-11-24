/*Leer un numero entero y decir si es primo o no*/

#include<iostream>
#include<stdio.h>

using namespace std;
int main(){
int a=0,n;

     cout<<"Ingrese un numero positivo"<<endl;
	 cin>>n;
	 
	 for(int i=1; i<=n; i++){
		if(n%i==0){
		a++;
		}			
	 }	
	  if(a!=2){
	   cout<<"NO es primo";			
	  }else{
		cout<<"Si es primo";
	  }
	  
	getchar();
	getchar();
	return 0;
}
