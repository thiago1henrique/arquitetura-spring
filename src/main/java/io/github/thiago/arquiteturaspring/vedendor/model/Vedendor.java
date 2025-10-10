package io.github.thiago.arquiteturaspring.vedendor.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_vedendor")
public class Vedendor {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
