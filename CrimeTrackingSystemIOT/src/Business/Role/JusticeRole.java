/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.JusticeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Justice.JusticeWorkAreaJPanel;

/**
 *
 * @author deivakumaran
 */
public class JusticeRole extends Role {

    public JusticeRole() {
        super(Role.RoleType.Justice.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new JusticeWorkAreaJPanel(userProcessContainer, account, (JusticeOrganization) organization, enterprise, business);

    }

}
