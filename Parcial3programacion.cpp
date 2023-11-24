// Taller de programacion 1. Parcial 3: 
// Etudiante: Jhon Jairo Zambrano Yela.

#include<iostream>
#include<conio.h>
#include<stdlib.h>
#include<string.h>

using namespace std;

int main(){
	int n;
	cout<<"\t        Ingrese la cantidad de tipos de marcos que maneja la marqueteria\n\n ";
	cout<<"=> ";cin>>n; cout<<"\n";
	
	while(n<=0){
		cout<<"\n Numero invalido (-_-) => Ingrese valores positivos "<<endl;
		cin>>n;
	}
	cout<<"---------------------------------------------------------------------------------------------------------------------"<<endl;
	
    struct tipomarco{
      float codigo;
  	  char nombre[20];
  	  float pventa;
  	  int cvendida;
  }tipomarco[n];
  
  for(int i=0; i<n; i++){
  	 fflush(stdin); //vasiar el buffer y permitir digitar los valores
  	 
		cout<<"\t                      \t      Datos del tipo de marco "<<i+1<<" \n\n";
	 fflush(stdin); //vasiar el buffer y permitir digitar los valores
	 	
		cout<<"Digite el codigo del tipo de marco "<<i+1<<endl;
		cout<<"=> "; cin>>tipomarco[i].codigo; cout<<"\n";
		while(tipomarco[i].codigo<=0){
		   cout<<"\n Codigo invalido (-_-) => Ingrese valores positivos "<<endl;
		   cout<<"=> "; cin>>tipomarco[i].codigo; cout<<"\n"; 	
		}
	 fflush(stdin); //vasiar el buffer y permitir digitar los valores
	 	
		cout<<"Digite el nombre del tipo de marco "<<i+1<<endl;
		cout<<"=> "; cin.getline(tipomarco[i].nombre,20,'\n'); cout<<"\n";
	 fflush(stdin); //vasiar el buffer y permitir digitar los valores
	 	
		cout<<"Digite el precio de venta unitario del tipo de marco "<<i+1<<endl;
		cout<<"=> "; cin>>tipomarco[i].pventa; cout<<"\n";
		while(tipomarco[i].pventa<=0){
		   cout<<"\n Precio de venta invalido (-_-) => Ingrese valores positivos "<<endl;
		   cout<<"=> "; cin>>tipomarco[i].pventa; cout<<"\n"; 	
		}
	 fflush(stdin); //vasiar el buffer y permitir digitar los valores
	 	
		cout<<"Digite la cantidad vendida del tipo de marco "<<i+1<<endl;
		cout<<"=> "; cin>>tipomarco[i].cvendida; cout<<"\n";
		while(tipomarco[i].cvendida<=0){
		   cout<<"\n Cantidad invalida (-_-) => Ingrese valores positivos "<<endl;
		   cout<<"=> "; cin>>tipomarco[i].cvendida; cout<<"\n"; 	
		}
		
		fflush(stdin);  //vasiar el buffer y permitir digitar los valores
cout<<"----------------------------------------------------------------------------------------------------------------------------"<<endl;
  }	cout<<"\n\n";
  
cout<<"---------------------------------------------------------------------------------------------------------------------------"<<endl;
cout<<"\t   \t   \t                  Se imprime los datos ingresados \n\n";
  
	for(int i=0; i<n; i++){
		cout<<"Codigo del tipo del tipo marco "<<i+1<<":  "<<tipomarco[i].codigo<<endl;
		cout<<"Nombre del tipo de marco "<<i+1<<":  "<<tipomarco[i].nombre<<endl;
		cout<<"Precio de venta unitario del tipo de marco "<<i+1<<":  "<<tipomarco[i].pventa<<endl;
		cout<<"Cantidad vendida del tipo de marco "<<i+1<<":  "<<tipomarco[i].cvendida<<endl;
		cout<<"------------------------------------------------------------------------------------------------------------------"<<endl;
	}cout<<"\n\n";
 int num=1;
 while(num==1){
	
    int opc;
	
 	 cout<<"\t  \t   \t                     Eliga la operacion que desea realizar \n\n";
 	 cout<<"1. Para consultar \n\n";
	 cout<<"2. Para modificar \n\n";
	 cout<<"3. Para eliminar \n\n";
     cout<<"=> "; cin>>opc; cout<<"\n";
     cout<<"-----------------------------------------------------------------------------------------------------------------------"<<endl;
 
	
	  switch(opc){
		 case 1: 
		       int codigo;
		       cout<<"Ingrese el codigo a consultar "<<endl;
		       cout<<"=> "; cin>>codigo;
		       while(codigo<=0){
		       	 cout<<"\n El codigo es ivalido (-_-) => Ingrese valores positivos "<<endl;
		         cout<<"=> "; cin>>codigo; cout<<"\n\n"; 	
			   }
		           for(int i=0; i<n; i++){
		 	         if(tipomarco[i].codigo==codigo){
		 	         	cout<<"El codigo es correcto: => "<<tipomarco[i].codigo<<endl; cout<<"\n\n";
		 	            
						  for(int i=0; i<1; i++){
	                  	 cout<<"Codigo  del tipo de marco "<<i+1<<":  "<<tipomarco[i].codigo<<endl;
		                 cout<<"Nombre del tipo de marco "<<i+1<<":  "<<tipomarco[i].nombre<<endl;
		                 cout<<"Precio de venta unitaria del tipo de marco "<<i+1<<":  "<<tipomarco[i].pventa<<endl;
	                   	 cout<<"Cantidad vendida del tipo de marco "<<i+1<<":  "<<tipomarco[i].cvendida<<endl;
	                   	 
	                     }cout<<"\n\n";  
	                    
					    
						}else{
					  	 cout<<" => El codigo es incorrecto"<<endl;
					   }
					   }break;
		 
		case 2: cout<<"----------------------------------------------------------------------------------------------------------------"<<endl;
				cout<<" \t     \t      Ingrese un codigo para modificar algo del tipo de marco "<<endl;
		        cout<<"=> "; cin>>codigo;
		        while(codigo<=0){
		       	 cout<<"\n El codigo es invalido (-_-) => Ingrese valores positivos "<<endl;
		         cout<<"=> "; cin>>codigo; cout<<"\n\n"; 	
		    	}
		    	for(int i=0; i<n; i++){
		    		fflush(stdin);  //vasiar el buffer y permitir digitar los valores
		    		if(tipomarco[i].codigo==codigo){
		    			cout<<"\t    \t     Elija el dato a modificar \n\n";
		    			cout<<"1. Codigo "<<endl;
		    			cout<<"2. Nombre "<<endl;
		    			cout<<"3. Precio de venta "<<endl;
		    			cout<<"4. Cantidades vendidas"<<endl;
		    			
		    			fflush(stdin);  //vasiar el buffer y permitir digitar los valores
		    			int opc;
		    			switch(opc){ fflush(stdin);  //vasiar el buffer y permitir digitar los valores
		    				case 1: cout<<" Digite el nuevo codigo "<<endl;
		    				        cin>>tipomarco[i].codigo;break;
		    				        
		    				case 2: fflush(stdin);  //vasiar el buffer y permitir digitar los valores
							        cout<<" Digite el nuevo nombre "<<endl;
		    				        cin.getline(tipomarco[i].nombre,20,'\n');break;
		    				        
		    				case 3: fflush(stdin);  //vasiar el buffer y permitir digitar los valores
							        cout<<" Digite el nuevo precio de venta "<<endl;
		    				        cin>>tipomarco[i].pventa;break;
		    				        
		    				case 4: fflush(stdin);  //vasiar el buffer y permitir digitar los valores
							        cout<<" Digite la nueva cantidad vendida "<<endl;
		    				        cin>>tipomarco[i].cvendida;break;
						}
		    			
					}else{
						cout<<"El codigo es invalido  (-_-)"<<endl;
					}
				}break;
				
	        
		 case 3:cout<<"------------------------------------------------------------------------------------------------------"<<endl;
			   cout<<"Ingrese un codigo para eliminar algo del tipo de marco "<<endl;
		       cout<<"=> "; cin>>codigo;
		        while(codigo<=0){
		       	 cout<<"\n El codigo es invalido (-_-) => Ingrese valores positivos "<<endl;
		         cout<<"=> "; cin>>codigo; cout<<"\n"; 	
		    	}
		    	for(int i=0; i<n; i++){
		    		 fflush(stdin);  //vasiar el buffer y permitir digitar los valores
		    		if(tipomarco[i].codigo==codigo){
		    			cout<<"Elija el dato a eliminar \n\n";
		    			cout<<"1. Codigo "<<endl;
		    			cout<<"2. Nombre "<<endl;
		    			cout<<"3. Precio de venta "<<endl;
		    			cout<<"4. Cantidades vendidas"<<endl;
		    			int opc;
		    			char res[]={'Dato eliminado'};
		    			 fflush(stdin);  //vasiar el buffer y permitir digitar los valores
		    			switch(opc){
		    				case 1: cout<<"Digite el codigo a eliminar "<<endl;
		    				        cin>>codigo;
		    				        if(tipomarco[i].codigo==codigo){
		    				           cout<<res;
									}else{
										cout<<"El codigo es invalido "<<endl;
									}
									break;
		    				        
		    				case 2: char nombre[20];
							        cout<<"Digite el  nombre a eliminar "<<endl;
		    				        cin.getline(nombre,20,'\n');
		    				       
		    				        if(strcmp(tipomarco[i].nombre,nombre)==0){
		    				           cout<<res;
									}else{
										cout<<"El nombre es invalido "<<endl;
									}break;
		    				case 3: float pventa;
							        cout<<"Digite el precio de venta a eliminar "<<endl;
		    				        cin>>pventa;
		    				        if(tipomarco[i].pventa==pventa){
		    				           cout<<res;
									}else{
										cout<<"El precio de venta es invalido "<<endl;
									}
									break;
		    				case 4: int cvendida;
							        cout<<"Digite el codigo a eliminar "<<endl;
		    				        cin>>codigo;
		    				        if(tipomarco[i].cvendida==cvendida){
		    				           cout<<res;
									}else{
										cout<<"La cantidad de ventas es invalida "<<endl;
									}
									break;
                       } 
				}else{
					cout<<"el codigo no existe"<<endl;
				}
	   }
}
	   cout<<"-----------------------------------------------------------------------------------------------------------------"<<endl;
	   
	   cout<<"Quiere volver a realizar una operacion ?  => Marque 1. "<<endl;     
	   cout<<"=> De lo contrario marque un numero diferente de 1 "<<endl;
	   cout<<"=> "; cin>>num;
}
	
	
	cout<<"\n";
	getch();
	return 0;
}

