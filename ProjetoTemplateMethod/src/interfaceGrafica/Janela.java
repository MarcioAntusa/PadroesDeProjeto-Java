/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGrafica;

import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.*;
import classesDados.Professor;

/**
 *
 * @author M
 */
public class Janela extends javax.swing.JFrame {

    /**
     * Creates new form tela
     */
    public Janela() {
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

        jLabelDadosProfessores = new javax.swing.JLabel();
        jButtonOrdenarPorNome = new javax.swing.JButton();
        jButtonOrdenarPorMatricula = new javax.swing.JButton();
        jButtonOrdenarPorEscolaNome = new javax.swing.JButton();
        jButtonOrdenarPorTitulacaoNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGridProfessores = new javax.swing.JTable();
        jButtonOrdenarPorTitulacaoEscolaNome = new javax.swing.JButton();
        jButtonOrdenarPorEscolaTitulacaoNome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROJETO TEMPLATE METHOD");

        jLabelDadosProfessores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDadosProfessores.setForeground(new java.awt.Color(0, 51, 204));
        jLabelDadosProfessores.setText("ORDENAÇÃO DOS DADOS DOS PROFESSORES");

        jButtonOrdenarPorNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonOrdenarPorNome.setText("NOME");
        jButtonOrdenarPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPorNomeActionPerformed(evt);
            }
        });

        jButtonOrdenarPorMatricula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonOrdenarPorMatricula.setText("MATRICULA");
        jButtonOrdenarPorMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPorMatriculaActionPerformed(evt);
            }
        });

        jButtonOrdenarPorEscolaNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonOrdenarPorEscolaNome.setText("ESCOLA, NOME");
        jButtonOrdenarPorEscolaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPorEscolaNomeActionPerformed(evt);
            }
        });

        jButtonOrdenarPorTitulacaoNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonOrdenarPorTitulacaoNome.setText("TITULAÇÃO, NOME");
        jButtonOrdenarPorTitulacaoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPorTitulacaoNomeActionPerformed(evt);
            }
        });

        jTableGridProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "NOME", "ESCOLA", "TITULAÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableGridProfessores);

        jButtonOrdenarPorTitulacaoEscolaNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonOrdenarPorTitulacaoEscolaNome.setText("TITULAÇÃO, ESCOLA, NOME");
        jButtonOrdenarPorTitulacaoEscolaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPorTitulacaoEscolaNomeActionPerformed(evt);
            }
        });

        jButtonOrdenarPorEscolaTitulacaoNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonOrdenarPorEscolaTitulacaoNome.setText("ESCOLA, TITULAÇÃO, NOME");
        jButtonOrdenarPorEscolaTitulacaoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPorEscolaTitulacaoNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonOrdenarPorNome)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonOrdenarPorMatricula)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonOrdenarPorEscolaNome)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonOrdenarPorTitulacaoNome)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonOrdenarPorEscolaTitulacaoNome)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonOrdenarPorTitulacaoEscolaNome))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabelDadosProfessores)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelDadosProfessores)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOrdenarPorNome)
                    .addComponent(jButtonOrdenarPorMatricula)
                    .addComponent(jButtonOrdenarPorEscolaNome)
                    .addComponent(jButtonOrdenarPorTitulacaoNome)
                    .addComponent(jButtonOrdenarPorTitulacaoEscolaNome)
                    .addComponent(jButtonOrdenarPorEscolaTitulacaoNome))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imprimirNaGrid(Iterator dados) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableGridProfessores.getModel();
            model.setNumRows(0);

            while(dados.hasNext()) {
                String[] linha = new String[4];
                Professor obj = (Professor) dados.next();
                linha[0] = "" + obj.getMatricula();
                linha[1] = obj.getNome();
                linha[2] = obj.getEscola();
                linha[3] = obj.getTitulacao();
                model.addRow(linha);
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }

    private void jButtonOrdenarPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorNomeActionPerformed
        try {
            String nomeDoArquivo = "./src/dados/ProfessoresDaEscola_2.csv";
            OrdenarPorNome objeto = new OrdenarPorNome(nomeDoArquivo);
            imprimirNaGrid(objeto.listagemDeProfessoresOrdenados());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButtonOrdenarPorNomeActionPerformed

    private void jButtonOrdenarPorMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorMatriculaActionPerformed
        try {
            String nomeDoArquivo = "./src/dados/ProfessoresDaEscola_2.csv";
            OrdenarPorMatricula objeto = new OrdenarPorMatricula(nomeDoArquivo);
            imprimirNaGrid(objeto.listagemDeProfessoresOrdenados());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButtonOrdenarPorMatriculaActionPerformed

    private void jButtonOrdenarPorEscolaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorEscolaNomeActionPerformed
        try {
            String nomeDoArquivo = "./src/dados/ProfessoresDaEscola_2.csv";
            OrdenarPorEscolaNome objeto = new OrdenarPorEscolaNome(nomeDoArquivo);
            imprimirNaGrid(objeto.listagemDeProfessoresOrdenados());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButtonOrdenarPorEscolaNomeActionPerformed

    private void jButtonOrdenarPorTitulacaoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorTitulacaoNomeActionPerformed
        try {
            String nomeDoArquivo = "./src/dados/ProfessoresDaEscola_2.csv";
            OrdenarPorTitulacaoNome objeto = new OrdenarPorTitulacaoNome(nomeDoArquivo);
            imprimirNaGrid(objeto.listagemDeProfessoresOrdenados());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButtonOrdenarPorTitulacaoNomeActionPerformed

    private void jButtonOrdenarPorEscolaTitulacaoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorEscolaTitulacaoNomeActionPerformed
        try {
            String nomeDoArquivo = "./src/dados/ProfessoresDaEscola_2.csv";
            OrdenarPorEscolaTitulacaoNome objeto = new OrdenarPorEscolaTitulacaoNome(nomeDoArquivo);
            imprimirNaGrid(objeto.listagemDeProfessoresOrdenados());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButtonOrdenarPorEscolaTitulacaoNomeActionPerformed

    private void jButtonOrdenarPorTitulacaoEscolaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorTitulacaoEscolaNomeActionPerformed
        try {
            String nomeDoArquivo = "./src/dados/ProfessoresDaEscola_2.csv";
            OrdenarPorTitulacaoEscolaNome objeto = new OrdenarPorTitulacaoEscolaNome(nomeDoArquivo);
            imprimirNaGrid(objeto.listagemDeProfessoresOrdenados());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButtonOrdenarPorTitulacaoEscolaNomeActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOrdenarPorEscolaNome;
    private javax.swing.JButton jButtonOrdenarPorEscolaTitulacaoNome;
    private javax.swing.JButton jButtonOrdenarPorMatricula;
    private javax.swing.JButton jButtonOrdenarPorNome;
    private javax.swing.JButton jButtonOrdenarPorTitulacaoEscolaNome;
    private javax.swing.JButton jButtonOrdenarPorTitulacaoNome;
    private javax.swing.JLabel jLabelDadosProfessores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGridProfessores;
    // End of variables declaration//GEN-END:variables
}
