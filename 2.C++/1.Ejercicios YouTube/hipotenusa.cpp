/* Escriba un programa que lea la entrada estándar de dos catetos de un triángulo rectángulo
y escriba en la salida estándar su hipotenusa*/

#include<iostream>
#include<conio.h>
#include<math.h>
using namespace std;
int main() {
	
float a,b,h=0;

cout<<" ingrese el primer cateto: \n";  cin>>a;
cout<<" ingrese el segundo cateto: \n"; cin>>b;

   h=sqrt(pow(a,2)+pow(b,2));
   cout<<"\n la hipotenusa es: "<<h<<endl;

getch();
return 0;
}
