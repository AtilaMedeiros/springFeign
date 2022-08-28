package com.example.springFeign;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pessoa {

    private Long id;
    private String nome;
    private int idade;
}
