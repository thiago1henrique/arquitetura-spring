package io.github.thiago.arquiteturaspring.escola.service;

import io.github.thiago.arquiteturaspring.escola.model.Aluno;
import io.github.thiago.arquiteturaspring.escola.model.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public List<Aluno> buscarAlunos() {
        return repository.findAll();
    }

    public Aluno buscarAlunoPorMatricula(int matricula) {
        return repository.findById(matricula).orElse(null);
    }
}
