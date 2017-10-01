/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Criminal;

import Business.Person.Person;

/**
 *
 * @author deivakumaran
 */
public class Criminal extends Person {
    private int criminalID;
    private int numberOfCasesConvicted;
    private String sexualAssault;
    private String robbery;
    private String murder;
    private int age;
    private IdentificationSigns identificationSigns;
    private static int count = 1;
    public Object getCriminalID;

    public Criminal() {
        identificationSigns = new IdentificationSigns();
        criminalID = count;
        count++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int getCriminalID() {
        return criminalID;
    }

    public int getNumberOfCasesConvicted() {
        return numberOfCasesConvicted;
    }

    public void setNumberOfCasesConvicted(int numberOfCasesConvicted) {
        this.numberOfCasesConvicted = numberOfCasesConvicted;
    }

    public String getSexualAssault() {
        return sexualAssault;
    }

    public void setSexualAssault(String sexualAssault) {
        this.sexualAssault = sexualAssault;
    }

    public String getRobbery() {
        return robbery;
    }

    public void setRobbery(String robbery) {
        this.robbery = robbery;
    }

    public String getMurder() {
        return murder;
    }

    public void setMurder(String murder) {
        this.murder = murder;
    }

    public IdentificationSigns getIdentificationSigns() {
        return identificationSigns;
    }

    public void setIdentificationSigns(IdentificationSigns identificationSigns) {
        this.identificationSigns = identificationSigns;
    }

     public IdentificationSigns addIdentificationSigns (String helicalRotation,int diameter, int helicalTurn,int roationPerBase,int meanPropellerTwist,double distanceBetweenAdjacentPhosphates,String fingerType,int spacing){
         IdentificationSigns identificationSigns = new IdentificationSigns();
     identificationSigns.setHelicalTurn(helicalTurn);
     identificationSigns.setHelicalRotation(helicalRotation);
     identificationSigns.setDiameter(diameter);
     identificationSigns.setRoationPerBase(roationPerBase);
     identificationSigns.setMeanPropellerTwist(meanPropellerTwist);
     identificationSigns.setDistanceBetweenAdjacentPhosphates(distanceBetweenAdjacentPhosphates);
     identificationSigns.setFingerPrintType(fingerType);
     identificationSigns.setSpacing(spacing);
         return identificationSigns;
     }
}
