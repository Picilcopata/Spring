package com.example.todo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.todo.entity.Tarefa;

public interface TarefaRepository extends CrudRepository<Tarefa, Long>{

    @SuppressWarnings("null")
    @Override
    List <Tarefa> findAll();
    
}
