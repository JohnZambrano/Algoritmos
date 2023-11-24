import javax.swing.JOptionPane;

public class Cuentas {
	protected String numero;
	protected String cliente;
	protected double saldo;

	public Cuentas() {
		numero = "";
		cliente = "";
		saldo = 0;
	}

	public Cuentas(String numero, String cliente, double saldo) {

		setNumero(numero);
		setCliente(cliente);
		setSaldo(saldo);
	}

	public String getNumero() {
		return numero;
	}

	public String getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNumero(String numero) {
		if (numero.length() > 0)
			this.numero = numero;
		else
			throw new IllegalArgumentException("El número de la cuenta no puede estar vacio");
	}

	public void setCliente(String cliente) {
		if (cliente.length() > 0)
			this.cliente = cliente;
		else
			throw new IllegalArgumentException("El nombre del cliente no puede estar vacio");
	}

	public void setSaldo(double saldo) {
		if (saldo >= 0)
			this.saldo = saldo;
		else
			throw new IllegalArgumentException("El saldo de la cuenta no puede ser negativo");
	}

	public void consignar(double valor) {
		if (valor >= 0)
			saldo += valor;
	}

	public void retirar(double valor) {
		if (valor >= 0)
			if (valor <= saldo)
				saldo -= valor;
			else
				JOptionPane.showMessageDialog(null, "Fondos insuficientes", "Manejo de Cuentas de Ahorro",
						JOptionPane.ERROR_MESSAGE);
	}

}
