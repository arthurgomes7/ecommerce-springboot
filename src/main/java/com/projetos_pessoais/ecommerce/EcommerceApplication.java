package com.projetos_pessoais.ecommerce;

import com.projetos_pessoais.ecommerce.model.Costumer;
import com.projetos_pessoais.ecommerce.model.Order;
import com.projetos_pessoais.ecommerce.model.Product;
import com.projetos_pessoais.ecommerce.model.enums.OrderStatus;
import com.projetos_pessoais.ecommerce.repository.CostumerRepository;
import com.projetos_pessoais.ecommerce.repository.OrderRepository;
import com.projetos_pessoais.ecommerce.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;
import java.util.Set;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(
			CostumerRepository costumerRepository,
			ProductRepository productRepository,
			OrderRepository orderRepository
	) {
		return args -> {
			if (costumerRepository.count() > 0 || productRepository.count() > 0 || orderRepository.count() > 0) {
				return;
			}

			Costumer maria = new Costumer();
			maria.setName("Maria Silva");
			maria.setEmail("maria@email.com");

			Costumer joao = new Costumer();
			joao.setName("Joao Souza");
			joao.setEmail("joao@email.com");

			costumerRepository.saveAll(Set.of(maria, joao));

			Product notebook = new Product();
			notebook.setName("Notebook");
			notebook.setPrice(3500.0);

			Product mouse = new Product();
			mouse.setName("Mouse Gamer");
			mouse.setPrice(150.0);

			Product teclado = new Product();
			teclado.setName("Teclado Mecanico");
			teclado.setPrice(280.0);

			productRepository.saveAll(Set.of(notebook, mouse, teclado));

			Order order1 = new Order();
			order1.setTotalValue(3650.0);
			order1.setConsumer(maria);
			order1.setDate(Instant.now());
			order1.setOrderStatus(OrderStatus.PAID);
			order1.setProducts(Set.of(notebook, mouse));

			Order order2 = new Order();
			order2.setTotalValue(280.0);
			order2.setConsumer(joao);
			order2.setDate(Instant.now());
			order2.setOrderStatus(OrderStatus.WAITING_PAYMENT);
			order2.setProducts(Set.of(teclado));

			orderRepository.saveAll(Set.of(order1, order2));
		};
	}

}
