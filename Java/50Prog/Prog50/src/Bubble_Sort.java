import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsorted = new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
			unsorted[i]=sc.nextInt();
		
		System.out.println("Before sorting : " + Arrays.toString(unsorted));
		bubbleSort(unsorted);
		System.out.println("After sorting : " + Arrays.toString(unsorted)); 
		}

		public static void bubbleSort(int[] unsorted) 
		{
			int n=5;
			int temp=0;
			for(int i=0; i < n; i++)
			{  
                for(int j=1; j < (n-i); j++)
                {  
                	if(unsorted[j-1] > unsorted[j])
                	{  
                		   temp = unsorted[j-1];  
                		   unsorted[j-1] = unsorted[j];  
                		   unsorted[j] = temp; 
                	}
                }
            }
		}
}