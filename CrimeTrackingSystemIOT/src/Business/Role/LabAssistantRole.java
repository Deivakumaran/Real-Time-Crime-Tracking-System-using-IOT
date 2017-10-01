/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.LabRole.LabAssistantWorkAreaJPanel;

/**
 *
 * @author deivakumaran
 */
public class LabAssistantRole extends Role {

    public LabAssistantRole() {
        super(Role.RoleType.LabAssistant.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, (LabOrganization) organization, enterprise);
    }

}
