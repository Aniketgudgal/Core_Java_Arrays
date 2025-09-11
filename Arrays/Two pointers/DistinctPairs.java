/*
Q9. Write a program in java to count all distinct pairs for a specific difference
Expected Output:
 The given array is:
 5 2 3 7 6 4 9 8
 The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
 Number of distinct pairs for difference 5 are: 3
*/
import java.util.Scanner;
import java.util.Arrays;
public class DistinctPairs
{
	public static void main(String x[])
	{
		int arr[] = new int[]{5,2,3,7,6,4,9,8};
		int k = 5;
		System.out.printf("pairs value is: %d\n",k);
		int l = 1;
		//sorting array
		for(int i = 0; i < arr.length && l < arr.length; i++)
		{
			if(arr[i] > arr[l]) // checking the each value using two pointer
			{
				arr[i] = arr[i] + arr[l];
				arr[l] = arr[i] - arr[l];
				arr[i] = arr[i] - arr[l];
			}
			l++;
		}
		//print sorted array
		System.out.printf("Sorted array:");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.printf("\n");
		// find out distinct pairs
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 1; j < arr.length;j++)
			{
			if(arr[j] - arr[i] == k)
			{
				System.out.printf("(%d, %d)",arr[j], arr[i]);
			}
			}
		}
	}
}