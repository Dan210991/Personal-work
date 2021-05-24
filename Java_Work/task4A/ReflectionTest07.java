package task4A;

/**
 * this test shows how I can access the Car object 'c' and change it to another object known as 'x' after using the setAccessible(true) method
 */

import java.lang.reflect.Field;

public class ReflectionTest07 
{
	public static void main(String[] args) throws Exception {
	    Car c = new Car();
	    Field[] fields = c.getClass().getDeclaredFields();
	    System.out.printf("There are %d fields\n", fields.length);
	    for (Field f : fields) {
	      f.setAccessible(true);
	      Object x = f.get(c);
	      f.set(c, x);
	      System.out.printf("field name=%s type=%s value=%s\n",
	    		  f.getName(),
	    		  f.getType(),
	    		  f.get(c));
	    }
	}
}
