package com.projetos_pessoais.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projetos_pessoais.ecommerce.model.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double totalValue;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "costumer_id", nullable = false)
    private Costumer consumer;

    private Instant date;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @OneToMany
    @JoinTable(
            name = "tb_order_product",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<Product> products = new HashSet<>();
}
