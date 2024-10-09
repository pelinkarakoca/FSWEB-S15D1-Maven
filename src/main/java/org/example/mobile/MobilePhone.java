package org.example.mobile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MobilePhone {
	private String myNumber;
	private List<Contact> myContacts = new LinkedList<>();

	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
	}

	public MobilePhone(String myNumber, List<Contact> myContacts) {
		this.myNumber = myNumber;
		this.myContacts = myContacts;
	}

	public String getMyNumber() {
		return myNumber;
	}

	public void setMyNumber(String myNumber) {
		this.myNumber = myNumber;
	}

	public List<Contact> getMyContacts() {
		return myContacts;
	}

	public void setMyContacts(List<Contact> myContacts) {
		this.myContacts = myContacts;
	}

	public boolean addNewContact(Contact contact) {
		if (!myContacts.contains(contact)) {
			myContacts.add(contact);
			return true;
		}
		return false;
	}

	public boolean updateContact(Contact oldContact, Contact newContact) {
		if (myContacts.contains(oldContact)) {
			myContacts.set(myContacts.indexOf(oldContact), newContact);
			return true;
		}
		return false;
	}

	public boolean removeContact(Contact contact) {
		if (myContacts.contains(contact)) {
			myContacts.remove(contact);
			return true;
		}
		return false;
	}

	public int findContact(Contact contact) {
		if (myContacts.contains(contact)) {
			return myContacts.indexOf(contact);
		}
		return -1;
	}

	public int findContact(String contactName) {
		for (int i = 0; i < myContacts.size(); i++) {
			if (myContacts.get(i).getName().equals(contactName)) {
				return i;
			}
		}
		return -1;
	}

	public Contact queryContact(String contactName){
		int findContactIndex = findContact(contactName);
		if(findContactIndex == -1) {
			return null;
		}
		return myContacts.get(findContactIndex);
	}

	public void printContact(){
		for(int i = 0; i < myContacts.size(); i++){
			System.out.println((i+1) + ". " + myContacts.get(i).getName() + " ->" + myContacts.get(i).getPhoneNumber());
		}
	}

}