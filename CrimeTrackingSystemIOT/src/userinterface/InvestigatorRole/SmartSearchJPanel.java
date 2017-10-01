/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InvestigatorRole;

import Business.Criminal.Criminal;
import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrganization;
import Business.Organization.InvestigatorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EnquiryReportRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deivakumaran
 */
public class SmartSearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SmartSearch
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private InvestigatorOrganization investigatorOrganization;

    SmartSearchJPanel(JPanel userProcessContainer, Enterprise enterprise, InvestigatorOrganization investigatorOrganization, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.investigatorOrganization = investigatorOrganization;
        populateInvestigationTable();
        populateCriminalTable();
    }

    
    public void populateInvestigationTable() {
        DefaultTableModel model = (DefaultTableModel) firTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : investigatorOrganization.getWorkQueue().getWorkRequestList()) {
            if ((request.getName()).equals(WorkRequest.Type.Enquiry.getValue())) {
               Object[] row = new Object[5];
                row[0] = request;
                int id = ((EnquiryReportRequest) request).getEnquiryID();
                row[1] = id;
                String victim = ((EnquiryReportRequest) request).getVictimName();
                row[2] = victim;
                String finger = ((EnquiryReportRequest) request).getFingerPrintType();
                row[3] = finger;
                int helical = ((EnquiryReportRequest) request).getHelicalTurn();
                row[4] = helical;
                model.addRow(row);
           

            }
        }
    }

    
    public void populateCriminalTable() {
        DefaultTableModel model = (DefaultTableModel) criminalTable.getModel();
        model.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

            if (organization.getName().equalsIgnoreCase(Organization.Type.Admin.getValue())) {
                AdminOrganization admin = (AdminOrganization) organization;
                for (Criminal criminal : admin.getCriminalDirectory().getCriminalList()) {
                    Object[] row = new Object[6];
                    row[0] = criminal;
                    row[1] = criminal.getCriminalID();
                    row[2] = criminal.getLastName();
                    //row[3] = criminal.getLastName();
                    row[3] = criminal.getNumberOfCasesConvicted();
                    model.addRow(row);
                }
            }

        }
    }

   
    public void populateTableforFinger(String type,int spacing) {
        DefaultTableModel model = (DefaultTableModel) criminalTable.getModel();
        model.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization.getName().equalsIgnoreCase(Organization.Type.Admin.getValue())) {

            AdminOrganization admin = (AdminOrganization) organization;

            for (Criminal criminal : admin.getCriminalDirectory().getCriminalList()) {
                if ((String.valueOf(type).matches(String.valueOf( criminal.getIdentificationSigns().getFingerPrintType()))
                 ||(String.valueOf(spacing).matches(String.valueOf( criminal.getIdentificationSigns().getSpacing()))))){
                    Object[] row = new Object[6];
                    row[0] = criminal;
                    row[1] = criminal.getCriminalID();
                    row[2] = criminal.getLastName();
                    //row[3] = criminal.getLastName();
                    row[3] = criminal.getNumberOfCasesConvicted();
                    model.addRow(row);
                }

            }
        }
    }
    }
    
        public void  populateTableforDNA(String helicalRotation,int diameter,int helicalTurn,int rotationPerBase,int meanPropellerTwist,double distanceBetweenAdjacentPhosphates) {
        DefaultTableModel model = (DefaultTableModel) criminalTable.getModel();
        model.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization.getName().equalsIgnoreCase(Organization.Type.Admin.getValue())) {

            AdminOrganization admin = (AdminOrganization) organization;

            for (Criminal criminal : admin.getCriminalDirectory().getCriminalList()) {
                if ((String.valueOf(helicalRotation).matches(String.valueOf( criminal.getIdentificationSigns().getHelicalRotation()))
                 &&(Integer.valueOf(helicalTurn).equals(Integer.valueOf(criminal.getIdentificationSigns().getHelicalTurn())))
                 &&(Integer.valueOf(diameter).equals(Integer.valueOf(criminal.getIdentificationSigns().getDiameter()))))
             &&(Integer.valueOf(meanPropellerTwist).equals(Integer.valueOf(criminal.getIdentificationSigns().getMeanPropellerTwist())))
         &&(Double.valueOf(distanceBetweenAdjacentPhosphates).equals(Double.valueOf(criminal.getIdentificationSigns().getDistanceBetweenAdjacentPhosphates())))){
                    Object[] row = new Object[6];
                    row[0] = criminal;
                    row[1] = criminal.getCriminalID();
                    row[2] = criminal.getLastName();
                    //row[3] = criminal.getLastName();
                    row[3] = criminal.getNumberOfCasesConvicted();
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
        backButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        firTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        criminalTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        populateButton = new javax.swing.JButton();
        addToCaseButton = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        dnaCheckBox = new javax.swing.JCheckBox();
        fingerCheckBox = new javax.swing.JCheckBox();
        searchButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(196, 232, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("Smart Search");

        backButton.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/InvestigatorRole/Back3Blue.png"))); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        firTable.setBackground(new java.awt.Color(225, 244, 255));
        firTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Crime Type", "EnquiryID", "Victim Name", "FingerPrint", "DNA helical Turn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        firTable.setGridColor(new java.awt.Color(225, 244, 255));
        firTable.setSelectionForeground(new java.awt.Color(224, 244, 255));
        jScrollPane2.setViewportView(firTable);

        criminalTable.setBackground(new java.awt.Color(225, 244, 255));
        criminalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FirstName", "Criminal ID", "LastName", "Cases Convicted"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        criminalTable.setSelectionForeground(new java.awt.Color(224, 244, 255));
        jScrollPane3.setViewportView(criminalTable);

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel4.setText("Last Name");

        firstNameTextField.setEnabled(false);

        lastNameTextField.setEnabled(false);

        populateButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        populateButton.setText("Populate");
        populateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                populateButtonActionPerformed(evt);
            }
        });

        addToCaseButton.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        addToCaseButton.setText("Add to Case");
        addToCaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCaseButtonActionPerformed(evt);
            }
        });

        searchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Critera", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 18))); // NOI18N

        dnaCheckBox.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        dnaCheckBox.setText("DNA");

        fingerCheckBox.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        fingerCheckBox.setText("Finger Print");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fingerCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(dnaCheckBox)
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dnaCheckBox)
                    .addComponent(fingerCheckBox)))
        );

        searchButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        searchButton.setText("Search");
        searchButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/InvestigatorRole/smartSearch.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(populateButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(85, 85, 85)
                                .addComponent(addToCaseButton))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(271, 271, 271))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(populateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToCaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addContainerGap(329, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void populateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_populateButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = criminalTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "No row was selected");
            return;
        }
               Criminal criminal = (Criminal) criminalTable.getValueAt(selectedRow, 0);
        //       criminalIDTextField.setText(String.valueOf(criminal.getCriminalID));
               firstNameTextField.setText(criminal.getFirstName());
               lastNameTextField.setText(criminal.getLastName());

                
    }//GEN-LAST:event_populateButtonActionPerformed

    private void addToCaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCaseButtonActionPerformed
        // TODO add your handling code here:
        if(firstNameTextField.getText().equals("")||
                lastNameTextField.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Appropriate fields must be added","WARNING",JOptionPane.WARNING_MESSAGE);

        }
        int selectedRow = firTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "No row was selected");
            return;
        }
        EnquiryReportRequest enquiryReportRequest = (EnquiryReportRequest) firTable.getValueAt(selectedRow, 0);
        
        /*int id ;
        
        try{
            id = Integer.valueOf(criminalIDTextField.getText());
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "DNA values should be in numbers", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }*/
        //enquiryReportRequest.setCriminalID(Integer.valueOf(criminalIDTextField.getText()));
      
        enquiryReportRequest.setCriminalFirstName(firstNameTextField.getText());
        enquiryReportRequest.setCriminalLastName(lastNameTextField.getText());
        enquiryReportRequest.setStatus("Warrant pending");
        JOptionPane.showMessageDialog(this, "Added to Case");

    }//GEN-LAST:event_addToCaseButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = firTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "No row was selected");

        }
        else {
            int res=0;
            int finger=0;
            int dna=0;
            for (Component c : searchPanel.getComponents()) {
                if (c.getClass().equals(JCheckBox.class)) {

                    JCheckBox jcb = (JCheckBox) c;
                    if (jcb.isSelected()) {
                        if ("Finger Print".equals(jcb.getText())){
                            finger=finger+1;

                        }
                        if ("DNA".equals(jcb.getText())){

                            dna=dna+1;
                        }
                        res=res+1;
                    }
                }

            }

            if (res <= 0){
                JOptionPane.showMessageDialog(this,"No Search Criteria found ");
            }
            // if((fingerCheckBox.isEnabled())&& (dnaCheckBox.isEnabled())){
                else{
                    if (finger > 0){
                        EnquiryReportRequest enquiryReportRequest = (EnquiryReportRequest) firTable.getValueAt(selectedRow, 0);
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

                            if (organization.getName().equalsIgnoreCase(Organization.Type.Admin.getValue())) {
                                AdminOrganization admin = (AdminOrganization) organization;
                                for (Criminal criminal : admin.getCriminalDirectory().getCriminalList()) {
                                    if ((String.valueOf(enquiryReportRequest.getFingerPrintType()).matches(String.valueOf( criminal.getIdentificationSigns().getFingerPrintType()))
                                        ||(String.valueOf(enquiryReportRequest.getFingerSpacing()).matches(String.valueOf( criminal.getIdentificationSigns().getSpacing()))))){
                                    String type = enquiryReportRequest.getFingerPrintType();
                                    int spacing=enquiryReportRequest.getFingerSpacing();
                                    populateTableforFinger(type,spacing);

                                }
                            }
                        }
                    }
                }

                if (dna > 0){
                    EnquiryReportRequest enquiryReportRequest = (EnquiryReportRequest) firTable.getValueAt(selectedRow, 0);
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

                        if (organization.getName().equalsIgnoreCase(Organization.Type.Admin.getValue())) {
                            AdminOrganization admin = (AdminOrganization) organization;
                            for (Criminal criminal : admin.getCriminalDirectory().getCriminalList()) {
                                if ((String.valueOf(enquiryReportRequest.getHelicalRotation()).matches(String.valueOf( criminal.getIdentificationSigns().getHelicalRotation()))
                                    &&(Integer.valueOf(enquiryReportRequest.getHelicalTurn()).equals(Integer.valueOf(criminal.getIdentificationSigns().getHelicalTurn())))
                                    &&(Integer.valueOf(enquiryReportRequest.getDiameter()).equals(Integer.valueOf(criminal.getIdentificationSigns().getDiameter()))))
                                &&(Integer.valueOf(enquiryReportRequest.getMeanProperTwist()).equals(Integer.valueOf(criminal.getIdentificationSigns().getMeanPropellerTwist())))
                                &&(Double.valueOf(enquiryReportRequest.getDistanceBetweenAdjacentPhospates()).equals(Double.valueOf(criminal.getIdentificationSigns().getDistanceBetweenAdjacentPhosphates())))){      String helicalRotation = enquiryReportRequest.getHelicalRotation();

                                int diameter=enquiryReportRequest.getDiameter();
                                int helicalTurn=enquiryReportRequest.getHelicalTurn();
                                int rotationPerBase=enquiryReportRequest.getRotationPerBase();
                                int meanPropellerTwist = enquiryReportRequest.getMeanProperTwist();
                                double distanceBetweenAdjacentPhosphates=enquiryReportRequest.getDistanceBetweenAdjacentPhospates();
                                populateTableforDNA(helicalRotation,diameter,helicalTurn,rotationPerBase,meanPropellerTwist,distanceBetweenAdjacentPhosphates);

                            }
                        }
                    }
                }
            }

        }
        }
        //if ((!(fingerCheckBox.isEnabled()))&& (!(dnaCheckBox.isEnabled()))){

            // JOptionPane.showMessageDialog(this,"No Search Criteria");
            //}

        /*EnquiryReportRequest enquiryReportRequest = (EnquiryReportRequest) firTable.getValueAt(selectedRow, 0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

            if (organization.getName().equalsIgnoreCase(Organization.Type.Admin.getValue())) {
                AdminOrganization admin = (AdminOrganization) organization;
                for (Criminal criminal : admin.getCriminalDirectory().getCriminalList()) {
                    if (String.valueOf(enquiryReportRequest.getHelicalTurn()).matches(String.valueOf( criminal.getIdentificationSigns().getHelicalTurn())));
                    //int name = enquiryReportRequest.getHelicalTurn();
                    //populateTable(name);

                }
            }
        }*/

    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCaseButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTable criminalTable;
    private javax.swing.JCheckBox dnaCheckBox;
    private javax.swing.JCheckBox fingerCheckBox;
    private javax.swing.JTable firTable;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton populateButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    // End of variables declaration//GEN-END:variables
}
