package com.example.CIientemprestimolivro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

@NoArgsConstructor
@Data
@Entity
public class Emprestimo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataInicial;
    private LocalDateTime dataFinal;
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private Cliente cliente;

    public Emprestimo(Long id, LocalDateTime dataInicial, LocalDateTime dataFinal) {
        this.id = id;
        this.dataInicial = LocalDateTime.now();  // Atribuindo o valor da data atual
        this.dataFinal = dataInicial.plusWeeks(2); //Soma 2 semana a partir da data inicial
    }


}
