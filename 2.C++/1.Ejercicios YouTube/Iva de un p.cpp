/*Programa que escrive el precio estandar
 de un producto sin iva y lo imprime con iva */

#include<iostream>
#include<stdio.h>
using namespace std;

int main() {
	
	int pfinal=0;
	float iva=0.19;
	int impuesto=0;
	int ppresente;
	
	printf("Ingrese el precio inicial del producto sin iva: \n");
	scanf("%d",&ppresente);
	
	impuesto=(ppresente*iva);
	pfinal=ppresente+impuesto;
	
	printf("El precio final del producto con iva es:\n %d",pfinal );
	


getchar();
return 0;

}


