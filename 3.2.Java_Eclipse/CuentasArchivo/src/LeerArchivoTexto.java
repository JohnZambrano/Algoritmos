import java.io.*;
import java.lang.IllegalStateException;
import java.util.*;

public class LeerArchivoTexto {
    private Scanner entrada;
    
    public void abrirArchivo() {
    	try {
    		entrada = new Scanner(new File("clientes.txt"));
    	}catch(FileNotFoundException ex) {
    		System.err.printf("Error al abrir el archivo. "+ ex.getMessage());
    		System.exit(1);
    	}
    }
    
    public void leerRegistros() {
    	RegistroCuenta registro = new RegistroCuenta();
    	System.out.printf("%-9s%-15s%-18s%10s%\n", "Nombre", "Apellido", "Saldo");
    	try {
    		while(entrada.hasNext()) {
    			registro.setCuenta(entrada.nextInt());
    			registro.setNombre(entrada.next());
    			registro.setApellido(entrada.next());
    			registro.setSaldo(entrada.nextDouble());
    			
    			System.out.printf("%-9d%-15s%-18s%10.2f\n", registro.getCuenta(),
    					registro.getNombre(),registro.getApellido(),registro.getSaldo());
    			
    		}
    	}catch(NoSuchElementException ex) {
    		System.err.println("El archivo no está bien formado"+ ex.getMessage());
    		entrada.close();
    		System.exit(1);
    		
    	}
    	catch(IllegalStateException ex) {
    		System.err.println("Error al leer el archivo "+ ex.getMessage());
    		System.exit(1);
    	}
    }
    
    public void cerrarArchivo() {
    	if(entrada != null)
    		entrada.close();
    }

}
