// Algoritmo que representa el �rea de un tri�ngulo
#include<stdio.h>
#include<conio.h>
int main() {
	
int a=0,b,h;

printf(" Ingrse la base del tri�gulo \n");
scanf("%d",&b);

printf(" Ingrese la altura del tri�ngulo \n");
scanf("%d",&h);

a=(b*h/2);

printf(" El �rea del tri�ngulo es %d",a);

getch();

return(0);


}
