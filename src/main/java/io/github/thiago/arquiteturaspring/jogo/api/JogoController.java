package io.github.thiago.arquiteturaspring.jogo.api;


import io.github.thiago.arquiteturaspring.jogo.model.Jogo;
import io.github.thiago.arquiteturaspring.jogo.service.JogoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    private JogoService service;

    public JogoController(JogoService service) {
        this.service = service;
    }

    @PostMapping
    public Jogo criarJogo(@RequestBody Jogo jogo) {
        return service.criarJogo(jogo);
    }

    @GetMapping
    public List<Jogo> listarJogos() {
        return service.listarJogos();
    }

    @PutMapping("{id}")
    public Jogo editarJogo(@PathVariable("id") int id, @RequestBody Jogo jogo) {
        jogo.setId(id);
        return service.editarJogo(jogo);
    }
}
