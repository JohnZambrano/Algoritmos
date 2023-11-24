import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArchivoFacultad {

	private DataInputStream leer;
	private DataOutputStream escribir;

	public void abrirEscritura() {
		try {
			escribir = new DataOutputStream(new FileOutputStream("facultad.dat", true));
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Error en la apertura", "Registro Academico",
					JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
	}

	public void abrirLectura() {
		try {
			leer = new DataInputStream(new FileInputStream("facultad.dat"));
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Registro Academico",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public void agregar(Facultad nuevo) {
		try {
			escribir.writeUTF(nuevo.getCodigo());
			escribir.writeUTF(nuevo.getNombre());
			JOptionPane.showMessageDialog(null, "Facultad Registrada ", "Registro Academico",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "No se pudo registrar la facultad ", "Registro Academico",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public String buscar(String codigoB) {
		Facultad buscarFac = new Facultad();
		try {
			do {
				buscarFac.setCodigo(leer.readUTF());
				buscarFac.setNombre(leer.readUTF());
				if (codigoB.equalsIgnoreCase(buscarFac.getCodigo()))
					return buscarFac.escribir();
			} while (true);
		} catch (IOException ex) {
			return "No hay resultados \n Fin de la búsqueda";
		}
	}

	public String listado() {
		String reporte = "";
		Facultad listarFac = new Facultad();
		try {
			do {
				listarFac.setCodigo(leer.readUTF());
				listarFac.setNombre(leer.readUTF());
				reporte += listarFac.escribir();
			} while (true);
		} catch (IOException ex) {
			return reporte;
		}
	}

	public void cerrar() {
		try {
			if (leer != null)
				leer.close();
			if (escribir != null)
				escribir.close();
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "No se pudo cerrar el archivo", "Registro Academico",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public ArrayList<String> cargarDatos() {
		ArrayList<String> reporte;
		reporte = new ArrayList<String>();
		Facultad listarFac = new Facultad();
		try {
			do {
				listarFac.setCodigo(leer.readUTF());
				listarFac.setNombre(leer.readUTF());
				reporte.add(listarFac.escribir());
			} while (true);
		} catch (IOException exc) {
			return reporte;
		}
	}

	public boolean validar(String codigoB) {
		Facultad buscarFac = new Facultad();
		try {
			do {
				buscarFac.setCodigo(leer.readUTF());
				buscarFac.setNombre(leer.readUTF());
				if (codigoB.equalsIgnoreCase(buscarFac.getCodigo()))
					return true;
			} while (true);
		} catch (IOException ex) {
			return false;
		}
	}

}
