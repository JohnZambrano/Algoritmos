import java.io.*;
import java.lang.SecurityException;
import java.util.*;

public class EscribirArchivoCuenta {
    private Formatter salida;
    private String continuar;
    
    public void abrirArchivo() {
    	try {
    		salida = new Formatter("clientes.txt");
    	}catch(SecurityException ex) {
    		System.err.println("No tiene acceso de escritura a este archivo");
    		System.exit(1);
    	}
    	catch(FileNotFoundException ex) {
    		System.err.println("Error al crear el archivo");
    		System.exit(1);
    	}
    }
    
    public void agregarRegistros() {
    	RegistroCuenta registro = new RegistroCuenta();
    	Scanner entrada = new Scanner(System.in);
    	do {
    		try {
    			System.out.printf("%s %s\n%s","Escriba el número de cuenta(>0)","nombre, apellido, saldo","?");
    			registro.setCuenta(entrada.nextInt());
    			registro.setNombre(entrada.next());
    			registro.setApellido(entrada.next());
    			registro.setSaldo(entrada.nextDouble());
    			if(registro.getCuenta()>0) {
    				salida.format("%d %s %s %.2f\n",registro.getCuenta(),registro.getNombre(),
    				       registro.getApellido(),registro.getSaldo());
    			}else
    				System.out.println("El número de cuenta debe ser mayor que 0");
    		 }catch(FormatterClosedException ex) {
    			 System.err.println("Error al escribir en el archihvo "+ex.getMessage());
    		 }
    		catch(NoSuchElementException ex) {
    			System.err.println("Entrada invalida. Intente de nuevo "+ ex.getMessage());
    			entrada.nextLine();
    		}
    		System.out.printf("%s","Registrar otra cuenta S/N");
    		continuar= entrada.next();
    	}while(continuar.charAt(0)=='s' || continuar.charAt(0)=='s');
    }
    
    public void cerrarArchivo() {
    	if(salida != null) {
    		salida.close();
    	}
    }
}
