// Programación ATS => Ejercicio 4 numero menor del arreglo

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	
	int n,num[20],*dir_num;
	int men=9999;
	
	cout<<"Ingrese el numero de elementos del vector: "<<endl;
	cin>>n;
	
	for(int i=0; i<n; i++){
		cout<<"\nIngrese un numero en la posicion ["<<i<<"]: ";cin>>num[i];
    }
    
	cout<<"\n\n";
	
	dir_num = &num[0]; // Guarda la direccion de memoria
	
	for(int i=0; i<n; i++){
		if(*dir_num<men){
			men=*dir_num;
		}
	}
	cout<<"El numero menor del arreglo es: "<<men<<endl;
	
	
	
	
	
	
	
	getch();
	return 0;
}

