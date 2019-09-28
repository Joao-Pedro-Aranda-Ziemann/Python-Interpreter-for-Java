package pacote;

import java.io.File;
import java.util.ArrayList;

public class Python3 {
	private static ArrayList<String> Lista_comandos = new ArrayList<String>();
	private static ArrayList<String> Lista_comandos2 = new ArrayList<String>();
	private Interpretador EI;
	private String caminho_python3;
	private String comandos = "";
	private String retorno = "";
	private File file;

	public Python3() {
		this.caminho_python3 = "/usr/bin/python3";
	}

	public Python3(String caminho_python3) {
		if (caminho_python3 == null) {
			this.caminho_python3 = "/usr/bin/python3";
		} else {
			this.caminho_python3 = caminho_python3;
		}
	}

	public void ᐷᐷᐷ(String comando) {
		if (!Lista_comandos.contains(this.caminho_python3)) {
			Lista_comandos.add(this.caminho_python3);
			Lista_comandos.add("-c");
		}
		this.comandos = (this.comandos + comando + "\n");
	}

	public void ooo(String comando) {
		comando = comando.replace("\t", "");

		this.comandos = (this.comandos + "\t" + comando + "\n");
	}

	public String Run(boolean Print_na_Tela) {
		try {
			Lista_comandos.add(this.comandos);

			this.EI = new Interpretador();
			this.retorno = this.EI.executandoComandos(Lista_comandos, Print_na_Tela);
			Lista_comandos.clear();
		} catch (Exception e) {
			this.retorno = e.toString();
		}
		return this.retorno;
	}

	public String PyRun(String caminho, boolean Print_na_Tela) {
		try {
			this.file = new File(caminho);
			if (this.file.exists()) {
				Lista_comandos2.clear();

				Lista_comandos2.add(this.caminho_python3);
				Lista_comandos2.add(caminho);

				this.EI = new Interpretador();
				this.retorno = this.EI.executandoComandos(Lista_comandos2, Print_na_Tela);

				Lista_comandos2.clear();
			} else {
				this.retorno = "file does not exist!";
			}
		} catch (Exception e) {
			this.retorno = e.toString();
		}
		return this.retorno;
	}
}
