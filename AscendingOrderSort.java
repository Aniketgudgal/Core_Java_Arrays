/*
5.Write a program to sort an array in ascending order without using built-in sort methods.
*/
import java.util.Scanner;
public class AscendingOrderSort
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		System.out.println("Enter the value in array");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i ; j < arr.length;j++)
			{
				if(arr[j] > arr[i])
				{
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		System.out.printf("\nThe array is\n");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.printf(" %d",arr[i]);
		}
		System.out.printf("\n");
	}
}