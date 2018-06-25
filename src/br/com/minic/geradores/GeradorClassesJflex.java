package br.com.minic.geradores;

import java.io.File;

public class GeradorClassesJflex {

	public static void main(String[] args) {

		jflex.Main.generate(new File("especificacoes/MiniC.flex"));

		try {

			System.out.println("\n\n------------------- Movendo arquivo gerado -------------------");

			String file_name = "AnalisadorLexico.java";
			File file = new File(file_name);
			File new_file = new File("src/br/com/minic/" + file_name);
			file.renameTo(new_file);
			System.out.println("  Aquivo: " + file.getPath() + " -> " + new_file.getPath());

		} catch (Exception e) {
			System.out.println("   Erro ao mover arquivo");
		}
	}
}
