package br.com.minic.elementos;

public class ComandoIf implements IComando {

	// Atributos
	private IExpressao expressao;
	private IComando comando;

	// Constutor
	public ComandoIf(IExpressao	 expressao, IComando comando) {
		this.expressao = expressao;
		this.comando = comando;
	}

	// Metodos
	public IExpressao getExpressao() {
		return expressao;
	}

	public void setExpressao(IExpressao expressao) {
		this.expressao = expressao;
	}

	public IComando getComando() {
		return comando;
	}

	public void setComando(IComando comando) {
		this.comando = comando;
	}

	@Override
	public void setParenteses(boolean parenteses) {
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("if (");
		builder.append(this.getExpressao());
		builder.append(")\n");
		builder.append(this.getComando());
		
		return builder.toString();
	}
}
