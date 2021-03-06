package edu.guru.sydrack.cursomc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import edu.guru.sydrack.cursomc.domain.Categoria;
import edu.guru.sydrack.cursomc.domain.Cidade;
import edu.guru.sydrack.cursomc.domain.Cliente;
import edu.guru.sydrack.cursomc.domain.Endereco;
import edu.guru.sydrack.cursomc.domain.Estado;
import edu.guru.sydrack.cursomc.domain.Produto;
import edu.guru.sydrack.cursomc.domain.enums.TipoCliente;
import edu.guru.sydrack.cursomc.repositories.CategoriaRepository;
import edu.guru.sydrack.cursomc.repositories.CidadeRepository;
import edu.guru.sydrack.cursomc.repositories.ClienteRepository;
import edu.guru.sydrack.cursomc.repositories.EnderecoRepository;
import edu.guru.sydrack.cursomc.repositories.EstadoRepository;
import edu.guru.sydrack.cursomc.repositories.ProdutoRepositorie;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository catR;
	@Autowired
	private ProdutoRepositorie pR;
	@Autowired
	private EstadoRepository estR;
	@Autowired
	private CidadeRepository cR;
	@Autowired
	private ClienteRepository cliR;
	@Autowired
	private EnderecoRepository eR;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);

		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "36378912377", TipoCliente.PESSOAFISICA);

		Endereco e1 = new Endereco(null,"Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, c1);
		Endereco e2 = new Endereco(null,"Avenida Martins", "105", "Sala 800", "Centro", "38777012", cli1, c2);


		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2,c3));

		catR.saveAll(Arrays.asList(cat1, cat2));
		pR.saveAll(Arrays.asList(p1,p2,p3));
		
		estR.saveAll(Arrays.asList(est1,est2));
		cR.saveAll(Arrays.asList(c1,c2,c3));

		cli1.getTelefones().addAll(Arrays.asList("27363323","93838393"));
		cli1.getEnderecos().addAll(Arrays.asList(e1,e2));
		cliR.saveAll(Arrays.asList(cli1));

		eR.saveAll(Arrays.asList(e1,e2));
		
		
	}

}
