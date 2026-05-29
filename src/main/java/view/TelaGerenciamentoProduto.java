package view;

import bo.ProdutoBO;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;

public class TelaGerenciamentoProduto extends javax.swing.JInternalFrame {

    private javax.swing.JTextField TxtNomeProduto;

    public void limparCampos() {

        TxtNomeProduto.setText("");
        TxtCategoria.setText("");
        TxtPreco.setText("");
        TxtQntdEstoque.setText("");
        TxtQntdMax.setText("");
        TxtQntdMin.setText("");
        TxtUnidade.setText("");
    }

    public void carregaTabela() {

        DefaultTableModel modelo
                = (DefaultTableModel) JTableProduto.getModel();

        modelo.setRowCount(0);

        List<Produto> lista
                = objProduto.listar();

        for (Produto p : lista) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getNome_categoria(),
                p.getPreco(),
                p.getQuantidade(),
                p.getQntdMax(),
                p.getQntdMin(),
                p.getUnidade()
            });
        }
        esconderColunaID();
    }

    ProdutoBO objProduto = new ProdutoBO();

    public TelaGerenciamentoProduto() {
        initComponents();
        javax.swing.SwingUtilities.invokeLater(() -> {
            esconderColunaID();
        });
    }

    private void esconderColunaID() {
        JTableProduto.getColumnModel().getColumn(0).setMinWidth(0);
        JTableProduto.getColumnModel().getColumn(0).setMaxWidth(0);
        JTableProduto.getColumnModel().getColumn(0).setWidth(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableProduto = new javax.swing.JTable();
        TxtQntdMin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtPreco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtUnidade = new javax.swing.JTextField();
        TxtnomeProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtCategoria = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtQntdEstoque = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtQntdMax = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        JTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome produto", "Categoria", "Preço", "Quantidade", "Quantidade Maxima", "Quantidade Minima", "Unidade"
            }
        ));
        jScrollPane1.setViewportView(JTableProduto);

        TxtQntdMin.addActionListener(this::TxtQntdMinActionPerformed);

        jLabel6.setText("Preço: ");

        TxtCategoria.addActionListener(this::TxtCategoriaActionPerformed);

        jLabel10.setText("Quantidade em estoque:");

        jLabel11.setText("Quantidade máxima:");

        jLabel12.setText("Nome do Produto: ");

        TxtQntdEstoque.addActionListener(this::TxtQntdEstoqueActionPerformed);

        jLabel13.setText("Quantidade minima:");

        jLabel14.setText("Unidade:");

        jLabel15.setText("Categoria");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(this::btnAlterarActionPerformed);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(this::btnVoltarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtQntdMin, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btnAlterar))
                            .addComponent(TxtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addContainerGap(158, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtQntdMax, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(TxtQntdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(TxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(TxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(TxtnomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addGap(202, 202, 202))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtnomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtQntdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtQntdMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtQntdMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(btnVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtQntdMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQntdMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtQntdMinActionPerformed

    private void TxtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCategoriaActionPerformed

    private void TxtQntdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQntdEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtQntdEstoqueActionPerformed


    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            int linha = JTableProduto.getSelectedRow();

            if (linha == -1) {
                throw new Mensagem("Selecione um produto para excluir.");
            }

            int id = Integer.parseInt(
                    JTableProduto.getValueAt(linha, 0).toString()
            );

            int confirmacao = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Tem certeza que deseja excluir este produto?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirmacao != JOptionPane.YES_OPTION) {
                return;
            }

            objProduto.excluir(id);

            JOptionPane.showMessageDialog(
                    rootPane,
                    "Produto excluído com sucesso!"
            );

            carregaTabela();
            limparCampos();

        } catch (Mensagem e) {
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        try {
            int linha = JTableProduto.getSelectedRow();

            if (linha == -1) {
                throw new Mensagem(
                        "Selecione um Produto para alterar."
                );
            }
            String nomeProduto = TxtNomeProduto.getText();
            String categoria = TxtCategoria.getText();
            String preco = TxtPreco.getText();
            String quantidadeEstoque = TxtQntdEstoque.getText();
            String quantidadeMinima = TxtQntdMin.getText();
            String quantidadeMaxima = TxtQntdMax.getText();
            String unidade = TxtUnidade.getText();

            if (nomeProduto.matches(".*\\d.*")) {
                throw new Mensagem("O nome do produto não pode conter números.");
            }

            if (!quantidadeEstoque.matches("\\d+")) {
                throw new Mensagem("Quantidade inválida.");
            }

            int id = Integer.parseInt(
                    JTableProduto.getValueAt(linha, 0).toString()
            );

            int quantidade = Integer.parseInt(quantidadeEstoque);

            double precoProduto = Double.parseDouble(preco);

            int qntdMin = Integer.parseInt(quantidadeMinima);
            int qntdMax = Integer.parseInt(quantidadeMaxima);

            Produto produto = new Produto();

            produto.setId(id);
            produto.setNome(nomeProduto);
            produto.setNome_categoria(categoria);
            produto.setPreco(precoProduto);
            produto.setQuantidade(quantidade);
            produto.setQntdMin(qntdMin);
            produto.setQntdMax(qntdMax);
            produto.setUnidade(unidade);

            if (nomeProduto.isEmpty()
                    || categoria.isEmpty()
                    || preco.isEmpty()
                    || quantidadeEstoque.isEmpty()
                    || quantidadeMinima.isEmpty()
                    || quantidadeMaxima.isEmpty()
                    || unidade.isEmpty()) {

                throw new Mensagem("Preencha todos os campos.");
            }

            objProduto.atualizar(produto);

            JOptionPane.showMessageDialog(
                    this,
                    "Produto alterado com sucesso!"
            );

            carregaTabela();

            limparCampos();

        } catch (Mensagem e) {

            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );

        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableProduto;
    private javax.swing.JTextField TxtCategoria;
    private javax.swing.JTextField TxtPreco;
    private javax.swing.JTextField TxtQntdEstoque;
    private javax.swing.JTextField TxtQntdMax;
    private javax.swing.JTextField TxtQntdMin;
    private javax.swing.JTextField TxtUnidade;
    private javax.swing.JTextField TxtnomeProduto;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
