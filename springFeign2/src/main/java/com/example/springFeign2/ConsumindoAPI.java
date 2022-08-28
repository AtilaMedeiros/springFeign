package com.example.springFeign2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "Fulano", url="http://localhost:8080/pessoa")
public interface ConsumindoAPI {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    Pessoa retornarPessoa();


}
