//                                            Taller final colas

/*
En la Distribuidora de Huevos “La Mejor”  el cajero debe atender a los clientes que deben pagar sus cuentas en la caja.
Para ello se debe realizar una aplicación que organice a sus clientes en una cola y contenga las siguientes opciones: 
 
1. Facturar 
2. Cobrar
3. Cierre
*/

#include<iostream>
#include<iomanip>
#include<stdlib.h>
#include<time.h>
#include<string.h>

using namespace std;

struct Nodo{
	int num_registro;
	char nombre[30];
	int cantidad;
	char tipo;
    int turno;
	Nodo *sig;
	
};


Nodo *frente, *nuevo, *aux, *fin;

int numero,dato,contador=0,clientes=0;

double dinero=0, pago=0, cambio=0, descuento=0,total=0;

///////////////////////////////////////////////////////////////////////////////

 void facturar(int codx, char nomx[], int cantx, char tipox, int turnox){
    if(frente==NULL){
        frente=new Nodo;
        frente->num_registro=codx;
        strcpy(frente->nombre,nomx);
        frente->cantidad=cantx;
        frente->tipo=tipox;
        frente->turno=turnox;
        frente->sig=NULL;
        fin=frente;
    }
    else{
        nuevo=new Nodo;
        
        nuevo->num_registro=codx;
        strcpy(nuevo->nombre,nomx);
        nuevo->cantidad=cantx;
        nuevo->tipo=tipox;
        nuevo->turno=turnox;
        
        nuevo->sig=NULL;
        fin->sig=nuevo;
        fin=nuevo;
    }
   
}
///////////////////////////////////////////////////////////////////////////////

void cobrar(){
	cout<<"\n\n";
    cout<<"=============================================================================="<<endl;
    cout<<"\n\t  \t    Facturacion de clientes "<<endl;
    
    cout<<"=============================================================================="<<endl;
    cout<<"=========================================================================="<<endl;
    cout<<"\nNumero de factura del cliente:  "<<frente->num_registro<<endl;
    
    cout<<"=========================================================================="<<endl;
    cout<<"\nNombre del cliente:   "<<frente->nombre<<endl;
    
    cout<<"=========================================================================="<<endl;
    cout<<"\nCantidad de huevos :  "<<frente->cantidad<<endl;
    
    cout<<"=========================================================================="<<endl;
    cout<<"\nTipo de huevos A-B-C:  "<<frente->tipo<<endl;
    
    cout<<"\n=========================================================================="<<endl;
    cout<<"\nTiene el turno:  "<<frente->turno<<endl;
    cout<<"=========================================================================="<<endl;
    cout<<"\n\n";
    
   //Calculando el valor a pagar por la cantidad de huevos
   
    if(frente->tipo=='A'||frente->tipo=='a'){
    	pago=300*frente->cantidad;
    	
	}else if(frente->tipo=='B'||frente->tipo=='b'){
		pago=400*frente->cantidad;
		
	}else if(frente->tipo=='C'||frente->tipo=='c'){
		pago=500*frente->cantidad;
	}
		
	cout<<"\n\n";
    cout<<"=============================================================================="<<endl;
    cout<<"\nTurno a facturar: "<<frente->turno<<endl;
    cout<<"=============================================================================="<<endl;
    cout<<"\nFactura No: "<<frente->num_registro<<endl;
    cout<<"=============================================================================="<<endl;
    cout<<"\nCliente: "<<frente->nombre<<endl;
    cout<<"=============================================================================="<<endl;
    cout<<"=============================================================================="<<endl;
    cout<<"\nValor a pagar es $: "<<pago<<endl;
    cout<<"=============================================================================="<<endl;
    cout<<"\n\nIngrese un numero del 1 al 10 para participar en el sorteo:"<<endl;
    
    srand(time(NULL)); //generar un numero aleatorio entre 1-10
	dato = 1 + rand()%(11-1);
	cout<<"\n(-_-) Bienvenido jugador ahora tendra que adivinar un numero (*_*)"<<endl;
	do{cout<<"\n\nDigite un numero => "; cin>>numero;cout<<"\n\n";
     }while(numero <= 0 || numero > 10);
    
		if(numero!=dato){
			cout<<"=============================================================================="<<endl;
			cout<<"\nMas suerte para la proxima vez :( \n";
			cout<<"Numero ganador: "<<dato;
			
			cout<<"\n======================================================================"<<endl;
			
			cout<<"\nSu pago final es $: "<<pago;
			
			cout<<"\n======================================================================"<<endl;
			
			do{
			  cout<<"\nIngrese el valor del dinero entregado $: "; cin>>dinero;
		    }while(dinero < pago);
			cout<<"\n======================================================================"<<endl;
			
			cout<<"Dinero entregado $: "<<dinero;
			
			cout<<"\n======================================================================"<<endl;
			cambio=dinero-pago;
			cout<<"\nSu cambio es de $: "<<cambio;
			
			cout<<"\n======================================================================"<<endl;
			cout<<"\n\n";
		}
		else if(numero==dato){
			cout<<"\n======================================================================"<<endl;
			
		   	cout<<"\n==>>>>Felicitaciones es Ganador y pagara la mitad de su compra :)\n";
		   	
		   	cout<<"\n======================================================================"<<endl;
		   	pago=pago/2;
		   	cout<<"\nSu pago final es$: "<<pago;
		   	
		   	cout<<"\n======================================================================"<<endl;
		   do{
		   	 cout<<"\nIngrese el valor del dinero entregado $: "; cin>>dinero;
		    }while(dinero < pago);
		   	cout<<"\n======================================================================"<<endl;
		   	
			cout<<"Dinero entregado: "<<dinero;
			
	        cout<<"\n======================================================================"<<endl;
	        
		   	cambio=dinero-pago;
			cout<<"\nSu cambio es de: "<<cambio;
			
			cout<<"\n======================================================================"<<endl;
			cout<<"\n\n";
		}
		total=total+pago;
		clientes=clientes+1;
		
		
    aux=frente;
    frente=aux->sig;
    delete aux;
    
}

