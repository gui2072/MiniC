package br.com.minic.elementos;

public class ComandoIfElse implements IComando {

	// Atributos
	private IExpressao expressao;
	private IComando comando1;
	private IComando comando2;

	// Constutor
	public ComandoIfElse(IExpressao expressao, IComando comando1, IComando comando2) {
		this.expressao = expressao;
		this.comando1 = comando1;
		this.comando2 = comando2;
	}

	// Metodos
	public IExpressao getExpressao() {
		return expressao;
	}

	public void setExpressao(IExpressao expressao) {
		this.expressao = expressao;
	}

	public IComando getComando1() {
		return comando1;
	}

	public void setComando1(IComando comando1) {
		this.comando1 = comando1;
	}

	public IComando getComando2() {
		return comando2;
	}

	public void setComando2(IComando comando2) {
		this.comando2 = comando2;
	}

	@Override
	public void setParenteses(boolean parenteses) {
	}

	@Override
	public String toString() {
		StringBuilder comandoIf = new StringBuilder();

		comandoIf.append("if (");
		comandoIf.append(this.getExpressao());
		comandoIf.append(")\n");
		comandoIf.append(this.getComando1());
		comandoIf.append("\nelse\n");
		comandoIf.append(this.getComando2());

		return comandoIf.toString();
	}
}
