package task5;

import java.util.Arrays;
import java.util.List;


public class List02 
{
	public static void main(String[] args) {
		List<Weapon> table = Arrays.asList(
			new Weapon("5.56x45", "AK-101", "Kalashnikov Concern", (float) 1.56, 150, 405, 35, 650, 650, "Single / Auto", true, true),
			new Weapon("5.56x45", "HK 416A5", "Heckler & Koch", (float) 0.36, 156, 413, 51, 850, 500, "Single / Auto", true, false),
			new Weapon("5.7x28", "FN 5-7", "FN Herstal", (float) 0.00, 330, 240, 86, 30, 50, "Single", true, true),
			new Weapon("9x19", "Saiga-9", "Kalashnikov Concern", (float) 2.41, 55, 305, 32, 650, 300, "Single", true, true),
			new Weapon("9x19", "MPX", "SIG Sauer", (float) 0.00, 67, 333, 40, 850, 500, "Single / Auto", true, true),
			new Weapon("7.62x39", "SKS", "Tula Arsenal", (float) 1.72, 182, 400, 40, 40, 400, "Single", true, false),
			new Weapon("12x70", "M870", "Remington Arms", (float) 13.75, 520, 650, 45, 30, 70, "Single", true, false),
			new Weapon("7.62x54R", "Mosin–Nagant", "Tula Arsenal", (float) 0.38, 338, 975, 13, 30, 1000, "Single", true, true),
			new Weapon("5.56x45", "TX-15 DML", "Lone Star Armory", (float) 0.36, 140, 380, 50, 800, 500, "Single", true, true),
			new Weapon("9x19", "MP5", "Heckler & Koch", (float) 6.86, 73, 340, 50, 800, 200, "Single / Burst / Auto", true, false),
			new Weapon("12.7x55", "Ash-12", "Izhmash", (float) 1.63, 180, 535, 55, 650, 650, "Single / Auto", true, true),
			new Weapon("9x19", "GLOCK 17", "Glock Ges.m.b.H", (float) 0.00, 365, 260, 90, 30, 60, "Single", true, true));
		
		table.stream().forEach(x -> System.out.println(x));
	    System.out.println();
	    table.parallelStream().forEach(System.out::println);
	}
}

/***
This prints the list in a parallel sequence by dividing the list into sections within the compiler and printing off when ready.

On larger scale forms of data this would allow the program to execute much quicker rather then executing in sequence.
***/
