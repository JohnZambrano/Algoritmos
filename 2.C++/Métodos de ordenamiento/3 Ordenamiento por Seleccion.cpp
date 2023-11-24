//Ordenamiento por Selección

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int numeros[100];
	int n,aux,min;
	
	cout<<"Ingrese la cantidad de  numeros a ordenar: "<<endl;
	cin>>n; cout<<"\n\n";
	
	cout<<"Ingrese los numeros a ordenar: \n\n";
	
	for(int i=0; i<n;i++){
		cout<<"Ingrese el "<<i+1<<" numero a ordenar "<<endl;
		cin>>numeros[i]; cout<<"\n";
	}
	
	//Algoritmo del Ordenamiento por Selección
	for(int i=0;i<n;i++){
		min = i;
		for(int j=i+1;j<n;j++){
			if(numeros[j] < numeros[min]){
				min = j;
			}
		}
		aux = numeros[i];
		numeros[i] = numeros[min];
		numeros[min] = aux;
	}
	
	
	cout<<"Orden Ascendente: ";
	for(int i=0;i<n;i++){
		cout<<numeros[i]<<" ";
	}
	
	cout<<"\nOrden Descendente: ";
	for(int i=n-1;i>=0;i--){
		cout<<numeros[i]<<" ";
	}
	cout<<"\n\a";
	getch();
	return 0;
}
