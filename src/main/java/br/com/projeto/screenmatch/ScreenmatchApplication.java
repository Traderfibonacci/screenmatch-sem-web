package br.com.projeto.screenmatch;

import br.com.projeto.screenmatch.model.DadosSerie;
import br.com.projeto.screenmatch.service.ConsumoApi;
import br.com.projeto.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi  = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=breaking+bad&apikey=6585022c");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDadis(json, DadosSerie.class);
		System.out.println(dados);
	}
}
