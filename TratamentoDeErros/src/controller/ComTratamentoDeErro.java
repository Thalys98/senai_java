package controller;
import util.Teclado;
public class ComTratamentoDeErro {

	public static void main(String[] args) {
	
		try {
		double a = Teclado.lerDouble("digite o numerador :");
		double b = Teclado.lerDouble("Digite o denominador :");
		double c = a/b;
		
		System.out.println("Resultado da divisao de A por B : "+c);
	
		}catch (NumberFormatException nfe) {
		System.out.println("Caracter inválido!"); 
		
		}catch (ArithmeticException ae) {
		System.out.println("Divisao por Zero");
		}
	}
}
		

	


