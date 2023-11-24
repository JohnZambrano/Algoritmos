import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class Calculadora extends JFrame implements ActionListener {
	private JLabel lblDisplay;
	private JButton[] button;
	private JPanel pBotones;

	private String[] keys = { "7", "8", "9", "/",
			                  "4", "5", "6", "*",
			                  "1", "2", "3", "-", 
			                  "0", "c", "=", "+",
	 };
	
	private String numStr1 = "";//Almacenar los resultados 
	private String numStr2 = "";
	private String op;//Operador
	private boolean firstInput = true;
	
	public Calculadora() {
		setTitle("Calculadora");
		setSize(250,230);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponent();
	}
	
	public void initComponent() {
		lblDisplay = new JLabel("0",SwingConstants.RIGHT);
		lblDisplay.setFont(new Font("Taoma",Font.BOLD,12));
		
		pBotones = new JPanel();
		pBotones.setLayout(new GridLayout(4,4));
		
		button = new JButton[16];
		for(int i = 0; i<button.length; i++) {
			button[i] = new JButton(keys[i]);
			button[i].addActionListener(this);
			pBotones.add(button[i]);
		}
		
		Container contenedor = getContentPane();
		setContentPane(contenedor);
		contenedor.setLayout(new BorderLayout(5,5));
		contenedor.add(lblDisplay, BorderLayout.NORTH);
		contenedor.add(pBotones, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent evento) {
		String resultStr = "";
		String str = String.valueOf(evento.getActionCommand());
		switch(str) {
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":{
			if(firstInput) {
				numStr1 = numStr1+str;
				lblDisplay.setText(str);
			}
			else
				
				numStr2 = numStr2+str;
			    lblDisplay.setText(numStr2);
		  }
		break;
		//case 9
		case"+":
		case"-":
		case"*":
		case"/":{
			op = str;
			firstInput = false;
			break;
		}
		case "=":{
            resultStr = evaluate();
			lblDisplay.setText(resultStr);
			numStr1 = resultStr;
			numStr2 = "";
			firstInput = false;
			break;
		}
		case "C":
		{
			lblDisplay.setText("0");
			numStr1 = "";
			numStr2 = "";
			firstInput = true;
			
		}
	    }// fin switch

}// fin ActionPerformed

	private String evaluate() {
		try {
			double num1 = Double.parseDouble(numStr1);
			double num2 = Double.parseDouble(numStr2);
			double result = 0;
			switch (op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			}// fin switch
			return String.valueOf(result);
		} catch (ArithmeticException e) {
			return e.getMessage();
		} catch (NumberFormatException e) {
			if (numStr1.equals(""))
				return "Error: Primer número invalido";
			else
				return "Error: Segundo numero invalido";
		}
	}

	public static void main(String[] args) {
		new Calculadora().setVisible(true);
	}

}
