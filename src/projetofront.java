
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author wilso
 */
public class projetofront extends javax.swing.JFrame {

    Exercicio exer[] = new Exercicio[100];
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableCellRenderer direitaRenderer = new DefaultTableCellRenderer();

    /**
     * Creates new form projetofront
     */
    public projetofront() {
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

        costas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        peito = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        costas.setText("Costas");
        costas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costasActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Código ", "Link"
            }
        ));
        jTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable);

        peito.setText("Peito");
        peito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peitoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peito)
                            .addComponent(costas, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(costas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void costasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costasActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = new DefaultTableModel();
        File arq = new File("dados");
        try {
            Scanner scan = new Scanner(arq);
            String a = new String();
            int b = 0;
            String c = new String();
            for (int i = 0; scan.hasNext(); i++) {
                a = scan.next();
                System.out.println("a=" + a);
                b = scan.nextInt();
                System.out.println("b=" + b);
                c = scan.next();
                System.out.println("c=" + c);
                exer[i] = new Exercicio(a, b, c);
            }

            modelo.addColumn("Nome");
            modelo.addColumn("Código");
            modelo.addColumn("Link");
            for (int i = 0; i < exer.length; i++) {
                if (exer[i] == null) {
                    i = exer.length;
                } else {

                    Exercicio exer1 = exer[i];

                    Object[] linha = {exer1.getNome(), String.format(" " + exer1.getCod()),
                        String.format("" + exer1.getLink())};
                    // O DefaultTableModel do Java Swing é projetado para ser genérico e flexível o 
                    // suficiente para acomodar os diversos tipos de dados na tabela.
                    // Para isto, ele recebe dados do tipo Object, que é a superclasse direta 
                    // de todas as classes em Java.
                    modelo.addRow(linha);
                }
            }
            jTable.setModel(modelo);

            direitaRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
            jTable.getColumnModel().getColumn(1).setCellRenderer(direitaRenderer);
            jTable.getColumnModel().getColumn(2).setCellRenderer(direitaRenderer);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(projetofront.class.getName()).log(Level.SEVERE, null, ex);
        }
        direitaRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        jTable.getColumnModel().getColumn(1).setCellRenderer(direitaRenderer);
        jTable.getColumnModel().getColumn(2).setCellRenderer(direitaRenderer);

    }//GEN-LAST:event_costasActionPerformed

    private void jTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableAncestorAdded

    private void peitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peitoActionPerformed
        // TODO add your handling code here:
         DefaultTableModel modelo = new DefaultTableModel();
        File arq = new File("dados1");
        try {
            Scanner scan = new Scanner(arq);
            String a = new String();
            int b = 0;
            String c = new String();
            for (int i = 0; scan.hasNext(); i++) {
                a = scan.next();
                System.out.println("a=" + a);
                b = scan.nextInt();
                System.out.println("b=" + b);
                c = scan.next();
                System.out.println("c=" + c);
                exer[i] = new Exercicio(a, b, c);
            }

            modelo.addColumn("Nome");
            modelo.addColumn("Código");
            modelo.addColumn("Link");
            for (int i = 0; i < exer.length; i++) {
                if (exer[i] == null) {
                    i = exer.length;
                } else {

                    Exercicio exer1 = exer[i];

                    Object[] linha = {exer1.getNome(), String.format(" " + exer1.getCod()),
                        String.format("" + exer1.getLink())};
                    // O DefaultTableModel do Java Swing é projetado para ser genérico e flexível o 
                    // suficiente para acomodar os diversos tipos de dados na tabela.
                    // Para isto, ele recebe dados do tipo Object, que é a superclasse direta 
                    // de todas as classes em Java.
                    modelo.addRow(linha);
                }
            }
            jTable.setModel(modelo);

            direitaRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
            jTable.getColumnModel().getColumn(1).setCellRenderer(direitaRenderer);
            jTable.getColumnModel().getColumn(2).setCellRenderer(direitaRenderer);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(projetofront.class.getName()).log(Level.SEVERE, null, ex);
        }
        direitaRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        jTable.getColumnModel().getColumn(1).setCellRenderer(direitaRenderer);
        jTable.getColumnModel().getColumn(2).setCellRenderer(direitaRenderer);
    }//GEN-LAST:event_peitoActionPerformed

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
            java.util.logging.Logger.getLogger(projetofront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(projetofront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(projetofront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(projetofront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new projetofront().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton costas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton peito;
    // End of variables declaration//GEN-END:variables
}
