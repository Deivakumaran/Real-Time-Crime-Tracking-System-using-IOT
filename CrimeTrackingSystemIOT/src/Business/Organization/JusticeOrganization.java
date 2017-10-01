/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AttorneyRole;
import Business.Role.JusticeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deivakumaran
 */
public class JusticeOrganization extends Organization {

    public JusticeOrganization() {
        super(Organization.Type.Justice.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new JusticeRole());
        return roles;
    }
}
