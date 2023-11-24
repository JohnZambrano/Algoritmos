#include<iostream>
#include<conio.h>
#include<D:\gotoxy.h>
using namespace std;

// Prototipo de la función

void intercambiar(int& , int& );

int main(){
	
	int n1=10,n2=15;
	
	gotoxy(20,3); cout<<"El valor del numero 1 es: "<<n1<<endl;
	gotoxy(20,4); cout<<"El valor del numero 2 es: "<<n2<<endl;
	
	// llamado de la función intercambiar
	intercambiar(n1,n2);
	

    gotoxy(20,8); cout<<"El nuevo valor del numero 1 es: "<<n1<<endl;
    gotoxy(20,9); cout<<"El nuevo valor del numero 2 es: "<<n2<<endl;
	
	getch();
    return 0;
}

// Función intercambiar

void intercambiar(int& n1, int& n2){
	int aux;
	aux=n1;
	n1=n2;
	n2=aux;
}






