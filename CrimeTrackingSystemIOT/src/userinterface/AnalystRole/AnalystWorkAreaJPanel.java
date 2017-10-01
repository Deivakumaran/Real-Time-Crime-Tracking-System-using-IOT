/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AnalystRole;

import Business.Enterprise.Enterprise;
import Business.Organization.AnalystOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author deivakumaran
 */
public class AnalystWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalystWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private AnalystOrganization analystOrganization;
    private Enterprise enterprise;

    public AnalystWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AnalystOrganization analystOrganization, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.account = account;
        this.analystOrganization = analystOrganization;
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageFingerPrintButton = new javax.swing.JButton();
        manageDNARequest = new javax.swing.JButton();
        manageDispatchButton = new javax.swing.JButton();
        manageCaseButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(196, 232, 255));

        jLabel2.setBackground(new java.awt.Color(196, 232, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel2.setText("Manage Work Area");

        manageFingerPrintButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        manageFingerPrintButton.setText("Manage Finger Print");
        manageFingerPrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFingerPrintButtonActionPerformed(evt);
            }
        });

        manageDNARequest.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        manageDNARequest.setText("Manage DNA");
        manageDNARequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDNARequestActionPerformed(evt);
            }
        });

        manageDispatchButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        manageDispatchButton.setText("Manage Dispatch");
        manageDispatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDispatchButtonActionPerformed(evt);
            }
        });

        manageCaseButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        manageCaseButton.setText("Manage Case");
        manageCaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCaseButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AnalystRole/forensics_crossing_police_line_300dpi.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageDispatchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageDNARequest, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(manageFingerPrintButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageCaseButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(68, 68, 68)
                        .addComponent(manageDispatchButton)
                        .addGap(65, 65, 65)
                        .addComponent(manageDNARequest)
                        .addGap(65, 65, 65)
                        .addComponent(manageFingerPrintButton)
                        .addGap(58, 58, 58)
                        .addComponent(manageCaseButton))
                    .addComponent(jLabel1))
                .addContainerGap(395, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageDispatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDispatchButtonActionPerformed
        // TODO add your handling code here:
        ManageDispatchJPanel manageDispatchPanel = new ManageDispatchJPanel(userProcessContainer, enterprise, analystOrganization, account);

        userProcessContainer.add(manageDispatchPanel, "ManageAnalystJPanel");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageDispatchButtonActionPerformed

    private void manageFingerPrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFingerPrintButtonActionPerformed
        // TODO add your handling code here:

        if (account.getRole().getName().equalsIgnoreCase("FingerPrintanalyst")) {
            ManageAnalystFingerPrintJPanel manageAnalystFingerPrintJPanel = new ManageAnalystFingerPrintJPanel(userProcessContainer, enterprise, account, analystOrganization);
            userProcessContainer.add(manageAnalystFingerPrintJPanel, "ManageAna1lystJPanel");
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(this, "You don't have fingerprit rights.Login as a Finger print analyst", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_manageFingerPrintButtonActionPerformed

    private void manageDNARequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDNARequestActionPerformed
        // TODO add your handling code here:
        if (account.getRole().getName().equalsIgnoreCase("BloodSpatterAnalyst")) {
            ManageAnalystDNAJPanel manageDNAJPanel = new ManageAnalystDNAJPanel(userProcessContainer, enterprise, account, analystOrganization);
            userProcessContainer.add(manageDNAJPanel, "ManageDNAJPanel");
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(this, "You don't have DNA administrative rights.Login as a DNA analyst", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_manageDNARequestActionPerformed

    private void manageCaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCaseButtonActionPerformed
        // TODO add your handling code here:
        if (account.getRole().getName().equalsIgnoreCase("BloodSpatterAnalyst")) {
            ManageDNACaseJPanel manageCaseJPanel = new ManageDNACaseJPanel(userProcessContainer, enterprise, account, analystOrganization);
            userProcessContainer.add(manageCaseJPanel, "ManageCaseJPanel");
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            ManageFingerPrintCaseJPanel manageFingerPrintCaseJPanel = new ManageFingerPrintCaseJPanel(userProcessContainer, enterprise, account, analystOrganization);
            userProcessContainer.add(manageFingerPrintCaseJPanel, "ManageFingerPrintCaseJPanel");
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_manageCaseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageCaseButton;
    private javax.swing.JButton manageDNARequest;
    private javax.swing.JButton manageDispatchButton;
    private javax.swing.JButton manageFingerPrintButton;
    // End of variables declaration//GEN-END:variables
}