package task4A;

/**
 * This test class shows more into how it is still possible to access data regardless if it is set to private or not,
 * under normal circumstances the getModel() method should not be accessible outside the Car.Java class yet I am able to access
 * all the methods that make up a car and see the default values assigned to them thanks to the setAccessible() flag which overrides
 * the previous declaration of private.
 **/

import java.lang.reflect.Field;

public class ReflectionTest06 
{
	public static void main(String[] args) throws Exception {
	    Car c = new Car();
	    Field[] fields = c.getClass().getDeclaredFields();
	    System.out.printf("There are %d fields\n", fields.length);

	    for (Field f : fields) {
	      f.setAccessible(true);
	      System.out.printf("field name=%s type=%s value=%s\n",
	    		  f.getName(),
	    		  f.getType(),
	    		  f.get(c));
	    }
	}
}
