import java.util.Scanner;

public class PruevaCirculo {
    
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese coordenada x ");
    double x = entrada.nextDouble();//lee el primer valor double
    System.out.println("Ingrese coordenada y ");
    double y = entrada.nextDouble();//lee el segundo valor double
    System.out.println("Ingrese el radio ");
    double r =entrada.nextDouble();//lee el tercer valor double
    Circulo cir = new Circulo(x, y, r);
    //Si se quiere utilizar esta instrucción nos muestra error
    //devido a que x es privado
    //cir.x(10);
    //para poder actualizar el valor de x se debe utilizar
    //el método modificar correspondiente al atributo
    cir.setX(10);
    //por el contrario como el atributo r es publico
    //se pueede acceder a el directamente
    //cir.r = 20;
    System.out.println("El circulo tiene coordenada X : "+cir.getX() + "  coordenada Y :  " + cir.getY() + " y radio: " + cir.r);
    System.out.printf("La longitud del circulo es % 3f \n ",cir.longitud());
    System.out.printf("El área del circulo es %3f \n ", cir.area());
    Circulo cir1 = new Circulo(5, 10, -3);
 }
}
    
