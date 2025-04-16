package com.example.CIientemprestimolivro.repository;

import com.example.CIientemprestimolivro.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepo extends JpaRepository<Livro, Long> {

}
