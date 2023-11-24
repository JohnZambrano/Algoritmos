// Ejemplo práctico sobre el uso de colas

#include <iostream>
#include <iomanip>
#include <stdlib.h>

using namespace std;

struct nodo{
    int cod;
    float sal;
    float inc ;
    int ant;
    nodo *sig;
};

nodo *cab,*nue,*aux,*fin;

void insertar_nuevo(int codx, float salx, int antx){
    if(cab==NULL){
        cab=new nodo;
        cab->cod=codx;
        cab->sal=salx;
        cab->ant=antx;
        cab->sig=NULL;
        fin=cab;
    }
    else{
        nue=new nodo;
        
        nue->cod=codx;
        nue->sal=salx;
        nue->ant=antx;
        
        nue->sig=NULL;
        fin->sig=nue;
        fin=nue;
    }
}
///////////////////////////////////////////
/*void mostrar_datos(){
    if(cab!=NULL){
        cout<<"\n\nLa cola es:\n\n";
         aux=cab;
        while(aux!=NULL){
            cout<<aux->dato<<"->";
            aux=aux->sig;
    }
}
    cout<<"NULL"<<endl<<endl;
}*/
///////////////////////////////////////////
void atender_nodo(){
    int adicional=0;
    cout<<"Datos registrados"<<endl;
    cout<<"Codigo empleado  "<<cab->cod<<endl;
    cout<<"Salario inicial  "<<cab->sal<<endl;
    cout<<"Antiguedad "<<cab->ant<<endl;
    if(cab->ant>5)
       adicional=5000;
    cab->inc=cab->sal*0.05;
    cout<<"Incremento "<<cab->inc<<endl;
    cab->sal=cab->sal+cab->inc+adicional;
    cout<<"Salario final  "<<cab->sal<<endl;
    
    aux=cab;
    cab=aux->sig;
    delete aux;
    
}
///////////////////////////////////////////
/*bool buscar(char car){
    bool enc=false;
    aux=cab;
    while((aux!=NULL)&&(enc==false)){
        if(car!=aux->dato)
             aux=aux->sig;
        else
             enc=true;
    }
    return enc;
}*/
///////////////////////////////////////////
int menu(){
    int opcion;
    cout<<endl;
    cout<<"1. Hacer Fila"<<endl;
    cout<<"2. Atender "<<endl;
    cout<<"3. Turno "<<endl;
    cout<<"4. salir"<<endl;
    cout<<"Digite el numero de la opcion deseada: ";
    do{
        cin>>opcion;
    }while(opcion<1 || opcion >4);
    return opcion;
}
///////////////////////////////////////////
int main(){
    int op;
    cab=NULL;
    fin=NULL;
    int codx, antx;
    float salx,incx;
    do {
        
        op=menu();
        switch(op){
            case 1:{
                cout<<"Codigo ";
                cin>>codx;
                cout<<"salario";
                cin>>salx;
                cout<<"Antiguedad";
                cin>>antx;
                insertar_nuevo(codx,salx,antx);
                break;
            }
            case 2:{
                if(cab!=NULL){
                    atender_nodo();
                    
                }
                else
                    cout<<"La cola está vacía"<<endl;
                break;
            }
            /*case 3:{
                if(cab!=NULL){
                    cout<<"Caracter a buscar ";
                    cin.ignore();
                    cin.get(valor);
                    bool turno=buscar(valor);
                    if (turno)
                            cout<<endl<<"El elemento "<<valor<<" se encuentra en la fila"<<endl;
                    else
                            cout<<endl<<"El elemento no esta en la fila"<<endl;
                }
                break;
            }*/
        }//fin switch
       // mostrar_datos();
        
    }while(op!=4);
    return 0;
}
