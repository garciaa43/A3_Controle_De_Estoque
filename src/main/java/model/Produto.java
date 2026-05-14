package model;

import java.util.ArrayList;
import dao.ProdutoDAO;

public class Produto {
    
    private int id;
    private double preco;
    private String unidade;
    private String categoria;
    private String produto;
    private int quantidade;
    private int quantidademax;
    private int quantidademin;
    private ProdutoDAO dao;
    

    public Produto() {
        this(0, "", 0, "", "", 0, 0, 0);
    }

    public Produto(int id, String produto, double preco, String unidade,
            String categoria, int quantidade, int quantidademax, int quantidademin) {
        this.id = id;
        this.preco = preco;
        this.unidade = unidade;
        this.categoria = categoria;
        this.produto = produto;
        this.quantidade = quantidade;
        this.quantidademax = quantidademax;
        this.quantidademin = quantidademin;
        this.dao = new ProdutoDAO();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidademax() {
        return quantidademax;
    }

    public void setQuantidademax(int quantidademax) {
        this.quantidademax = quantidademax;
    }

    public int getQuantidademin() {
        return quantidademin;
    }

    public void setQuantidademin(int quantidademin) {
        this.quantidademin = quantidademin;
    }

    public ProdutoDAO getDAO() {
        return dao;
    }

    public void setDao(ProdutoDAO dao) {
        this.dao = dao;
    }
}
    
    
