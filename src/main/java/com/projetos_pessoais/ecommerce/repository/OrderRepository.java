package com.projetos_pessoais.ecommerce.repository;

import com.projetos_pessoais.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
