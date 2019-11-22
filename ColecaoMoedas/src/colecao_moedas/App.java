package colecao_moedas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Moeda[] moedas = new Moeda[19];
        int anoFabricacao;
        double valorOrigem, valorDolarAmericano;
        String paisOrigem, desFaceCara, desFaceCoroa;
        boolean proximo = true;
        int posicao = 0;

        Scanner scan = new Scanner(System.in);

        do{
            //Entrada de dados do usuário corrente
			System.out.print("Ano fabricacao: ");
			anoFabricacao = scan.nextInt();
			scan.nextLine();
			System.out.print("Valor de origem: ");
			valorOrigem = scan.nextDouble();
			scan.nextLine();
			System.out.print("Valor em Dolar Americano: ");
			valorDolarAmericano = scan.nextDouble();
			scan.nextLine();
			System.out.print("Pais de origem: ");
			paisOrigem = scan.nextLine();
			System.out.println("Descrição da face Cara: ");
			desFaceCara = scan.nextLine();
			System.out.println("Descrição da face Coroa: ");
			desFaceCoroa = scan.nextLine();
			
			moedas[posicao] = new Moeda(anoFabricacao, valorOrigem, valorDolarAmericano, paisOrigem, desFaceCara, desFaceCoroa);
			
			//Continua no laço?
			System.out.println("Deseja continuar cadastrando? (s/n)");
			String resposta = scan.nextLine();
			
			if(resposta.equals("n") || resposta.equals("N")) {
				proximo = false;
			} else if(posicao >= 19) { 
				System.out.println("Limite de moedas no máximo!");
				proximo = false;
			} else {
				posicao++;
			}
        }while(proximo);

        proximo = true;

        do{
            for(int j = 0; j <= posicao; j++) {
                System.out.println(moedas[j].toPrint());
            }
            
            System.out.println("\nQual o id da moeda para conversão?");
            int converID = scan.nextInt();
            scan.nextLine();
            
            if(moedas[converID-1] != null){
                System.out.println("Valor da contacao: ");
                double cotacao = scan.nextDouble();
                scan.nextLine();
                System.out.println("Valor em Reais: " + moedas[converID-1].conversao(cotacao));
                System.out.println("Valor em Dolar: " + moedas[converID-1].getValorDolarAmericano());
            } else {
                System.out.println("Moeda nao encontrada!");
            }

            //Continua no laço?
			System.out.println("Deseja ver a conversao de outra moeda? (s/n)");
			String resposta = scan.nextLine();
			
			if(resposta.equals("n") || resposta.equals("N")) {
				proximo = false;
			}
        }while(proximo);
        
        scan.close();

        System.out.println("Fim");
    }
}