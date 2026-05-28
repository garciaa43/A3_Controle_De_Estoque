package view;

import bo.ProdutoBO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import model.Produto;

public class TelaGerenciamentoProduto extends javax.swing.JInternalFrame {

    public TelaGerenciamentoProduto() {
        initComponents();
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
        TxtCategoria1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtQntdMaxima2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtQntdEstoque = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtQntdMax = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnCadastrar1 = new javax.swing.JButton();
        btnCadastrar2 = new javax.swing.JButton();

        JTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome produto", "Categoria", "Preço", "Quantidade", "Quantidade Maxima", "Quantidade Minima", "Unidade"
            }
        ));
        jScrollPane1.setViewportView(JTableProduto);

        TxtQntdMin.addActionListener(this::TxtQntdMinActionPerformed);

        jLabel6.setText("Preço: ");

        TxtQntdMaxima2.addActionListener(this::TxtQntdMaxima2ActionPerformed);

        jLabel10.setText("Quantidade em estoque:");

        jLabel11.setText("Quantidade máxima:");

        jLabel12.setText("Nome do Produto: ");

        TxtQntdEstoque.addActionListener(this::TxtQntdEstoqueActionPerformed);

        jLabel13.setText("Quantidade minima:");

        jLabel14.setText("Unidade:");

        jLabel15.setText("Categoria");

        btnCadastrar.setText("Excluir");
        btnCadastrar.addActionListener(this::btnCadastrarActionPerformed);

        btnCadastrar1.setText("Alterar");
        btnCadastrar1.addActionListener(this::btnCadastrar1ActionPerformed);

        btnCadastrar2.setText("Voltar");
        btnCadastrar2.addActionListener(this::btnCadastrar2ActionPerformed);

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
                                .addComponent(btnCadastrar1))
                            .addComponent(TxtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar)
                        .addContainerGap(158, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtQntdMax, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(TxtQntdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(TxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(TxtQntdMaxima2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(TxtCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar2)
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
                .addComponent(TxtCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtQntdMaxima2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnCadastrar1)
                    .addComponent(btnCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(btnCadastrar2))
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

    private void TxtQntdMaxima2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQntdMaxima2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtQntdMaxima2ActionPerformed

    private void TxtQntdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQntdEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtQntdEstoqueActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            String nomeProduto = TxtUnidade.getText();
            String categoria = TxtCategoria1.getText();
            String preco = TxtPreco.getText();
            String quantidadeEstoque = TxtQntdEstoque.getText();
            String quantidadeMinima = TxtQntdMin.getText();
            String quantidadeMaxima = TxtQntdMax.getText();
            String unidade = TxtUnidade.getText();

            if (nomeProduto.matches(".*\\d.*")) {
                throw new Mensagem("O nome do produto não pode conter números.");
            } else if (categoria.matches(".*\\d.*")) {
                throw new Mensagem("A categoria não pode conter números.");
            } else if (unidade.matches(".*\\d.*")) {
                throw new Mensagem("A unidade não pode conter números.");
            }

            if (!preco.matches("\\d+")) {
                throw new Mensagem("A quantidade deve conter apenas números.");

            } else if (!quantidadeEstoque.matches("\\d+")) {
                throw new Mensagem("A quantidade deve conter apenas números.");

            } else if (!quantidadeMinima.matches("\\d+")) {
                throw new Mensagem("A quantidade minima deve conter apenas números.");

            } else if (!quantidadeMaxima.matches("\\d+")) {
                throw new Mensagem("A quantidade maxima deve conter apenas números.");

            }

            int preco_produto = Integer.parseInt(preco);
            int qntdEstoque = Integer.parseInt(quantidadeEstoque);
            int qntdMin = Integer.parseInt(quantidadeMinima);
            int qntdMax = Integer.parseInt(quantidadeMaxima);

            if (nomeProduto.isEmpty() || categoria.isEmpty() || preco.isEmpty() || quantidadeEstoque.isEmpty() || quantidadeMinima.isEmpty()
                    || quantidadeMaxima.isEmpty() || unidade.isEmpty()) {
                throw new Mensagem("Todos os campos devem ser preenchidos.");
            }

            //     boolean cadastrou = objMovimentacao.insertMovimentacao(
            //           nomeProduto,
            //         datx,
            //       quantidade,
            //     tipoMovimentacao
            // );
        } catch (Mensagem e) {
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int linha = jTableProduto.getSelectedRow();

            if (linha == -1) {
                btnExcluir.setEnabled(false);
            } else {
                int id = Integer.parseInt(jTableProduto.getValueAt(linha, 0).toString());
                int repostaUsuario = JOptionPane.showConfirmDialog(
                        null,
                        "Tem certeza que deseja apagar essa Produto??"
                );
                if (repostaUsuario == JOptionPane.YES_OPTION) {
                    boolean apagou = objProduto.deleteMovimentacaoBO(id);

                    if (apagou) {
                        JOptionPane.showMessageDialog(
                                rootPane,
                                "Produto apagado com sucesso!"
                        );

                        limparCampos();
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        } finally {

            carregaTabela();
        }
    }

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int linha = jTableProduto.getSelectedRow();

            if (linha == -1) {
                throw new Mensagem(
                        "Selecione um aluno para alterar."
                );
            }
            String nomeProduto = TxtNomeProduto.getText();
            String data = TxtDataMovimentacao.getText();
            String qntdMovimentada = TxtQntdMovimentada.getText();
            String tipoMovimentacao = comboBoxTipodeMovimentacao.getSelectedItem().toString();

            if (nomeProduto.matches(".*\\d.*")) {
                throw new Mensagem("O nome do produto não pode conter números.");
            }

            if (data.isEmpty()) {
                throw new Mensagem("Informe uma data.");
            }

            if (!qntdMovimentada.matches("\\d+")) {
                throw new Mensagem("A quantidade deve conter apenas números.");
            }

            int id = Integer.parseInt(
                    jTableProduto.getValueAt(linha, 0).toString()
            );

            int quantidade = Integer.parseInt(qntdMovimentada);

            boolean alterou = objProduto.atualizarProduto(id, nomeProduto, categoria, preco, quantidade,  );

            if (alterou) {

                JOptionPane.showMessageDialog(
                        rootPane,
                        "Produto alterada com sucesso!"
                );

                carregaTabela();
                limparCampos();
            }

        } catch (Mensagem e) {
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }


    private void btnCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar1ActionPerformed

    private void btnCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableProduto;
    private javax.swing.JTextField TxtCategoria1;
    private javax.swing.JTextField TxtPreco;
    private javax.swing.JTextField TxtQntdEstoque;
    private javax.swing.JTextField TxtQntdMax;
    private javax.swing.JTextField TxtQntdMaxima2;
    private javax.swing.JTextField TxtQntdMin;
    private javax.swing.JTextField TxtUnidade;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastrar1;
    private javax.swing.JButton btnCadastrar2;
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
