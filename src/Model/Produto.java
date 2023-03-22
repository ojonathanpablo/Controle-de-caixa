
package Model;

import DAO.AppDAO;
import java.util.Date;


public class Produto implements AppDAO{
    private int idProduto;
    private String nome;
    private double valor;
    private int estoque;
    private Date validade;

    public Produto(int idProduto, String nome, double valor, int estoque, Date validade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
        this.validade = validade;
    }

    public Produto(int idProduto, String nome, double valor, int estoque) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @Override
    public void Cadastra(Object cadastra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Exluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
