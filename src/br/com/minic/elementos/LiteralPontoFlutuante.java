package br.com.minic.elementos;

public class LiteralPontoFlutuante implements IExpressao {

	// Atributos
	private double valor;

	// Construtor
	public LiteralPontoFlutuante(double valor) {
		this.setValor(valor);
	}

	// Metodos
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public void setParenteses(boolean parenteses) {}

	@Override
	public String toString() {
		return String.valueOf(this.getValor());
	}
}
