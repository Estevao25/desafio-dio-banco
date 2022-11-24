
public enum TipoConta {
	Corrente("Corrente"),
	Poupanca("Poupança");
	
    private final String tipo;   

	TipoConta(String string) {
		this.tipo = string;
	}

	public String getTipo() {
		return tipo;
	}

}
