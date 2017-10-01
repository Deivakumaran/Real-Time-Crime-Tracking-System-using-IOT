/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InvestigatorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deivakumaran
 */
public class InvestigatorOrganization extends Organization {

    public InvestigatorOrganization() {
        super(Organization.Type.Investigator.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InvestigatorRole());
        return roles;
    }
}
