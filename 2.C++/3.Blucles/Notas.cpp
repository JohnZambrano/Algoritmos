/* En una clase de 5 alumnos se han realizado tres exámenes y se requiere determinar el número de: 
 a) Alumnos que aprobaron todos los exámenes.
 b) Alumnos que aprobaron al menos un examen.
 c) Alumnos que aprobaron únicamente el último examen.
 
Realice un programa que permita la lectura de los datos y el cálculo de las estadísticas.
*/

#include<iostream>
#include<stdlib.h>

using namespace std;

int main(){
    int ntres=0,ndos=0,nuno=0;
    
    int rtres=0,rdos=0,runo=0,almenos=0;
    
    int sumatotal=0,suma3=0,almenostotal=0;
    
    float nota1,nota2,nota3;
    
	for(int i=1; i<=5; i++){   /*Ciclo para ingresar las  notas de los estudiantes */
	cout<<"\n";
	cout<<"Igrese las 3 notas del alumno \n"<<endl;
	cout<<"Nota 1. del estudiante "<<i<<endl;
	cin>>nota1;
		
	cout<<"Nota 2. del estudiante "<<i<<endl;
	cin>>nota2;
	
	cout<<"Nota 3. del estudiante "<<i<<endl;
	cin>>nota3;	
	cout<<"\n\n";
	
		if(nota1>=3.0){
			nuno=nuno+1;
			cout<<"El estudiante "<<i;cout<<": Aprobo la nota 1 "<<endl;
			
		   }else if(nota1<3.0){
			runo=runo+1;
			cout<<"El estudiante "<<i;cout<<": Reprobo la nota 1"<<endl;
		   }
		   
		if(nota2>=3.0){
			ndos=ndos+1;
			cout<<"El estudiante "<<i;cout<<": Aprobo la nota 2 "<<endl;
		    }else if(nota2<3.0) {
		     rdos=rdos+1;
			 cout<<"El estudiante "<<i;cout<<": Reprobo la nota 2 "<<endl;		
		   }
		   	
		if(nota3>=3.0){
			ntres=ntres+1;	
			cout<<"El estudiante "<<i;cout<<": Aprobo la nota 3 "<<endl;	
		   }else if(nota3<3.0){
		    rtres=rtres+1;	
			cout<<"El estudiante "<<i;cout<<": Reprobo la nota 3 "<<endl;		
		   }
		   
		if((nota1)||(nota2)||(nota3)>=3.0){
		   almenos=almenos+1;
		}
		cout<<"\n\n";
    }
	    sumatotal=nuno+ndos+ntres;
		almenostotal=almenos;
		suma3=ntres;
		
	cout<<"Los alumnos  que apovaron todos los examenes fueron: "<<sumatotal;cout<<"\n";
	cout<<"Los alumnos  que apovaron al menos un  examenen fueron: "<<almenostotal;cout<<"\n"; 
	cout<<"Los alumnos  que apovaron el ultimo examenen fueron: "<<suma3;cout<<"\n";
	
	cout<<"\n\n";
	system("pause");
	return 0;
}
