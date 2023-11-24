/* Hacer un programa que pida al usuario ingresar una cadena de caracteres,
   luego verificar la longitud de la cadena, y si esta supera en tamaño de diez mostarar en pantalla,
   caso contarario no mostrarla */
   
   #include<iostream>
   #include<conio.h>
   #include<string.h>
   
   using namespace std;
   
  int main(){
   	 char cad[50];
   	 int tam=0;
   	 
   	 cout<<"Ingrese la cadena de caracteres:\n\n";
   	 gets(cad);cout<<"\n";
   	 
   	 tam=strlen(cad);
   	 
   	 if(tam>10){
   	 	cout<<"El tamanno de la cadena es: "<<tam<<endl;
   	 	}
   	 
   	getch();
   	return 0;
   }

