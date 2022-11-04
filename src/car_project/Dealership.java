package car_project;

public class Dealership {

	public static void main(String[] args) {
/*
 * TODO
 * Create a simulated car dealership
 * Employees/Cars/Customers
 * 
 * Employees sell vehicles
 * Vehicles drive customers
 * Customers own vehicles
 */
		
		Customer cx1 = new Customer();
		Employee emp1 = new Employee();
		Vehicle vec1 = new Vehicle();
		
		cx1.setName("Todd");
		cx1.setAddress("123 fake Street");
		cx1.setBudet(5000);
		cx1.setCashHand(4);
		cx1.setCredScore(650);
		
		
		emp1.setMinCreditScore(500);
		emp1.setMinSellValue(8000);
		emp1.setName("Andrew");
		
		vec1.setAccidents(1);
		vec1.setBasePrice(6000);
		vec1.setManufacturer("NoYoda");
		vec1.setMiles(4566787);
		vec1.setModel("The Baguette");
		vec1.setMpg(12.34);
		vec1.setYear(2000);
		
		
		cx1.purchaseCar(vec1, emp1, false);
		/*
		 * handleCx(Customer cust, boolean finance, Vehicle vehicle)
		 * 	if(finance == true)
		 * 		runCredit(Customer cust, double doubleAmnt)
		 * 	else if(vehicle.getPrice()<= cust.cashOnHand)
		 * 		sell
		 * 	else:
		 * 		need more money
		 */

	}

}
