package edu.guru.sydrack.cursomc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import edu.guru.sydrack.cursomc.domain.Categoria;
import edu.guru.sydrack.cursomc.repositories.CategoriaRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
 

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository catR;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		catR.saveAll(Arrays.asList(cat1, cat2));
	}

}
