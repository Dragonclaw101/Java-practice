package car_project;

public class Employee {
	/*
	 * TODO
	 * Name
	 * MinSellValue
	 * MinCreditScore
	 */
	
	private int minCreditScore;
	private double offer;
	private String name;
	private double minSellValue;
	
	public void  financeCar(Customer cx) {
		System.out.println("Ran credit check");
		
		if(cx.getCredScore() >= minCreditScore) {
			cx.setHasCar(true);
			System.out.println("Has car- good credit");
		}
		
		else {
			cx.setHasCar(false);
			System.out.println("No car - bad credit");
		}
	}

	public int getMinCreditScore() {
		return minCreditScore;
	}

	public void setMinCreditScore(int minCreditScore) {
		this.minCreditScore = minCreditScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMinSellValue() {
		return minSellValue;
	}

	public void setMinSellValue(double minSellValue) {
		this.minSellValue = minSellValue;
	}

	public double getOffer() {
		return offer;
	}

	public void setOffer(double offer) {
		this.offer = offer;
	}
	
	
	
}
