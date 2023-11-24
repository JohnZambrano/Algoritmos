/* Programa que pida salario de varios trabajadores*/
#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int sal,num;
	cout<<"                              Ingrese la cantidad de trabajadores "<<endl;
	cin>>num;cout<<"\n\n";
	for(int i=0; i<num; i++){
		cout<<"Ingrese el salario del trabajador  "<<i+1<<endl;
		cin>>sal; cout<<"\n";
	
	}
	for(int i=0; i<num; i++){
	
	if(sal>1000){
			cout<<"El salario del empleado "<<i+1<<" es "<<sal;
		}
	
}
	
getch();
return 0;
}
