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
public class EnquiryReportRequest extends WorkRequest {

    private int enquiryID;
    private String enquiryDescription;
    private int suspectPersonID;
    private String suspectName;
    private int victimID;
    private String victimName;
    private String motive;
    private static int count1 = 1000;
    private static int count2 = 3200;
    private static int count3 = 0;
    private String result;
    private String crimeType;
    private String fingerPrintType;
    private int fingerSpacing;
    private String helicalRotation;
    private int diameter;
    private int helicalTurn;
    private int rotationPerBase;
    private int meanProperTwist;
    private double distanceBetweenAdjacentPhospates;
    private String comment;
    private int criminalID;
    private String criminalFirstName;
    private String criminalLastName;
    private int caseID;

    public EnquiryReportRequest() {
        super(WorkRequest.Type.Enquiry.getValue());
        count1++;
        count2++;
        count3++;
        suspectPersonID = count1;
        victimID = count2;
        enquiryID = count3;

    }

    public int getCaseID() {
        return caseID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public int getEnquiryID() {
        return enquiryID;
    }

    public void setEnquiryID(int enquiryID) {
        this.enquiryID = enquiryID;
    }

    public String getEnquiryDescription() {
        return enquiryDescription;
    }

    public void setEnquiryDescription(String enquiryDescription) {
        this.enquiryDescription = enquiryDescription;
    }

    public int getSuspectPersonID() {
        return suspectPersonID;
    }

    public void setSuspectPersonID(int suspectPersonID) {
        this.suspectPersonID = suspectPersonID;
    }

    public String getSuspectName() {
        return suspectName;
    }

    public void setSuspectName(String suspectName) {
        this.suspectName = suspectName;
    }

    public int getVictimID() {
        return victimID;
    }

    public void setVictimID(int victimID) {
        this.victimID = victimID;
    }

    public String getVictimName() {
        return victimName;
    }

    public void setVictimName(String victimName) {
        this.victimName = victimName;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public String getFingerPrintType() {
        return fingerPrintType;
    }

    public void setFingerPrintType(String fingerPrintType) {
        this.fingerPrintType = fingerPrintType;
    }

    public int getFingerSpacing() {
        return fingerSpacing;
    }

    public void setFingerSpacing(int fingerSpacing) {
        this.fingerSpacing = fingerSpacing;
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

    public int getRotationPerBase() {
        return rotationPerBase;
    }

    public void setRotationPerBase(int rotationPerBase) {
        this.rotationPerBase = rotationPerBase;
    }

    public int getMeanProperTwist() {
        return meanProperTwist;
    }

    public void setMeanProperTwist(int meanProperTwist) {
        this.meanProperTwist = meanProperTwist;
    }

    public double getDistanceBetweenAdjacentPhospates() {
        return distanceBetweenAdjacentPhospates;
    }

    public void setDistanceBetweenAdjacentPhospates(double distanceBetweenAdjacentPhospates) {
        this.distanceBetweenAdjacentPhospates = distanceBetweenAdjacentPhospates;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getCriminalID() {
        return criminalID;
    }

    public void setCriminalID(int criminalID) {
        this.criminalID = criminalID;
    }

    public String getCriminalFirstName() {
        return criminalFirstName;
    }

    public void setCriminalFirstName(String criminalFirstName) {
        this.criminalFirstName = criminalFirstName;
    }

    public String getCriminalLastName() {
        return criminalLastName;
    }

    public void setCriminalLastName(String criminalLastName) {
        this.criminalLastName = criminalLastName;
    }

    @Override
    public String toString() {
        return crimeType;
    }

}
