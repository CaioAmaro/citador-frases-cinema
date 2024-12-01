package caioamaro.citador_frases_cinema.service;

import caioamaro.citador_frases_cinema.dto.CitacaoDTO;
import caioamaro.citador_frases_cinema.model.Citacao;
import caioamaro.citador_frases_cinema.repository.CitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServiceCitacao {

    @Autowired
    private CitacaoRepository repository;

    private int contador = 0;

    public CitacaoDTO obterTodasCitacoes(){

        List<CitacaoDTO> listaDeCitacoes = repository.findAll().stream()
                .map(c -> new CitacaoDTO(c.getTitulo(), c.getFrase(), c.getTitulo(), c.getPoster()))
                .collect(Collectors.toList());

        if(contador > listaDeCitacoes.size()-1){
            contador = 0;
        }

        return listaDeCitacoes.get(contador++);
    }

}
