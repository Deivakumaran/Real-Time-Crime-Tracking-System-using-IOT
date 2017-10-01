/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Ecosystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author deivakumaran
 */
public abstract class Role {

    private String name;

    public Role(String name) {
        this.name = name;
    }

    public enum RoleType {
        Admin("Admin"),
        Public("Public"),
        Investigator("Inverstigator"),
        BloodSpatter("BloodSpatterAnalyst"),
        FingerPrint("FingerPrintanalyst"),
        LabAssistant("Lab Assistant"),
        Commissioner("Commissioner"),
        Attorney("Attorney"),
        SystemAdmin("SystemAdmin"),
        Justice("Justice");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public String getName() {
        return name;
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Ecosystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
