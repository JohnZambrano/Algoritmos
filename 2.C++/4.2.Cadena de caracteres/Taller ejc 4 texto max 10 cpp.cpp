// Taller de programacion . ejercicio: 4

#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

int main(){
	
	char cad1[15],pal[15]; cout<<"\n";
	int tam;
	
	cout<<" Ingrese un texto\n\n";
	cin>>cad1;
	
	tam=strlen(cad1);
	
	for(int i=0; i=tam; i++){
		if(i!=' '){
			pal=pal[i]+i;
		}
	
	}
	
	getch();
	return 0;
}
