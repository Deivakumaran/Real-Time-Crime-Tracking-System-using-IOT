/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdministrativeRole.AdminPoliceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author deivakumaran
 */
public class AdminRole extends Role {

    public AdminRole() {
        super(Role.RoleType.Admin.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        System Ecosystem = null;
        return new AdminPoliceWorkAreaJPanel(userProcessContainer, enterprise, business);
    }
}
