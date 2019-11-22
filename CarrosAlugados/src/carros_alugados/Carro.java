package carros_alugados;

/**
 * Carro
 */
public class Carro {
    private String placa;
	private String modelo;
    private double valorDiaria;
    
    public Carro(String placa, String modelo, double valorDiaria){
		this.placa = placa;
		this.modelo = modelo;
		this.valorDiaria = valorDiaria;
    }
    

    public double obterValorAuguel(double quantidadeDias) {
		return (this.valorDiaria*quantidadeDias);
	}
	public boolean equals(Carro carro) {
		return this.placa.equals(carro.placa);
	}
	public String toPrint() {
		return "Placa: "+this.placa+" / "+ "Modelo: "+this.modelo+" / "+"Valor diaria: "+this.valorDiaria;
	}

    public String getPlaca() {
		return placa;
    }
    
	public void setPlaca(String placa) {
		this.placa = placa;
    }
    
	public String getModelo() {
		return modelo;
    }
    
	public void setModelo(String modelo) {
		this.modelo = modelo;
    }
    
	public double getValorDiaria() {
		return valorDiaria;
    }
    
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}    
}