package com.application.addressbook.entities;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 05-Jun-2018
 */

public class Person implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private Address address;

    public Person() {
    }

    public Person(String firstName, String lastName, Address address, String mobileNumber) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.mobileNumber = mobileNumber;
	this.address = address;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getMobileNumber() {
	return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
    }

    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

    public void editPerson(String mobileNumber, String addressLocation, String city, String state, String zipCode) {
	this.address.editAddress(addressLocation, city, state, zipCode);
	this.mobileNumber = mobileNumber;

    }

    public void displayPerson() {
	String[] printData = new String[7];
	printData[0] = this.getFirstName();
	printData[1] = this.getLastName();
	printData[2] = this.getMobileNumber();
	printData[3] = this.getAddress().getAddressLocation();
	printData[4] = this.getAddress().getCity();
	printData[5] = this.getAddress().getState();
	printData[6] = this.getAddress().getZipCode();
	AtomicInteger atomi = new AtomicInteger(0);
	String contactPersonDetails = String.format(atomi.incrementAndGet()
		+ "First Name :%10s\nLast Name  :%20s\nMobile Number :%20s\nAddress :%20s\nCity :%20s\nState :%20s\nZip Code :%20s\n",
		printData);
	System.out.println(contactPersonDetails);

    }
}
