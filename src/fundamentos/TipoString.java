package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
	System.out.println("Ol� pessoal".charAt(2));
	
	String s = "Boa tarde";
	System.out.println(s.concat("!!!"));
	System.out.println(s + "!!!");
	System.out.println(s.toLowerCase().startsWith("boa"));
	System.out.println(s.endsWith("Tarde"));
	System.out.println(s.length());
System.out.println(s.equals("boa tarde"));
System.out.println(s.equalsIgnoreCase("boa tarde"));

   
   var nome = "Pedro";
   var sobrenome = "Santos";
   var idade = 33;
   var salario = 12345.987;
   
   String maisUmaFrase = "\n\n" + "Nome: " + nome + "\nSobrenome: " 
   + sobrenome + "\nIdade: " + idade + 
   "\nSalario: R$" + salario + "\n\n";
   System.out.println(maisUmaFrase);
   
	
	}

}
