/*
Q3.WAP to create matrix of 3 x 3 and transpose it means convert row to column and column to row
*/
import java.util.Scanner;
public class TransposeMatrix
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int col = 2;
		int row  = 3;
		int nums[][] = new int[col][row];
		int transpose[][] = new int[row][col];
		//inser value in array
		System.out.printf("The matrix [%d , %d]\n",col,row);
		System.out.printf("Enter the value in array\n");
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = xyz.nextInt();
			}
		}
		for(int i = 0; i < transpose.length; i++)
		{
			for(int j = 0; j < transpose[i].length; j++)
			{
				transpose[i][j] = nums[j][i];
			}
		}
		//display array
		System.out.printf("\n");
		for(int i = 0; i < transpose.length; i++)
		{
			for(int j = 0; j < transpose[i].length; j++)
			{
				System.out.printf(" %d",transpose[i][j]);
			}
			System.out.printf("\n");
		}
	}
}