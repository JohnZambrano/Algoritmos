// Ejercicio 8: Funciones programación ATS

#include<iostream>
#include<conio.h>
#include<D:\gotoxy.h>

using namespace std;

// Prototipo de la función

void cambio(int , int& ,int& , int& , int& , int& , int& );

int main(){
	int a=0,cien=100,cinc=50,veinte=20,diez=10,cinco=5,uno=1;
	
	gotoxy(30,2); cout<<"Ingrese un valor en dinero "<<endl;
	gotoxy(30,3); cin>>a;
	
	//llamado de la función
	
	cambio(a,cien,cinc,veinte,diez,cinco,uno);
	
	getch();
	return 0;
}
//Función cambio 

void cambio(int a, int& cien, int& cincuenta, int& veinte, int& diez, int& cinco, int& uno ) {
 
 int i=0 ,j=0 ,k=0 , c=0 , n=0 , m=0;
 
 do{
  
  
  if (a >= cien ){
   
   a -= cien;
   i++; 
   
  } else if (a>= cincuenta){
   
   a-= cincuenta;
   j++; 
   
  } else if (a>= veinte) {
   
   a-= veinte;
   k++; 
   
  } else if (a>= diez) {
   
   a -= diez;
   c++; 
   
  } else if (a>= cinco){
   
   a -= cinco;
   n++; 
   
  } else if (a>= uno){
   
   a-= uno;
   m++; 
   
  } 
   } while (a != 0);
   
 gotoxy(30,5); cout << "Los Billetes utilizados son:\n\n ";
 
 cout<<"Billete de cien -> " <<i << endl;
 cout<<"\n Billete de cincuenta -> " << j << endl; 
 cout<<"\n Billete de veinte -> " << k << endl; 
 cout<<"\n Billete de diez -> " << c << endl;
 cout<<"\n Billete de cinco -> " << n << endl; 
 cout<<"\n Billete de uno -> " << m << endl;
}
