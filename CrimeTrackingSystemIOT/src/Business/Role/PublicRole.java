/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PublicOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Public.PublicWorkAreaJPanel;

/**
 *
 * @author deivakumaran
 */
public class PublicRole extends Role {

    public PublicRole() {
        super(Role.RoleType.Public.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new PublicWorkAreaJPanel(userProcessContainer, account, (PublicOrganization) organization, business, enterprise);
    }

}
