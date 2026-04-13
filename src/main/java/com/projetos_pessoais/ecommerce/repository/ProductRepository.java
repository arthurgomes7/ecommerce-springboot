package com.projetos_pessoais.ecommerce.repository;

import com.projetos_pessoais.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findProductByName(String name);
}
