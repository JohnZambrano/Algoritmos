// Programación ATS => Ejercicio 2 Punteros num primo

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int num,*dir_num;
	
	cout<<"Digite un numero "<<endl;
	cout<<"=> ";cin>>num;
	
	dir_num = &num; // Guardando posición de memoria
	
	int prim=0;
	
	for(int i=1; i<=(*dir_num); i++){
	 
	   if(*dir_num%i==0){
	 	  prim++;
	   }
	}
	if(prim>2){
		cout<<"El numero: "<<*dir_num<<" no es primo"<<endl;
		cout<<"Con direccion de memoria: "<<dir_num<<endl;	
	}else{
		cout<<"El numero: "<<*dir_num<<" es primo "<<endl;
		cout<<"Con direccion de memoria: "<<dir_num<<endl;
	}
	

	
	getch();
	return 0;
}
