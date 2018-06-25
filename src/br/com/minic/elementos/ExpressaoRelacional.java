package br.com.minic.elementos;

public class ExpressaoRelacional implements IExpressao {

	// Atributos
	private IExpressao expressao1;
	private OperadorRelacional operador;
	private IExpressao expressao2;
	private boolean parenteses;

	// Construtor
	public ExpressaoRelacional(IExpressao expressao1, OperadorRelacional operador, IExpressao expressao2) {
		this.expressao1 = expressao1;
		this.operador = operador;
		this.expressao2 = expressao2;
	}

	// Metodos
	public IExpressao getExpressao1() {
		return expressao1;
	}

	public void setExpressao1(IExpressao expressao1) {
		this.expressao1 = expressao1;
	}

	public OperadorRelacional getOperador() {
		return operador;
	}

	public void setOperador(OperadorRelacional operador) {
		this.operador = operador;
	}

	public IExpressao getExpressao2() {
		return expressao2;
	}

	public void setExpressao2(IExpressao expressao2) {
		this.expressao2 = expressao2;
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

		if(this.isParenteses()) {
			builder.append("(");
		}
		
		builder.append(this.getExpressao1());
		builder.append(" ");
		builder.append(this.getOperador());
		builder.append(" ");
		builder.append(this.getExpressao2());

		if(this.isParenteses()) {
			builder.append(")");
		}	
		
		return builder.toString();
	}
}
