package edu.guru.sydrack.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.guru.sydrack.cursomc.domain.Produto;

@Repository
public interface ProdutoRepositorie extends JpaRepository<Produto, Integer> {

}