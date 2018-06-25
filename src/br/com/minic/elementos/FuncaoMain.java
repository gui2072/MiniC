package br.com.minic.elementos;

import java.util.List;

public class FuncaoMain {

	// Atributos
	private Tipo tipoMain;
	private List<IComando> comandos;
	private TipoRetorno retorno;

	// Construtor
	public FuncaoMain(Tipo tipoMain, List<IComando> comandos, TipoRetorno retorno) {
		this.setTipoMain(tipoMain);
		this.setComandos(comandos);
		this.setRetorno(retorno);
	}

	// Metodos
	public Tipo getTipoMain() {
		return tipoMain;
	}

	public void setTipoMain(Tipo tipoMain) {
		this.tipoMain = tipoMain;
	}
	
	public List<IComando> getComandos() {
		return comandos;
	}

	public void setComandos(List<IComando> comandos) {
		this.comandos = comandos;
	}

	public TipoRetorno getRetorno() {
		return retorno;
	}

	public void setRetorno(TipoRetorno retorno) {
		this.retorno = retorno;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(getTipoMain() + " main () {\n");

		int len = this.getComandos().size();
		
		for (int x = 0; x < len; x++) {
			builder.append((this.getComandos().get(x)).toString());
			
			if (x != len-1) {
				builder.append("\n");				
			}
		}
		
		if (this.getRetorno() != null) {
			builder.append("return " + getRetorno() + ";");
		}

		builder.append("\n}");

		return builder.toString();
	}
}
