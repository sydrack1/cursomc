package edu.guru.sydrack.cursomc.domain;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import edu.guru.sydrack.cursomc.domain.enums.TipoCliente;

@Entity
public class Cliente implements Serializable{
    
    private static final long serialVersionUID = 1L;
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String cpfOuCnpj;
    private Integer tipo;   
    @OneToMany(mappedBy="cliente")
    private List<Endereco> enderecos = new ArrayList<>();
    @ElementCollection
    @CollectionTable(name="TELEFONE")
    private Set<String> telefones = new HashSet<>();
    //CONSTRUTORES
    public Cliente(){}

    public Cliente(Integer id, String nome, String email, String cpfOuCnpj, TipoCliente tipo){
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = tipo.getCod();
    }
    /**
     * @return the cpfOuCnpj
     */
    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }
    /**
     * @param cpfOuCnpj the cpfOuCnpj to set
     */
    public void setCpfOuCnpj(String cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return the enderecos
     */
    public List<Endereco> getEnderecos() {
        return enderecos;
    }
    /**
     * @param enderecos the enderecos to set
     */
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return the telefones
     */
    public Set<String> getTelefones() {
        return telefones;
    }
    /**
     * @param telefones the telefones to set
     */
    public void setTelefones(Set<String> telefones) {
        this.telefones = telefones;
    }
    /**
     * @return the tipo
     */
    public TipoCliente getTipo() {
        return TipoCliente.toEnum(tipo);
    }
    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo.getCod();
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