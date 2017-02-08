import java.util.Scanner;

public class Harmonic 
{
		public static void main(String[] args){
			int num,i;
			double value = 0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter N");
			num =sc.nextInt();
			if(num==0)
				System.out.println("Value of N can not be zero");
			else{
				for(i=1;i<=num;i++){
					value = value + (1.0f/i);
				}
				System.out.println("Harmonic value of "+num+" is "+value);
			}

		}
	
}
/*For example:
______4_____		__4___
1/10+1/12+1/16+1/8= 89/240
 */