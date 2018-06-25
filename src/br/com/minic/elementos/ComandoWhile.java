package br.com.minic.elementos;

public class ComandoWhile implements IComando {

	// Atributos
	private IExpressao expressao;
	private IComando comandos;

	// Construtor
	public ComandoWhile(IExpressao expressao, IComando comandos) {
		this.expressao = expressao;
		this.comandos = comandos;
	}

	// Metodos
	public IExpressao getExpressao() {
		return expressao;
	}

	public void setExpressao(IExpressao expressao) {
		this.expressao = expressao;
	}

	public IComando getComandos() {
		return comandos;
	}

	public void setComandos(IComando comandos) {
		this.comandos = comandos;
	}

	@Override
	public void setParenteses(boolean parenteses) {
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("while (");
		builder.append(this.getExpressao());
		builder.append(") {\n");
		builder.append(this.getComandos());
		builder.append("}\n");

		return builder.toString();
	}
}
