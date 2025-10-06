package io.github.thiago.arquiteturaspring;

//camadas
// -> repository
// -> service
// -> controller

import io.github.thiago.arquiteturaspring.todos.*;
import jakarta.persistence.EntityManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;

public class ExemploInjecaoDepedencia {
    public static void main(String[] args) throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("url");
        dataSource.setUsername("user");
        dataSource.setPassword("password");

        Connection connection = dataSource.getConnection();

        EntityManager entityManager = null;

        TodoRepository repository = null;//new SimpleJpaRepository<TodoEntity, Integer>(null, null);
        TodoValidator todoValidator = new TodoValidator(repository);
        MailSender sender = new MailSender();

        TodoService todoService = new TodoService(repository, sender, todoValidator);
    }
}
