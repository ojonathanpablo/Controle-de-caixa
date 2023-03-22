package Model;

import DAO.AppDAO;

public class Cliente implements AppDAO {

    private int idCliente;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String telefone;
    private String email;

    public Cliente(int idCliente, String nome, String email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
    }

    public Cliente(int idCliente, String nome, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void Cadastra(Object cadastra) {
        
        
        
    }

    @Override
    public void Exluir(int id) {

    }

}
