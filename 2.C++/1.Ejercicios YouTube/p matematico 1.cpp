/* Escribe la siguiente expresion matemática cómo expreción enC++.  a+(b/(c-d)).*/

#include<iostream>

using namespace std;

int main() {
	
	float a,b,c,d,res=0;
	
	cout<<"a+(b/(c-d))=? ";
	
	cout<<"ingrese el valor de a: \n";  cin>>a;
	
	cout<<"ingrese el valor de b: \n";  cin>>b;
	
	cout<<"ingrese el valor de c: \n";  cin>>c;
	
	cout<<"ingrese el valor de d: \n";  cin>>d;
	
	res=a+(b/(c-d)) ;

	cout.precision(2);
	
	cout<<"\n el resultado es: "<<res<<endl;
	
	return 0;
}
