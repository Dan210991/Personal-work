package task4A;

/**
 * This test shows that it is possible to access data about the Car class and whether or not it is accessible,
 * When ran the console will display information on the name, data type and the accessibility of the method.
 */

import java.lang.reflect.Field;

public class ReflectionTest05 
{
	public static void main(String[] args) throws Exception {
	    Car c = new Car();
	    Field[] fields = c.getClass().getDeclaredFields();
	    System.out.printf("There are %d fields\n", fields.length);

	    for (Field f : fields) {
	      System.out.printf("Name=%s - Type=%s - Accessibility=%s\n\n",
	    		  f.getName(),
	    		  f.getType(),
	    		  f.isAccessible());
	    }
	  }
}
