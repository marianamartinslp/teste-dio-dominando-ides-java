package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//Ler num1
		// Ler num2
		// + - * / %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o segundo numero");
		double num2= entrada.nextDouble();
		
		System.out.println("Informe a opera��o: ");
		String op = entrada.next();
		
		//L�gica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op)? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = ?", 
				num1, op, num2);		
		entrada.close();
	}
}
