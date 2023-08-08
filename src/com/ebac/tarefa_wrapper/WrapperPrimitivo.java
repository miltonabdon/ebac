package com.ebac.tarefa_wrapper;

import java.util.Scanner;

public class WrapperPrimitivo {
	
	static int idade = 18;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int nextInt = scanner.nextInt();
		
		scanner.nextLine();
		
		Integer idadeEntradaWrapper = Integer.valueOf(nextInt);
		Integer idadeAtualWrapper = Integer.valueOf(idade);
		
		if(idadeAtualWrapper > idadeAtualWrapper)
			System.out.println("Sua idade "+ idadeEntradaWrapper + " é maior que a " + idade);
		else {
			System.out.println("Sua idade "+ idadeEntradaWrapper + " é menor que a " + idade);
		}
		
		scanner.close();
	}

}
