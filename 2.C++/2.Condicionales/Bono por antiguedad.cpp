/* Bono por antiguedad */

#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
	int ant=0,bant;
	
	cout<<"Ingrese la antiguedad del empleado en years: \n";
	cin>>ant;
	
         if(ant==1 ) {
           bant=100;
           cout<<"El bono por antiguedad es:$ \n"<<bant<<endl;
           
	    }else if(ant==2) {
	    	bant=200;
	    	cout<<"El bono por antiguedad es:$ \n"<<bant<<endl;
	    	
		}else if(ant==3) {
			bant=300;
			cout<<"El bono por antiguedad es:$ \n"<<bant<<endl;
			
		}else if(ant==4) {
			bant=400;
			cout<<"El bono por antiguedad es:$ \n"<<bant<<endl;
			
		}else if(ant==5) {
			bant=500;
			cout<<"El bono por antiguedad es:$ \n"<<bant<<endl;
			
		}else if(ant>5) {
			bant=1000;
			cout<<"El bono por antiguedad es:$ \n"<<bant<<endl;
		}
	


	getchar();
	return 0;
}
