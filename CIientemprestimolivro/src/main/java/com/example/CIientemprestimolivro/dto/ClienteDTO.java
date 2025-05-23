package com.example.CIientemprestimolivro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO implements Serializable {

    private Long id;

    private String nome;
    private String sobrenome;
    private String cpf;

}
