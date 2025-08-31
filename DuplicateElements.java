/*
6. Write a program to find the duplicate elements in an array.
*/
import java.util.Scanner;
public class DuplicateElements
{
	public static void main(String x[])
	{
		int[] num = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the value in array\n");
		// insert value from user
		int i = 0; 
		while(i < num.length)
		{
			num[i] = sc.nextInt();
			i++;
		}
		//display array
		i = 0;
		while(i < num.length)
		{
			System.out.printf(" %d",num[i]);
			i++;
		}
		System.out.printf("\n");
		//sorting the array 
		i = 0;
		int j = 0;
		while(i < num.length - 1)
		{
			
			j = i+1;
			while(j < num.length)
			{
			if(num[i] > num[j]) 
			{
				num[i] = num[i] + num[j];
				num[j] = num[i] - num[j];
				num[i] = num[i] - num[j];
			}
			else
			{
			j++;
			}
			}
			i++;
		}
		System.out.printf("\n");
		
		//print duplicate value in array
		System.out.printf("Duplicate elements are following\n");
		i = 0;
		while(i < num.length - 1)
		{
			if(num[i] == num[i+1])
			{
				System.out.printf(" %d",num[i]);
			}
			i++;
		}
		
	}
}