package br.com.minic.elementos;

import java.util.List;

public class DeclaracaoVariaveis implements IComando {

	// Atributos
	private Tipo tipo;
	private List<IDeclaracaoVariavel> declaracoes;

	// Construtor
	public DeclaracaoVariaveis(Tipo tipo, List<IDeclaracaoVariavel> declaracoes) {
		this.tipo = tipo;
		this.declaracoes = declaracoes;
	}

	// Metodos
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public List<IDeclaracaoVariavel> getDeclaracoes() {
		return declaracoes;
	}

	public void setDeclaracoes(List<IDeclaracaoVariavel> declaracoes) {
		this.declaracoes = declaracoes;
	}

	@Override
	public void setParenteses(boolean parenteses) {
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(this.getTipo());
		builder.append(" ");

		int len = this.getDeclaracoes().size();
		
		for (int x = 0; x < len; x++) {
			builder.append((this.getDeclaracoes().get(x)).toString());
			
			if (x != len-1) {
				builder.append(", ");				
			}
		}
		
		builder.append(";");

		return builder.toString();
	}
}
