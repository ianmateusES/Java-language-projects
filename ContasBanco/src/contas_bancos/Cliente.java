package contas_bancos;

/**
 * Cliente
 */
public class Cliente {
    private String nome;
	private long cpf;
	private AConta[] contas;
	
	public Cliente() {
		this.nome = null;
        this.cpf = 0;
        this.contas = new AConta[2];
	}
	
	public Cliente(String nome, long cpf) {
		this.nome = nome;
        this.cpf = cpf;
        this.contas = new AConta[2];
	}
	

	public boolean setContaCorrente(AConta conta) {
        if(conta instanceof ContaCorrente){
            contas[0] = conta;
            return true;
        } else {
            return false;
        }
	}
	
	public boolean setContaPoupanca(AConta conta) {
		if(conta instanceof ContaPoupanca){
            contas[1] = conta;
            return true;
        } else {
            return false;
        }
	}
	
	public boolean setContaEspecial(AConta conta) {
		if(conta instanceof ContaEspecial){
            contas[2] = conta;
            return true;
        } else {
            return false;
        }
	}
	
	public void rederJuros() {
		for (int i=0; i < contas.length; i++) {
			if(contas[i] != null) {
				if(contas[i] instanceof ContaPoupanca) {
					System.out.println("Saldo da conta poupanca antes: "+contas[i].getSaldo()+" Taxa juros: "+contas[i].getTaxaJuros());
                    contas[i].aplicarJuros();
					System.out.println("Saldo da conta poupanca depois: " + contas[i].getSaldo());
				} else if(contas[i] instanceof ContaCorrente) {
					System.out.println("Saldo da conta corrente antes: " + contas[i].getSaldo() + " Taxa juros: " + contas[i].getTaxaJuros());
					contas[i].aplicarJuros();
					System.out.println("Saldo da conta corrente depois: " + contas[i].getSaldo());
				} else if(contas[i] instanceof ContaEspecial) {
					System.out.println("Saldo da conta especial antes: " + contas[i].getSaldo() + " Taxa juros: " + contas[i].getTaxaJuros());
					contas[i].aplicarJuros();
					System.out.println("Saldo da conta especial depois: " + contas[i].getSaldo());
				}
			}	
		}
	}
	
	public double getSaldoTotal() {
		double saldoTotal = 0;
		
		for(AConta conta : contas) {
			if(conta != null)
				saldoTotal += conta.getSaldo();
		}
		return saldoTotal;
	}
}