package com.projetos_pessoais.ecommerce.repository;

import com.projetos_pessoais.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
