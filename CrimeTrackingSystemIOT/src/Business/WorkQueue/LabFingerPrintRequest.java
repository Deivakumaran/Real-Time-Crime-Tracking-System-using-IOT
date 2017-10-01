/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import javax.swing.ImageIcon;

/**
 *
 * @author deivakumaran
 */
public class LabFingerPrintRequest extends WorkRequest {

    private String result;
    ImageIcon image;
    private int caseID;
    private int space;
    private static int count;

    public LabFingerPrintRequest() {
        super(WorkRequest.Type.FingerPrint.getValue());
        count++;
        caseID = count;

    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public int getCaseID() {
        return caseID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
