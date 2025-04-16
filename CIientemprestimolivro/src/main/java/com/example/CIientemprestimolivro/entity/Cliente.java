package com.example.CIientemprestimolivro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

//nao esquecer do onetomany e tal

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   ArrayList<Livro> livros = new ArrayList<Livro>();
   private String nome;
   private String sobrenome;
   @Column(unique = true) // Garante que o CPF seja único no banco
   private int cpf;


}
