package sjd;

import java.util.*;

public class SwitchCases {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		switch(n)
//		{
//		case 1:
//			System.out.println("Mon");
//			break;
//		case 2:
//			System.out.println("Tue");
//			break;
//		case 3:
//			System.out.println("Wed");
//			break;
//		case 4:
//			System.out.println("Thu");
//			break;
//		case 5:
//			System.out.println("Fri");
//			break;
//		case 6:
//			System.out.println("Sat");
//			break;
//		case 7:
//			System.out.println("Sun");
//			break;
//		default:
//			System.out.println("Invalid No");
//		}
		
		
//		switch(n)
//		{
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("Weekday");
//			break;
//		case 6:
//		case 7:
//			System.out.println("Weekend");
//			break;
//		default:
//			System.out.println("Invalid No");
//		}
		
		
		switch(n)
		{
		case 1,2,3,4,5 -> System.out.println("Weekday");
		case 6,7 -> System.out.println("Weekend");
		default -> System.out.println("Invalid No");
		}
		sc.close();
	}
}
