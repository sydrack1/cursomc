package edu.guru.sydrack.cursomc.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria implements Serializable{
    
    private static final long serialVersionUID = 1L;
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    // Construtores
    public Categoria(){ //Vazio
    }
    public Categoria(Integer id, String nome){
        super();
        this.id = id;
        this.nome = nome;
    }
    // Getters e Setters
    public Integer getId() {
        return id;
    } 
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // hashCode e equals
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}