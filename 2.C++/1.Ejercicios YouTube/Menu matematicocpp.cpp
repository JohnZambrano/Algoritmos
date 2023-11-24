/*   Hacer un menú que considere las siguientes opciones:
  Caso 1: Cubo de un numero
  Caso 2: Numero par o impar
  Case 3: salir.  */
  
  #include<iostream>
  #include<stdio.h>
  #include<cmath>
  using namespace std;
  
  int main() {
  	
	  int opc,num,cubo=0,mod=0;
	  cout<<"\t                               Bienvenido a su menu matematico"<<endl;
	  cout<<"1. Cubo de un numero"<<endl;
	  cout<<"2. Numero par o impar"<<endl;
	  cout<<"3. Salir"<<endl;
	  
	  cout<<"opcion:  ";
	  cin>>opc;
	  switch(opc) {
	      case 1:
	  	  cout<<"ingrese el numero: "<<endl;
	      cin>>num;
	  	  cubo=(pow(num,3));
	  	  cout<<"El cubo del numero es:\n"<<cubo;break;
	        case 2:
	  	    cout<<"ingrese un numero: "<<endl;
	  	     cin>>num;
	  	     mod=num%2;
	  	     if(mod==0) {
	  		 cout<<"El numero es par"<<endl;
		     }else{
		     cout<<"El numero es impar"<<endl;
		    }
	              case 3: break;
	  	
	  }
	  
  	
  	getchar();
  	return 0;
  }
