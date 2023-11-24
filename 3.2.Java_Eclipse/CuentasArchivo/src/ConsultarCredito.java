import java.io.*;
import java.lang.IllegalStateException;
import java.util.*;

public class ConsultarCredito {

	private int solicitud = 1;
	private Scanner entrada;

	public void opcionMenu() {
		Scanner textoEnt = new Scanner(System.in);
		System.out.printf("\n%s \n%s \n%s \n%s \n%s\n ", "Ingrese su solicitud ", 
				"1.Lista de cuenta con saldo cero",
				"2. Lista de cuentas con saldo crédito",
				"3.Lista de cuentas con saldo débito",
				"4.Retornar");
		try {
			do {
				System.out.print("Ingrese su opción ");
				solicitud = textoEnt.nextInt();
				switch(solicitud) {
				case 1:
					System.out.println("\nCuentas con saldo en cero\n");
					break;
				case 2:
					System.out.println("\nCuentas con saldo con crédito\n");
					break;
				case 3:
					System.out.println("\nCuentas con saldo con débito\n");
					break;
					
				}//Fin switch
			}while(solicitud != 4);
		}//fin try
		catch(NoSuchElementException ex) {
			System.err.println("Entrada invalida");
			System.exit(1);
		 }//fin catch
	  }//fin método
	
	private void leerRegistro() {
		RegistroCuenta registro = new RegistroCuenta();
			try {
				entrada = new Scanner(new File("Clientes.txt"));
				while(entrada.hasNext()) {
					registro.setCuenta(entrada.nextInt());
					registro.setNombre(entrada.next());
					registro.setApellido(entrada.next());
					registro.setSaldo(entrada.nextDouble());
					if(debeMostrar(registro.getSaldo()))
						System.out.printf("%-10d%-12s%-12s%10.2f", registro.getCuenta(), registro.getNombre(),
								registro.getApellido(),registro.getSaldo());
				}//fin while
			}//fin try
			catch(NoSuchElementException ex) {
				System.err.println("El archivo no esta bien formado ");
				entrada.close();
				System.exit(1);
			}
			catch(IllegalStateException ex) {
				System.err.println("Error al leer el archivo ");
				System.exit(1);
			}
			catch(FileNotFoundException ex) {
				System.err.println("No se puede encontrar el archivo ");
				System.exit(1);
			}
			finally {
				if(entrada != null)
					entrada.close();
			}
		}
	
	private boolean debeMostrar(double saldo) {
		if((solicitud == 1)&&(saldo == 0))
		return true;
		else if ((solicitud == 2)&&(saldo < 0))
		return true;
		else if((solicitud == 3)&&(saldo > 0))
		return true;
		return false;
		
		}
	
	
	}//fin clase

