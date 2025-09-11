/*
4.Write a program to find the missing number in an array of n consecutive integers.
*/
import java.util.Scanner;
public class MissingNumberArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.printf("Enter the value in array\n");
		int i = 0;
		while(i < num.length)
		{
			num[i] = sc.nextInt();
			i++;
		}
		//print missing numbers
		System.out.printf("\nMissing values are following\n");
		for(i = 0; i < num.length - 1; i++)
		{
			int j = num[i] + 1;
			while( j > num[i] && j < num[i+1]) // find out between number & print it
			{
				System.out.printf(" %d",j); // from previous to current number print all numbers 
				j++;
			}
		}
		System.out.printf("\n");
	}
}