import java.util.*;

public class Principal {
	

	public static void main(String[] args) {
        EscribirArchivoCuenta escribir = new EscribirArchivoCuenta();
        LeerArchivoTexto leer = new  LeerArchivoTexto();
        int respuesta = 0;
        do {
        	Scanner teclado = new Scanner(System.in);
        	System.out.println("\n Administración de cuentas\n");
        	System.out.println("1. Registrar");
        	System.out.println("2. Buscar");
        	System.out.println("3. Listar");
        	System.out.println("4. Finalizar");
        	System.out.println("Opción a ejecutar ");
        	respuesta = teclado.nextInt();
        	switch(respuesta) {
        	case 1:
        		escribir.abrirArchivo();
        		escribir.agregarRegistros();
        		escribir.cerrarArchivo();
        		break;
        	case 2:
        	   /*pedir al usuario el numero de cuenta abuscar
        		*en la clase LeerArchivo adicionar un método que retorne un boleano y muestre
        		*los datos de la cuenta en caso de que esté registrada, retorna verdadero
        		*si la cuenta no esta registrada retorna falso y debe aparecer un mensaje
        		*indicando que la cuenta no está
        		*/
        		break;
        		
        	case 3:
        		leer.abrirArchivo();
        		leer.leerRegistros();
        		leer.cerrarArchivo();
        		break;
        	case 4:
        		//reporte.opcionMenu();
        		break;
        	}
        }while(respuesta !=5);
	}
}
	


