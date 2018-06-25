package br.com.minic.elementos;

public class ExpressaoNegacao implements IExpressao {

	// Atributos
	private IExpressao expressao;
	private boolean parenteses;

	// Construtor
	public ExpressaoNegacao(IExpressao expressao1) {
		this.expressao = expressao1;
	}

	// Metodos
	public IExpressao getExpressao() {
		return expressao;
	}

	public void setExpressao(IExpressao expressao) {
		this.expressao = expressao;
	}

	
	public boolean isParenteses() {
		return parenteses;
	}

	@Override
	public void setParenteses(boolean parenteses) {
		this.parenteses = parenteses;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("!(");
		builder.append(this.getExpressao());
		builder.append(")");

		return builder.toString();
	}
}
