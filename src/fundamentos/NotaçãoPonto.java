package fundamentos;

public class NotaçãoPonto {

	public static void main(String[] args) {
		
		String s = "Bom Dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
				
		
		System.out.println(s);
		
		String x = "Leo";
		x = x.toUpperCase();
		System.out.println(x);
		
		String y = "Bom Dia X"
				.replace("X", "Senhor").toUpperCase();
		System.out.println(y);
		
		
	//Treino
		
		String w = "Bom Dia Aline".replace("Aline", "Amor da minha Vida").toUpperCase().concat(" <3 ");
		System.out.println(w);
		
		String d = "Boa tarde a todos".replace("a todos", "senhores").toUpperCase().concat("!!");
		System.out.println(d);
		
		//Tipos primitivos não tem o operador "."
		
		
		
	}
}
