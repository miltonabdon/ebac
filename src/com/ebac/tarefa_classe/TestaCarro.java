package com.ebac.tarefa_classe;

public class TestaCarro {
	
	public static void main(String[] args) {
		
		Carro testaCarro = new Carro("Ferrari", Float.valueOf(4));
		
		System.out.println(testaCarro.getVelocidade());
		
		testaCarro.acelera();
		
		System.out.println(testaCarro.getVelocidade());
		
		
		
	}

}
