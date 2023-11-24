/* Costo de un producto aplicando iva  */

#include<iostream>
#include<stdio.h>

using namespace std;

int main() {
int cost=0,des=0,pres;

printf("Ingrse el precio del articulo \n");
scanf("%d",&pres);

  if (pres>=200) {
	 des=pres*0.15;
	 
    }
        if ((pres>=100)and(pres<200)){
		    des=pres*0.12;
		    
        
        }   else if(pres<100) {
	        des=pres*0.10;
		       
		    }
	    
cost=pres-des;

printf("El descuento aplicado es: %d\n",des);
printf("El precio final del articulo es: %d\n",cost);
	
	getchar();
	return 0;
}
