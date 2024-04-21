package com.example.todo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Tarefas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "Tarefa")
    private String nomeTarefa;

    @Column(name = "Descricao")
    private String descricao;

    @Column(name = "dataCriacao")
    private LocalDate dataCriacao;

    public Tarefa(String nomeTarefa, String descricao, LocalDate dataCriacao) {
        this.nomeTarefa = nomeTarefa;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
    }
}
