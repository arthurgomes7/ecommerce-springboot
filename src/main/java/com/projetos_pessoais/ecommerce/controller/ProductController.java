package com.projetos_pessoais.ecommerce.controller;


import com.projetos_pessoais.ecommerce.dto.ProdutDto;
import com.projetos_pessoais.ecommerce.model.Product;
import com.projetos_pessoais.ecommerce.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/products")
@RequiredArgsConstructor
@Validated
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/name/{productName}")
    @ResponseStatus(HttpStatus.OK)
    public Product findProductByName(@PathVariable String productName){
        return productService.findProductByName(productName);
    }

    @GetMapping("/id/{productId}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Product> findProductById(@PathVariable Long productId){
        return productService.findById(productId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveProduct(@RequestBody @Valid ProdutDto produtDto){
        productService.save(produtDto);
    }
}
