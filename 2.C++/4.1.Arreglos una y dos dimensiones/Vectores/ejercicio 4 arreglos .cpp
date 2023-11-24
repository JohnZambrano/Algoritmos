// ejercicio 4 arreglos

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int nums[10],men=9999;
	
	cout<<"Ingrese 10 numeros \n\n";
	
	for(int i=0; i<10; i++){
		cout<<i+1<<". Ingrese un numero: ";
		cin>>nums[i]; cout<<"\n";
		
		if(nums[i]<men){
			men=nums[i];
		}
		
		
	}cout<<"\n\n";
	
	cout<<"Se imprime los numeros en orden inverso\n\n";
	
	for(int i=9; i>=0; i--){
		cout<<nums[i]<<" ";
	}cout<<"\n\n";
	
	cout<<" El valor minimo leido es: "<<men;
	
	
	getch();
	return 0;
}
