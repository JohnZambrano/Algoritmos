// ejeercicio 3 arreglos 
#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int numpares[100];
	
	cout<<"Se imprime los numeros pares de 1 a 100:\n\n";
	
	for(int i=0; i<100; i++){
		numpares[i]=i+1;
		if(numpares[i]%2==0){
			cout<<numpares[i]<<"  ";
		}
	}
	
	
	getch();
	return 0;
}
