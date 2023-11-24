// Taller de programacion . ejercicio: 5

#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

int main(){
	char cad1[30],cad2[30];
	int tam1,tam2,menor=0;
	
	cout<<"Ingrese la primer cadena de caracteres: "<<endl;
	gets(cad1); cout<<"\n\n";
	tam1=strlen(cad1);
	
	cout<<" Ingrese la segunda cadena de caracteres: "<<endl;
	gets(cad2); cout<<"\n\n";
	tam2=strlen(cad2);
	
	if(tam1<tam2){
		menor=tam1;
	}else{
		menor=tam2;
	}
	
	for(int i=0; i<1; i++){
		if(strcmp(cad1,cad2)==0){
			cout<<"La palabra es anagrama\n\n";
		}
		for(int j=0; j<menor; j++ ){
		
		 if(strcmp(cad1[i],cad2[j])==0){
		    	
		    }else{
			 cout<<"la palabra no es anagrama\n\n";
		    }
       }
    }
	
	
	getch();
	return 0;
}
