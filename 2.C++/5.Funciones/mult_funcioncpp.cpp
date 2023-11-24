// Funcion que multiplica 2 # float
#include<conio.h>
#include<iostream>

using namespace std;
// Prototipo de funcion
void pedirDatos();
void mult(float ,float );

float num1,num2;

int main(){
	pedirDatos();
	mult(num1,num2);
	
	getch();
	return 0;
}
void pedirDatos(){
	cout<<"Digite 2 numeros \n "; 
	cin>>num1;
	cin>>num2;
	
}

void mult(float x,float y){
	float multiplicacion = x*y;
	
	cout<<"La multiplicacion es: "<<multiplicacion<<endl;
	
	
}






