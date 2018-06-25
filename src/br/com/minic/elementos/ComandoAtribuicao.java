package br.com.minic.elementos;

public class ComandoAtribuicao implements IComando {

	// Atributos
	private Identificador identificador;
	private IExpressao expressao;

	// Construtor
	public ComandoAtribuicao(Identificador identificador, IExpressao expressao) {
		this.identificador = identificador;
		this.expressao = expressao;
	}

	// Metodos
	public IExpressao getExpressao() {
		return expressao;
	}

	public Identificador getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
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
		
		builder.append(this.getIdentificador());
		builder.append(" = ");
		builder.append(this.getExpressao());
		builder.append(";");
		
		return builder.toString();				
	}
}
