/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CommissionerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CommissionerRole.CommissionerMainWorkAreaJPanel;

/**
 *
 * @author deivakumaran
 */
public class CommissionerRole extends Role {

    public CommissionerRole() {
        super(Role.RoleType.Commissioner.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new CommissionerMainWorkAreaJPanel(userProcessContainer, account, (CommissionerOrganization) organization, enterprise, business);
    }

}
