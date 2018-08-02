package com.inheritance.intermediate;

public class CorporateTraining extends Training {

	int days;
	int getValue;

	// Constructor
	CorporateTraining() {

	}

	CorporateTraining(int id, String Subject, int fees, int days) {
		super(id, Subject, fees);
		this.days = days;

	}

	// Function for getting fee
	void getOrderValue() {
		getValue = fees * days;
		System.out.println("Fees of Corporate Training " + getValue);
	}
}
