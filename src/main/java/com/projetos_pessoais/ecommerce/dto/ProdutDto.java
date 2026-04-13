package com.projetos_pessoais.ecommerce.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ProdutDto {

    @NotBlank
    private String name;
    @NotNull
    private Double price;
}
