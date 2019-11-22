package contas_bancos;

import java.util.ArrayList;

/**
 * Banco
 */
public class Banco {
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void adicionarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public boolean auditoria() {
		double saldoContas = 0;
		for(Cliente cliente : clientes) {
			saldoContas += cliente.getSaldoTotal();
		}
		
		if(saldoContas > 5000){
            return true;
        }
			
		return false;	
	}
}