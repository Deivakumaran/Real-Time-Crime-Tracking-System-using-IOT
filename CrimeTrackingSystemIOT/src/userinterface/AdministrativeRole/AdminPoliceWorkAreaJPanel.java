/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package UserInterface.AdministrativeRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author deivakumaran
 */
public class AdminPoliceWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Ecosystem system;

    /**
     * Creates new form AdminWorkAreaJPanel
     *
     * @param userProcessContainer
     * @param enterprise
     */
    public AdminPoliceWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        valueLabel.setText(enterprise.getName());
        Business.Initialization.initializeCriminal(enterprise.getOrganizationDirectory());

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        userJButton1 = new javax.swing.JButton();
        manageCriminalButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(196, 232, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        manageEmployeeJButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 200, -1));

        manageOrganizationJButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 200, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 120, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 130, -1));

        userJButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        userJButton1.setText("Manage User");
        userJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButton1ActionPerformed(evt);
            }
        });
        add(userJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 200, -1));

        manageCriminalButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        manageCriminalButton.setText("Manage Criminal");
        manageCriminalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCriminalButtonActionPerformed(evt);
            }
        });
        add(manageCriminalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), system);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void userJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButton1ActionPerformed
        // TODO add your handling code here:4
        // ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer,enterprise);
        // CriminalDirectoryJPanel adm = new CriminalDirectoryJPanel(userProcessContainer, enterprise);
        userinterface.AdministrativeRole.ManageUserAccountJPanel ma = new userinterface.AdministrativeRole.ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", ma);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_userJButton1ActionPerformed

    private void manageCriminalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCriminalButtonActionPerformed
        // TODO add your handling code here:
        Business.Initialization.initializeCriminal(enterprise.getOrganizationDirectory());
        userinterface.AdministrativeRole.CriminalDirectoryJPanel adm = new userinterface.AdministrativeRole.CriminalDirectoryJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("adminPublicWorkAreaJPanel", adm);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageCriminalButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageCriminalButton;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
