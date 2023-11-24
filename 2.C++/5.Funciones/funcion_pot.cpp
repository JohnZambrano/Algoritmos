// Funcion que calcula la potencia de cualquier numero

#include<iostream>
#include<conio.h>

using namespace std;

void datos();
void pot(int ,int );
int a,b;

int main(){
	
	datos();
	pot(a,b);
	
	getch();
	return 0;
}
void datos(){
	cout<<"Digite un numero: "<<endl;
	cin>>a;
	cout<<"Digite el expoonente de elevacion: "<<endl;
	cin>>b;
}
void pot(int a,int b){
	long res=1;
	for( int i=1; i<=b; i++){
		res=res*a;
	}
	cout<<"El resultado es: "<<res<<endl;
}







