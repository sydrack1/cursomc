package edu.guru.sydrack.cursomc.services;

import edu.guru.sydrack.cursomc.domain.Categoria;
import edu.guru.sydrack.cursomc.repositories.CategoriaRepository;
import edu.guru.sydrack.cursomc.services.exceptions.ObjectNotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired//instancia automaticamente o repositorie
    private CategoriaRepository repo;
    
    public Categoria find(Integer id){
        Optional<Categoria> obj = repo.findById(id); 
         return obj.orElseThrow(() -> new ObjectNotFoundException(
             "Objeto não encontrado! Id: " + id + 
         ", Tipo: " + Categoria.class.getName())); 
    }
    
}