package br.com.minic.elementos;

public class ExpressaoBinaria implements IExpressao {

	// Atributos
	private IExpressao expressao1;
	private String operador;
	private IExpressao expressao2;

	// Construtor
	public ExpressaoBinaria(IExpressao expressao1, String operador, IExpressao expressao2) {
		this.setExpressao1(expressao1);
		this.setOperador(operador);
		this.setExpressao2(expressao2);
	}

	// Metodos
	public IExpressao getExpressao1() {
		return expressao1;
	}

	public void setExpressao1(IExpressao expressao1) {
		this.expressao1 = expressao1;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public IExpressao getExpressao2() {
		return expressao2;
	}

	public void setExpressao2(IExpressao expressao2) {
		this.expressao2 = expressao2;
	}

	@Override
	public void setParenteses(boolean parenteses) {
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(this.getExpressao1());
		builder.append(" ");
		builder.append(this.getOperador());
		builder.append(" ");
		builder.append(this.getExpressao2());

		return builder.toString();
	}
}
