package pacote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Interpretador {

	private ProcessBuilder processBuilder;
	private Process process;
	private InputStream inputStream;
	private InputStreamReader inputStreamReader;

	private String linha;
	private String retorno;

	public String executandoComandos(ArrayList<String> comandos, boolean print) throws IOException {

		processBuilder = new ProcessBuilder(comandos);
		process = processBuilder.start();
		inputStream = process.getInputStream();
		inputStreamReader = new InputStreamReader(inputStream);

		try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

			while ((linha = bufferedReader.readLine()) != null) {

				if (print) {

					System.out.println(linha);
				}

				retorno = linha;
			}

			return retorno;

		} catch (Exception e) {
			System.out.println(e);

			retorno = e.toString();
			return retorno;
		}
	}
}
