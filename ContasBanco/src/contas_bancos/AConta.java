package contas_bancos;

/**
 * AConta
 */
public abstract class AConta {
    private static int sqAgencia = 1000;
	private static int sqNumero = 10000000;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected double taxaJuros;
    
    public AConta(){
        this.agencia = ++sqAgencia;
		this.numero = ++sqNumero;
		this.saldo = 0;
		this.taxaJuros = 5.5;
    }

    public AConta(double saldo, double taxaJuros) {
		super();
		this.agencia = ++sqAgencia;
		this.numero = ++sqNumero;
		this.saldo = saldo;
		this.taxaJuros = taxaJuros;
	}


    public String sacar(double valor) {
		if(valor > this.saldo)
			return "Saldo insuficiente";
		else 
			this.saldo -= valor;
		
		return "Saque realizado com suceso";
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void aplicarJuros() {
		saldo -= 25;
	}
	
	public double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public double getSaldo() {
		return saldo;
	}

}