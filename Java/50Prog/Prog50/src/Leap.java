import java.io.*;
import java.util.Scanner;
public class Leap 
{
	public static void main(String args[]) 
	{
		System.out.println("Check leap year or not");
		 
		System.out.println("\nEnter the year : ");
		Scanner sc = new Scanner(System.in);
		
		int year = Integer.parseInt(sc.nextLine());
		
		if(year%400 == 0 && year%4 == 0) 
			System.out.println(year + " is a leap year");

		else 
			System.out.println(year + " is not a leap year");
		
	}
}
