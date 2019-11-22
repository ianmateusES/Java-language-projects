package carros_alugados;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<Carro>();
        Carro carroAlugado;
        int escolha, i = 0;
        double quantidadeDias;

        carros.add(new Carro("HDB4754", "Mercedez", 900));
        carros.add(new Carro("BHD3243", "Honda", 500));
        carros.add(new Carro("FBD1013", "Tesla", 1500));

		do{
            System.out.println("Escolha o carro: ");
            for (Carro carro : carros) {
                i++;
                System.out.println(i +"-"+carro.toPrint());
            }
            escolha = scan.nextInt();
            scan.nextLine();
            if(escolha < 1 || escolha > i){
                System.out.println("Escolha invalida!\n");
                i=0;
                carroAlugado = null;
            }else{
                carroAlugado = carros.get(escolha-1);    
            }
        }while(carroAlugado == null);

        System.out.print("Quantidade de dias: ");
		quantidadeDias = scan.nextDouble();
		scan.nextLine();
        
        RegistroAluguel aluguel = new RegistroAluguel(carroAlugado, quantidadeDias);
        System.out.println(aluguel.toPrint());

        scan.close();
        System.out.println("Fim");
    }
}