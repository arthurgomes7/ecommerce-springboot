package com.projetos_pessoais.ecommerce.service;

import com.projetos_pessoais.ecommerce.model.Costumer;
import com.projetos_pessoais.ecommerce.repository.CostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostumerService {

    @Autowired
    private CostumerRepository repository;

    public List<Costumer> findAll(){
        return repository.findAll();
    }
}
