/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InvestigatorRole;

import Business.Enterprise.Enterprise;
import Business.Organization.AnalystOrganization;
import Business.Organization.InvestigatorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AlarmWorkRequest;
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
public class ManageAnalystJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAnalystJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private InvestigatorOrganization investigatorOrganization;
    private Enterprise enterprise;

    public ManageAnalystJPanel(JPanel userProcessContainer, Enterprise enterprise, InvestigatorOrganization investigatorOrganization, UserAccount account) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.enterprise = enterprise;
        this.account = account;
        this.investigatorOrganization = investigatorOrganization;
        this.userProcessContainer = userProcessContainer;
        populateTable();
        dispathRequestPopulateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) analystTable.getModel();

        model.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization.getName().equalsIgnoreCase(Organization.Type.Analyst.getValue())) {
                for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[4];
                    row[0] = userAccount;

                    row[1] = userAccount.getEmployee().getName();
                    row[2] = userAccount.getEmployee().getId();
                    model.addRow(row);
                }
            }
        }
    }

    public void dispathRequestPopulateTable() {
        DefaultTableModel model = (DefaultTableModel) statusTable.getModel();
        model.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization.getName().equalsIgnoreCase(Organization.Type.Analyst.getValue())) {
                for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                    if ((request.getName()).equals(WorkRequest.Type.Dispatch.getValue())) {
                        DispatchArrivalWorkRequest dispatch = (DispatchArrivalWorkRequest) request;
                        Object[] row = new Object[6];
                        //row[0] = dispatch;
                        row[0] = dispatch.getMessage();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        analystTable = new javax.swing.JTable();
        requestButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        statusTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(196, 232, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("Manage Analyst Request");

        analystTable.setBackground(new java.awt.Color(225, 244, 255));
        analystTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "AnalystName", "Analyst ID"
            }
        ));
        analystTable.setGridColor(new java.awt.Color(225, 244, 255));
        analystTable.setSelectionForeground(new java.awt.Color(224, 244, 255));
        jScrollPane1.setViewportView(analystTable);

        requestButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        requestButton.setText("Send Request");
        requestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonActionPerformed(evt);
            }
        });

        statusTable.setBackground(new java.awt.Color(225, 244, 255));
        statusTable.setModel(new javax.swing.table.DefaultTableModel(
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
        statusTable.setGridColor(new java.awt.Color(225, 244, 255));
        statusTable.setSelectionForeground(new java.awt.Color(224, 244, 255));
        statusTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(statusTable);

        backButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/InvestigatorRole/Back3Blue.png"))); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(671, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backButton)
                        .addComponent(requestButton)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(427, 427, 427))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(requestButton)
                .addGap(86, 86, 86)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(backButton)
                .addContainerGap(274, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = analystTable.getSelectedRow();

        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to select the Analyst", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                UserAccount userAccount = (UserAccount) analystTable.getValueAt(selectedRow, 0);

                for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
                    if (request.getName().equals(WorkRequest.Type.Alarm.getValue())) {
                        AlarmWorkRequest Aw = (AlarmWorkRequest) request;
                        DispatchArrivalWorkRequest daWorkRequest = new DispatchArrivalWorkRequest();
                        daWorkRequest.setMessage("Arrive at the Location");
                        daWorkRequest.setSender(account);
                        daWorkRequest.setStatus("Requested");
                        daWorkRequest.setStreetline1(Aw.getStreetline1());
                        daWorkRequest.setCity(Aw.getCity());
                        daWorkRequest.setState(Aw.getState());
                        daWorkRequest.setCountry(Aw.getCountry());
                        daWorkRequest.setZipCode(Aw.getZipCode());

                        Organization org = null;
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof AnalystOrganization) {
                                org = organization;
                                break;
                            }
                        }
                        if (org != null) {
                            org.getWorkQueue().getWorkRequestList().add(daWorkRequest);
                            userAccount.getWorkQueue().getWorkRequestList().add(daWorkRequest);
                            populateTable();
                            dispathRequestPopulateTable();
                            JOptionPane.showMessageDialog(null, "Request Sent Succesfully to Analyst Team");
                            break;
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please Select Valid Analyst", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_requestButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable analystTable;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton requestButton;
    private javax.swing.JTable statusTable;
    // End of variables declaration//GEN-END:variables
}
