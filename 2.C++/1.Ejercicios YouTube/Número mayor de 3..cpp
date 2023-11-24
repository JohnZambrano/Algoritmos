/* Escriba un programa que lea 3 números y determine cúal de ellos es mayor */

#include<iostream>
#include<stdio.h>
using namespace std;

int main() {
	
	int n1,n2,n3;
	
cout<<"ingrese el primer numero: ";
cin>>n1;

cout<<"ingrese el segundo numero: ";
cin>>n2;

cout<<"ingrese el tercer numero: ";
cin>>n3;

if (n1==n2 and n1==n3) {
	cout<<" Los numeros son igules";
}
else if(n1>n2 and n1>n3) {
	
	cout<<" El numero mayor es: "<<n1;
}
else if (n2>n3) {
	
	cout<<" El numero mayor es: "<<n2;
}

else {
	cout<<" El numero mayor es: "<<n3;
}

	
getchar();	
return 0;	
}
