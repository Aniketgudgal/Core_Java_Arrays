/*
Check Palindrome Using Two Pointers
Check if a string is a palindrome using the two-pointer approach.
*/
public class PalindromeString
{
	public static void main(String x[])
	{
		String src[] = new String[] {"A","N","G","K","A"};
		int j = src.length - 1;
		System.out.println(j);
		boolean flag = true;
		for(int i = 0; i < src.length && (j >= (src.length)/2); i++)
		{
			System.out.println();
			if(src[i] != src[j])
			{
				flag = false;
				break;
			}
			j--;
		}
		if(flag)
		{
			System.out.println("The String is palindrome");
		}
		else
		{
			System.out.println("The String is not palindrome");
		}
	}
}