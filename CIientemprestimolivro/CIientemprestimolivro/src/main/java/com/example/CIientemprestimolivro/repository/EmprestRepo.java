package com.example.CIientemprestimolivro.repository;

import com.example.CIientemprestimolivro.entity.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestRepo extends JpaRepository<Emprestimo, Long> {
}
