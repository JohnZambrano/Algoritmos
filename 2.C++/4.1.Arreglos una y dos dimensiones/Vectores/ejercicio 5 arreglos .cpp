// ejercicio 5 arreglos 

#include<iostream>
#include<conio.h>

using namespace std;
int main(){
	int nums[10],suma=0,resta=0,ops;
	double mult=1;
	float div=1;
	
	cout<<"Ingrese los 10 numeros\n\n";
	
		for(int i=0; i<10; i++){
		 cout<<i+1<<". Ingrese un numero: ";
		 cin>>nums[i]; cout<<"\n";
		 
		}cout<<"\n\n";
		
		cout<<"Elija la opcion que quiere realizar con los numeros \n\n";
		
		cout<<" 1. Para sumar los numeros\n\n";
		cout<<" 2. Para restar los numero\n\n";
		cout<<" 3. Para multiplicar los numeros\n\n";
		cout<<" 4. Para dividir los numeros\n\n";
		cin>>ops;
		
		switch(ops){
			case 1: for(int i=0; i<10; i++){
			            suma=suma+nums[i];
	        }
	        cout<<"La suma de los numeros es: "<<suma;
			break;
	        
			case 2: for(int i=0; i<10; i++){
			            resta=resta-nums[i];
	        }
	        cout<<"La resta de los numeros es: "<<resta;
			break;
	        
			case 3: for(int i=0; i<10; i++){
			            mult=mult*nums[i];
	        }
			cout<<"La multiplicacion de los numeros es: "<<mult;
			break;
	        
			case 4: for(int i=0; i<10; i++){
			            div=div*nums[i];
	        }
			cout<<"La didvicion de los numeros es: "<<div;
			break;
		}
	     cout<<"\n\n";
	
	getch();
	return 0;
}
