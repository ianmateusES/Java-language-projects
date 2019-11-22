package cadastro_usuario;

/**
 * Usuario
 */
public class Usuario {
    private static int sqid = 0;
    private int id;
    private String nome;
    private String sobrenome;
    private int idade;
    private String cargo;
    private double salario;

    public Usuario() {
        this.id = ++sqid;
    }
    
    Usuario(String nome, String sobrenome, int idade, String cargo, double salario){
        this.id = ++sqid;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
    }

	public void promover(double porcentagem){
        this.salario += (this.salario*porcentagem)/100;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobreString){
        this.sobrenome = sobreString;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

	public String toPrint() {
        return this.id+", "+this.nome+" "+this.sobrenome+", "+this.idade+", "+this.cargo+", "+this.salario;
	}
}