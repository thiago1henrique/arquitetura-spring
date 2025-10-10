package io.github.thiago.arquiteturaspring.jogo.service;

import io.github.thiago.arquiteturaspring.jogo.model.Jogo;
import io.github.thiago.arquiteturaspring.jogo.model.JogoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    private JogoRepository repository;

    public JogoService(JogoRepository repository) {
        this.repository = repository;
    }

    public Jogo criarJogo(Jogo jogo) {
        return repository.save(jogo);
    }

    public Jogo editarJogo(Jogo jogo) {
        return repository.save(jogo);
    }

    public List<Jogo> listarJogos() {
        return repository.findAll();
    }
}
