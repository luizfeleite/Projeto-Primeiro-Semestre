package telas;

import dados.SistemaDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaMenu extends javax.swing.JFrame {
    
    public TelaMenu() {
        initComponents();
        try {
            ResultSet resultado = SistemaDao.listarTodosProdutos();
            //Tira um mold da tabela
            DefaultTableModel modeloTabela; 
            modeloTabela = (DefaultTableModel) tblProdutos.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //Fazer enquanto tiver departamento na variável resultado
            while(resultado.next()){
                Object dep[] = {
                    resultado.getString("codigo"),
                    resultado.getString("nome"),
                    resultado.getString("validade"),
                    resultado.getString("quantidade")
                };
                modeloTabela.addRow(dep);
            }
                    
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuProdutos = new javax.swing.JMenu();
        itmAdicionarProdutos = new javax.swing.JMenuItem();
        itmRemoverProdutos = new javax.swing.JMenuItem();
        itmAlterarProdutos = new javax.swing.JMenuItem();
        itmConsultarProdutos = new javax.swing.JMenuItem();

        setTitle("TelamMenu");
        getContentPane().setLayout(null);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(485, 240, 100, 23);

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Validade", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(tblProdutos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 600, 340);

        mnuProdutos.setText("Produtos");

        itmAdicionarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmAdicionarProdutos.setText("Adicionar");
        itmAdicionarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdicionarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmAdicionarProdutos);

        itmRemoverProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmRemoverProdutos.setText("Remover");
        itmRemoverProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRemoverProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmRemoverProdutos);

        itmAlterarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmAlterarProdutos.setText("Alterar");
        itmAlterarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmAlterarProdutos);

        itmConsultarProdutos.setText("Consultar");
        itmConsultarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmConsultarProdutos);

        jMenuBar1.add(mnuProdutos);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(616, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmAdicionarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdicionarProdutosActionPerformed
        new ControleProdutos().setVisible(true);
    }//GEN-LAST:event_itmAdicionarProdutosActionPerformed

    private void itmConsultarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarProdutosActionPerformed
        new ControleProdutos().setVisible(true);
    }//GEN-LAST:event_itmConsultarProdutosActionPerformed

    private void itmRemoverProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRemoverProdutosActionPerformed
        new ControleProdutos().setVisible(true);
    }//GEN-LAST:event_itmRemoverProdutosActionPerformed

    private void itmAlterarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarProdutosActionPerformed
        new ControleProdutos().setVisible(true);
    }//GEN-LAST:event_itmAlterarProdutosActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            ResultSet resultado = SistemaDao.listarTodosProdutos();
            //Tira um mold da tabela
            DefaultTableModel modeloTabela; 
            modeloTabela = (DefaultTableModel) tblProdutos.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //Fazer enquanto tiver departamento na variável resultado
            while(resultado.next()){
                Object dep[] = {
                    resultado.getString("codigo"),
                    resultado.getString("nome"),
                    resultado.getString("validade"),
                    resultado.getString("quantidade")
                };
                modeloTabela.addRow(dep);
            }
                    
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

       public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JMenuItem itmAdicionarProdutos;
    private javax.swing.JMenuItem itmAlterarProdutos;
    private javax.swing.JMenuItem itmConsultarProdutos;
    private javax.swing.JMenuItem itmRemoverProdutos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnuProdutos;
    private javax.swing.JTable tblProdutos;
    // End of variables declaration//GEN-END:variables
}
