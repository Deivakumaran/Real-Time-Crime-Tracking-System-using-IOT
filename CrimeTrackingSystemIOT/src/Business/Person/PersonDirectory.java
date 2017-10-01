/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author deivakumaran
 */
public class PersonDirectory {

    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<Person>();

    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(String firstName, String lastName, LocalDate dob, String addressLine1, String addressLine2, String city, String state, String country, String zipCode, String phoneNumber) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setDob(dob);
        person.setStreetName(addressLine1);
        //  person.setAddressLine2(addressLine2);
        person.setCity(city);
        person.setState(state);
        person.setCountry(country);
        person.setZipCode(zipCode);
        person.setPhoneNumber(phoneNumber);
        personList.add(person);
    }
}
