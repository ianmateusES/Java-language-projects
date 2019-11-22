package carros_alugados;

/**
 * RegistroAluguel
 */
public class RegistroAluguel {
    private Carro carroAlugado;
    private double valorAluguel;
    
    public RegistroAluguel(Carro carroAlugado, double quantidadeDias) {
        this.carroAlugado = carroAlugado;
        this.valorAluguel = carroAlugado.obterValorAuguel(quantidadeDias);
    }

    public Carro getCarroAlugado() {
        return carroAlugado;
    }

    public void setCarroAlugado(Carro carroAlugado) {
        this.carroAlugado = carroAlugado;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    
    public String toPrint() {
        return this.carroAlugado.toPrint()+" / Valor do aluguel: " +valorAluguel;
    }
}