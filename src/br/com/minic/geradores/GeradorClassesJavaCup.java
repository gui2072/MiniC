package br.com.minic.geradores;

import java.io.File;
import java.io.IOException;

import java_cup.internal_error;

public class GeradorClassesJavaCup {

	public static void main(String[] args) throws internal_error, IOException, Exception {

		String[] argumentos = new String[] { "especificacoes/MiniC.cup" };

		java_cup.Main.main(argumentos);

		try {
			String[] files = new String[] { "parser.java", "sym.java" };

			System.out.println("\n\n------------------- Movendo arquivos gerados -------------------");

			for (String file_name : files) {
				File file = new File(file_name);
				File new_file = new File("src/br/com/minic/" + file_name);
				file.renameTo(new_file);
				System.out.println("  Aquivo: " + file.getPath() + " -> " + new_file.getPath());
			}

		} catch (Exception e) {
			System.out.println("   Erro ao mover arquivos");
		}
	}
}
