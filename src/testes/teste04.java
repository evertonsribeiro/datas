package testes;

import java.util.Calendar;

public class teste04 {

	public static void main(String[] args) {
		
		Calendar agora = Calendar.getInstance();
		
		System.out.println("A data corrente é : " + agora.getTime());
		
		int amount = 0;
		agora.add(Calendar.DATE, amount -15); 
		System.out.println("A data 15 dias atrás é : " + agora.getTime());
		
		agora.add(Calendar.MONTH, amount +4); 
		System.out.println("4 meses depois é : " + agora.getTime());
		
		agora.add(Calendar.YEAR, amount +2); 
		System.out.println("2 anos depois é : " + agora.getTime());
	}

}
