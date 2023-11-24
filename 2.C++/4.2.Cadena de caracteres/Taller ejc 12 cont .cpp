// Taller de programacion .cadenas : ejercicio 12.

#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

int main(){
	 char frase[20];
	 int band=0,cont=0;
	 cout<<"Digite la frase a validar: "<<endl;
	 gets(frase);
	 for(int i=0; i<strlen(frase); i++ ){
	 	  if(frase[i]=='('){
	 	  	 cont++;
		   }else if(frase[i]==')'){
		   	 cont--;
		   }
		   if(cont<0){
		   	band=1;
		   }
	    }
	       if((cont==0 )&&(band==0)){
	       	  cout<<"La frase es valida"<<endl;
		   }else{
		   	  cout<<"La frase es invalida"<<endl;
		   }
	
	 getch();
     return 0;
}
