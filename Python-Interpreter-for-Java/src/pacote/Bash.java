package pacote;

import java.io.File;
import java.util.ArrayList;

public class Bash {
	private static ArrayList<String> Lista_comandos = new ArrayList<String>();
	private static ArrayList<String> Lista_comandos2 = new ArrayList<String>();
	private Interpretador EI;
	private String caminho_bash;
	private String retorno = "";
	private File file;

	public Bash() {
		this.caminho_bash = "/bin/bash";
	}

	public Bash(String caminho_bash) {

		if (caminho_bash == null) {
			this.caminho_bash = "/bin/bash";
		} else {
			this.caminho_bash = caminho_bash;
		}
	}

	public String shell(String comando, boolean Print_na_Tela) {
		try {
			if (!Lista_comandos.contains(this.caminho_bash)) {
				Lista_comandos.add(this.caminho_bash);
				Lista_comandos.add("-c");
			}
			Lista_comandos.add(comando);

			this.EI = new Interpretador();
			this.retorno = this.EI.executandoComandos(Lista_comandos, Print_na_Tela);
			Lista_comandos.clear();
		} catch (Exception e) {
			this.retorno = e.toString();
		}
		return this.retorno;
	}

	public String ShRun(String caminho, boolean Print_na_Tela) {
		try {
			this.file = new File(caminho);
			if (this.file.exists()) {
				Lista_comandos2.clear();

				Lista_comandos2.add(this.caminho_bash);
				Lista_comandos2.add(caminho);

				this.EI = new Interpretador();
				this.retorno = this.EI.executandoComandos(Lista_comandos2, Print_na_Tela);
			} else {
				this.retorno = "file does not exist!";
			}
		} catch (Exception e) {
			this.retorno = e.toString();
		}
		return this.retorno;
	}
}
