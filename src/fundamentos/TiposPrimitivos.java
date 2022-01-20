package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
	//informações do funcionario
		
		// Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numericos reais com pontos flutuantes
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipos booleanos
		boolean estadeFerias = false; // true
		
		//tipos primitivos caracteres
		char status = 'A'; //ativo (qualquer caractere que represente)
		
		
		//**Exercicios
		
		//Dias de Empresa
		System.out.println(anosDeEmpresa *365);
		
		//Numeros de Viagens
		System.out.println(numerosDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias?" + estadeFerias);
		System.out.println("Status: " + status);
		
		
		
		
	}
}
