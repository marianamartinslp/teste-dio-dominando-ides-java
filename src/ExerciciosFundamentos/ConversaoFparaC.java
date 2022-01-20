package ExerciciosFundamentos;

import java.util.Scanner;

public class ConversaoFparaC {
	
	public static void main(String[] args) {
			
		// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius. */

		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em °F: ");
		double f = scanner1.nextDouble();
		
		double conversao1 = (f * 1.8) + 32;
		
		System.out.println("Valor em Celsius " + conversao1);
		
		scanner1.close();
		
		
		
	}

}
