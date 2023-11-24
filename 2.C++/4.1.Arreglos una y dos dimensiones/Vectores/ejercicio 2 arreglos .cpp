// Ejercicio 2 arreglos

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int nump[100],cont;
	
	cout<<"Se imprime los numeros primos de 1 a 100:\n\n ";
	
	for(int i=1; i<=100;i++){
		cont=0;
	    for(int j=i; j>=1; j--){
			if(i%j==0){
				cont++;	
			}
	    }
		if(cont<=2){
			cout<<i<<"  ";
		}	
	}cout<<"\n\n";
	
	getch();
	return 0;
}
