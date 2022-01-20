package ExerciciosFundamentos;

import java.util.Scanner;

public class ConversaoCparaF {
	
	public static void main(String[] args) {
		//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		
		double conversao = (celsius - 32) / 1.8;
		
		System.out.println("Valor em °F: " + conversao);
		
		entrada.close();
		
		

	}
	
	

}
