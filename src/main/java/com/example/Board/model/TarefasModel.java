package com.example.Board.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_tarefas")
public class TarefasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String titulo;

    @Column(length = 1200, nullable = false)
    private String descricao;

    @Column(length = 20, nullable = false)
    private String status;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

}
