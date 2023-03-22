
package Model;

import DAO.AppDAO;
import java.util.Date;


public class Vendas implements AppDAO{
    private int idVendas;
    private int idProduto;
    private int idCliente;
    private Date dataVenda;
    private double valor;
    private double valorTotal;
    private int desconto;

    public Vendas(int idVendas, int idProduto, int idCliente, Date dataVenda, double valor, double valorTotal, int desconto) {
        this.idVendas = idVendas;
        this.idProduto = idProduto;
        this.idCliente = idCliente;
        this.dataVenda = dataVenda;
        this.valor = valor;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
    }

    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
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
