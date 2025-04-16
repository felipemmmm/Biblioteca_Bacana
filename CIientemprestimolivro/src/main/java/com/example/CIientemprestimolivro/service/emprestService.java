package com.example.CIientemprestimolivro.service;

// classe service onde fica todas as regras de negócio e faz a comunição com o banco de dados(repository)

import com.example.CIientemprestimolivro.dto.ClienteDTO;
import com.example.CIientemprestimolivro.dto.EmprestimoDTO;
import com.example.CIientemprestimolivro.entity.Emprestimo;
import com.example.CIientemprestimolivro.repository.EmprestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class emprestService {

    //Comunicação entre service e a próxima camada (repository)
    @Autowired
    private EmprestRepo emprestRepo;

    //getAll
    public List<Emprestimo> getAllEmprestimos() {
        return emprestRepo.findAll();
    }

    public Optional<EmprestimoDTO> getById(Long id) {
        Optional<Emprestimo> emprestimoOptional = emprestRepo.findById(id);
        if(emprestimoOptional.isPresent()){
            EmprestimoDTO produtoDTO = new EmprestimoDTO();
            return Optional.of(produtoDTO.fro
        } else {
            return Optional.empty();

        }
    }

}
