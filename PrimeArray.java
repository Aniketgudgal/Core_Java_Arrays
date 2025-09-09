import java.util.Scanner;
public class PrimeArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int n[] = new int[5];
		System.out.printf("Enter the value in array\n");
		for(int i = 0; i < n.length; i++)
		{
			n[i] = xyz.nextInt();
		}
		// check prime number in array
		for(int i = 0; i < n.length; i++)
		{
			int j = 2;
			int num = n[i];
			boolean flag = true;
			while(j < num)
			{
				if(num % j == 0)
				{
					flag = false;
				}
				j++;
			}
			//print the prime numbers
			if(flag)
			{
				System.out.printf(" %d\n",n[i]);
			}
		}
	}
}