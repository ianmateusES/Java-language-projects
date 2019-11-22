package colecao_moedas;

/**
 * Moeda
 */
public class Moeda {
    private static int sqid = 0;
    private int id;
    private int anoFabricacao;
    private double valorOrigem;
    private double valorDolarAmericano;
    private String paisOrigem;
    private String desFaceCara;
    private String desFaceCoroa;
    
    public Moeda(){
        this.id = ++sqid;
    }

    public Moeda(int anoFabricacao, double valorOrigem, double valorDolarAmericano, 
                String paisOrigem, String desFaceCara, String desFaceCoroa){
        this.id = ++sqid;
        this.anoFabricacao = anoFabricacao;
        this.valorOrigem = valorOrigem;
        this.valorDolarAmericano = valorDolarAmericano;
        this.paisOrigem = paisOrigem;
        this.desFaceCara = desFaceCara;
        this.desFaceCoroa = desFaceCoroa;
    }

    public double conversao(double cotacao) {
		return (this.valorDolarAmericano*cotacao);
    }
    
    public String toPrint(){
        return id+", "+anoFabricacao+", "+valorOrigem+", "+valorDolarAmericano+", "+paisOrigem+", "
                +desFaceCara+", "+desFaceCoroa;
    }

    public int getId() {
		return id;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public double getValorOrigem() {
		return valorOrigem;
	}

	public void setValorOrigem(double valorOrigem) {
		this.valorOrigem = valorOrigem;
	}

	public double getValorDolarAmericano() {
		return valorDolarAmericano;
	}

	public void setValorDolarAmericano(double valorDolarAmericano) {
		this.valorDolarAmericano = valorDolarAmericano;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public String getDesFaceCara() {
		return desFaceCara;
	}

	public void setDesFaceCara(String desFaceCara) {
		this.desFaceCara = desFaceCara;
	}

	public String getDesFaceCoroa() {
		return desFaceCoroa;
	}

	public void setDesFaceCoroa(String desFaceCoroa) {
		this.desFaceCoroa = desFaceCoroa;
	}
}