package model;

public class Conta_corrente {
private String titular;
private String agencia;
private String numeroConta;
private double saldo;
 public Conta_corrente(String titlar,String agencia,String numeroConta,double saldo) {
	 super();
	 this.titular =titular;
	 this.agencia=agencia;
	 this.numeroConta=numeroConta;
	 this.saldo=saldo;
 
 } 
 public Conta_corrente() {
 
 }
 
 public String getTitular() {
  return titular;
 }  
 public void setTitular(String titular) {
	 this.titular= titular;
 }
 public String setAgencia() {
	 return agencia;
 }
 public void setAgencia(String agencia) {
	 this.agencia = agencia; 	
 }
 public String getNumeroconta() {
	 return numeroConta;
 }
 public String setNumeroConta() {
	 return numeroConta;
 }
public void setNumeroConta(String numeroConta) {
	
}
public double getSaldo() {
	return saldo;
}
public void setSaldo (double saldo) {
	this.saldo = saldo;
}
public double calcularSaldo() {
	return this.saldo;
	
}
 }

