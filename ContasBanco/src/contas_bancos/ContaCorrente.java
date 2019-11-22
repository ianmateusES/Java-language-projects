package contas_bancos;

/**
 * ContaCorrente
 */
public class ContaCorrente extends AConta {
    private double imposto = 3;
	
	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(double saldo, double taxaJuros) {
		super(saldo, taxaJuros);
		// TODO Auto-generated constructor stub
	}

	public void aplicarJuros() {
		super.aplicarJuros();
		if(saldo < 0)
			saldo += (saldo*taxaJuros)/100;
	}
	
	public void aplicarImposto() {
		saldo -= (saldo*this.imposto)/100;
	}
	
	public void aplicarImposto(double taxaimposto) {
		saldo -= (saldo*taxaimposto)/100;
	}    
}