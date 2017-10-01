/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author deivakumaran
 */
public class Ecosystem extends Organization {

    private static Ecosystem Ecosystem;
    private ArrayList<Network> networkList;
    
    public Ecosystem(){
        super(null);
        networkList = new ArrayList<Network>();
    }
    
    public static Ecosystem getInstance(){
        if(Ecosystem == null)
            Ecosystem = new Ecosystem();
        return Ecosystem;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public Network createNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public boolean checkIfUserNameIsUnique(String userName){
        boolean flag = true;
        for(Network n:Ecosystem.getNetworkList()){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                    if(o.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                        flag = false;
                }
            }
            
        }
        return flag;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SystemAdminRole());
        return roles;
    }
    
}
