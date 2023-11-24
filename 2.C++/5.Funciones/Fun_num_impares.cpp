 // Ejercicio 14: Funciones programación ATS

#include<iostream>
#include<conio.h>
#include<D:\gotoxy.h>
#include<stdlib.h>
#include<string.h>

using namespace std;

//Prototipo de la función

void datos();
void mostrar();
void impares(int vec[], int tam);

int cont1=0,cont2=0;
int vec[100],vec2[100],vec3[100],tam;

int main(){
	// Se coloca color al fondo y a la letra
	system("color 01");
	// Se llama la función pedir datos
	datos();
	// Se llama a la función impares
	impares(vec,tam);
	//Se llama a la función mostrar
	mostrar();
	 
	
	getch();
	return 0;
}

 void datos(){
	gotoxy(30,2); cout<<"Ingrese el tamanio del vector "<<endl;
	gotoxy(30,3); cout<<"=> "; cin>>tam;
	
    for(int i=0; i<tam; i++){
	 cout<<i+1<<". Ingrese numeros enteros "<<endl;
	 cout<<"=> "; cin>>vec[i];
	}
	cout<<"\n\n";
	
}
// Función impares

void impares(int vec[], int tam){
	
	for(int i=0; i<tam; i++){
		if(vec[i]%2 != 0){
			cont1=cont1+1;
			vec2[i]=vec[i];	
		}
		else{
			cont2=cont2+1;
			vec3[i]=vec[i];
		}
	}

	
}
// Función que muestra los numeros impares

void mostrar(){
	
	for(int i=0; i<tam; i++){
		cout<<vec2[i]<<" ";
	}
	if(cont1==0){
		cout<<"\n\nNo existe ningun nuemro impar en el vector "<<endl;
	}
	else if(cont2==0){
		cout<<"\n\nTodos los numeros del vector son impares "<<endl;
	}
}















