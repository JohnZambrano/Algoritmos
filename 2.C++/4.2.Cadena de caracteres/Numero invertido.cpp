// Taller de programacion. Ejercicico: 3.

#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

int main(){
	 char num1[10],num2[10];
	 
	  cout<<"Ingrese un numero: "<<endl;
	  cin>>num1; cout<<"\n\n";
	  
	  strrev(num1);
	  strcpy(num2,num1);
	  cout<<"El numero invertido es igual a: "<<num2<<endl;
	
	 getch();
	 return 0;
}
