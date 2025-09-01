/*
Move Zeros to End
Move all 0s to the end of the array while maintaining the order of non-zero elements.
*/
public class MovesZero
{
	public static void main(String x[])
	{
		int num[] = new int[] {10, 20 ,50 ,0, 60,80,0,100,101};
		//print the array
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(" "+num[i]);
		}
		System.out.printf("\n");
		//moving value
		int j = num.length - 1;
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] == 0) // checking the value is equal to zero
			{
				int k = i + 1;
				int l = i;
				int temp = num[i];
				while(k != j) // shifting zeros to the right-side
				{
					num[l] = num[k];
					k++;
					l++;
				}
			}
		}
		// display array
		for(int i = 0; i < num.length; i++)
		{
			System.out.printf(" "+num[i]);
		}
		System.out.printf("\n");
	}
}