package car_project;

public class Customer {
	/*
	 * TODO
	 * Name
	 * Maximum price
	 * Credit score
	 * Address
	 * Cash on hand
	 */
	//Creating instances of this class in the dealership
	
	//Personal- add in cx budget and employee minimum offer
//	public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
//	}
	
	private String name;
	private String address;
	private double budget;
	private double cashHand;
	private int credScore;
	private boolean hasCar = false;
	
	public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
		employee.setOffer((vehicle.getBasePrice()* 1.25));
		
		while(employee.getOffer() > budget) {
			double temp = employee.getOffer();
			
			if(temp * .9 >= employee.getMinSellValue()) {
				employee.setOffer(temp);
			}
			else {
				System.out.println("Min sell greater than budget - break");
				break;
			}
		}
		
		if (employee.getOffer() <= budget) {
			
			if(finance == true) {
				System.out.println("financing");
				if(cashHand >= (vehicle.getBasePrice())*.1) {
					employee.financeCar(this);
				}
				else {
					System.out.println("No car - not financed");
				}
			}
			
			else if(cashHand >= vehicle.getBasePrice()) {
				System.out.println("buy cash");
				hasCar = true;
				cashHand = cashHand - vehicle.getBasePrice();
				
				System.out.println("Has car - had cash");
			}
			
			else {
				System.out.println("No car - not enough cash");
			}
		}
		
		else {
			System.out.println("No car");
		}
	}
	
	//Getters/Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public double getBudet() {
		return budget;
	}
	public void setBudet(double budet) {
		this.budget = budet;
	}
	
	
	public double getCashHand() {
		return cashHand;
	}
	public void setCashHand(double cashHand) {
		this.cashHand = cashHand;
	}
	
	
	public boolean isHasCar() {
		return hasCar;
	}
	public void setHasCar(boolean hasCar) {
		this.hasCar = hasCar;
	}
	public int getCredScore() {
		return credScore;
	}
	public void setCredScore(int credScore) {
		this.credScore = credScore;
	}
}
