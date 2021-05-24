package task4A;

/**
 * This class shows the difference between public and private Java methods.
 * Using the Car.Java and trying to access the methods within it you can see that it is possible to
 * access the SetManufacturer() method and set to a value as it is a public method so can be accessed outside of its own class. 
 * 
 * Whereas the SetModel() method cannot be accessed at all as it is set to a private method in the Car.java class.
 * 
 * 
 * @author Dan
 *
 */

public class ReflectionTest02 {
	 public static void main(String[] args) {
		    Car c = new Car();
		    c.setManufacturer("Ford");
		     //c.setModel(Focus); 						// if you uncomment this you will get a compiler error
		    String setManufacturer = c.Manufacturer;
		     //String Model = s.Model; 					// if you uncomment this you will get a compiler error
		    System.out.println("c=" + c);
		  }
}
