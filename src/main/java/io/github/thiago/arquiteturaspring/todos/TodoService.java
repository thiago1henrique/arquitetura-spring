package io.github.thiago.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository repository;
    private final MailSender mailSender;
    private final TodoValidator validator;

    public TodoService(TodoRepository repository, MailSender mailSender, TodoValidator validator) {
        this.repository = repository;
        this.mailSender = mailSender;
        this.validator = validator;
    }

    public TodoEntity salvar(TodoEntity novoTodo) {
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todo) {
        repository.save(todo);
        String status = todo.getConcluido() == Boolean.TRUE ? "Concluído" : "Não concluído";
        mailSender.enviar("Todo " + todo.getDescricao() + " foi atualizado para:" + status);
    }

    public TodoEntity buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<TodoEntity> buscarTodos() {
        return repository.findAll();
    }
}
