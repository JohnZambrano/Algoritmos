/* Escriba un programa que lea la nota final de cuatro alumnos
y calcule la nota final media de los cuatro alumnos.
*/

#include<iostream>
using namespace std;
int main() {
	
	float n1,n2,n3,n4,nfm=0;
	
	cout<<"ingrese la nota del primer alumno: \n";  cin>>n1;
	cout<<"ingrese la nota del segundo alumno: \n";  cin>>n2;
	cout<<"ingrese la nota del tercer alumno: \n";  cin>>n3;
	cout<<"ingrese la nota del cuarto  alumno: \n";  cin>>n4;
	
	nfm=(n1+n2+n3+n4)/4;
	cout.precision(2);
	cout<<"\n la nota final media de los 4 alumnos es:\n"<<nfm<<endl;
	return 0;
}
