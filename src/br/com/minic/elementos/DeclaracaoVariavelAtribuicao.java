package br.com.minic.elementos;

public class DeclaracaoVariavelAtribuicao implements IDeclaracaoVariavel{

	// Atributos
	private Identificador identificador;
	private IExpressao expressao;

	// Construtor
	public DeclaracaoVariavelAtribuicao(Identificador identificador, IExpressao expressao) {
		this.identificador = identificador;
		this.expressao = expressao;
	}

	// Medotos
	public Identificador getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

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

		builder.append(this.getIdentificador());
		builder.append(" = ");
		builder.append(this.getExpressao());

		return builder.toString();
	}

}
