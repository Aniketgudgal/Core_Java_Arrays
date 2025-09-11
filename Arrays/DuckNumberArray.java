/*
Q21. Write a java program to find duck number of a array.
*/
import java.util.Scanner;
public class DuckNumberArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		//find duck number
		System.out.printf("Duck numbers in array is: ");
		for(int i = 0; i < a.length; i++)
		{
			int rem;
			int b = a[i]; // store in the b variable because the original variable should not becomes zero
			// set flag variable to diplay the number is duck
			boolean flag = false;
			while(b != 0)
			{
				rem = b % 10; // separate out each digit
				if(rem == 0) // checking with zero
				{
					flag = true; // if found flag becomes true
					break;
				}
				b = b / 10; // removing digit
			}
			
			if(flag)// checking flag variable value
			{
				System.out.print(" "+a[i]);
			}
		}
	}
}