///////////////////////////////////////////////////////////////////////////////

void cierre(){
	cout<<"=========================================================================="<<endl;
	cout<<"\n\nEl producto total de la venta de hoy es $: "<<total<<endl;
	cout<<"\n=========================================================================="<<endl;
	cout<<"\n\nSe atendieron: "<<clientes<<" clientes"<<endl;
	cout<<"\n=========================================================================="<<endl;
	
	cout<<"\n";
	
}

///////////////////////////////////////////////////////////////////////////////

int menu(){ 
  int opcion;
   
  cout<<endl; 
  cout<<"================================================================================"<<endl;
  cout<<"   \t   \t    Distribuidora de huevos la mejor  \n ";
  cout<<"1. Facturar"<<endl; 
  cout<<" 2. Cobrar"<<endl; 
  cout<<" 3. Cierre"<<endl; 
  
   do{
	  cout<<"\nDigite el numero de la opcion deseada: "; 
     cin>>opcion; 
    }while(opcion<1 || opcion >3); 
    
    return opcion; 
} 

///////////////////////////////////////////////////////////////////////////////
int main(){
	int op;
	
    frente=NULL;
    fin=NULL;
    
    int codx, cantx, turnox;
    char nomx[30],tipox;
    turnox=1;
	
	do{
		op=menu();
		switch(op){
			case 1:{
				cout<<"\n\n";
				cout<<"\n=================================================================="<<endl;
				do{
				cout<<"Codigo  de factura: ";cin>>codx;}while(codx <= 0);
                cout<<"\n=================================================================="<<endl;
                cout<<"Nombre del cliente: ";cin>>nomx;
                cout<<"\n=================================================================="<<endl;
                do{
                cout<<"Cantidad de huevos: "; cin>>cantx;}while(cantx <= 0);
                cout<<"\n=================================================================="<<endl;
                cout<<"Tipo de huevo A-B-C: "; cin>>tipox;
                cout<<"\n================================================================="<<endl;
                cout<<"Tiene el turno: "<<turnox; 
            
                cout<<"\n\n";
                facturar(codx,nomx,cantx,tipox,turnox);
                turnox=turnox+1;
                
				break;
			}
			
			case 2:{
				if(frente!=NULL){
                   cobrar();
                    
                } 
                else{
				
                    cout<<"\n\nLa cola esta vacia (*_*)"<<endl;
                }
			    break;
		    }
			
			
			
			case 3:{
				cierre();
				
				break;
			}		
			
		}
			
	}while(op!=3);
	
	return 0;
}


