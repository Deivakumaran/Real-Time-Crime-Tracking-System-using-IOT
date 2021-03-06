/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AttorneyRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AttorneyOrganization;
import Business.Organization.JusticeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EnquiryReportRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deivakumaran
 */
public class AttorneyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AttorneyWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private AttorneyOrganization attorneyOrganization;
    private Enterprise enterprise;
    private Ecosystem system;

    public AttorneyWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AttorneyOrganization attorneyOrganization, Enterprise enterprise, Ecosystem system) {
        initComponents();
        this.enterprise = enterprise;
        this.account = account;
        this.attorneyOrganization = attorneyOrganization;
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) firTable.getModel();
        model.setRowCount(0);

        for (WorkRequest request : attorneyOrganization.getWorkQueue().getWorkRequestList()) {
            if (request.getName().equalsIgnoreCase(WorkRequest.Type.Enquiry.getValue())) {
                Object[] row = new Object[6];
                row[0] = request;
                int id = ((EnquiryReportRequest) request).getEnquiryID();
                row[1] = id;
                String result = ((EnquiryReportRequest) request).getCriminalFirstName();
                row[2] = result;
                String status = ((EnquiryReportRequest) request).getStatus();
                row[3] = status;
                int number = ((EnquiryReportRequest) request).getCaseID();
                row[4] = number;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        firTable = new javax.swing.JTable();
        createCaseIDButton = new javax.swing.JButton();
        judgeRequestButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(196, 232, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("Attorney Request");

        firTable.setBackground(new java.awt.Color(225, 244, 255));
        firTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CrimeType", "Enquiry ID", "Criminal Name", "Status", "CaseID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(firTable);
        if (firTable.getColumnModel().getColumnCount() > 0) {
            firTable.getColumnModel().getColumn(0).setResizable(false);
            firTable.getColumnModel().getColumn(1).setResizable(false);
            firTable.getColumnModel().getColumn(2).setResizable(false);
            firTable.getColumnModel().getColumn(3).setResizable(false);
            firTable.getColumnModel().getColumn(4).setResizable(false);
        }

        createCaseIDButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        createCaseIDButton.setText("Create Case ID");
        createCaseIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCaseIDButtonActionPerformed(evt);
            }
        });

        judgeRequestButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        judgeRequestButton.setText("Send Request to Judge");
        judgeRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judgeRequestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(judgeRequestButton)
                                .addGap(374, 374, 374)
                                .addComponent(createCaseIDButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(jLabel1)))
                .addContainerGap(641, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCaseIDButton)
                    .addComponent(judgeRequestButton))
                .addContainerGap(585, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createCaseIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCaseIDButtonActionPerformed
        // TODO add your handling code here:
        int row = firTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        EnquiryReportRequest enquiryReportRequest = (EnquiryReportRequest) firTable.getValueAt(row, 0);
        if (enquiryReportRequest.getStatus().equalsIgnoreCase("Attorney Review Pending")) {
            CreateCaseJPanel createCaseJPanel = new CreateCaseJPanel(userProcessContainer, enquiryReportRequest);
            userProcessContainer.add("CreateCaseJPanel", createCaseJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Case created!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_createCaseIDButtonActionPerformed

    private void judgeRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judgeRequestButtonActionPerformed
        // TODO add your handling code here:
        int row = firTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Organization org = null;
        EnquiryReportRequest enquiryReportRequest = (EnquiryReportRequest) firTable.getValueAt(row, 0);
        if (enquiryReportRequest.getStatus().equalsIgnoreCase("Attorney reviewed")) {

            for (Enterprise attorney : system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof JusticeOrganization) {
                        org = organization;
                        break;
                    }
                }
            }
            if (org != null) {
                enquiryReportRequest.setStatus("Judge Review Pending");
                org.getWorkQueue().getWorkRequestList().add(enquiryReportRequest);
                JOptionPane.showMessageDialog(null, "Request sent");
            }

            populateTable();
        } else if (enquiryReportRequest.getStatus().equalsIgnoreCase("Attorney Review Pending")) {
            JOptionPane.showMessageDialog(null, "Case must be created", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Case completed", "Warning", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_judgeRequestButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createCaseIDButton;
    private javax.swing.JTable firTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton judgeRequestButton;
    // End of variables declaration//GEN-END:variables
}
