package com.example.CIientemprestimolivro.dto;

import com.example.CIientemprestimolivro.entity.Cliente;
import com.example.CIientemprestimolivro.entity.Emprestimo;
import com.example.CIientemprestimolivro.entity.Livro;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmprestimoDTO implements Serializable {

    private Long id;
    private LocalDateTime dataInicial;
    private LocalDateTime dataFinal;
    private Set<Livro> livros;
    private Cliente cliente;

    public Emprestimo toEmprestimo() {
        return new Emprestimo(
                this.id,
                this.dataInicial,
                this.dataFinal,
                this.livros,
                this.getCliente()
        );
    }

}
