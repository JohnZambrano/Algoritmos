// Ejercicio 12: Funciones programación ATS

#include<iostream>
#include<conio.h>
#include<D:\gotoxy.h>
#include<stdlib.h>

using namespace std;

//Prototipo de la función

void datos();
void mostrar();
void ordenar(int vec[], int tam);


int vec[100],tam;

int main(){
	
	// Se llama la función pedir datos
	system("color 01");
	datos();
	ordenar(vec,tam);
	mostrar();
	 
	
	gotoxy(35,20); getch();
	return 0;
}
//Función pedir datos
void datos(){
	gotoxy(30,2); cout<<"Ingrese el tamanio del vector "<<endl;
	gotoxy(30,3); cout<<"=> "; cin>>tam;
	
    for(int i=0; i<tam; i++){
	 cout<<i+1<<". Ingrese un numero: "<<endl;
	 cout<<"=> "; cin>>vec[i];
	}
	
}
//Función de ordenamiento

void ordenar(int vec[], int tam){
  int aux;
  bool band=false;
	
	for(int i=0;i<tam;i++){
		for(int j=0;j<tam-1;j++){
			if(vec[j] > vec[j+1]){
					band=true;
			}
			
			
		}
	}
	if(band==true){
		cout<<"\n\nEl vector no esta ordenado de forma ecendente "<<endl;
	}
	else{
		 cout<<"\n\nEl vector si esta ordenado de forma acendente "<<endl;
	}
}

void mostrar(){
	cout<<"\n\nSe muetra el vector : ";
	for(int i=0;i<tam;i++){
		cout<<vec[i]<<" ";
	}	
	
}

