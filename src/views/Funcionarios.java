/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Controllers.FuncionarioController;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import models.Usuario;

/**
 *
 * @author kevin
 */
public class Funcionarios extends javax.swing.JFrame {
    private Usuario funcionarioContext;
    /**
     * Creates new form Funcionarios
     */
    public Funcionarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_login = new javax.swing.JLabel();
        input_login = new javax.swing.JTextField();
        cadastro_cliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaFuncionarios = new javax.swing.JTable();
        lbl_senha = new javax.swing.JLabel();
        input_senha = new javax.swing.JPasswordField();
        button_excluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_login.setText("Login:");

        input_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_loginActionPerformed(evt);
            }
        });

        cadastro_cliente.setText("Cadastrar");
        cadastro_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_clienteActionPerformed(evt);
            }
        });

        TabelaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Login", "Data Cadastro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaFuncionarios.setColumnSelectionAllowed(true);
        TabelaFuncionarios.getTableHeader().setReorderingAllowed(false);
        TabelaFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaFuncionarios);
        TabelaFuncionarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        lbl_senha.setText("Senha:");

        input_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_senhaActionPerformed(evt);
            }
        });

        button_excluir.setText("Excluir");
        button_excluir.setEnabled(false);
        button_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cadastro_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_login)
                                    .addComponent(lbl_senha))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(input_login, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(input_senha))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_login)
                            .addComponent(input_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_senha)
                            .addComponent(input_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cadastro_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(button_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_loginActionPerformed

    private void cadastro_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_clienteActionPerformed
        if(funcionarioContext != null){
            try {
                String senha = input_senha.getText();
                funcionarioContext.setSenha(senha);
                FuncionarioController.editar(funcionarioContext);
                input_login.setText("");
                input_senha.setText("");
                cadastro_cliente.setText("Cadastrar");
                loadTableData(); 
                this.funcionarioContext = null;
                button_excluir.setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(Funcionarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Funcionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            String login = input_login.getText();
            String senha = input_senha.getText();

            if(login != "" && senha != ""){
                try {
                    FuncionarioController.inserir(login, senha);
                    JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso.", "Loginha", JOptionPane.INFORMATION_MESSAGE);
                    input_login.setText("");
                    input_senha.setText("");
                    loadTableData();
                } catch (SQLException ex) {
                    Logger.getLogger(Funcionarios.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Ops. Não foi possivel cadastrar o funcionario tente novamente mais tarde.", "Loginha", JOptionPane.INFORMATION_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Funcionarios.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Ops. Não foi possivel cadastrar o funcionario tente novamente mais tarde.", "Loginha", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }        
    }//GEN-LAST:event_cadastro_clienteActionPerformed

    private void input_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_senhaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            loadTableData();
        } catch (SQLException ex) {
            Logger.getLogger(Funcionarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Funcionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void TabelaFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaFuncionariosMouseClicked
        final DefaultTableModel model;
        model = (DefaultTableModel) TabelaFuncionarios.getModel();
        int index = TabelaFuncionarios.getSelectedRow();
        
        int id = (int) model.getValueAt(index, 0);
        String login = model.getValueAt(index, 1).toString();
        
        cadastro_cliente.setText("Editar");
        input_login.setText(login);
        
        Usuario funcionario = new Usuario();
        funcionario.setId(id);
        funcionario.setLogin(login);
        button_excluir.setEnabled(true);
        this.funcionarioContext = funcionario;
    }//GEN-LAST:event_TabelaFuncionariosMouseClicked

    private void button_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_excluirActionPerformed
        if(funcionarioContext != null){
            try {
                String senha = input_senha.getText();
                funcionarioContext.setSenha(senha);
                FuncionarioController.excluir(funcionarioContext);
                input_login.setText("");
                input_senha.setText("");
                cadastro_cliente.setText("Cadastrar");
                loadTableData(); 
                this.funcionarioContext = null;
                button_excluir.setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(Funcionarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Funcionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_button_excluirActionPerformed

    public void loadTableData() throws SQLException, ClassNotFoundException{
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Id","Login","Data Cadastro"}, 0);
        List<Usuario> listagem = FuncionarioController.listarFuncionarios();

        for(Usuario item:listagem){
            model.addRow(new Object[]{item.getId(), item.getLogin(), item.getDataCad()});
        }
        
        TabelaFuncionarios.setModel(model);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funcionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaFuncionarios;
    private javax.swing.JButton button_excluir;
    private javax.swing.JButton cadastro_cliente;
    private javax.swing.JTextField input_login;
    private javax.swing.JPasswordField input_senha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_senha;
    // End of variables declaration//GEN-END:variables
}
