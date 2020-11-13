package testes;

import java.util.Date;

public class Teste02 {

	public static void main(String[] args) {
		
		Long currentTimeMillis = System.currentTimeMillis();
		
		System.out.println(currentTimeMillis);		
		
		Date novaData = new Date(currentTimeMillis);
		
		System.out.println(novaData);
		

	}

}
