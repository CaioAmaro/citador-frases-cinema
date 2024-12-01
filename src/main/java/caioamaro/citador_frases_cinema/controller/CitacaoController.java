package caioamaro.citador_frases_cinema.controller;

import caioamaro.citador_frases_cinema.dto.CitacaoDTO;
import caioamaro.citador_frases_cinema.service.ServiceCitacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("series")
public class CitacaoController {

    @Autowired
    private ServiceCitacao service;

    @GetMapping("/frases")
    public CitacaoDTO obterTodasCitacoes(){
        return service.obterTodasCitacoes();
    }
}
