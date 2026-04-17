package model;

public class ContaEspecial extends Conta_corrente {
	
	private double limite;
	
	public ContaEspecial(String titlar, String agencia, String numeroConta, double saldo,double limite) {
			super(titlar, agencia, numeroConta, saldo);
			this.limite=limite;
	}
	public ContaEspecial() {
		super();
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
}
	@Override
	public double calcularSaldo() {
		double saldoFinal;
		saldoFinal = super.calcularSaldo()+ limite;
		return saldoFinal;
	}


}



