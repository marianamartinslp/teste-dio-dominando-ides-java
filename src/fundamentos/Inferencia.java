package fundamentos;

public class Inferencia {

public static void main(String[] args) {
	
	double a = 4.5;
	System.out.println(a);
	
	a = 15.5;
	System.out.println(a);
	
	a = 10;
	System.out.println(a);
	
	//valores decimais podem se tornar valores inteiros
	
	var b = 4.5;
	System.out.println(b);
	
	var c = "Texto"; // variavel declarada
	System.out.println(c);
	c = "Outro Texto"; // variavel declarada
	System.out.println(c);
	
	//uma vez declarada a variavel de forma inteira, nao é possivel declarar numeros decimais.
	
	
	double d; //variavel iniciada
	d = 4.5; // variavel declarada
	System.out.println(d); // usada
	
	
}
}
