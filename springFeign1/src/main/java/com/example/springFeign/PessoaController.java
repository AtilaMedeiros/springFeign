package com.example.springFeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    @GetMapping
    public Pessoa getPessoa(){
        return Pessoa.builder()
                .id(1L)
                .nome("Fulano")
                .idade(30)
                .build();
    }


}
