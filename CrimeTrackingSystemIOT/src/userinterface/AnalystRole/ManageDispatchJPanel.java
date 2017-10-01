/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AnalystRole;

import Business.Enterprise.Enterprise;
import Business.Organization.AnalystOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DispatchArrivalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deivakumaran
 */
public class ManageDispatchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDispatchJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private AnalystOrganization analystOrganization;
    private Enterprise enterprise;

    public ManageDispatchJPanel(JPanel userProcessContainer, Enterprise enterprise, AnalystOrganization analystOrganization, UserAccount account) {

        initComponents();
        this.enterprise = enterprise;
        this.account = account;
        this.analystOrganization = analystOrganization;
        this.userProcessContainer = userProcessContainer;
        populateDispatch();
    }

    public void populateDispatch() {
        DefaultTableModel model = (DefaultTableModel) dispatchTable.getModel();
        model.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization.getName().equalsIgnoreCase(Organization.Type.Analyst.getValue())) {
                for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                    if ((request.getName()).equals(WorkRequest.Type.Dispatch.getValue())) {
                        DispatchArrivalWorkRequest dispatch = (DispatchArrivalWorkRequest) request;
                        Object[] row = new Object[6];
                        row[0] = dispatch;

                        row[1] = dispatch.getSender();
                        row[2] = dispatch.getReceiver();
                        row[3] = dispatch.getStatus();
                        row[4] = dispatch.getStreetline1() + "," + dispatch.getCity() + "," + dispatch.getZipCode() + "," + dispatch.getZipCode();

                        model.addRow(row);
                    }
                }
            }
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

        assignToMebutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dispatchTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(196, 232, 255));

        assignToMebutton.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        assignToMebutton.setText("Assign to me");
        assignToMebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMebuttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("Manage Dispatch Request");

        backButton.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AnalystRole/Back3Blue.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        dispatchTable.setBackground(new java.awt.Color(196, 232, 255));
        dispatchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Location"
            }
        ));
        dispatchTable.setSelectionForeground(new java.awt.Color(224, 244, 255));
        dispatchTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(dispatchTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 598, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(assignToMebutton))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(500, 500, 500))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(709, 709, 709))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(assignToMebutton))
                .addContainerGap(545, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void assignToMebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMebuttonActionPerformed
        // TODO add your handling code here:
        int selectedRow = dispatchTable.getSelectedRow();

        if (selectedRow >= 0) {
            DispatchArrivalWorkRequest request = (DispatchArrivalWorkRequest) dispatchTable.getValueAt(selectedRow, 0);
            request.setStatus("Received");
            request.setReceiver(account);
            populateDispatch();
            JOptionPane.showMessageDialog(null, "Request assgined to you Sucessfully");

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            return;

        }
    }//GEN-LAST:event_assignToMebuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMebutton;
    private javax.swing.JButton backButton;
    private javax.swing.JTable dispatchTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
