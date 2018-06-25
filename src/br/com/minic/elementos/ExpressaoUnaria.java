package br.com.minic.elementos;

public class ExpressaoUnaria implements IExpressao {

	// Atributos
	private String operador;
	private IExpressao expressao;
	private boolean parenteses;

	// Construtor
	public ExpressaoUnaria(String operador, IExpressao expressao) {
		this.setOperador(operador);
		this.setExpressao(expressao);
	}

	// Metodos
	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

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
		
		if (this.isParenteses()) {
			builder.append("(");
		}
			builder.append(this.getOperador());
			builder.append(this.getExpressao());
			
		if (this.isParenteses()) {
			builder.append(")");
		}
		
		return builder.toString();
	}
}
