package task4A;

/**
 * In this test I attempt to get the details of a Car, However this code will error on compiler as the getModel()
 * method is set to private in the Car.Java class and therefore cannot be accessed in this class showing that data hiding is currently working.
 */

import java.lang.reflect.Field;

public class ReflectionTest04 
{
	public static void main(String[] args) throws Exception 
	{
	    Car c = new Car();
	    Field[] fields = c.getClass().getFields();
	    System.out.printf("There are %d fields\n", fields.length);
	    for (Field f : fields) 
	    {
	      System.out.printf("Manufacturer=%s Model=%s type=%s DoorCount=%f EngineSize=%f Taxed=%b\n",
	    		  c.getManufacturer(),
	    		  c.getModel(),
	    		  c.getType(),
	    		  c.getDoorCount(),
	    		  c.getEngineSize(),
	    		  c.getTaxed());
	    }
	}
}
