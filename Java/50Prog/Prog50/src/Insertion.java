import java.util.Arrays;
import java.util.Scanner;

public class Insertion
{ 
	public static void main(String args[]) 
	{
		int[] unsorted = new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
			unsorted[i]=sc.nextInt();
		
		System.out.println("Before sorting : " + Arrays.toString(unsorted));
		insertionSort(unsorted);
		System.out.println("After sorting : " + Arrays.toString(unsorted)); } 

		public static void insertionSort(int[] unsorted) 
		{
			for (int i = 1; i < unsorted.length; i++) 
			{
				int j = i;
				while (j > 0 && unsorted[j] < unsorted[j- 1]) 
				{ 
					int temp = unsorted[j - 1];
					unsorted[j - 1] = unsorted[j];
					unsorted[j] = temp;
					j--; 
				}
			}
		}
}
