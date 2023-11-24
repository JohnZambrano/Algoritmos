/*Escribe un programa que lea de la entrada estándar de tres números.
 Después debe leer un cuarto número e indicar si
 el número coincide con alguno de los introducidos con anterioridad.*/
 
#include<iostream>
#include<stdio.h>

using namespace std;

int main() {

int n1,n2,n3,n4;

cout<<"ingrese el valor de n1:  "; cin>>n1;
cout<<"ingrese el valor de n2:  "; cin>>n2;	
cout<<"ingrese el valor de n3:  "; cin>>n3;

cout<<" ahora ingrese otro numero para comprovar si coincide con alguno de los anteriores: \n";
	
cin>>n4;	

if ((n4==n1)or( n4==n2)or(n4==n3)) {

cout<<" El cuarto numero ingresado si coincide con algun numero anterior ";
	
}
else {
cout<<" El cuarto numero ingresado no coicide con ningun numero anterior ";	
	
}	
	
	getchar();
	return 0;
}
