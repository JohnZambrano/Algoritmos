#include <iostream>
#include <conio.h>

using namespace std;

int pedirDatos(int);
int fibonacci(int);
void mostrarDatos(int, int);

int main() {
 int nElementos, secuencia;

 nElementos = pedirDatos(nElementos);
 secuencia = fibonacci(nElementos);
 mostrarDatos(nElementos, secuencia);

 _getch();
 return 0;
}

int pedirDatos(int n) {
 do {
  cout << "Digite un numero entero positivo de elementos: ";
  cin >> n;
 } while (n <= 0);

 return n;
}

//Funcion Recursiva
int fibonacci(int n) {
 int sec = 0;

 if (n == 0) {//Caso base
  sec = 0;
 }
 else if (n == 1) {
  sec = 1;
 }
 else {//Caso general
  sec = fibonacci(n-1) + fibonacci(n - 2);
 }
 return sec;
}

void mostrarDatos(int n, int sec) {
 cout << "La secuencia de la serie Fibonacci (pos 0 = 0) en la posicion " << n << " es: " << sec;
}
