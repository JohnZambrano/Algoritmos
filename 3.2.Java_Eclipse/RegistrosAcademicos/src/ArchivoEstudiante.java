import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class ArchivoEstudiante {
	private DataInputStream leer;
	private DataOutputStream escribir;
	
	public void abrirEscritura() {
		try {
			escribir = new DataOutputStream( new FileOutputStream("estudiantes.dat", true));
		}catch(IOException ex) {
			JOptionPane.showMessageDialog(null, "Error en la apertura","Registro Academico",
					JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
	}
	
	public void abrirLectura() {
		try {
			leer = new DataInputStream( new FileInputStream("estudiantes.dat"));
		}catch(FileNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "Archivo no encontrado","Registro Academico",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void agregar(Estudiante nuevo) {
		try {
			escribir.writeUTF(nuevo.getCodigo());
			escribir.writeUTF(nuevo.getNombre());
			escribir.writeUTF(nuevo.getApellido());
			escribir.writeUTF(nuevo.getPrograma());
			JOptionPane.showMessageDialog(null, "Estudiante RegistradO ","Registro Academico",
					JOptionPane.INFORMATION_MESSAGE);
		}catch(IOException ex) {
			JOptionPane.showMessageDialog(null, "No se pudo registrar el estudiante", "Registro Academico",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public String buscar(String codigoB) {
		Estudiante buscarEst = new Estudiante();
		try {
			do {
				buscarEst.setCodigo(leer.readUTF());
				buscarEst.setNombre(leer.readUTF());
				buscarEst.setApellido(leer.readUTF());
				buscarEst.setPrograma(leer.readUTF());
				if(codigoB.equalsIgnoreCase(buscarEst.getCodigo()))
					return buscarEst.escribir();
			}while(true);
		}catch(IOException ex) {
			return "No hay resultados \n Fin de la búsqueda";
		}
	}
	
	public String listado() {
		String reporte = "";
		Estudiante listarEst = new Estudiante();
		try {
			do {
				listarEst.setCodigo(leer.readUTF());
				listarEst.setNombre(leer.readUTF());
				listarEst.setApellido(leer.readUTF());
				listarEst.setPrograma(leer.readUTF());
				reporte += listarEst.escribir();
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
	

}
