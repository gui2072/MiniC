package br.com.minic.elementos;

import java.util.List;

public class ComandoPreferencial implements IComando {

	// Atributos
	private List<IComando> comandos;
	private boolean parenteses;

	// Construtor
	public ComandoPreferencial(List<IComando> comandos, boolean parenteses) {
		this.comandos = comandos;
		this.parenteses = parenteses;
	}

	// Metodos
	public List<IComando> getComandos() {
		return comandos;
	}

	public void setComandos(List<IComando> comandos) {
		this.comandos = comandos;
	}

	public boolean isParenteses() {
		return parenteses;
	}

	@Override
	public void setParenteses(boolean parenteses) {
		this.parenteses = parenteses;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		if (this.isParenteses()) {
			builder.append("(");
		}

		if (this.getComandos() != null) {
			for (IComando comando : this.getComandos()) {
				builder.append(comando);
			}
		}

		if (this.isParenteses()) {
			builder.append(")");
		}

		return builder.toString();
	}
}
