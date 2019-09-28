package pacote;

import java.io.File;
import java.util.ArrayList;

public class Python2 {

	private static final ArrayList<String> Lista_comandos = new ArrayList<String>();
	private Interpretador EI;
	private String caminho_python2;
	private String comandos = "";
	private String retorno = "";
	private File file;

	public Python2() {
		this.caminho_python2 = "/usr/bin/python2";
	}

	public Python2(String caminho_python2) {
		if (caminho_python2 == null) {
			this.caminho_python2 = "/usr/bin/python2";
		} else {
			this.caminho_python2 = caminho_python2;
		}
	}

	public void ᐷᐷᐷ(String comando) {
		if (!Lista_comandos.contains(this.caminho_python2)) {
			Lista_comandos.add(this.caminho_python2);
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
				Lista_comandos.clear();
				Lista_comandos.add(this.caminho_python2);
				Lista_comandos.add(caminho);

				this.EI = new Interpretador();
				this.retorno = this.EI.executandoComandos(Lista_comandos, Print_na_Tela);
				Lista_comandos.clear();
			} else {
				this.retorno = "file does not exist!";
			}
		} catch (Exception e) {
			this.retorno = e.toString();
		}
		return this.retorno;
	}
}
