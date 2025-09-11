/*
Q23. Write a java program to find armstrong number of a array. 
*/
import java.util.Scanner;
public class ArmstrongNumberInArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		// accept size of array
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.printf("\nEnter the value in array\n");
		// insert value in array
		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.printf("Armstrong number in Array is: ");
		for(int i = 0; i < num.length; i++)
		{
			// store the array value 
			int b = num[i];
			int count = 0;
			while(b != 0)
			{
				count++; // digit counting 
				b /= 10;
			}
			b = num[i];
			// calculating sum of all digit with the digit power
			int sum = 0;
			while(b != 0)
			{
				int rem = b % 10; // accept each digit
				sum += (Math.pow(rem,count)); // give the no. of digit power to each number
				b /= 10; // remove the last digit
			}
			if(sum == num[i]) // check all digit sum is equal or not
			{
				System.out.print(" "+num[i]);
			}
		}
		
	}
}