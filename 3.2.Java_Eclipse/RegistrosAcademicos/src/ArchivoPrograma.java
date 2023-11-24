import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArchivoPrograma {
	
	private DataInputStream leer;
	private DataOutputStream escribir;
	
	public void abrirEscritura() {
		try {
			escribir = new DataOutputStream( new FileOutputStream("facultad.dat", true));
		}catch(IOException ex) {
			JOptionPane.showMessageDialog(null, "Error en la apertura","Registro Academico",
					JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
	}
	
	public void abrirLectura() {
		try {
			leer = new DataInputStream( new FileInputStream("facultad.dat"));
		}catch(FileNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "Archivo no encontrado","Registro Academico",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void agregar(Programa nuevo) {
		try {
			escribir.writeUTF(nuevo.getCodigo());
			escribir.writeUTF(nuevo.getNombre());
			escribir.writeUTF(nuevo.getFacultad());
			JOptionPane.showMessageDialog(null, "Programa RegistradO ","Registro Academico",
					JOptionPane.INFORMATION_MESSAGE);
		}catch(IOException ex) {
			JOptionPane.showMessageDialog(null, "No se pudo registrar el programa", "Registro Academico",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public String buscar(String codigoB) {
		Programa buscarPro = new Programa();
		try {
			do {
				buscarPro.setCodigo(leer.readUTF());
				buscarPro.setNombre(leer.readUTF());
				buscarPro.setFacultad(leer.readUTF());
				if(codigoB.equalsIgnoreCase(buscarPro.getCodigo()))
					return buscarPro.escribir();
			}while(true);
		}catch(IOException ex) {
			return "No hay resultados \n Fin de la búsqueda";
		}
	}
	
	
	public String listado() {
		String reporte = "";
		Programa listarPro = new Programa();
		try {
			do {
				listarPro.setCodigo(leer.readUTF());
				listarPro.setNombre(leer.readUTF());
				listarPro.setFacultad(leer.readUTF());
				reporte += listarPro.escribir();
			}while(true);
		}catch(IOException ex) {
			return reporte;
		}
	}
	
	public void cerrar() {
		try {
			if(leer != null)
				leer.close();
			if(escribir != null)
				escribir.close();
		}catch(IOException ex) {
			JOptionPane.showMessageDialog(null, "No se pudo cerrar el archivo", "Registro Academico",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public ArrayList<String> cargarDatos(){
		 ArrayList<String>reporte;
		 reporte = new  ArrayList<String>();
		 Programa listarPro = new Programa();
		 try {
			 do {
				 listarPro.setCodigo(leer.readUTF());
				 listarPro.setNombre(leer.readUTF());
				 listarPro.setFacultad(leer.readUTF());
				 reporte.add(listarPro.escribirCombo());
			 }while(true);
		 }catch(IOException ex) {
			 return reporte;
		 }
	}
	

	

}
