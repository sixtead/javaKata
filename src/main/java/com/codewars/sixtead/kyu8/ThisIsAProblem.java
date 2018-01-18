package com.codewars.sixtead.kyu8;

class ThisIsAProblem {
    private String firstName;
    private String lastName;
    private String fullName;

    public ThisIsAProblem(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.fullName = first + " " + last;
   }

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return fullName;
	}
}