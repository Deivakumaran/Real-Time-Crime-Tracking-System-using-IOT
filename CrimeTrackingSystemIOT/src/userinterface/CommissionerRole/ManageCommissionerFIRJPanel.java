/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CommissionerRole;

import Business.Chart.Bar_Chart;
import Business.Enterprise.Enterprise;
import Business.Organization.CommissionerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EnquiryReportRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author deivakumaran
 */
public class ManageCommissionerFIRJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageFIRJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private CommissionerOrganization commissionerOrganization;
    private Enterprise enterprise;

    public ManageCommissionerFIRJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount, CommissionerOrganization commissionerOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = userAccount;
        this.commissionerOrganization = commissionerOrganization;
        this.enterprise = enterprise;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) firTable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : commissionerOrganization.getWorkQueue().getWorkRequestList()) {
            if (request.getName().equals(WorkRequest.Type.Enquiry.getValue())) {

                Object[] row = new Object[5];
                row[0] = request;
                int id = ((EnquiryReportRequest) request).getEnquiryID();
                row[1] = id;
                String victim = ((EnquiryReportRequest) request).getVictimName();
                row[2] = victim;
                row[3] = request.getSender();
                String result = ((EnquiryReportRequest) request).getResult();
                row[4] = result == null ? "Not Reviewed" : result;
                model.addRow(row);
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

        processButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        firTable = new javax.swing.JTable();
        firReportYearWiseButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(196, 232, 255));

        processButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        processButton.setText("Process");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/CommissionerRole/Back3Blue.png"))); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("Manage FIR");

        firTable.setBackground(new java.awt.Color(225, 244, 255));
        firTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CrimeType", "Enquiry ID", "Victim Name", "Sender", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        firTable.setSelectionForeground(new java.awt.Color(224, 244, 255));
        jScrollPane1.setViewportView(firTable);
        if (firTable.getColumnModel().getColumnCount() > 0) {
            firTable.getColumnModel().getColumn(0).setResizable(false);
            firTable.getColumnModel().getColumn(1).setResizable(false);
            firTable.getColumnModel().getColumn(2).setResizable(false);
            firTable.getColumnModel().getColumn(3).setResizable(false);
            firTable.getColumnModel().getColumn(4).setResizable(false);
        }

        firReportYearWiseButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        firReportYearWiseButton.setText("FIR Report");
        firReportYearWiseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firReportYearWiseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(processButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(firReportYearWiseButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(627, 627, 627)
                        .addComponent(jLabel1)))
                .addContainerGap(693, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(firReportYearWiseButton))
                .addGap(59, 59, 59)
                .addComponent(processButton)
                .addContainerGap(508, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        // TODO add your handling code here:
        int row = firTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        EnquiryReportRequest enquiryReportRequest = (EnquiryReportRequest) firTable.getValueAt(row, 0);
        if (enquiryReportRequest.getResult().equalsIgnoreCase("Sent")) {

            ViewCommisionerEnquiryJPanel viewCommisionerEnquiryJPanel = new ViewCommisionerEnquiryJPanel(userProcessContainer, enquiryReportRequest);
            userProcessContainer.add("viewCommisionerEnquiryJPanel", viewCommisionerEnquiryJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Approved request cannot be processed again", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_processButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void firReportYearWiseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firReportYearWiseButtonActionPerformed
        // TODO add your handling code here:

        Bar_Chart demo = new Bar_Chart("Bar Chart Demo", enterprise, commissionerOrganization);
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }//GEN-LAST:event_firReportYearWiseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton firReportYearWiseButton;
    private javax.swing.JTable firTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processButton;
    // End of variables declaration//GEN-END:variables

}
