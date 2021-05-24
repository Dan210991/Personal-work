package task4A;

/**
 * This test shows that it is possible by using SetAccessible() to not only access a private class,
 * But also to set that class to a new value (in this case i used a private string to show this).
 */

import java.lang.reflect.Field;

public class ReflectionTest08 
{
	public static void main(String[] args) throws Exception {
	    Car c = new Car();
	    Field[] fields = c.getClass().getDeclaredFields();
	    
	    fields[1].setAccessible(true);
        System.out.println("Model before = " + fields[1].get(c));
        fields[1].set(c, "Focus");
        System.out.println("Model after = " + fields[1].get(c));
	}

}
