/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AnalystOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AnalystRole.AnalystWorkAreaJPanel;

/**
 *
 * @author deivakumaran
 */
public class BloodSpatterAnalystRole extends Role {

    public BloodSpatterAnalystRole() {
        super(Role.RoleType.BloodSpatter.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new AnalystWorkAreaJPanel(userProcessContainer, account, (AnalystOrganization) organization, enterprise);
    }
}
