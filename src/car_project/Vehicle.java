package car_project;

public class Vehicle {
	/*
	 * TODO
	 * Vehicle base price
	 * Model
	 * Year
	 * Car company
	 * Miles
	 * Accident number
	 * MPG
	 */

	
	private double basePrice;
	private String model;
	private int year;
	private String manufacturer;
	private double miles;
	private int accidents;
	private double mpg;
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getMiles() {
		return miles;
	}
	public void setMiles(double miles) {
		this.miles = miles;
	}
	public int getAccidents() {
		return accidents;
	}
	public void setAccidents(int accidents) {
		this.accidents = accidents;
	}
	public double getMpg() {
		return mpg;
	}
	public void setMpg(double mpg) {
		this.mpg = mpg;
	}
	
	
	
}
