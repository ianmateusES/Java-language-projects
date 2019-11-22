package cadastro_usuario;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String name, sobrename, cargo;
		int idade;
		double salario, porcentagem;
		
		int i = 0, j; // Indices
		String verificador;
        
		Usuario[] arrayUsuarios = new Usuario[5];
		Scanner scan = new Scanner(System.in);
		
		
		do {
			System.out.println("Nome:");
			arrayUsuarios[i] = new Usuario();
			name = scan.nextLine();
			arrayUsuarios[i].setNome(name);
			
			System.out.println("Sobrenome:");
			sobrename = scan.nextLine();
			arrayUsuarios[i].setSobrenome(sobrename);
			
			System.out.println("Idade:");
			idade = scan.nextInt();
			scan.nextLine();
			arrayUsuarios[i].setIdade(idade);
			
			System.out.println("Cargo:");
			cargo = scan.nextLine();
			arrayUsuarios[i].setCargo(cargo);
			
			System.out.println("Salario:");
			salario = scan.nextInt();
			scan.nextLine();
			arrayUsuarios[i].setSalario(salario);
            
            i++;
			if(i > 5) {
				System.out.println("Limite de cadastro atingindo");
				verificador = "nao";
			}else {
				System.out.println("Deseja cadastrar outro Usuario? (Sim ou Nao)");
				verificador = scan.nextLine();
			}
		}while(verificador.contentEquals("Sim") || verificador.contentEquals("sim"));
		 
		
		do {
			System.out.println("Deseja promover alguem? (Sim ou Nao)");
			verificador = scan.nextLine();
			if(verificador.contentEquals("Nao") || verificador.contentEquals("nao")) {
				break;
            }
            
			for(j=0;j < i; j++) {
				System.out.println(arrayUsuarios[j].toPrint());
			}
			
			do {
				System.out.println("Digite o id do Usuario: ");
				j = scan.nextInt();
				scan.nextLine();
			}while(j < 1 || j > i);
			
			System.out.println("Digite a porcentagem: ");
			porcentagem = scan.nextDouble();
			scan.nextLine();
			arrayUsuarios[j-1].promover(porcentagem);
			
			System.out.println("Novo salario: ");
			System.out.println(arrayUsuarios[j-1].getSalario());
		}while(true);
		 
		scan.close();
		System.out.println("Fim");
    }
}