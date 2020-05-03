package com.learnjava.learnings;

public class Laptops {

	private String brand;
	private String color;
	private String Processor;
	private boolean state;

	public Laptops(String brand, String color, String Processor) {

		this.brand = brand;
		this.color = color;
		this.Processor = Processor;
		System.out.println("This Laptops Brand is " + brand);
		System.out.println("This Laptops Color is " + color);
		System.out.println("This Laptops Processor is " + Processor);
	}

	/**
	 * @return the state
	 */
	public boolean isState() {
		System.out.println("Laptops Currunt State is " + state);
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}

}
