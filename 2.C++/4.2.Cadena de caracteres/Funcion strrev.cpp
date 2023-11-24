// Realiza un programa que determine si una palabra es polindroma

#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

int main(){
	char cad1[10],cad2[10];
	
 	cout<<"Ingrese una palabra"<<endl;
 	cin>>cad1;cout<<"\n";
 	
 	strcpy(cad2,cad1);
 	strrev(cad1);
 
 	if(strcmp(cad1,cad2)==0){
 		cout<<cad1<<":  "<<"La palabra si es polindroma";
	 }else {
	 	cout<<cad1<<":  "<<"La palabra no es polindroma";
	 }
	 
	 getch();
	 return 0;
}
