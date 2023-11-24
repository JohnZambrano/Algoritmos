//Busqueda Binaria

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int numeros[100];
	int n;
	
	cout<<"Ingrese la cantidad de numeros a trabajar: \n";
	cin>>n; cout<<"\n\n";
	
	for(int i=0; i<n;i++){
		cout<<i+1<<" Ingrese un numero "<<endl;
		cin>>numeros[i]; cout<<"\n";
	}
	
	int inf,sup,mitad,dato,i;
	char band='F';
	
	dato = n;
	
	//Algoritmo de la Busqueda Binaria
	inf=0;
	sup=n;
	i=0;
	while((inf<=sup)&&(i<n)){
		mitad = (inf+sup)/2;
		if(numeros[mitad]== dato){
			band='V';
			break;
		}
		if(numeros[mitad]>dato){
			sup = mitad;
			mitad = (inf+sup)/2;
		}
		if(numeros[mitad]<dato){
			inf = mitad;
			mitad = (inf+sup)/2;
		}
		i++;
	}
	
	if(band == 'V'){
		cout<<"El numero se encontro en la pos: "<<mitad<<endl;
	}
	else{
		cout<<"El numero NO se encontro";
	}
	
	getch();
	return 0;
}
