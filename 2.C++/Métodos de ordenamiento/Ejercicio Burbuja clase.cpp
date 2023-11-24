#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int vector[100];
	int cant,aux;
	
	cout<<"Ingrese la cantidad de numeros a ordenar: "<<endl;
	cin>>cant; cout<<"\n";
	
	for(int i=0; i<cant; i++){
		cout<<"Ingrese el numero "<<i+1<<" a ordenar"<<endl;
		cin>>vector[i];
	}cout<<"\n\n";
	
	for(int i=0; i<cant; i++){
		for(int j=i+1; j<cant; j++){
			if(vector[i]<vector[j]){
				
			}else{
				aux=vector[j];
				vector[j]=vector[i];
				vector[i]=aux;
			}
		}
	}cout<<"\n\n";
	
		cout<<"Numeros ordenados de mayor a menor"<<endl;
		
	for(int i=0; i<cant; i++){
		cout<<vector[i]<<"  ";
	}

	
	getch();
	return 0;
}
