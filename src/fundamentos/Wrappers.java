package fundamentos;

import java.util.Scanner;

public class Wrappers {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
				
		//byte
		Byte b = 100;
		Short s = 1000;
		
		//integer.parseInt(entrada.next());
		Integer i = 10000; //int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Boolean bo = Boolean.parseBoolean("true"); //o mesmo que boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c.toString());
		System.out.println(c + "...");
		
		entrada.close();
		
		
		
		
		
		
		
	}

}
