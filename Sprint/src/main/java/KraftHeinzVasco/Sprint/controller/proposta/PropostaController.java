package KraftHeinzVasco.Sprint.controller.proposta;

import KraftHeinzVasco.Sprint.domain.proposta.proposta.DadosListagemProposta;
import KraftHeinzVasco.Sprint.domain.proposta.proposta.DadosCadastroProposta;
import KraftHeinzVasco.Sprint.domain.proposta.proposta.DadosDetalhamentoProposta;
import KraftHeinzVasco.Sprint.domain.proposta.proposta.Proposta;
import KraftHeinzVasco.Sprint.domain.proposta.proposta.PropostaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("propostas")
public class PropostaController {

    @Autowired
    private PropostaRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroProposta dados, UriComponentsBuilder uriBuilder ){
        var proposta = new Proposta(dados);
        repository.save(proposta);

        var uri = uriBuilder.path("/propostas/{id}").buildAndExpand(proposta.getId()).toUri();


        return ResponseEntity.created(uri).body(new DadosDetalhamentoProposta(proposta));


    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemProposta>> listar(@PageableDefault Pageable paginicao) {
        var page = repository.findAll(paginicao).map(DadosListagemProposta::new);
        return ResponseEntity.ok(page);
    }






}
