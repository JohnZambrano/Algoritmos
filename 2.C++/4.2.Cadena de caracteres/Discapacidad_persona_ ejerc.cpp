/*Defina una estructura que sirva para representar a una persona.
La estructura debe contener dos campos: el nombre de la persona y un valor de tipo lógico que indica si la persona
tiene algún tipo de discapacidad. Realice un programa que dado un vector de personas rellene dos nuevos vectores:
uno que contenga las personas que no tienen ninguna discapacidad y otro que contenga las personas con discapacidad.*/

 #include <iostream>
 #include <conio.h>
 #include <string.h>
 
 
 using namespace std;
 
struct persona{
  char nombre[30];
  bool disc;
 }per[200];
 
 int main(){
 	char per[200],per_disc[100],per_san[100];
 	int num;
 	
 	// Se ingresan el numero de personas y sus datos
 	cout<<"Ingrese el numero de personas "<<endl;
 	cin>>num;
 	
 	for(int i=0; i<num; i++){
 		fflush(stdin); //vasiar el buffer y permitir digitar los valores
 		cout<<"Ingrese el nombre de la persona "<<i+1<<endl;
 		cin.getline(per[i].nombre,30,'\n');
 		
 		cout<<"Determinar si tiene una discapacidad la persona "<<i+1<<endl;
 		cout<<"Marcar v para verdadero y f para falso "<<endl;
 		cin.getline(per[i].disc,'\n');
 		
 		if(per[i]=='v'){
 			strcpy(per_disc,per[i]);
 			
		 }
		 else{
		 	strcpy(per_san,per[i]);
		 }
 		}
 	getch();
 	retur 0;
 }
   
