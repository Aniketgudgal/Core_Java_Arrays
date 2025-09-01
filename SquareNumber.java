/*
Write a program using for loop to print the square of numbers from 1 to 10.
*/
import java.util.Scanner;
public class SquareNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int num = sc.nextInt();
		int i = 1;
		while(i <= num)
		{
			int j = i;
			System.out.printf("\n[%d : %d]",i,(j*j));
			i++;
		}
		System.out.printf("\n");
	}
}