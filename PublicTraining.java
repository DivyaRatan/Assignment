package com.inheritance.intermediate;

public class PublicTraining extends Training {

	int participants;
	int getValue;

	// Constructor
	public PublicTraining() {

	}

	public PublicTraining(int id, String Subject, int fees, int participants) {
		super(id, Subject, fees);
		this.participants = participants;

	}

	// Function for getting fee
	void getOrderValue() {
		getValue = fees * participants;
		System.out.println("Fees of Public Training " + getValue);
	}
}
