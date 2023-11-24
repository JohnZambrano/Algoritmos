// Convertir dos cadenas de minusculas a mayusculas .
// compararlas y decir si son iguales o no

#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

int main(){
	 char cad1[20];
	 char cad2[20];
	 
	 cout<<"Ingrese una cadena de caracteres:\n ";
	 gets(cad1); cout<<"\n";
	 
	 cout<<"Ingrese una cadena de caracteres:\n ";
	 gets(cad2); cout<<"\n";
	 
	 cout<<"Se visualizan las cadenas convertidas en mayusculas\n\n";
	 
	 strupr(cad1);
	 strupr(cad2);
	 
	 cout<<cad1<<"\n"<<endl;
	 cout<<cad2<<endl;
	 
	 cout<<"\n\n";
	 
	 if(strcmp(cad2,cad1)==0){
	 	  cout<<"Las cadenas son iguales"<<endl;
	 }else{
	 	 cout<<"Las cadenas son diferentes"<<endl;
	 }
	
 	getch();
	 return 0;
}

