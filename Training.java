package com.inheritance.intermediate;

abstract public class Training {
	int id;
	String Subject;
	int fees;

	// Constructor
	public Training() {

	}

	public Training(int id, String Subject, int fees) {
		this.id = id;
		this.Subject = Subject;
		this.fees = fees;
	}

	// Function for overriding
	abstract void getOrderValue();
}
