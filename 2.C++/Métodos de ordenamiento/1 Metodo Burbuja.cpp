//Metodo Burbuja

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int array[100];
	int aux,cant;
	
	cout<<"Ingrese la cantidad de  numeros a ordenar: "<<endl;
	cin>>cant; cout<<"\n\n";
	
	cout<<"Ingrese los numeros a ordenar: \n";
	
	for(int i=0; i<cant;i++){
		cout<<"Ingrese el "<<i+1<<" numero a ordenar "<<endl;
		cin>>array[i]; cout<<"\n";
	}
	
	 
	for(int i=0;i<cant;i++){
		for(int j=0;j<cant-1;j++){
			if(array[j] > array[j+1]){
				aux = array[j];
				array[j] = array[j+1];
				array[j+1] = aux;
			}
		}
	}
	
	cout<<"Numeros de forma Ascendente: ";
	for(int i=0;i<cant;i++){
		cout<<array[i]<<" ";
	}
	
	cout<<"\nNumeros de forma Descendente: ";
	for(int i=cant-1;i>=0;i--){
		cout<<array[i]<<" ";
	}
	
	getch();
	return 0;
}
