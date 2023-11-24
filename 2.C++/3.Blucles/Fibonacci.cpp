/* Hacer un que realice la serie fibonacci -- 1 1 2 3 5 8 13...n */

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
int n,a=0,b=1,c=1;

cout<<"digite el numero de elementos: ";  cin>>n; cout<<"\n";


cout<<"1 "; 

for(int i=1; i<n; i++)	{
	c = a + b;
	cout<<c<<"  ";
	a = b; 
    b = c;
}
	
getch();
return 0;	
}
