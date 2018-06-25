package br.com.minic.elementos;

public class DeclaracaoVariavel implements IDeclaracaoVariavel{
	
	//Atributos
	private Identificador identificador;

	//Construtor
	public DeclaracaoVariavel(Identificador identificador) {
		this.identificador = identificador;
	}

	//Metodos
	public Identificador getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

	@Override
	public void setParenteses(boolean parenteses) {
	}
		
	@Override
	public String toString() {
		return this.getIdentificador().toString();
	}
}
