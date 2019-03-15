package org.centronelson.sec.login;

public class UserNew {
	String firstName;
	String lastName;
	String password;
	public UserNew() {}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserNew [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + "]";
	}
	
}
