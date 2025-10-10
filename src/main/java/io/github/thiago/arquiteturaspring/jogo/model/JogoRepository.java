package io.github.thiago.arquiteturaspring.jogo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogo, Integer> {
}
