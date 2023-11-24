/* Solicitar 5 notas y comvertirlas a notas cualitativas segun corresponda
0-34<-bajo
35-41<-basico
42-46<-alto
47-50<-superior*/

#include<iostream>
#include<conio.h>

using namespace std;
int main(){
float nota,prom=0,suma=0;

cout<<"ingrese 5 notas"<<endl;
for(int i=1; i<=5; i++){
    cout<<"ingrese su nota de (0.0-5.0): "<<endl;
    cin>>nota;

      if((nota>=0.0)and(nota<=3.4)){
       cout<<"Nota baja"<<endl;	 					
       }
    if((nota>=3.5)and(nota<=4.1)){
	 cout<<"Nota basica"<<endl;		
    }
      if((nota>=4.2)and(nota<=4.6)){
     cout<<"Nota alta"<<endl; 
      }
        if((nota>=4.7)and(nota<=5.0)){
		cout<<"Nota superior"<<endl;	
        }
        suma=suma+nota;
        prom=suma/5;
  } 
   cout<<"El promedio es: "<<prom<<endl;
    
	 if((prom>=0.0)and(prom<=3.4)){
    cout<<"El promedio es  bajo"<<endl;
	}
    
    	if((prom>=3.5)and(prom<=4.1)){
	     cout<<"El promedio es basico"<<endl;
	    }
	 	
     	if((prom>=4.2)and(prom<=4.6)){
         cout<<"El promedio es alto"<<endl;
	     }
     
           if((prom>=4.7)and(prom<=5.0)){
		     cout<<"El promedio es  superior"<<endl;
	     	}
			
	    
	getch();
	return 0;
}
