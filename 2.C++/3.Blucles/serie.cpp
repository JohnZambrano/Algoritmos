/* Hacer un programa que calcule el resultado de la siguiente expresion: 1-2+3-4+5-6...n*/

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
     int suma=0,n;

     cout<<"Ingrese el tamaño de la sucesion: "<<endl;
     cin>>n;
       for(int i=1; i<=n; i++){
     	   if(n%2==0){
     	   	 suma=suma-i;	
			}else{
		    	suma=suma+i;
			}
	   }
	
	    cout<<"La suma total de la sucesion es: "<<suma<<endl;
	    
	    
	    cout<<"\n\n";
	
	
	 getch();
	 return 0;
}
