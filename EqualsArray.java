/*
3.Write a program to check if two arrays are equal (same elements in the same order).
*/
import java.util.Scanner;
public class EqualsArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		
		System.out.printf("\nEnter the %d value in array 1\n",num1.length);
		for(int i = 0; i < num1.length; i++)
		{
			num1[i] = xyz.nextInt();
		}
		System.out.printf("\nEnter the %d value in array 2\n",num2.length);
		for(int i = 0; i < num2.length; i++)
		{
			num2[i] = xyz.nextInt();
		}
		
		//sort array
		int i = 0, j = 0;
		while(i < num1.length)
		{
			j = i;
			while(j < num1.length)
			{
				if(num1[i] > num1[j])
				{
					num1[i] = num1[i] + num1[j];
					num1[j] = num1[i] - num1[j];
					num1[i] = num1[i] - num1[j];
				}
				j++;
			}
			i++;
		}
		// sort array 2
		i = 0;
		j = 0;
		while(i < num2.length)
		{
			j = i;
			while(j < num2.length)
			{
				if(num2[i] > num2[j])
				{
					num2[i] = num2[i] + num2[j];
					num2[j] = num2[i] - num2[j];
					num2[i] = num2[i] - num2[j];
				}
				j++;
			}
			i++;
		}
		//display array 1
		
		j = 0;
		while(j < num1.length)
		{
			System.out.printf(" %d",num1[j]);
			j++;
		}
		System.out.printf("\n");
		j = 0;
	
		//display array 2
		while(j < num2.length)
		{
			System.out.printf(" %d",num2[j]);
			j++;
		}
		boolean flag = true;
		for(int k = 0; k < num1.length;k++)
		{
			if(num1.length != num2.length)
			{
				flag = false;
				break;
			}
			else
			{
				if(num1[k] != num2[k])
				{
					flag = false;
					break;
				}
			}
		}
		String srt = flag ? "\nThe arrays are equals":"\nThe arrays are not equals";
		System.out.printf("%s",srt);
	}
}