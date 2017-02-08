import java.util.Scanner;

public class Shoke {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name="";
		int share,price;
		int total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of Shoke Holder");
		name=sc.nextLine();
		System.out.println("Enter No.of shares");
		share=sc.nextInt();
		System.out.println("Enter Price of share");
		price=sc.nextInt();
		
		total=price*share;
		System.out.println("Total cost of share is="+total);
		
	}

}
