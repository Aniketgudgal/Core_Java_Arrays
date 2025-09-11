/*
5.Write a program to sort an array in ascending order without using built-in sort methods. in while loop
*/
import java.util.Scanner;
public class SortArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[6];
		System.out.printf("the size is: %d",arr.length);
		System.out.println("\nEnter the values in array");
		//insert values in array
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int i = 0, j = 0;
		//sorting the array without any methods
		while(i < arr.length)
		{
			j = i;
			while(j < arr.length)
			{
				if(arr[i] > arr[j]) // if we give < means array goes descending order sorted
				{
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
				j++;
			}
			i++;
		}
		//display array
		for(int k = 0; k < arr.length; k++)
		{
			System.out.printf(" %d",arr[k]);
		}
		System.out.printf("\n");
	}
}