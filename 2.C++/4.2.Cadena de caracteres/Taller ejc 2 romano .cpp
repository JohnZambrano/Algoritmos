// Taller de programacion .cadenas : ejercicio 2.

#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

int main(){
	int num1=0,num2=0,num3=0;
	char rom[20],letra1,letra2;
	
	 cout<<"Digite un numero romano "<<endl;
	 cin>>rom;
	 
	 for(int i=0; i<strlen(rom);i++){
	 	  if(i==0){
	 	  	letra1=rom[i];
		   }else{
		   	letra2=rom[i-1];
		   	letra1=rom[i];
		   }
		    switch(letra1){
		    	case 1: 'M', num2=1000; break;
		    	case 2: 'D', num2=500; break;
		    	case 3: 'C', num2=100; break;
		    	case 4: 'L', num2=50; break;
		    	case 5: 'X', num2=10; break;
		    	case 6: 'V', num2=5; break;
		    	case 7: 'I', num2=1; break;
			}
			if(i!=0){
				switch(letra2){
		    	  case 1: 'M', num3=1000; break;
		    	  case 2: 'D', num3=500; break;
		    	  case 3: 'C', num3=100; break;
		    	  case 4: 'L', num3=50; break;
		       	  case 5: 'X', num3=10; break;
		      	  case 6: 'V', num3=5; break;
		    	  case 7: 'I', num3=1; break;
			    }
			
			
			    if(i==0){
		     	num1=num2;
			    }else if(num3<num2){
					num1=num1-num3;
					num1=num1+(num2-num3);
				}else{
					num1=num1+num2;
				}
	     	}
	    }  
	    cout<<"El numero entero es: "<<num1<<endl;
	    
	
	  getch();
	  return 0;
}
