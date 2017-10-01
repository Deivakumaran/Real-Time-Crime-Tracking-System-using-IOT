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
public class AlarmWorkRequest extends WorkRequest {

    private int requestId;
    private static int count = 1;
    private String status;
    private String streetline1;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String latitude;
    private String longitude;

    public AlarmWorkRequest() {
        super(WorkRequest.Type.Alarm.getValue());
        requestId = count;
        count++;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStreetline1() {
        return streetline1;
    }

    public void setStreetline1(String streetline1) {
        this.streetline1 = streetline1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
