// Estructuras anidadaas en C++

#include<iostream>
#include<conio.h>

using namespace std;

struct inf_direccion{
	char direccio[30];
	char ciudad[20];
	char provincia[20];
};


int main(){
	int n;
	cout<<"Ingrese el numero de empleados: "<<endl;
	cin>>n;
	
struct empleado{
	char nombre[20];
	struct inf_direccion dir_empleado;
	double salario;
}empleado[n];

	for(int i=0; i<n; i++){
		fflush(stdin); //vasiar el buffer y permitir digitar los valores
		cout<<"Datos del empleado "<<i+1<<" :\n\n";
		
		cout<<"Digite el nombre del empleado "<<i+1<<endl;
		cin.getline(empleado[i].nombre,20,'\n'); cout<<"\n";
		
		cout<<"Digite la direccion del empleado "<<i+1<<endl;
		cin.getline(empleado[i].dir_empleado.direccio,30,'\n'); cout<<"\n";
		
		cout<<"Digite la ciudad del empleado "<<i+1<<endl;
		cin.getline(empleado[i].dir_empleado.ciudad,20,'\n'); cout<<"\n";
		
		cout<<"Digite la provincia del empleado "<<i+1<<endl;
		cin.getline(empleado[i].dir_empleado.provincia,20,'\n'); cout<<"\n";
		
		cout<<"Digite el salario del empleado "<<i+1<<endl;
		cin>>empleado[i].salario; cout<<"\n\n";
	}
	// Imprimiendo los datos
	
	for(int i=0; i<n; i++){
		cout<<"Nombre del empleado "<<i+1<<":  "<<empleado[i].nombre<<endl;
		cout<<"Direccion del empleado "<<i+1<<":  "<<empleado[i].dir_empleado.direccio<<endl;
		cout<<"Ciudad del empleado "<<i+1<<":  "<<empleado[i].dir_empleado.ciudad<<endl;
		cout<<"Provincia del empleado "<<i+1<<":  "<<empleado[i].dir_empleado.provincia<<endl;
		cout<<"Salario del empleado "<<i+1<<":  "<<empleado[i].salario<<"\n\n";
	}
	cout<<"\n\n";
	
	
	getch();
	return 0;
}

	

