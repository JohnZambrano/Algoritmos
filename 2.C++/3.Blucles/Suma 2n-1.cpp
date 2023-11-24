/*Escriba un programa que calcule el valor de: 1+3+5+...+2n-1 */

#include<iostream>
#include<stdio.h>

using namespace std;

int main(){
     int suma=0,num;

      cout<<"Digite el numero de elementos: "	<<endl; cin>>num;
        for(int i=1; i<=2*num-1;  i +=2){
	       suma += i;
	
       }
	     cout<<"La suma es"<<suma<<endl;
	
	 getchar();
	 return 0;
}
