import java.io.PrintWriter;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of matrix");
		int a[][]=new int[5][5];
		int b[][]=new int[5][5];
		System.out.println("Enter First Matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();				
			}
		}
		System.out.println("Enter Second Matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();				
			}
		}
		System.out.println("First Matrix Using Simple Method");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
				
			}
			System.out.println("\n");
		}
		System.out.println("Second Matrix using PrintWriter Method");
		
		PrintWriter ps=new PrintWriter(System.out);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				ps.print(b[i][j]+"\t");
				
			}
			ps.println("\n");
		}
		ps.close();
		
	}

}
