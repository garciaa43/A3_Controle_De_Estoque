package model;

import dao.MovimentacaoDAO;


public class Movimentacao {
    private int id_produto;
    private String dataMovimentacao;
    private int qntdMovimentada;
    private String tipoMovimentacao;
    
    
    private MovimentacaoDAO dao;
        
   
 
    public Movimentacao(int id_produto, String dataMovimentacao, int qntdMovimentada, String tipoMovimentacao) {
        this.id_produto = id_produto;
        this.dataMovimentacao = dataMovimentacao;
        this.qntdMovimentada = qntdMovimentada;
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Movimentacao() {
    }

    public void setId_Produto(int nomeProduto) {
        this.id_produto = id_produto;
    }

    public void setDataMovimentacao(String dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public void setQntdMovimentada(int qntdMovimentada) {
        this.qntdMovimentada = qntdMovimentada;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public int getId_Produto() {
        return id_produto;
    }

    public String getDataMovimentacao() {
        return dataMovimentacao;
    }

    public int getQntdMovimentada() {
        return qntdMovimentada;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }
    
    @Override
    public String toString() {
        return "ID do Produto: " + id_produto 
              + "Data da Movimentação: " + dataMovimentacao 
              + "Quantidade Movimentada: " + qntdMovimentada 
              + "Tipo Movimentação: " + tipoMovimentacao;
    }
    
   
    
}
