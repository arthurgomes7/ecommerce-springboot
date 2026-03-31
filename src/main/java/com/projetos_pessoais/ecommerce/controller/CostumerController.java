package com.projetos_pessoais.ecommerce.controller;

import com.projetos_pessoais.ecommerce.model.Costumer;
import com.projetos_pessoais.ecommerce.service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/v1")
@RestController
public class CostumerController {

    @Autowired
    private CostumerService service;

    @GetMapping
    public List<Costumer> findAll(){
        return service.findAll();
    }

}
