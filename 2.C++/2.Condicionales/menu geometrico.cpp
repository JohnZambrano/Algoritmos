/*Programa que permita calcular el area de diferentes figuras geometricas :
como el circulo ,cuadrado,triángulo y rectangulo*/

#include<iostream>
#include<stdio.h>
#include<cmath>
using namespace std;
 
 int main(){
 	 int opc,a,l;
 	 float pi=3.14,r;
 	
 	 cout<<"\t                   Bienvenido a su menu geometrico\n"<<endl;
 	 cout<<"1. Para area del cuadrado\n"<<endl;
 	 cout<<"2. Para area del circulo\n"<<endl;
 	 cout<<"3. Para area del triangulo\n"<<endl;
	 cout<<"4. Para area del rectangulo\n"<<endl;
	 cout<<"5. Salir"<<endl;
 	 cin>>opc;
 	 switch(opc){
 	   case 1:
 	   cout<<"Ingrese un lado del cuadrado: "<<endl; cin>>l;
 	   a=(pow(l,2)) ;
	   cout<<"El area del cuadrado es: "<<a<<endl;break;
			  
	   case 2:
	    cout<<"Ingrese el valor del radio de la circunferencia: "<<endl; cin>>r;
	    a=(pi*(pow(r,2)));
	    cout<<" El area de la circunferencia es: "<<a<<endl;break; 
	               
	    case 3: int b,h;
	    cout<<"Ingrese la base del triangulo: "<<endl; cin>>b;
        cout<<"Ingrese la altura del triangulo: "<<endl; cin>>h;
        a=((b*h)/2);
	    cout<<"La area del triangulo es :"<<a<<endl;break;
	       	             
	    case 4: int a,b2;
	    cout<<"Ingrese la altura del rectangulo: "<<endl; cin>>a;
	    cout<<"Ingrese la base del rectangulo: "<<endl; cin>>b2;
	    a=a*b2;
	    cout<<"La area del rectangulo es: "<<a<<endl;break;
	    default :break;		
	   }
 	
 	
 	getchar();
 	return 0;
 }
