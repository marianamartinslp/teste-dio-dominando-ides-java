package ExerciciosFundamentos;

import java.util.Scanner;

public class ValorAoQuadrado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		double valor = scanner.nextDouble();
		
		//Existe tamb�m a seguinte possibilidade
		// double quadrado = valor * valor;
		//double cubo = valor * valor * valor;
		 
		 double quadrado = Math.pow(valor, 2);
		 double cubo = Math.pow(valor, 3);
		 
		 System.out.print("O valor ao quadrado �: " + quadrado + "\n O valor ao cubo �: " + cubo);
		 
		 scanner.close();
	}
}
