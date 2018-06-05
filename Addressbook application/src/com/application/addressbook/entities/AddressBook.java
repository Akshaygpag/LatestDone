package com.application.addressbook.entities;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.application.addressbook.interfaces.VariableHolder;
import com.application.addressbook.util.Utility;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 05-Jun-2018
 */

public class AddressBook implements Serializable, VariableHolder {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private List<Person> contactList = new Vector<Person>();
    private File addressBookLocation;
    private Boolean isChangedSinceLastSave;
    private String addressBookName;

    public String getAddressBookName() {
	this.addressBookName = addressBookLocation.getName().split(EXT)[0];
	return addressBookLocation.getName().split(EXT)[0];
    }

    public void setAddressBookName(String addressBookName) {
	this.addressBookName = addressBookName;
    }

    public AddressBook() {
    }

    public List<Person> getContactList() {
	return contactList;
    }

    public void setContactList(Vector<Person> contactList) {
	this.contactList = contactList;
    }

    public File getAddressBookLocation() {
	return addressBookLocation;
    }

    public void setAddressBookLocation(File addressBookLocation) {
	this.addressBookLocation = addressBookLocation;
    }

    public Boolean getIsChangedSinceLastSave() {
	return isChangedSinceLastSave;
    }

    public void setIsChangedSinceLastSave(Boolean isChangedSinceLastSave) {
	this.isChangedSinceLastSave = isChangedSinceLastSave;
    }

    public void addPerson(Person person) {
	this.contactList.add(person);
    }

    public void editPerson(Person person,int index) {

	Person existingPerson = this.contactList.get(index);

	if (existingPerson == null) {
	    System.out.println("Person not in the address book");
	    return;
	}
	existingPerson.editPerson(person.getMobileNumber(), person.getAddress().getAddressLocation(),
		person.getAddress().getCity(), person.getAddress().getState(), person.getAddress().getZipCode());
	this.setIsChangedSinceLastSave(true);
	System.out.println("Person updated success .");
    }

    public void deletePerson(String number) {
	Person person = Utility.matchNumber(number, this.contactList);
	if (person != null) {
	    this.contactList.remove(person);
		this.setIsChangedSinceLastSave(true);
	    return;
	}
	System.out.println("Person not in the address book");
    }

    public void displayAllPersons() {

	Iterator<Person> iterate = null;
	iterate = contactList.iterator();
	while (iterate.hasNext()) {
	    Person temp = iterate.next();
	    temp.displayPerson();
	}
    }

    public void displayPerson(String number) {

	Iterator<Person> iterate = null;
	iterate = contactList.iterator();
	while (iterate.hasNext()) {
	    Person temp = iterate.next();
	    if (temp.getMobileNumber().equals(number)) {
		temp.displayPerson();
	    }
	}
    }

    public void setContactList(List<Person> contactList) {
	this.contactList = contactList;
    }

    public void displayPerson(String firstName, String lastName) {

	Person person = new Person();
	person.setFirstName(firstName);
	person.setLastName(lastName);
	Person displayPerson = Utility.matchPerson(person, contactList);
	displayPerson.displayPerson();
    }

    public void sortByZipCode() {

	Comparator<Person> sortZipCode = (Person first, Person second) -> {
	
	    if ((first.getAddress().getZipCode().compareTo(second.getAddress().getZipCode())) == 0) {

		if ((first.getFirstName().compareTo(second.getFirstName())) < 0) {
		    return -1;
		} else if ((first.getFirstName().compareTo(second.getFirstName())) > 0) {
		    return 1;
		} else {
		    return 0;
		}

	    } else if ((first.getAddress().getZipCode().compareTo(second.getAddress().getZipCode())) < 0) {
		return -1;
	    }
	    return 1;

	};

	this.contactList.sort(sortZipCode);
	this.setIsChangedSinceLastSave(true);
	System.out.println("Sorted by zip code");
    }

    public void sortByName() {

	Comparator<Person> sortName = (Person first, Person second) -> {

	    if ((first.getFirstName().compareTo(second.getFirstName())) < 0) {
		return -1;
	    } else if ((first.getFirstName().compareTo(second.getFirstName())) == 0) {
		if ((first.getLastName().compareTo(second.getLastName())) < 0) {

		    return -1;
		} else if ((first.getLastName().compareTo(second.getLastName())) > 0) {

		    return 1;
		} else {
		    return 0;
		}

	    } else
		return 1;

	};

	this.contactList.sort(sortName);
	this.setIsChangedSinceLastSave(true);
	System.out.println("Sorted by name");

    }
}
