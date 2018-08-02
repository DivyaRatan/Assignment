package com.inheritance.intermediate;

public class TrainingTest {
	public static void main(String args[]) {
		// taking input
		Training Public = new PublicTraining(4, "Java", 5000, 50);
		Training Corporate = new CorporateTraining(5, "Big Data", 3500, 4);
		// Calling the function
		Public.getOrderValue();
		Corporate.getOrderValue();

	}

}
