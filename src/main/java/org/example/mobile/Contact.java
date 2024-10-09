package org.example.mobile;

import java.util.Objects;

public class Contact {
	private String name;
	private String phoneNumber;

	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static Contact createContact(String name, String phoneNumber){
		return new Contact(name, phoneNumber);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Contact contact)) return false;
		return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
