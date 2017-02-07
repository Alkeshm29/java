import java.util.Scanner;

public class Factors {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Num");
		int num =sc.nextInt();
		int i = 1;
			
		//while(i*i<=num)
		while(i<=num) 
		{
			if(num%i == 0)
				System.out.println(i + " is a factor");
		    i++;
		}
	}

}
