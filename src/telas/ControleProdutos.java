package telas;

import dados.SistemaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class ControleProdutos extends javax.swing.JFrame {
    
    MaskFormatter mfdata;
    String pattern = "dd-MM-yyyy";

    public ControleProdutos() {
        try {
            mfdata = new MaskFormatter("##-##-####");
        } catch (ParseException ex) {
            System.out.println("Ocorreu um erro na criação da mascara");
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        lblValidade = new javax.swing.JLabel();
        txtValidade = new javax.swing.JFormattedTextField(mfdata);
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();

        getContentPane().setLayout(null);

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodigo.setText("Código");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(30, 20, 90, 40);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(150, 20, 240, 40);

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(410, 20, 140, 40);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(30, 80, 90, 40);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(150, 80, 240, 40);

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(410, 80, 140, 40);

        lblValidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValidade.setText("Validade");
        getContentPane().add(lblValidade);
        lblValidade.setBounds(30, 140, 90, 40);

        txtValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtValidade);
        txtValidade.setBounds(150, 140, 240, 40);

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(410, 140, 140, 40);

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(410, 200, 140, 40);

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuantidade.setText("Quantidade");
        getContentPane().add(lblQuantidade);
        lblQuantidade.setBounds(30, 200, 110, 40);

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(150, 200, 240, 40);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(30, 260, 140, 40);

        setSize(new java.awt.Dimension(622, 341));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValidadeActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            Connection conectado = SistemaDao.conectar();
            PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM Nome WHERE Codigo = ?");
            stConsultar.setString(1, txtCodigo.getText());
            ResultSet resultado = stConsultar.executeQuery();
            if(resultado.next()){ //Se encontrou os dados do usuário
                txtCodigo.setText(resultado.getString("Codigo"));
                txtNome.setText(resultado.getString("Nome"));
                txtValidade.setText(resultado.getString("Validade"));

                txtQuantidade.setText(resultado.getString("Quantidade"));
                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);
                btnLimpar.setVisible(true);
            } else { //Se não encontrou o sdadosdo usuário
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
                txtCodigo.requestFocus();
                txtCodigo.setText("");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
            if(txtCodigo.getText().equals ("")){
            JOptionPane.showMessageDialog(null, "O código é obrigatório");
            txtCodigo.requestFocus();
            return;
        }
        if(txtNome.getText().equals ("")){
            JOptionPane.showMessageDialog(null, "O nome é obrigatório");
            txtNome.requestFocus();
            return;
        }
        if(txtValidade.getText().equals ("")){
            JOptionPane.showMessageDialog(null, "A validade é obrigatória");
            txtValidade.requestFocus();
            return;
        }
        if(txtQuantidade.getText().equals ("")){
            JOptionPane.showMessageDialog(null, "A quantdade é obrigatória");
            txtQuantidade.requestFocus();
            return;
        }
        try {
            //Pega a classe do drive do banco de dados
            Connection conectado = SistemaDao.conectar();

            //Prepara um comando SQL INSERT incompleto
            PreparedStatement stSalvar = conectado.prepareStatement("INSERT INTO produtos VALUES(?,?,?,?)");

            //Completa o comando INSERT preparado na linha anterior(os pontos de interrogação)
            stSalvar.setString(1, txtCodigo.getText());
            stSalvar.setString(2, txtNome.getText());
            
            /*int validade = Integer.parseInt(txtValidade.getText());
            stSalvar.setInt(4, validade);*/
            
                try {
                    DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                    Date date = formatter.parse(txtValidade.getText());
                    stSalvar.setDate(3, new java.sql.Date(date.getTime()));

                } catch (ParseException ex) {
                    Logger.getLogger(ControleProdutos.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            stSalvar.setString(4, txtQuantidade.getText());
            int quantidade = Integer.parseInt(txtQuantidade.getText());
            stSalvar.setInt(4, quantidade);
            txtCodigo.setText("");
            txtNome.setText("");
            txtValidade.setText("");
            txtQuantidade.setText("");
            //Colocar o cursor no campo código
            txtCodigo.requestFocus();

            //Execulta o update no banco
            stSalvar.executeUpdate();
            //Mostra a mensagem de confirmação da inclusão do registro na tabela do banco
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {

            if(ex.getMessage().contains("Duplicate entry")){
                JOptionPane.showMessageDialog(null, "Este produto " + txtCodigo.getText() + " já está cadastrado");
                txtCodigo.requestFocus();
            }else{
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtCodigo.setText("");
        txtNome.setText("");
        txtValidade.setText("");
        txtQuantidade.setText("");
        txtCodigo.requestFocus();
        btnExcluir.setVisible(false);
        btnAlterar.setVisible(false);
        btnLimpar.setVisible(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if(txtCodigo.getText().equals ("")){
            JOptionPane.showMessageDialog(null, "O código é obrigatório");
            txtCodigo.requestFocus();
            return;
        }

        try {
            //Pega a classe do drive do banco de dados
            Connection conectado = SistemaDao.conectar();

            //Prepara um comando SQL UPDATE incompleto
            PreparedStatement stAlterar = conectado.prepareStatement("UPDATE funcionarios SET Nome = ?, Validade = ?, Quantidade = ? WHERE Codigo = ?;");

            //Completa o comando UPDATE preparado na linha anterior(os pontos de interrogação)
            stAlterar.setString(1, txtCodigo.getText());
            stAlterar.setString(2, txtNome.getText());
            stAlterar.setString(3, txtValidade.getText());
            stAlterar.setString(3, txtQuantidade.getText());
            stAlterar.setString(4, txtCodigo.getText());

            //Execulta o update no banco
            stAlterar.executeUpdate();
            //Mostra a mensagem de confirmação da alteração do registro na tabela do banco
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);

            txtCodigo.setText("");
            txtNome.setText("");
            txtValidade.setText("");
            txtQuantidade.setText("");
            //Colocar o cursor no campo código
            txtCodigo.requestFocus();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(txtCodigo.getText().equals ("")){
            JOptionPane.showMessageDialog(null, "A matrícula é obrigatória");
            txtCodigo.requestFocus();
            return;
        }

        try {
            //Pega a classe do drive do banco de dados
            Connection conectado = SistemaDao.conectar();

            //Prepara um comando SQL DELETE incompleto
            PreparedStatement stExcluir = conectado.prepareStatement("DELETE from produtos WHERE Codigo = ?");

            //Completa o comando DELETE preparado na linha anterior(os pontos de interrogação)
            stExcluir.setString(1, txtCodigo.getText());

            //Execulta o update no banco
            stExcluir.executeUpdate();
            //Mostra a mensagem de confirmação da exclusão do registro na tabela do banco
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);

            txtCodigo.setText("");
            txtNome.setText("");
            txtValidade.setText("");
            txtQuantidade.setText("");
            //Colocar o cursor no campo código
            txtCodigo.requestFocus();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}
