/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author deivakumaran
 */
public class CaseWorkRequest extends WorkRequest {

    private String testResult;

    public CaseWorkRequest() {
        super(WorkRequest.Type.Case.getValue());
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

}
