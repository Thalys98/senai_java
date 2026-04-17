package controller;

import model.Conta_corrente;
import model.ContaEspecial;

public class Teste {
public static void main (String []args) {
	Conta_corrente cc = new Conta_corrente ("Michael oliveira","00001","123456",250);
	System.out.println("Saldo michael");
	System.out.println(cc.calcularSaldo());
	
	ContaEspecial cce = new ContaEspecial ("fabricio curvello","0034","987654",0.5,500);
	System.out.println("saldo fabricicio");
	System.out.println(cce.calcularSaldo());
}
}
