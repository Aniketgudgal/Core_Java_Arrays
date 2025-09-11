/*
Q1. WAP to create two matrix of 3 x3  and calculate addition of two matrix and store in third matrix
*/
import java.util.Scanner;
public class AdditionInThirdMatrix
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int matx1[][] = new int[3][3];
		int matx2[][] = new int[3][3];
		int sum[][] = new int[3][3];
		//insert into first array
		System.out.printf("Enter the first array value\n");
		for(int i = 0; i < matx1.length; i++)
		{
			for(int j = 0; j < matx1[i].length; j++)
			{
				matx1[i][j] = xyz.nextInt();
			}
		}
		System.out.printf("Enter second array value\n");
		// insert into second array
		for(int i = 0; i < matx2.length; i++)
		{
			for(int j = 0; j < matx2[i].length; j++)
			{
				matx2[i][j] = xyz.nextInt();
			}
		}
		
		// addition in third matrix
		for(int i = 0; i < sum.length; i++)
		{
			for(int j = 0; j < sum[i].length; j++)
			{
				sum[i][j] = matx1[i][j] + matx2[i][j];
			}
		}
		
		//display third matrix
		System.out.printf("Addition in third matrix\n");
		for(int i =0; i < sum.length; i++)
		{
			for(int j = 0; j < sum[i].length; j++)
			{
				System.out.printf(" %d",sum[i][j]);
			}
			System.out.printf("\n");
		}
		
	}
} 