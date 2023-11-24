/*Escriba una plantilla de función llamada maximo() que devuelva el valor 
máximo de tres argumentos que se transmitan a la función cuando sea llamada. 
Suponga que los tres argumentos serán del mismo tipo de datos.*/

#include<iostream>
#include<conio.h>

using namespace std;

// Plantilla de la funcióm

  template <class TIPOD>
  
// Prototipo de las funciones

float maximo(TIPOD n1, TIPOD n2, TIPOD n3);
void datos();

float may=0,m=0;
float a,b,c;

int main(){
	
	datos();
	
	m=maximo(a,b,c);
	cout<<"El mayor es: "<<m<<endl;
		
getch();
return 0;
}

void datos(){
    
    cout<<" Ingrese los tres datos que se necesitan  "<<endl;
	cin>>a;
	cin>>b;
	cin>>c;	
    	
    cout<<"\n\n";	
}

template <class TIPOD>
float maximo(TIPOD n1, TIPOD n2, TIPOD n3){
    if((n1>n2)and(n1>n3)){
       may=n1;
   		
	}
	else if((n2>n1)&&(n2>n3)){
		may=n2;
	}
	else{
	may=n3;
	}
	return may;
}














