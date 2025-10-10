package io.github.thiago.arquiteturaspring.escola.api;

import io.github.thiago.arquiteturaspring.escola.model.Aluno;
import io.github.thiago.arquiteturaspring.escola.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @PostMapping
    public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
        return this.service.salvar(aluno);
    }

    @GetMapping
    public List<Aluno> buscarAlunos() {
        return service.buscarAlunos();
    }

    @GetMapping("{matricula}")
    public Aluno buscarAlunoPorMatricula(@PathVariable int matricula) {
        return service.buscarAlunoPorMatricula(matricula);
    }
}
