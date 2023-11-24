// Algoritmo que representa el área de un triángulo
#include<stdio.h>
#include<conio.h>
int main() {
	
int a=0,b,h;

printf(" Ingrse la base del triágulo \n");
scanf("%d",&b);

printf(" Ingrese la altura del triángulo \n");
scanf("%d",&h);

a=(b*h/2);

printf(" El área del triángulo es %d",a);

getch();

return(0);


}
