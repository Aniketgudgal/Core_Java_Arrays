/*
	Find the Maximum Subarray Sum using Kadane's Algorithm
*/
import java.util.Scanner;
public class MaxSumSubarray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int nums[] = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		int maxSum = Integer.MIN_VALUE;
		int maxArray = 0;
		int sum = 0;
		int i = 0; 
		int j = 0;
		while(i < nums.length)
		{
			sum = sum + nums[i];
			if(sum > maxSum)
			{
				if((i-j+1)> maxArray)
				{
					maxArray = (i-j+1);
					maxSum = sum;
				}
			}
			if(sum > maxSum)
			{
				if(sum > maxSum)
				{
					if((i-j+1)> maxArray)
					{
						maxArray = (i-j+1);
						maxSum = sum;
					}
				}
				sum = sum - nums[j];
				j++;
				
			}
			if(sum < 0)
			{
				sum = 0;
			}
			i++;
		}
		System.out.println("Max Sum is: "+maxSum);
	}
}