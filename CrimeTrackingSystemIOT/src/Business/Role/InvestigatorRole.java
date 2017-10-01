/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InvestigatorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InvestigatorRole.InvestigatorWorkAreaJPanel;

/**
 *
 * @author deivakumaran
 */
public class InvestigatorRole extends Role {

    public InvestigatorRole() {
        super(Role.RoleType.Investigator.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new InvestigatorWorkAreaJPanel(userProcessContainer, account, (InvestigatorOrganization) organization, enterprise);
    }
}
