package br.com.minic.elementos;

public class ComandoPrintsrt implements IComando {

	// Atributos
	private IExpressao expressao;

	// Construtor
	public ComandoPrintsrt(IExpressao expressao) {
		this.expressao = expressao;
	}

	// Metodos
	public IExpressao getExpressao() {
		return expressao;
	}

	public void setExpressao(IExpressao expressao) {
		this.expressao = expressao;
	}

	@Override
	public void setParenteses(boolean parenteses) {
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("printsrt");
		builder.append(this.getExpressao());
		builder.append(");\n");
		
		return builder.toString();
	}
}
