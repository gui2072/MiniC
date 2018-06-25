package br.com.minic.elementos;

import java.util.List;

public class ProgramaMiniC {
	
	//Atributos
	private List<DeclaracaoInclude> declaracaoIncludes;
	private FuncaoMain funcaoMain;
	private List<DeclaracaoFuncao> declaracaoFuncaos;

	//Construtor
	public ProgramaMiniC(List<DeclaracaoInclude> declaracaoIncludes, FuncaoMain funcaoMain,
			List<DeclaracaoFuncao> declaracaoFuncaos) {
		this.declaracaoIncludes = declaracaoIncludes;
		this.funcaoMain = funcaoMain;
		this.declaracaoFuncaos = declaracaoFuncaos;
	}

	//Metodos
	public List<DeclaracaoInclude> getDeclaracaoIncludes() {
		return declaracaoIncludes;
	}

	public void setDeclaracaoIncludes(List<DeclaracaoInclude> declaracaoIncludes) {
		this.declaracaoIncludes = declaracaoIncludes;
	}

	public FuncaoMain getFuncaoMain() {
		return funcaoMain;
	}

	public void setFuncaoMain(FuncaoMain funcaoMain) {
		this.funcaoMain = funcaoMain;
	}

	public List<DeclaracaoFuncao> getDeclaracaoFuncaos() {
		return declaracaoFuncaos;
	}

	public void setDeclaracaoFuncaos(List<DeclaracaoFuncao> declaracaoFuncaos) {
		this.declaracaoFuncaos = declaracaoFuncaos;
	}

	@Override
	public String toString() {
		StringBuilder programaMiniC = new StringBuilder();
		
		if (declaracaoIncludes != null) {
			for (DeclaracaoInclude declaracaoInclude:declaracaoIncludes) {
				programaMiniC.append(declaracaoInclude.toString());
				programaMiniC.append("\n");
			}
		}
		
		programaMiniC.append("\n");
		programaMiniC.append(this.funcaoMain.toString());
		programaMiniC.append("\n\n");

		if (declaracaoFuncaos != null) {
			for (DeclaracaoFuncao declaracaoFuncao:declaracaoFuncaos) {
				programaMiniC.append(declaracaoFuncao.toString());
				programaMiniC.append("\n");
			}
		}

		return programaMiniC.toString();
	}
}
