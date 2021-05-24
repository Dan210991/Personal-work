package task3;

public class QuitOption extends Main implements SwitchStrategy{

	@Override
	public void run() 
		{
			if (_d == null) 
			{
				System.out.println("It is a shame that you did not want to play");
		        }
			else 
		        {
		          System.out.println("Thankyou for playing");
		        }
		        System.exit(0);        
		}
		
	

}
