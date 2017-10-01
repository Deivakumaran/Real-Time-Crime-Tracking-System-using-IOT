/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Criminal.CriminalDirectory;
import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deivakumaran
 */
public class AdminOrganization extends Organization {

    private CriminalDirectory criminalDirectory;

    public AdminOrganization() {
        super(Organization.Type.Admin.getValue());
        criminalDirectory = new CriminalDirectory();
    }

    public CriminalDirectory getCriminalDirectory() {
        return criminalDirectory;
    }

    public void setCriminalDirectory(CriminalDirectory criminalDirectory) {
        this.criminalDirectory = criminalDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }

}
