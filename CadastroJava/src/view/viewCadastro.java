/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Categoria;
import model.bean.Produto;
import model.dao.CategoriaDAO;
import model.dao.ProdutoDAO;

/**
 *
 * @author Administrador
 */
public class viewCadastro extends javax.swing.JFrame {

    
    private DefaultTableModel dtmProdutos;
    /**
     * Creates new form viewCadastro
     * método construtor
     */
    public viewCadastro() {
        initComponents();
        dtmProdutos = (DefaultTableModel) jTableProdutos.getModel();
        preencherComboBoxCategorias();
        preencherTabelaProdutos();
    }

    private void preencherTabelaProdutos(){
        ProdutoDAO pDao = new ProdutoDAO();
        int idProduto = 0;
        String descProduto = "";
        int quantidade = 0;
        double valor = 0.0d;
        int idCategoria = 0;
        dtmProdutos.setRowCount(0); //Reseta tabela
        
        for(Produto p: pDao.findAll()){
            idProduto = p.getIdProduto();
            descProduto = p.getDescricao();
            quantidade = p.getQtd();
            valor = p.getValor();
            idCategoria = p.getCategoria().getIdCategoria();
            Object[] dados = {idProduto, descProduto, quantidade, valor, idCategoria};
            dtmProdutos.addRow(dados);
        }
    }
    
    private void preencherTabelaProdutos(int idCat){
        ProdutoDAO pDao = new ProdutoDAO();
        int idProduto = 0;
        String descProduto = "";
        int quantidade = 0;
        double valor = 0.0d;
        int idCategoria = 0;
        dtmProdutos.setRowCount(0); //Reseta tabela
        
        for(Produto p: pDao.findAll(idCat)){
            idProduto = p.getIdProduto();
            descProduto = p.getDescricao();
            quantidade = p.getQtd();
            valor = p.getValor();
            idCategoria = p.getCategoria().getIdCategoria();
            Object[] dados = {idProduto, descProduto, quantidade, valor, idCategoria};
            dtmProdutos.addRow(dados);
        }
    }
    
    private void preencherComboBoxCategorias(){
        CategoriaDAO catDao = new CategoriaDAO();
        for(Categoria cat:catDao.findAll()){
            jComboBoxCategorias.addItem(cat);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabelDesc = new javax.swing.JLabel();
        jLabelQtd = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldDesc = new javax.swing.JTextField();
        jTextFieldQtd = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jComboBoxCategorias = new javax.swing.JComboBox<>();
        jLabelCtg = new javax.swing.JLabel();
        jButtonMostrar = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jTextField4.setText("jTextField4");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelDesc.setText("Descrição:");

        jLabelQtd.setText("Quantidade:");

        jLabelValor.setText("Valor:");

        jButtonCadastrar.setText("Cadastrar");

        jButtonAlterar.setText("Alterar");

        jButtonExcluir.setText("Excluir");

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProduto", "Descrição", "Quantidade", "Valor", "idCategoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        jComboBoxCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriasActionPerformed(evt);
            }
        });

        jLabelCtg.setText("Categorias:");

        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jLabelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCadastrar)
                                .addGap(12, 12, 12)
                                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelCtg, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDesc)
                    .addComponent(jLabelQtd)
                    .addComponent(jLabelValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jComboBoxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jLabelCtg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriasActionPerformed
        // TODO add your handling code here:
        Categoria cat = new Categoria();
        //Castin de (Categoria)
        cat = (Categoria)jComboBoxCategorias.getSelectedItem();
        //Para Depuração
        //JOptionPane.showMessageDialog(null, cat);
        preencherTabelaProdutos(cat.getIdCategoria());
    }//GEN-LAST:event_jComboBoxCategoriasActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        // TODO add your handling code here:
        preencherTabelaProdutos();
    }//GEN-LAST:event_jButtonMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(viewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JComboBox<Object> jComboBoxCategorias;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCtg;
    private javax.swing.JLabel jLabelDesc;
    private javax.swing.JLabel jLabelQtd;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldDesc;
    private javax.swing.JTextField jTextFieldQtd;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
