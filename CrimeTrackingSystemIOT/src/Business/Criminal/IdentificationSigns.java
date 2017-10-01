/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Criminal;

/**
 *
 * @author deivakumaran
 */
public class IdentificationSigns {

    private String fingerPrintType;
    private int spacing;
    private String helicalRotation;
    private int diameter;
    private int helicalTurn;
    private int roationPerBase;
    private int meanPropellerTwist;
    private double distanceBetweenAdjacentPhosphates;

    public String getFingerPrintType() {
        return fingerPrintType;
    }

    public void setFingerPrintType(String fingerPrintType) {
        this.fingerPrintType = fingerPrintType;
    }

    public int getSpacing() {
        return spacing;
    }

    public void setSpacing(int spacing) {
        this.spacing = spacing;
    }

    public String getHelicalRotation() {
        return helicalRotation;
    }

    public void setHelicalRotation(String helicalRotation) {
        this.helicalRotation = helicalRotation;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getHelicalTurn() {
        return helicalTurn;
    }

    public void setHelicalTurn(int helicalTurn) {
        this.helicalTurn = helicalTurn;
    }

    public int getRoationPerBase() {
        return roationPerBase;
    }

    public void setRoationPerBase(int roationPerBase) {
        this.roationPerBase = roationPerBase;
    }

    public int getMeanPropellerTwist() {
        return meanPropellerTwist;
    }

    public void setMeanPropellerTwist(int meanPropellerTwist) {
        this.meanPropellerTwist = meanPropellerTwist;
    }

    public double getDistanceBetweenAdjacentPhosphates() {
        return distanceBetweenAdjacentPhosphates;
    }

    public void setDistanceBetweenAdjacentPhosphates(double distanceBetweenAdjacentPhosphates) {
        this.distanceBetweenAdjacentPhosphates = distanceBetweenAdjacentPhosphates;
    }

}
