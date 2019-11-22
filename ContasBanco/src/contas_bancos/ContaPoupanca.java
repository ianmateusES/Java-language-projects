package contas_bancos;

/**
 * ContaPoupanca
 */
public class ContaPoupanca extends AConta {
    
    public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(double saldo, double taxaJuros) {
		super(saldo, taxaJuros);
		// TODO Auto-generated constructor stub
	}

	public void aplicarJuros() {
		saldo += (saldo*taxaJuros)/100;
	}
}