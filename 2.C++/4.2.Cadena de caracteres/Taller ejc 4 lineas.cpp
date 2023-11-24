// Taller de programacion .cadenas : ejercicio 4.

#include<iostream>
#include<stdio.h>
#include<string.h>

using namespace std;

int main(){
	 char lineas[20][10],aux[20];
	    for(int i=0; i<10; i++){
	    	cout<<"Digite la linea  "<<i+1<<endl;
	    	gets(lineas[i]);
		}
		for(int i=0; i<10; i++){
			strcpy(aux,lineas[i]);
			for(int j=0; j<10; j++){
				if(strcmp(lineas[i],lineas[j])>0){
					strcpy(aux,lineas[i]);
					strcpy(lineas[i],lineas[j]);
					strcpy(lineas[j],aux);
				}
			}
		}
		for(int i=0; i<10; i++){
	        	 cout<<lineas[i]<<" ";
			}
	
	 getchar();
	 getchar();
	 return 0;
}
