package br.com.minic.elementos;

public class LiteralChar implements IExpressao {

	// Atributos
	private char valor;

	// Construtor
	public LiteralChar(char valor) {
		this.setValor(valor);
	}

	// Metodos
	public char getValor() {
		return valor;
	}

	public void setValor(char valor) {
		this.valor = valor;
	}

	@Override
	public void setParenteses(boolean parenteses) {}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("'");
		builder.append(String.valueOf(this.getValor()));
		builder.append("'");
		
		return builder.toString();
	}
}
