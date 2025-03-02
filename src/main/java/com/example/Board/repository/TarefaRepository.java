package com.example.Board.repository;

import com.example.Board.model.TarefasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TarefaRepository extends JpaRepository<TarefasModel, Long> {
}
