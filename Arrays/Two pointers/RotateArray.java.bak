/*
Right Rotate an Array by k position (using Reversal Algorithm)
*/
import java.util.Scanner;
public class RotateArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int nums[] = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.print("Enter the value of K: ");
		int k = sc.nextInt();
		RotateArray.Rotate(nums,0,(nums.length - 1));
		RotateArray.Rotate(nums,0,k-1);
		RotateArray.Rotate(nums,k,(nums.length-1));
		
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(" "+nums[i]);
		}
		
	}
	public static void Rotate(int nums[], int i, int j)
	{
		while(i < j)
		{
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
	}
}