/* Pedir al usuario dos cadenas de caracteres, 
   e indicar si ambas cadenas son iguales, 
   en caso de no serlo indicar cual es mayor alfabeticamente*/
   
#include<iostream>
#include<conio.h>
#include<string.h>
   
 using namespace std;
   
   int main(){
   	 char cad1[50],cad2[50];
   	 
   	 cout<<"Ingrese la cadena 1:\n "<<endl;
   	 gets(cad1);cout<<"\n";
   	 
   	 cout<<"Ingrese la cadena 2:\n "<<endl;
   	 gets(cad2);cout<<"\n";
   	 
   	 if(strcmp(cad1,cad2)==0){
   	 	cout<<"Las cadenas son guales \n";
		 }else if(strcmp(cad1,cad2)>0){
		 	   cout<<cad1<<" "<<"Esta despues alfabeticamente"<<endl;             
		     }else{
		     	cout<<cad1<<" "<<"Esta antes alfabeticamente"<<endl;
			 }
   	 
   	
   	 getch();
   	 return 0;
   }
   
   
   
   
