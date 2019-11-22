package contas_bancos;

/**
 * ContaEspecial
 */
public class ContaEspecial extends AConta {
    private double limite = 1000;
	
	public ContaEspecial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaEspecial(double saldo, double taxaJuros) {
		super(saldo, taxaJuros);
		// TODO Auto-generated constructor stub
	}


	public void aplicarJuros() {
		if(saldo < 0) {
			saldo += (saldo*taxaJuros)/100;
			if((saldo*-1) > limite)
				super.aplicarJuros();
		}
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}   
}