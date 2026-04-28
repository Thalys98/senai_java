package controller;

import util.Teclado;

public class SemTratamentoDeErro {

	public static void main(String[] args) {
  
		double a = Teclado.lerDouble("digite o numerador:");
		double b = Teclado.lerDouble("digite o denominador:");
		
		double c = a/b;
		System.out.println("resultado da divisao de a por b:"+c);
		
	}
}
