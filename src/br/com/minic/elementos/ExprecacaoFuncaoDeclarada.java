package br.com.minic.elementos;

import java.util.List;

public class ExprecacaoFuncaoDeclarada implements IExpressao, IComando {

	// Atributos
	private Identificador identificador;
	private List<IExpressao> expressoes;

	// Construtor
	public ExprecacaoFuncaoDeclarada(Identificador identificador, List<IExpressao> expressoes) {
		this.identificador = identificador;
		this.expressoes = expressoes;
	}

	// Metodos
	public Identificador getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

	public List<IExpressao> getExpressoes() {
		return expressoes;
	}

	public void setExpressoes(List<IExpressao> expressoes) {
		this.expressoes = expressoes;
	}

	@Override
	public void setParenteses(boolean parenteses) {
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(this.getIdentificador());
		builder.append("(");

		int len = this.getExpressoes().size();
		
		for (int x = 0; x < len; x++) {
			builder.append((this.getExpressoes().get(x)).toString());
			
			if (x != len-1) {
				builder.append(", ");				
			}
		}
		
		builder.append(")");

		return builder.toString();
	}
}
