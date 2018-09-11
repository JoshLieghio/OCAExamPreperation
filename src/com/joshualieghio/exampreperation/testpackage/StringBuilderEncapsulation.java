package com.joshualieghio.exampreperation.testpackage;

public class StringBuilderEncapsulation {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();	//creating a new SmartPhone instance 
		System.out.printf("Make and Model: %s %s\n", sp.getManufacturer().toString(), sp.getModel());
		
		StringBuilder tsb = sp.getManufacturer();	// creates a StringBuilder reference that points to the manufacturer in sp Object
		System.out.printf("Test StringBuilder = %s\n", tsb.toString());	
		
		tsb.delete(0, tsb.length());	// clears the test StringBuilder 
		tsb.append("iPhone");			// appends iPhone to the test StringBuilder (this also changes manufacturer) 

		System.out.printf("Test StringBuilder After: %s\n", tsb.toString());	
		System.out.printf("Make and Model after: %s %s\n", sp.getManufacturer().toString(), sp.getModel());
	}

}

class SmartPhone {
	private StringBuilder manufacturer;
	private StringBuilder model;
	
	{
		manufacturer = new StringBuilder("Samsung");
		model = new StringBuilder("S8 Plus");
	}
	
	StringBuilder getManufacturer() { return this.manufacturer; }	// This is NOT encapsulation!
	
	String getModel() { return this.model.toString(); }				// Good encapsulation, because it does not return a reference 
																	// to the actual StringBuilder object
																	// instead it returns the immutable String representation
}
