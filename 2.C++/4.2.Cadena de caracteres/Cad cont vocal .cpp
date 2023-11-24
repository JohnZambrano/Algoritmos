// Taller de programacion .ejercicio: 1

#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

int main(){
	 char cad[50];
	 char vocal=' ';
	 int tam=0,cont=0;
	 
	 
	 
	 cout<<"Ingrese una cadena de caracteres:\n";
	 gets(cad); cout<<"\n\n";
	 
	 cout<<"ingrese una vocal: \n";
	 cin>>vocal; cout<<"\n\n";
	 
	 tam=strlen(cad);
	 
	 for(int i=0; i<tam; i++){
	 	 if(cad[i]==vocal){
	 	     cont=cont+1; 	
	 	 	}
	    }
	    
		cout<<"la vocal  "<<vocal<<" se encuentra: "<<cont<<" veces  en la cadena \n\n";
	
	
	  getch();
	  return 0;
}


