package br.com.minic.elementos;

public class TipoRetorno {

	// Atributos
	private String tipo;
	private Object valor;

	// Construtor
	public TipoRetorno(String tipo, Object valor) {
		this.setTipo(tipo);
		this.setValor(valor);
	}

	// Metodos
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return this.valor.toString();
	}
}
