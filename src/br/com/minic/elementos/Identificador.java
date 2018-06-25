package br.com.minic.elementos;

public class Identificador implements IExpressao {

	// Atributos
	private String nome;

	// Construtor
	public Identificador(String nome) {
		this.setNome(nome);
	}

	// Metodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void setParenteses(boolean parenteses) {
	}
	
	@Override
	public String toString() {
		return this.getNome();
	}
}
