/* Función despliegue */

#include<iostream>
#include<conio.h>

using namespace std;
// Plantilla de la función
template <class TIPOD>
// Prototipo de la función 
void despliegue(TIPOD dato);

int main(){
	
    int dato1 = 5;
   	float dato2 = 2.5;
   	double dato3 = 456.866;
   	char dato4='a';
   	
   	cout<<"\n\n";
   	
	despliegue(dato1);
	despliegue(dato2);
	despliegue(dato3);
	despliegue(dato4);
	
	getch();
	return 0;
}

   template <class TIPOD>
   void despliegue(TIPOD dato){
	cout<<" \t    \t     El dato es: "<<dato<<endl;
}






