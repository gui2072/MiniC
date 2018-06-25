package br.com.minic.elementos;

public class DeclaracaoInclude {

	// Atributo
	private Identificador identificador;

	// Construtor
	public DeclaracaoInclude(Identificador identificador) {
		this.identificador = identificador;
	}

	// Metodos
	public Identificador getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

	@Override
	public String toString() {
		StringBuilder declaracaoInclude = new StringBuilder();
		
		declaracaoInclude.append("#include <");
		declaracaoInclude.append(this.getIdentificador());
		declaracaoInclude.append(".h>");
		
		return declaracaoInclude.toString();
	}
}
