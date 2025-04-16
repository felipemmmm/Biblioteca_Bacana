package com.example.CIientemprestimolivro.repository;

import com.example.CIientemprestimolivro.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository<Cliente, Long> {
}
