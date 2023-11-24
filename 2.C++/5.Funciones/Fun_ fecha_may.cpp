// Programación ATS.Ejercicio 18: Fecha más reciente

#include<iostream>
#include<conio.h>
#include<D:\gotoxy.h>

using namespace std;

 struct fecha{
   int anio;
   int mes;
   int dia;
   
 }f1,f2;

//Prototipo de la funcccíon
 void datos();
 void mayor(fecha, fecha);
 
 
 int main(){
 	
  //Se llama a las funciones
  
    datos();
    mayor(f1,f2);
 	
 	
    getch();
    return 0;
 }
 
void datos(){
	
cout<<"Ingrese una fecha del modo => 2000/05/05 = anio/mes/dia: \n"<<endl;

cout<<" Anio: ";cin>>f1.anio;
cout<<" Mes: "; cin>>f1.mes;
cout<<" Dia: "; cin>>f1.dia; 

cout<<"\n";

cout<<"Ingrese una fecha del modo => 2000/05/05 = anio/mes/dia: \n"<<endl;

cout<<" Anio: ";cin>>f2.anio;
cout<<" Mes: "; cin>>f2.mes;
cout<<" Dia: "; cin>>f2.dia; 

cout<<"\n";
}
void mayor(fecha f1, fecha f2){
	
	//Primera comparación fecha 1
	
	if((f1.anio>f2.anio)){
		cout<<f1.anio<<"/"<<f1.mes<<"/"<<f1.dia<<" Es la fecha mas actual";
	}
	else if((f2.anio>f1.anio)){
		cout<<f2.anio<<"/"<<f2.mes<<"/"<<f2.dia<<" Es la fecha mas actual";
	}

	// Cuando los anios son iguales

	if((f1.anio==f2.anio)and(f1.mes>f2.mes)){
		cout<<f1.anio<<"/"<<f1.mes<<"/"<<f1.dia<<" Es la fecha mas actual";
	}
	else if((f1.anio==f2.anio)and(f2.mes>f1.mes)){
		cout<<f1.anio<<"/"<<f1.mes<<"/"<<f1.dia<<" Es la fecha mas actual";
	}
	
	// Cuando anios y meses son iguales
	
	if((f1.anio==f2.anio)and(f1.mes==f2.mes)and(f1.dia>f2.dia)){
		cout<<f1.anio<<"/"<<f1.mes<<"/"<<f1.dia<<" Es la fecha mas actual";
	}
	else if((f1.anio==f2.anio)and(f1.mes==f2.mes)and(f2.dia>f1.dia)){
		cout<<f2.anio<<"/"<<f2.mes<<"/"<<f2.dia<<" Es la fecha mas actual";
	}
	
	// En un caso de que las fechas sean iguales 
	
	if((f1.anio==f2.anio)and(f1.mes==f2.mes)and(f1.dia==f2.dia)){
	    cout<<f1.anio<<"/"<<f1.mes<<"/"<<f1.dia<<" Es la fecha mas actual\n\n";
		
		cout<<"Las dos fechas son iguales "<<endl;
	}

}




