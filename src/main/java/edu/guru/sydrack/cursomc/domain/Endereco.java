package edu.guru.sydrack.cursomc.domain;
import java.io.Serializable;

public class Endereco implements Serializable{
    
    private static final long serialVersionUID = 1L;
    //ATRIBUTOS
    private Integer id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    
    private Cidade cidade;
    
    private Cliente cliente;
    //CONSTRUTORES
    public Endereco(){}
    public Endereco(Integer id,String logradouro,String numero,String complemento,String bairro,String cep,Cidade cidade, Cliente cliente){
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cliente = cliente;
        this.cidade = cidade;
    }
    // GETTERS E SETTERS
    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }
    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }
    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }
    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
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
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }
    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }
    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    /**
     * @return the cidade
     */
    public Cidade getCidade() {
        return cidade;
    }
    /**
     * @param cidade the cidade to set
     */
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
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