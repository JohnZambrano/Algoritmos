/*Realice un programa que lea de la entrada est�ndar n�meros hasta que se introduzca un cero.
 En ese momento el programa debe terminar y mostrar en la salida est�ndar
  el n�mero de valores mayores que cero le�dos.*/
  
  #include<iostream>
  #include<stdio.h>
  
  using namespace std;
  
  int main(){
  	  int num,p=0;
  	  
      cout<<"ingrese un numero diferente de cero: "; cout<<"\t Y si quiere finalizar el programa ingrese cero: "<<endl;
  	  do{
  	  	cin>>num;
  	  	p=p+1;
		}while(num>0);
  	    
  	    cout<<"Las cantidades positivas son: "<<p<<endl;
  	
     getchar();
     return 0;
  }
