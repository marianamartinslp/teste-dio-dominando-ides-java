package fundamentos.operadores;

public class Ternarios {
	
	public static void main(String[] args) {
		
		double media = 2.6;
		
		String resultadoFinal = media >= 7.0 ? 
			"Aprovado" : "Em recupera��o";
	
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento;
		String resultado = temDesconto ? "Sim" : "N�o";
		
		System.out.printf("Tem desconto? %s", resultado);
		
		
	}

}
