import java.io.*;
import javax.swing.JOptionPane;

public class RegistroUsuarios{
	
	private RandomAccessFile archivo;
	
    public RegistroUsuarios() {
    	try {
    		archivo = new RandomAccessFile("sorteo.dat","rw");
    		
    	}catch(IOException ex){
    		JOptionPane.showMessageDialog(null," Error al abrir el archhivo", "Sorteo",
    				JOptionPane.ERROR_MESSAGE);
    		System.exit(1);
    	}
    }
    
    public long numeroRegistros() {
    	try {
    		return archivo.length()/20;
    	}catch(IOException ex) {
    		return -1;
    	}
    }
    
    public boolean agragarUsuario (Usuario registros) {
    	try {
    		archivo.seek(archivo.length());
    		archivo.writeInt(registros.getCodigo());
    		archivo.writeLong(registros.getCedula());
    		archivo.writeLong(registros.getTelefono());
    		return true;
    	}catch(IOException ex) {
    		return false;
    	}
    }
    
    public void cerrar() {
    	try {
    		archivo.close();
    		
    	}catch(IOException ex) {
    		JOptionPane.showMessageDialog(null, "Error al cerrar el archivo", 
    				"Sorteo ",JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    private Usuario cargarDatos() {
    	try {
    		Usuario registro = new Usuario();
    		registro.setCodigo(archivo.readInt());
    		registro.setCedula(archivo.readLong());
    		registro.setTelefono(archivo.readLong());
    		return registro;
    	}catch(IOException ex) {
    		return null;
    	}
    }
    
    public String movimientos(int tipo) {
    	long pos = 0;
    	try {
    		pos = archivo.getFilePointer();
    		switch(tipo) {
    		case 1:
    			//primero
    			archivo.seek(0);
    			break;
    		case 2:
    			//último
    			archivo.seek(archivo.length() - 20);
    			break;
    		case 3:
    			//anterior
    			if(pos == 20)
    			archivo.seek(archivo.length() - 20);
    			else
    				archivo.seek(pos - 40);
    			break;
    		case 4:
    			//siguiente
    			if(pos == archivo.length())
    				pos = 0; // envia al inicio del archivo
    			
    			archivo.seek(pos);
    			break;
    			
    		}
    		return cargarDatos().estado();
    	}catch(IOException ex) {
    		return "";
    	}
    }
    
    public String todos() {
    	String reporte = "";
    	try {
    		Usuario registro = new Usuario();
    		archivo.seek(0);
    		do {
    		registro.setCodigo(archivo.readInt());
    		registro.setCedula(archivo.readInt());
    		registro.setTelefono(archivo.readInt());
    		reporte += registro.estado();
    		
    		}while(true);
    	}catch(IOException ex) {
    		return reporte;
    	}
    }
    
    public String buscar(int codigo) {
    	String reporte = "";
    	try {
    		archivo.seek((codigo-1)*20);
    		if(archivo.getFilePointer() >= 0 && archivo.getFilePointer() < archivo.length())
    			reporte = cargarDatos().estado();
    		return reporte;
    	}catch(IOException ex) {
    		return reporte;
    	}
    	
    	
    }
    
}
