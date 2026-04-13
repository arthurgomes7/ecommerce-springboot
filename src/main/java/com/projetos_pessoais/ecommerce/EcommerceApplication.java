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
}
