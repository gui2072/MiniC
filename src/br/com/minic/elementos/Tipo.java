package br.com.minic.elementos;

public class Tipo {

	// Atributos
	private String tipo;

	// Construtor
	public Tipo(String tipo) {
		this.setTipo(tipo);
	}

	// Metodos
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return this.getTipo();
	}
}