package com.example.CIientemprestimolivro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LivroDTO {
    private Long idLivro;
    private String nome;
    private String autor;
    private int isbn;
    private String genero;
}
