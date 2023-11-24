import java.util.Scanner;
public class PruevaLavadora{
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        String mar, vol;
        byte respuesta;
        System.out.println("Ingrese la marca de la lavadora:");
        mar = entrada.nextLine();
        System.out.println("Ingrese el volumen de la lavadora:");
        vol = entrada.nextLine();
        Lavadora lav1 = new Lavadora(mar, vol);
        System.out.println("La marca original de la lavadora es: " + lav1.decirMarca());
        System.out.println("Inicio del proceso de lavado");
        lav1.lavar();
        lav1.secar();
        System.out.println("===============================");
        System.out.println("Cambiar de lavadora? 1=Si 0=No");
        respuesta = entrada.nextByte();
        entrada.nextLine();
        if(respuesta == 1){
            System.out.println("Ingrese la nueva marca de la lavadora: ");
            mar = entrada.nextLine();
            lav1.cambiarMarca(mar);
            System.out.print("Su nueva lavadora ahora es de marca: ");
        }
        else
            System.out.print("No se ha cambiado la marca ");
            System.out.println(lav1.decirMarca());
        }  // fin de main
    } // fin de la clase
     

