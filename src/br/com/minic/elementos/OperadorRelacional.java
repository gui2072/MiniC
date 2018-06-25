package br.com.minic.elementos;

public class OperadorRelacional {

	// Atributos
	private String operador;

	// Construtor
	public OperadorRelacional(String operador) {
		this.operador = operador;
	}

	// Metodos
	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	@Override
	public String toString() {
		return operador.toString();
	}
}
