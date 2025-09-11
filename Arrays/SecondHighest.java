/*
1.Write a program to find the second largest element in an array.
*/
import java.util.Scanner;
public class SecondHighest
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		System.out.printf("Enter the values in array");
		//insert values in array
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		//perform operations
		int secondMax = 0;
		int max = a[0];
		for(int i = 0; i < a.length - 1; i++)
		{
			if(a[i] < a[i+1]) // 1 < 2
			{
				secondMax = max;
				max = a[i + 1];
				if(a[i] > secondMax && a[i] < max)
				{
					secondMax = a[i];
				}
			}
		}
		System.out.printf("\nThe max is: "+max);
		System.out.printf("\nThe second max is: "+secondMax);
	}
}