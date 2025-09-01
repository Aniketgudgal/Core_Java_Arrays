/*
Count Pairs with Given Sum
Count how many pairs in an unsorted array sum up to a target using two pointers.
*/
import java.util.Scanner;
public class PairsSum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the target");
		int target = sc.nextInt();
		int num[] = new int[size];
		// inset value
		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.printf("The target index value is: %d",num[target]);
		System.out.printf("\n");
		// display array
		for(int i = 0; i < num.length; i++)
		{
			System.out.printf(" %d",num[i]);
		}
		System.out.printf("\n");
		// operate array
		for(int i = 0; i < num.length; i++)
		{
			for(int j = 1; j < num.length; j++)
			{
				if((num[i] + num[j]) == num[target])
				{
					System.out.printf("(%d, %d)",num[i], num[j]);
				}
			}
		}
	}
}