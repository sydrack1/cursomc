package edu.guru.sydrack.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.guru.sydrack.cursomc.domain.Cidade;

// Esse repository é a mesma coisa do famoso dao
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
    
}