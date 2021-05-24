package task4;

import static task4.CarUnit.checkStringEquals;
import static task4.CarUnit.checkStringNotEquals;
import static task4.CarUnit.checkEquals;
import static task4.CarUnit.checkNotEquals;
import static task4.CarUnit.checkIsTrue;
import static task4.CarUnit.checkIsFalse;
import static task4.CarUnit.report;


public class TestCar 
{
	
	public static final Object Car = new Object();
	
	
//Checking Car Manufacturer
	
	//Equal
	
	private void assertEqualManufacturer() 
	{
		Car car1 = new Car("Ford", "Focus", "Hatchback", 3, 1.2, true);
		Car car2 = new Car("Honda", "Accord", "Saloon", 4, 1.8, true);
		String expectedResult = "Ford";
		
		checkStringEquals(expectedResult, car1.getManufacturer());
		checkStringEquals(car1.getManufacturer(), car2.getManufacturer());
	}
	
	//Not Equal
	
	private void assertNotEqualManufacturer() 
	{
		Car car1 = new Car("Honda", "Accord", "Saloon", 3, 1.2, true);
		Car car2 = new Car("Honda", "Accord", "Saloon", 4, 1.8, true);
		String expectedResult = "Ford";
		
		checkStringNotEquals(expectedResult, car1.getManufacturer());
		checkStringNotEquals(car1.getManufacturer(), car2.getManufacturer());
	}
	
//Checking Car Model
	
	//Equal
	
	private void assertEqualModel() 
	{
		Car car1 = new Car("Ford", "Focus", "Hatchback", 3, 1.2, true);
		Car car2 = new Car("Honda", "Accord", "Saloon", 4, 1.8, true);
		String expectedResult = "Focus";
		
		checkStringEquals(expectedResult, car1.getModel());
		checkStringEquals(car1.getModel(), car2.getModel());
	}
	
	//Not Equal
	
	private void assertNotEqualModel() 
	{
		Car car1 = new Car("Honda", "Accord", "Saloon", 3, 1.2, true);
		Car car2 = new Car("Honda", "Accord", "Saloon", 4, 1.8, true);
		String expectedResult = "Focus";
		
		checkStringNotEquals(expectedResult, car1.getModel());
		checkStringNotEquals(car1.getModel(), car2.getModel());
	}
	
//Checking Car Type	
	
	//Equal
	
	private void assertEqualType() 
	{
		Car car1 = new Car("Ford", "Focus", "Hatchback", 3, 1.2, true);
		Car car2 = new Car("Honda", "Accord", "Saloon", 4, 1.8, true);
		String expectedResult = "Hatchback";
		
		checkStringEquals(expectedResult, car1.getType());
		checkStringEquals(car1.getType(), car2.getType());
	}
	
	//Not Equal
	
	private void assertNotEqualType() 
	{
		Car car1 = new Car("Honda", "Accord", "Saloon", 3, 1.2, true);
		Car car2 = new Car("Honda", "Accord", "Saloon", 4, 1.8, true);
		String expectedResult = "Hatchback";
		
		checkStringNotEquals(expectedResult, car1.getType());
		checkStringNotEquals(car1.getType(), car2.getType());
	}
	
//Checking Door Count
	
	//Equal
	
	private void assertEqualDoorCount() 
	{
		Car car1 = new Car("Ford", "Focus", "Hatchback", 3, 1.2, true);
		Car car2 = new Car("Honda", "Accord", "Saloon", 4, 1.8, true);
		double expectedResult = 3;
		
		checkEquals(expectedResult, car1.getDoorCount());
		checkEquals(car1.getDoorCount(), car2.getDoorCount());
	}
	
	//Not Equal
	
	private void assertNotEqualDoorCount() 
	{
		Car car1 = new Car("Ford", "Focus", "Hatchback", 3, 1.2, true);
		Car car2 = new Car("Honda", "Accord", "Saloon", 3, 1.8, true);
		double expectedResult = 7;
		
		checkNotEquals(expectedResult, car2.getDoorCount());
		checkNotEquals(car1.getDoorCount(), car2.getDoorCount());
	}
	
//Checking Engine size
	
	//Equal

	private void assertEqualEngineSize() 
	{
		Car car1 = new Car("Ford", "Focus", "Hatchback", 3, 1.8, true);
		Car car2 = new Car("Honda", "Accord", "Saloon", 3, 0.8, true);
		double expectedResult = 1.8;
		
		checkEquals(expectedResult, car1.getEngineSize());
		checkEquals(car1.getEngineSize(), car2.getEngineSize());
		
	}

	//Not Equal
	
	private void assertNotEqualEngineSize() 
	{
		Car car1 = new Car("Ford", "Focus", "Hatchback", 3, 1.6, true);
		Car car2 = new Car("Honda", "Accord", "Saloon", 3, 1.6, true);
		double expectedResult = 1.8;
		
		checkNotEquals(expectedResult, car1.getEngineSize());
		checkNotEquals(car1.getEngineSize(), car2.getEngineSize());
	}

//Checking tax

	//True
	
	private boolean checkTrueBool(boolean Taxed) 
	{
		Car car1 = new Car("Ford", "Focus", "Hatchback", 3, 1.2, true);
		Car car2 = new Car("Honda", "Accord", "Saloon", 3, 1.8, false);
		
		checkIsTrue(car1.getTaxed());
		checkIsTrue(car2.getTaxed());
		
		return Taxed;	
	}
	
	//False
	
	private boolean checkFalseBool(boolean Taxed) 
	{
		Car car1 = new Car("Ford", "Focus", "Hatchback", 3, 1.2, false);
		Car car2 = new Car("Honda", "Accord", "Saloon", 3, 1.8, true);
		
		checkIsFalse(car1.getTaxed());
		checkIsFalse(car2.getTaxed());
		
		return Taxed;	
	}

	//Runs Tests
	
	public static void main(String[] args) {
	    TestCar tc = new TestCar();
	    
	    tc.assertEqualManufacturer();
	    tc.assertNotEqualManufacturer();
	    
	    tc.assertEqualModel();
	    tc.assertNotEqualModel();
	    
	    tc.assertEqualType();
	    tc.assertNotEqualType();
	    
	    tc.assertEqualDoorCount();
	    tc.assertNotEqualDoorCount();
	    
	    tc.assertEqualEngineSize();
	    tc.assertNotEqualEngineSize();
	    
	    tc.checkTrueBool(true);
	    tc.checkFalseBool(false);
	    
	    report();
	  }

}
