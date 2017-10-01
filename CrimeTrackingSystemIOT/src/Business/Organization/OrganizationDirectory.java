/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author deivakumaran
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Commissioner.getValue())) {
            organization = new CommissionerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Investigator.getValue())) {
            organization = new InvestigatorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Analyst.getValue())) {
            organization = new AnalystOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Public.getValue())) {
            organization = new PublicOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Admin.getValue())) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            organization = new LabOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Attorney.getValue())) {
            organization = new AttorneyOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Justice.getValue())) {
            organization = new JusticeOrganization();
            organizationList.add(organization);
        }

        return organization;
    }

    public void deleteOrganization(Organization organization) {
        organizationList.remove(organization);
    }
}
