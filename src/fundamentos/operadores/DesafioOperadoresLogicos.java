package fundamentos.operadores;

public class DesafioOperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		boolean tv50 = trabalho1 && trabalho2; //E
		boolean tv32 = trabalho1 ^ trabalho2; //Ou Exclusivo
		boolean comprousorvete = trabalho1 || trabalho2; //OU
		
		//Operador Unário
		boolean maisSaudavel = !comprousorvete; //NOT
		
		System.out.println("Comprou TV 50\" ? " + tv50);
		System.out.println("Comprou TV 32\" ? " + tv32);
		System.out.println("Comprou sorvete? " + comprousorvete);
		System.out.println("Mais saudável? " + !comprousorvete);
		
		

		
	}

}
