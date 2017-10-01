/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BloodSpatterAnalystRole;
import Business.Role.FingerPrintAnalystRole;
import Business.Role.InvestigatorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deivakumaran
 */
public class AnalystOrganization extends Organization {

    public AnalystOrganization() {
        super(Organization.Type.Analyst.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodSpatterAnalystRole());
        roles.add(new FingerPrintAnalystRole());
        return roles;
    }
}
