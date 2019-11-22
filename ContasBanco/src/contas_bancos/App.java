package contas_bancos;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<AConta> Banco = new ArrayList<AConta>();
        Banco banco = new Banco();
		Cliente cliente1 = new Cliente("Ian", 65235145614l);
		Cliente cliente2 = new Cliente("Samuel", 64951325690l);

        cliente1.setContaCorrente(new ContaCorrente(5000, 10));
        cliente1.setContaPoupanca(new ContaPoupanca(4000, 10));
        
        cliente2.setContaEspecial(new ContaEspecial(2000, 5));
        cliente2.setContaPoupanca(new ContaPoupanca(1000, 5));

        System.out.println("Saldo total antes: " + cliente1.getSaldoTotal());
		cliente1.rederJuros();
		System.out.println("Saldo total depois: " + cliente1.getSaldoTotal());
		
		System.out.println("");
		
		System.out.println("Saldo total antes: " + cliente2.getSaldoTotal());
		cliente2.rederJuros();
		System.out.println("Saldo total depois: " + cliente2.getSaldoTotal());
		
		System.out.println("");
		
		banco.adicionarCliente(cliente1);
		banco.adicionarCliente(cliente2);
		
		if(banco.auditoria())
			System.out.println("Passou na auditoria");
		else
			System.out.println("Nao passou na auditoria");
    }
}