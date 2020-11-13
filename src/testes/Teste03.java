package testes;

import java.time.Instant;
import java.util.Date;

public class Teste03 {

	public static void main(String[] args) {
	
		Date dataInicio = new Date();
		System.out.println(dataInicio);
		
		Instant instant = dataInicio.toInstant();
		System.out.println(instant);
	}

}
