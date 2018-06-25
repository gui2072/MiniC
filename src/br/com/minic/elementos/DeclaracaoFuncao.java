package br.com.minic.elementos;

import java.util.List;

public class DeclaracaoFuncao {

	// Atributos
	private Tipo tipo;
	private String identificador;
	private List<DeclaracaoParametro> parametros;
	private IExpressao expressao;
	private List<IComando> comandos;

	// Construtor
	public DeclaracaoFuncao(Tipo tipo, String identificador, List<DeclaracaoParametro> parametros,
			IExpressao expressao, List<IComando> comandos) {
		this.setTipo(tipo);
		this.setIdentificador(identificador);
		this.setParametros(parametros);
		this.setExpressao(expressao);
		this.setComandos(comandos);
	}

	// Metodos
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public List<DeclaracaoParametro> getParametros() {
		return parametros;
	}

	public void setParametros(List<DeclaracaoParametro> parametros) {
		this.parametros = parametros;
	}

	public IExpressao getExpressao() {
		return expressao;
	}

	public void setExpressao(IExpressao expressao) {
		this.expressao = expressao;
	}

	public List<IComando> getComandos() {
		return comandos;
	}

	public void setComandos(List<IComando> comandos) {
		this.comandos = comandos;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();

		builder.append(this.getTipo().toString());
		builder.append(" ");
		builder.append(this.getIdentificador());
		builder.append("(");
		
		if (this.getParametros() != null) {
			int totalParametros = this.getParametros().size();
			int totalParametrosMenos1 = totalParametros - 1;

			for (int i = 0; i < totalParametros; i++) {
				DeclaracaoParametro declaracaoParametro = this.getParametros().get(i);
				builder.append(declaracaoParametro.toString());

				if (i < totalParametrosMenos1) {
					builder.append(", ");
				}
			}
		}

		builder.append(") {\n");

		int len = this.getComandos().size();
		
		for (int x = 0; x < len; x++) {
			builder.append((this.getComandos().get(x)).toString());
			
			if (x != len-1) {
				builder.append("\n");				
			}
		}
		
		builder.append("return ");
		builder.append(getExpressao().toString());
		builder.append(";\n}");

		return builder.toString();
	}
}
