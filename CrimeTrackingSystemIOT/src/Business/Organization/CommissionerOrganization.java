/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CommissionerRole;
import Business.Role.InvestigatorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deivakumaran
 */
public class CommissionerOrganization extends Organization {

    public CommissionerOrganization() {
        super(Organization.Type.Commissioner.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CommissionerRole());
        return roles;
    }

}
