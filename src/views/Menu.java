/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import models.Usuario;

/**
 *
 * @author kevin
 */
public class Menu extends javax.swing.JFrame {
    private Usuario usuario;
    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        CadastrosMenuItem = new javax.swing.JMenu();
        Clientes_item = new javax.swing.JMenuItem();
        Produtos_item = new javax.swing.JMenuItem();
        Funcionarios = new javax.swing.JMenuItem();
        Vendas_item = new javax.swing.JMenuItem();
        UsuarioMenuItem = new javax.swing.JMenu();
        Sair_item = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 75)); // NOI18N
        jLabel1.setText("Lojinha");

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/kevin/Área de Trabalho/gru.png")); // NOI18N

        CadastrosMenuItem.setText("Cadastros");
        CadastrosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrosMenuItemActionPerformed(evt);
            }
        });

        Clientes_item.setText("Clientes");
        Clientes_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clientes_itemActionPerformed(evt);
            }
        });
        CadastrosMenuItem.add(Clientes_item);

        Produtos_item.setText("Produtos");
        Produtos_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Produtos_itemActionPerformed(evt);
            }
        });
        CadastrosMenuItem.add(Produtos_item);

        Funcionarios.setText("Funcionarios");
        Funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionariosActionPerformed(evt);
            }
        });
        CadastrosMenuItem.add(Funcionarios);

        Vendas_item.setText("Vendas");
        Vendas_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vendas_itemActionPerformed(evt);
            }
        });
        CadastrosMenuItem.add(Vendas_item);

        jMenuBar1.add(CadastrosMenuItem);

        UsuarioMenuItem.setText("Usuario");

        Sair_item.setText("Sair");
        Sair_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair_itemActionPerformed(evt);
            }
        });
        UsuarioMenuItem.add(Sair_item);

        jMenuBar1.add(UsuarioMenuItem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrosMenuItemActionPerformed

    }//GEN-LAST:event_CadastrosMenuItemActionPerformed

    private void Clientes_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clientes_itemActionPerformed
        Clientes clientes_view = new Clientes();
        clientes_view.setVisible(true);
    }//GEN-LAST:event_Clientes_itemActionPerformed

    private void Produtos_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Produtos_itemActionPerformed
        Produtos produtos_view = new Produtos();
        produtos_view.setVisible(true);
    }//GEN-LAST:event_Produtos_itemActionPerformed

    private void FuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionariosActionPerformed
        Funcionarios funcionarios_view = new Funcionarios();
        funcionarios_view.setVisible(true);
    }//GEN-LAST:event_FuncionariosActionPerformed

    private void Vendas_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vendas_itemActionPerformed
        Vendas vendas_view = new Vendas();
        vendas_view.setVisible(true);
    }//GEN-LAST:event_Vendas_itemActionPerformed

    private void Sair_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair_itemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Sair_itemActionPerformed
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);                
            }
        });
    }
    public void setUsuarioContext(Usuario usuario){
        this.usuario = usuario;
        this.UsuarioMenuItem.setText(this.usuario.getLogin());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu CadastrosMenuItem;
    private javax.swing.JMenuItem Clientes_item;
    private javax.swing.JMenuItem Funcionarios;
    private javax.swing.JMenuItem Produtos_item;
    private javax.swing.JMenuItem Sair_item;
    private javax.swing.JMenu UsuarioMenuItem;
    private javax.swing.JMenuItem Vendas_item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}