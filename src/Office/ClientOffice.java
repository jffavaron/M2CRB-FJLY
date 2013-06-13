/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;

import java.awt.CardLayout;
import java.awt.Color;

/**
 *
 * @author jfred_000
 */
public class ClientOffice extends javax.swing.JFrame {
    private static String nomOffice = ServeurOffice.nomOffice;
    /**
     * Creates new form ClientOffice
     */
    public ClientOffice() {
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

        BandeauOffice = new javax.swing.JPanel();
        boutonAccueil = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        Accueil = new javax.swing.JPanel();
        boutonConsulterStatsSites = new javax.swing.JButton();
        boutonConsulterLesVentes = new javax.swing.JButton();
        boutonConsulterListeSites = new javax.swing.JButton();
        jLabelTitreClientOffice = new javax.swing.JLabel();
        ConsultationVentes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListeVentes = new javax.swing.JTable();
        ConsultationStatsSites = new javax.swing.JPanel();
        ConsultationListeSites = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Office de tourisme de Toulouse");
        setFocusCycleRoot(false);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        boutonAccueil.setText("Accueil");
        boutonAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAccueilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BandeauOfficeLayout = new javax.swing.GroupLayout(BandeauOffice);
        BandeauOffice.setLayout(BandeauOfficeLayout);
        BandeauOfficeLayout.setHorizontalGroup(
            BandeauOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BandeauOfficeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boutonAccueil)
                .addContainerGap())
        );
        BandeauOfficeLayout.setVerticalGroup(
            BandeauOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BandeauOfficeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boutonAccueil)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        mainPanel.setLayout(new java.awt.CardLayout());

        boutonConsulterStatsSites.setText("Consulter les statistiques des sites");
        boutonConsulterStatsSites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonConsulterStatsSitesActionPerformed(evt);
            }
        });

        boutonConsulterLesVentes.setText("Consulter les ventes");
        boutonConsulterLesVentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonConsulterLesVentesActionPerformed(evt);
            }
        });

        boutonConsulterListeSites.setText("Consulter la liste des sites");
        boutonConsulterListeSites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonConsulterListeSitesActionPerformed(evt);
            }
        });

        jLabelTitreClientOffice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitreClientOffice.setText("Office de tourisme de " + nomOffice);

        javax.swing.GroupLayout AccueilLayout = new javax.swing.GroupLayout(Accueil);
        Accueil.setLayout(AccueilLayout);
        AccueilLayout.setHorizontalGroup(
            AccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccueilLayout.createSequentialGroup()
                .addGroup(AccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccueilLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addGroup(AccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boutonConsulterStatsSites, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boutonConsulterLesVentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boutonConsulterListeSites, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(AccueilLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabelTitreClientOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        AccueilLayout.setVerticalGroup(
            AccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccueilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitreClientOffice)
                .addGap(147, 147, 147)
                .addComponent(boutonConsulterLesVentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonConsulterStatsSites)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonConsulterListeSites)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        mainPanel.add(Accueil, "Accueil");

        jLabel1.setText("Liste des ventes :");

        jTableListeVentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Client", "N° de carte"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListeVentes);

        javax.swing.GroupLayout ConsultationVentesLayout = new javax.swing.GroupLayout(ConsultationVentes);
        ConsultationVentes.setLayout(ConsultationVentesLayout);
        ConsultationVentesLayout.setHorizontalGroup(
            ConsultationVentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultationVentesLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(ConsultationVentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultationVentesLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
                .addContainerGap())
        );
        ConsultationVentesLayout.setVerticalGroup(
            ConsultationVentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultationVentesLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(ConsultationVentes, "ConsultationVentes");

        javax.swing.GroupLayout ConsultationStatsSitesLayout = new javax.swing.GroupLayout(ConsultationStatsSites);
        ConsultationStatsSites.setLayout(ConsultationStatsSitesLayout);
        ConsultationStatsSitesLayout.setHorizontalGroup(
            ConsultationStatsSitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        ConsultationStatsSitesLayout.setVerticalGroup(
            ConsultationStatsSitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        mainPanel.add(ConsultationStatsSites, "ConsultationStatsSites");

        javax.swing.GroupLayout ConsultationListeSitesLayout = new javax.swing.GroupLayout(ConsultationListeSites);
        ConsultationListeSites.setLayout(ConsultationListeSitesLayout);
        ConsultationListeSitesLayout.setHorizontalGroup(
            ConsultationListeSitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        ConsultationListeSitesLayout.setVerticalGroup(
            ConsultationListeSitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        mainPanel.add(ConsultationListeSites, "ConsultationListeSites");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BandeauOffice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BandeauOffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boutonConsulterStatsSitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonConsulterStatsSitesActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "ConsultationStatsSites");
    }//GEN-LAST:event_boutonConsulterStatsSitesActionPerformed

    private void boutonConsulterLesVentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonConsulterLesVentesActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "ConsultationVentes");
    }//GEN-LAST:event_boutonConsulterLesVentesActionPerformed

    private void boutonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAccueilActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "Accueil");
    }//GEN-LAST:event_boutonAccueilActionPerformed

    private void boutonConsulterListeSitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonConsulterListeSitesActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "ConsultationListeSites");
    }//GEN-LAST:event_boutonConsulterListeSitesActionPerformed

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
            java.util.logging.Logger.getLogger(ClientOffice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientOffice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientOffice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientOffice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //Lancement du service stat de l'office
        ServeurStatOffice servStat = new ServeurStatOffice(args);
        Thread thread_servStat = new Thread(servStat);
        thread_servStat.start();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientOffice().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Accueil;
    private javax.swing.JPanel BandeauOffice;
    private javax.swing.JPanel ConsultationListeSites;
    private javax.swing.JPanel ConsultationStatsSites;
    private javax.swing.JPanel ConsultationVentes;
    private javax.swing.JButton boutonAccueil;
    private javax.swing.JButton boutonConsulterLesVentes;
    private javax.swing.JButton boutonConsulterListeSites;
    private javax.swing.JButton boutonConsulterStatsSites;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitreClientOffice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListeVentes;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
