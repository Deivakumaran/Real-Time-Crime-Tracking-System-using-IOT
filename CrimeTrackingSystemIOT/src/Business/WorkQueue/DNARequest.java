/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author deivakumaran
 */
public class DNARequest extends WorkRequest {

    private String sample;
    private String helicalRotation;
    private String diameter;
    private String helicalTurn;
    private String rotationPerBase;
    private String meanProperTwist;
    private String distanceBetweenAdjacentPhospates;
    private int caseID;
    private String comment;
    private static int count;

    public DNARequest() {
        super(WorkRequest.Type.DNA.getValue());
        count++;
        caseID = count;
    }

    public int getCaseID() {
        return caseID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSample() {
        return sample;
    }

    public String getHelicalRotation() {
        return helicalRotation;
    }

    public String getDiameter() {
        return diameter;
    }

    public String getHelicalTurn() {
        return helicalTurn;
    }

    public String getRotationPerBase() {
        return rotationPerBase;
    }

    public String getMeanProperTwist() {
        return meanProperTwist;
    }

    public String getDistanceBetweenAdjacentPhospates() {
        return distanceBetweenAdjacentPhospates;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public void setHelicalRotation(String helicalRotation) {
        this.helicalRotation = helicalRotation;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public void setHelicalTurn(String helicalTurn) {
        this.helicalTurn = helicalTurn;
    }

    public void setRotationPerBase(String rotationPerBase) {
        this.rotationPerBase = rotationPerBase;
    }

    public void setMeanProperTwist(String meanProperTwist) {
        this.meanProperTwist = meanProperTwist;
    }

    public void setDistanceBetweenAdjacentPhospates(String distanceBetweenAdjacentPhospates) {
        this.distanceBetweenAdjacentPhospates = distanceBetweenAdjacentPhospates;
    }

}
