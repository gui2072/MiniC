package br.com.minic.elementos;

public class LiteralInteiro implements IExpressao {

	// Atributo
	private int valor;

	// Construtor
	public LiteralInteiro(int valor) {
		this.setValor(valor);
	}

	// Metodos
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public void setParenteses(boolean parenteses) {}

	@Override
	public String toString() {
		return String.valueOf(this.getValor());
	}
}
