/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Criminal;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author deivakumaran
 */
public class CriminalDirectory {

    private ArrayList<Criminal> criminalList;

    public CriminalDirectory() {
        criminalList = new ArrayList();
    }

    public ArrayList<Criminal> getCriminalList() {
        return criminalList;
    }

    public Criminal addCriminal(String firstName, String lastName, LocalDate dob, int age, int noOfCases, String SA, String robbery, String murder, String city, String zipCode, String phoneNumber) {
        Criminal criminal = new Criminal();
        criminal.setFirstName(firstName);
        criminal.setLastName(lastName);
        criminal.setDob(dob);
        criminal.setAge(age);
        criminal.setNumberOfCasesConvicted(noOfCases);
        criminal.setMurder(murder);
        criminal.setPhoneNumber(phoneNumber);
        criminal.setRobbery(robbery);
        criminal.setSexualAssault(SA);
        criminal.setCity(city);
        criminal.setZipCode(zipCode);
        LocalDate birthdate = dob;
        criminal.setState("Massachusetts");
        criminal.setCountry("USA");
        criminalList.add(criminal);
        return criminal;
    }

}
