package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); // importa��o do scanner, abertura
		
		System.out.print("Informe o primeiro salario: ");
		String valor1 = entrada.next().replace("," , "."); // Cria��o de string com o valor e //next para substituir as "," por "." de numeros decimais
		
		System.out.print("\nInforme o segundo salario: ");
		String valor2 = entrada.next().replace("," , "."); 
		
		System.out.println("\nInforme o terceiro salario: ");
		String valor3 = entrada.next().replace("," , ".");
		
		double salario1 = Double.parseDouble(valor1); // convers�o de double para string
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3; // resultado da soma dos salarios, divido por 3 para obter a media
		System.out.println("A m�dia dos sal�rios � " + media);
				
		entrada.close(); //fechamento do scanner
		
		
		
		

		
		
		
		System.out.print("");
		
	}
}
