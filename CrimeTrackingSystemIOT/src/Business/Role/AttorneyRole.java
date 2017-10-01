/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AttorneyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AttorneyRole.AttorneyWorkAreaJPanel;

/**
 *
 * @author deivakumaran
 */
public class AttorneyRole extends Role {

    public AttorneyRole() {
        super(Role.RoleType.Attorney.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new AttorneyWorkAreaJPanel(userProcessContainer, account, (AttorneyOrganization) organization, enterprise, business);
    }

}
