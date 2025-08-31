/*
7.Write a program to rotate an array by k positions.
*/
import java.util.Scanner;
public class RotateArray
{
	public static void main(String x[])
	{
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the rotate value K\n");
		int k = sc.nextInt();
		System.out.printf("Enter the values in array\n");
		int i =0; 
		while(i < arr.length)
		{
			arr[i] = sc.nextInt();
			i++;
		}
		while(k != 0)
		{
			int temp = arr[arr.length-1];
			i = arr.length - 1;
			while(i > 0)
			{
				arr[i] = arr[i-1];
				i--;
			}
			arr[i] = temp;
			k--;
		}
		System.out.printf("\nprint rotate array\n");
		while(i < arr.length)
		{
			System.out.printf(" %d",arr[i]);
			i++;
		}
	}
}