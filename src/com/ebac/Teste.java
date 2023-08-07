package com.ebac;

public class Teste {

	public static void main(String[] args) {
		
		Teste teste = new Teste();
		
		
		System.out.println(teste.myMethod(5));

	}
	
	
	public int myMethod(int n) {
		return n <= 1 ? 1 : myMethod(n - 1) * n;
	}

}
