package com.example.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.entity.Tarefa;
import com.example.todo.repository.TarefaRepository;

@RestController
@RequestMapping()
public class TarefaController {
    
    @Autowired
    private TarefaRepository acoes;

    @PostMapping("/criarTarefa")
    public Tarefa cadastrarTarefa(@RequestBody Tarefa tarefa){
        return acoes.save(tarefa);
    }

    @GetMapping("/tarefas")
    public List<Tarefa> listar(){
        return acoes.findAll();
    }
    
    @PutMapping("/atualizarTarefa")
    public Tarefa atualizarTarefa(@RequestBody Tarefa tarefa){
        return acoes.save(tarefa);
    }

    @DeleteMapping("/excluirTarefa/{id}")
    public void excluir(@PathVariable Long id){
        acoes.deleteById(id);
    }
}
