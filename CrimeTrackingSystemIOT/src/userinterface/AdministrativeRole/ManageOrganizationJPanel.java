/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deivakumaran
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDirectory;
    private JPanel userProcessContainer;
    public int counter_1 = 0;
    public int counter_2 = 0;
    public int counter_3 = 0;
    public int counter_4 = 0;
    public int counter_5 = 0;
    public int counter_6 = 0;
    public int counter_7 = 0;
    public int counter_8 = 0;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory directory, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = directory;
        populateTable();
        populateEnterpriseCombo();
        populateCombo();

    }

    private void populateCombo() {
        organizationJComboBox.removeAllItems();
        // Enterprise enterprise = (Enterprise) enterprisejComboBox.getSelectedItem();
        for (Type type : Organization.Type.values()) {
            organizationJComboBox.addItem(type);
        }
    }

    private void populateEnterpriseCombo() {
        enterprisejComboBox.removeAllItems();
        for (Enterprise.EnterpriseType typeenterprise : Enterprise.EnterpriseType.values()) {
            enterprisejComboBox.addItem(typeenterprise.getValue());
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : organizationDirectory.getOrganizationList()) {
            Object[] row = new Object[4];
            row[0] = organization;
            row[1] = organization.getOrganizationID();
            row[2] = organization.getName();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        enterprisejComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(196, 232, 255));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        addJButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        organizationJComboBox.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Organization Type ");

        backJButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/Back3Blue.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DeleteButton.setText("Delete Organization");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Enterprise Type");

        enterprisejComboBox.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        enterprisejComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel6.setText("Manage Organization");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(702, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(enterprisejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(backJButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DeleteButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(539, 539, 539))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(716, 716, 716))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel6)
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(enterprisejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJButton)
                    .addComponent(backJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteButton)
                .addContainerGap(361, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Type type = (Type) organizationJComboBox.getSelectedItem();

        if (counter_1 == 0 && type.getValue().equals(Type.Commissioner.getValue())) {
            organizationDirectory.createOrganization(type);
            counter_1++;
            JOptionPane.showMessageDialog(this, "Organization Created");
            populateTable();

        } else if (counter_2 == 0 && type.getValue().equals(Type.Admin.getValue())) {
            organizationDirectory.createOrganization(type);
            counter_2++;
            JOptionPane.showMessageDialog(this, "Organization Created");
            populateTable();

        } else if (counter_3 == 0 && type.getValue().equals(Type.Analyst.getValue())) {
            organizationDirectory.createOrganization(type);
            counter_3++;
            JOptionPane.showMessageDialog(this, "Organization Created");
            populateTable();

        } else if (counter_4 == 0 && type.getValue().equals(Type.Attorney.getValue())) {
            organizationDirectory.createOrganization(type);
            counter_4++;
            JOptionPane.showMessageDialog(this, "Organization Created");
            populateTable();

        } else if (counter_5 == 0 && type.getValue().equals(Type.Investigator.getValue())) {
            organizationDirectory.createOrganization(type);
            counter_5++;
            JOptionPane.showMessageDialog(this, "Organization Created");
            populateTable();

        } else if (counter_6 == 0 && type.getValue().equals(Type.Justice.getValue())) {
            organizationDirectory.createOrganization(type);
            counter_6++;
            JOptionPane.showMessageDialog(this, "Organization Created");
            populateTable();

        } else if (counter_7 == 0 && type.getValue().equals(Type.Lab.getValue())) {
            organizationDirectory.createOrganization(type);
            counter_7++;
            JOptionPane.showMessageDialog(this, "Organization Created");
            populateTable();

        } else if (counter_8 == 0 && type.getValue().equals(Type.Public.getValue())) {
            organizationDirectory.createOrganization(type);
            counter_8++;
            JOptionPane.showMessageDialog(this, "Organization Created");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(this, "Cant be added twice");
            return;
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = organizationJTable.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the Organization", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Organization organization = (Organization) organizationJTable.getValueAt(selectedRow, 0);
                organizationDirectory.deleteOrganization(organization);
                JOptionPane.showMessageDialog(null, "Organization successfully Deleted");
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select Valid Organization", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_DeleteButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox enterprisejComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
