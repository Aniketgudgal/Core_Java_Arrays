/*
Q4. WAP to create two matrix of 3 x 3 and perform matrix multiple on two matrix and store its result in 3rd matrix
*/
import java.util.Scanner;
public class MatrixMultiplication
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int nums1[][] = new int[2][2];
		int nums2[][] = new int[2][2];
		int sum[][] = new int[2][2];
		//inset value in first array
		System.out.printf("Enter the value in first array\n");
		for(int i = 0; i < nums1.length; i++)
		{
			for(int j = 0; j < nums1[i].length; j++)
			{
				nums1[i][j] = xyz.nextInt();
			}
		}
		//inset value in second array
		System.out.printf("Enter the value in second array\n");
		for(int i =0; i < nums2.length; i++)
		{
			for(int j = 0; j < nums2[i].length; j++)
			{
				nums2[i][j] = xyz.nextInt();
			}
		}
		
		// multiplication of two array
		/* 
			this is the mathematical formula to calculate the matrix multiplication
			C=A×B
					3
		   C[i][j]= ∑   A[i][k]×B[k][j]; 
				   k=1
		*/
		for(int i = 0; i < sum.length; i++)
		{
			for(int j = 0; j < sum[i].length; j++)
			{
				int add = 0; // this store the multiplication of number
				for(int k = 0 ; k < sum.length ; k++)
				{
					add += nums1[i][k]*nums2[k][j] ;
				}
				sum[i][j] = add; // store that multiplication and addition on third matrix
			}
		}
		// display the matrix
		System.out.printf("Array\n");
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