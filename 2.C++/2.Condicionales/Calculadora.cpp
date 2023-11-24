#include<iostream>
#include<stdio.h>
#include<cmath>
using namespace std;
int main(){
int opc,num1,num2,num,n,suma=0,resta=0,pro=0,div=0;
double raiz=0,pot=0,logaritmo=0;
cout<<"\t                    Elija el tipo de operacion a ralizar"<<endl;

cout<<"Para suma digite: 1\n"<<endl;

cout<<"Para resta digite: 2\n"<<endl;

cout<<"Para multiplicacion digite: 3\n"<<endl;
        	
cout<<"Para dividicion digite: 4\n"<<endl;	

cout<<"Para potencia digite: 5\n"<<endl;
	
cout<<"Para raiz cuadrada digite: 6\n"<<endl;	

cout<<"Para logaritmo digite: 7\n"<<endl;	

cin>>opc; cout<<"\n"<<endl;

switch(opc){
case 1:cout<<"ingrese el primer numero\n"<<endl;
        cin>>num1;
        cout<<"ingrse el segundo numero\n"<<endl;
         cin>>num2;
        suma=num1+num2;
        cout<<"La suma es: "<<suma;break;
       
case 2:cout<<"ingrese el primer numero"<<endl;
        cin>>num1;
        cout<<"ingrse el segundo numero"<<endl;
         cin>>num2;
        resta=num1-num2;
        cout<<"La resta es: "<<resta;break;
       
case 3:cout<<"ingrese el primer numero"<<endl;
        cin>>num1;
        cout<<"ingrse el segundo numero"<<endl;
         cin>>num2;
        pro=num1*num2;
        cout<<"El producto es: "<<pro;break;
       
case 4:cout<<"ingrese el primer numero"<<endl;
        cin>>num1;
        cout<<"ingrse el segundo numero"<<endl;
         cin>>num2;
        div=num1/num2;
        cout<<"El cociente es: "<<div;break;
       
case 5:cout<<"ingrese el numero a elevar: "<<endl;
        cin>>num;
          cout<<"ingrese la potencia : "<<endl;
	       cin>>n;
	  	  pot=(pow(num,n));
	  	  cout<<"La potencia  del numero es: "<<pot;break;
	  	  
case 6:cout<<"Ingrese un numero"<<endl;  
        cin>>num;
		raiz=sqrt(num);
		cout<<"La raiz cuadrada es: "<<raiz;break; 
		                                          
case 7:cout<<"Ingrese un numero: "<<endl;
       cin>>num;
	   logaritmo=log10(num);
	   cout<<"El logaritmo natural es: "<<logaritmo;break;
	    
default:cout<<"Salir"<<endl;break;	
	
  }
	getchar();
	return 0;
}
