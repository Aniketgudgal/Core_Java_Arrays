/*
Q2. WAP to create create matrix of 3 x 3 and sort the row data  and display it
*/
import java.util.Scanner;
public class ColumnDataSortRow
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int[][] nums = new int[3][3];
		//insert value in array
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = xyz.nextInt();
			}
		}
		//sort column
		for(int i = 0; i < nums.length; i++)
		{
			int n[] = new int[nums.length];
			for(int j = 0; j < nums.length; j++)
			{
				n[j] = nums[i][j];
			}
			for(int j = 0; j < n.length ;j++)
			{
				for(int k = j+1; k < n.length;k++)
				{
					
				if(n[j] > n[k])
				{
					int temp = n[k];
					n[k] = n[j];
					n[j] = temp;
				}
				}
			}
			System.out.printf("\n");
			for(int j = 0; j < n.length;j++)
			{
				System.out.printf(" %d",n[j]);
			}
			
		}
	}
}