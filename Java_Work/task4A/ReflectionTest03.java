package task4A;

/**
 *This class shows how it is possible to gather details of another class,
 * by creating a new instance and using the getClass() to see where it is inherited from
 * @author Dan
 *
 **/


public class ReflectionTest03 
{
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("class = " + c.getClass());
		System.out.println("class name = " + c.getClass().getName());
	}
}
