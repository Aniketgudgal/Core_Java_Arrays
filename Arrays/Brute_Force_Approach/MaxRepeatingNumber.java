/*
Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7
*/
public class MaxRepeatingNumber
{
	public static void main(String x[])
	{
		int nums[] = new int[]{2,3,5,3,4,1,7,7,7,7};
		//find maximum repeating number
		int max=nums[0];
		int sum = 0;
		int number = 0;
		// find out the number which is comes in most of the time in array
		for(int i = 0; i < nums.length; i++)
		{
			int count = 0;
			for(int j = 1; j < nums.length; j++)
			{
				if(nums[i] == nums[j] && j != i)
				{
					count++;// count the each number
				}
			}
			if(count > sum)
			{
				sum = count; // if the number sum is greater then other then we have to store that number in sum
				number = nums[i]; // store that number from array into a variable
			}
		}
		//print in console window
		System.out.println("The count is: "+sum);
		System.out.println("The number is: "+number);
	}
}