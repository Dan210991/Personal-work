package task3;

public class PlayOption extends Main implements SwitchStrategy
{
	@Override
	public void run()
	{
		System.out.println();
        String h4 = "Select difficulty";
        String u4 = h4.replaceAll(".", "=");
        System.out.println(u4);
        System.out.println(h4);
        System.out.println(u4);
        System.out.println("1) Simples");
        System.out.println("2) Not-so-simples");
        System.out.println("3) Super-duper-shuffled");
	}

}
