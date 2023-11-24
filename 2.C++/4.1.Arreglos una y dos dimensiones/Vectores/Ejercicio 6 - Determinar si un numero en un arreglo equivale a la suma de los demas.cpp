/*6. Escribe un programa que defina un vector de n�meros y calcule si existe 
alg�n n�mero en el vector cuyo valor equivale a la suma del resto de n�meros 
del vector.*/

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int numeros[100],n;
	
	cout<<"Ingrese el numero de elementos del vector"<<endl;
	cin>>n; cout<<"\n\n";
	
	for(int i=0; i<n; i++){
		cout<<i+1<<". Ingrese un numero "<<endl;  // Definimos el vector
		cin>>numeros[i];
	}cout<<"\n\n";
	
	int suma=0,mayor=0;
	
	for(int i=0;i<n;i++){
		suma += numeros[i];
		
		if(numeros[i]>mayor){ //Determinamos cual es el numero mayor, ya que
			mayor = numeros[i];//el unico numero que puede ser la suma de los
		}					  //demas es el numero mayor
	}
	
	if(mayor == suma-mayor){//comparamos si el numero mayor es igual a suma menos el numero mayor
		cout<<"El numero "<<mayor<<" es la suma de los demas";
	}
	else{
		cout<<"No existe ningun numero que sea la suma de los demas";
	}
	
	getch();
	return 0;
}

