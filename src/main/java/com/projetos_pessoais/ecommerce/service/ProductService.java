package com.projetos_pessoais.ecommerce.service;

import com.projetos_pessoais.ecommerce.dto.ProdutDto;
import com.projetos_pessoais.ecommerce.model.Product;
import com.projetos_pessoais.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public void save(ProdutDto produtDto){
        productRepository.save(Product.builder()
                .name(produtDto.getName())
                .price(produtDto.getPrice())
                .build());
    }

    public Product findProductByName(String name){
        return productRepository.findProductByName(name);
    }

    public Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }
}
