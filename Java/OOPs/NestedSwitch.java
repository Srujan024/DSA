package sjd;

import java.util.*;

public class NestedSwitch {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int stuid = sc.nextInt();
		String dept = sc.next();
		
		switch(stuid)
		{
		case 1 -> System.out.println("SJD");
		case 2 -> System.out.println("MADDY");
		case 3 -> {
			System.out.println("KIRMADA");
			switch(dept)
			{
			case "Dev" -> System.out.println("Developer");
			case "Test" -> System.out.println("Tester");
			}
		}
		case 4 -> System.out.println("SEDEZ");
		default -> System.out.println("Invalid Data");
		}
		
		sc.close();
	}
}
