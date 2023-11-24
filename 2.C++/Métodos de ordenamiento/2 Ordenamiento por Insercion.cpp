#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int numeros[100];
	int n,pos,aux;
	
	cout<<"Ingrese la cantidad de  numeros a ordenar: "<<endl;
	cin>>n; cout<<"\n\n";
	
	cout<<"Ingrese los numeros a ordenar: \n\n";
	
	for(int i=0; i<n;i++){
		cout<<"Ingrese el "<<i+1<<" numero a ordenar "<<endl;
		cin>>numeros[i]; cout<<"\n";
	}
	
	for(int i=0;i<n;i++){
		pos = i; 
		aux = numeros[i];
		
		while((pos>0) && (numeros[pos-1] > aux)){
			numeros[pos] = numeros[pos-1];
			pos--;
		}
		numeros[pos] = aux;
	}
	
	cout<<"Orden Ascendente: ";
	for(int i=0;i<n;i++){
		cout<<numeros[i]<<" ";
	}
	
	cout<<"\nOrden Descendente: ";
	for(int i=n-1;i>=0;i--){
		cout<<numeros[i]<<" ";
	}
	
	getch();
	return 0;
}
