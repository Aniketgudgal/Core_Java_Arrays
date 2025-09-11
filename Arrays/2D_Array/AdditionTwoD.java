/*
Q1. WAP to create two matrix of 3 x3  and calculate addition of two matrix and store in third array
*/
import java.util.Scanner;
public class AdditionTwoD
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int [][] nums = new int[3][3];
		int[] sumR = new int[3]; // for row addition
		int[] sumC = new int[3]; // for column addition
		//insert value into 2D array
		System.out.printf("Enter the value in array\n");
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums.length; j++)
			{
				nums[i][j] = xyz.nextInt();
			}
			System.out.printf("\n");
		}
		//sum of row and column
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				sumR[i] += nums[i][j];
				sumC[i] += nums[j][i];
			}
		}
		//display 2D array
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				System.out.printf(" %d",nums[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n Addition of rows \n");
		//display sum row
		for(int i =0; i < sumR.length; i++)
		{
			System.out.printf(" %d",sumR[i]);
		}
		// display sum of column
		System.out.printf("\n The Addition of column \n");
		for(int i =0; i < sumC.length; i++)
		{
			System.out.printf(" %d",sumC[i]);
		}
	}
} 