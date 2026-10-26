package com.kezya.olasring;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    private final ContatoRepository repository;

    public ContatoController(ContatoRepository repository) {
        this.repository = repository;
    }

    // READ - lista todos
    @GetMapping
    public List<Contato> listar() {
        return repository.findAll();
    }

    // READ - busca por nome (derived query!)
    @GetMapping("/buscar")
    public List<Contato> buscarPorNome(@RequestParam String nome) {
        return repository.findByNome(nome);
    }

    // CREATE - cria um novo
    @PostMapping
    public Contato criar(@RequestBody Contato contato) {
        return repository.save(contato);
    }

    // READ - busca por id
    @GetMapping("/{id}")
    public Contato buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // UPDATE - atualiza
    @PutMapping("/{id}")
    public Contato atualizar(@PathVariable Long id, @RequestBody Contato contato) {
        contato.setId(id);
        return repository.save(contato);
    }

    // DELETE - remove
    @DeleteMapping("/{id}")
    public String remover(@PathVariable Long id) {
        repository.deleteById(id);
        return "Contato removido!";
    }
}
