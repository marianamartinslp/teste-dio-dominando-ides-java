package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringParaNumero {
	
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo numero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
				double numero2 = Double.parseDouble(valor2);
				
				double soma = numero1 + numero2;
				System.out.println("A soma � " + soma);
				System.out.println("A media � " + soma / 2);
				
	}

}
