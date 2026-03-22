package String;
import java.util.*;
public class Sum_of_Num_in_String {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = "Sy23e6d";
		System.out.println(s);
		int sum = solve(s);
		System.out.println("The sum of numbers in String : "+sum);
	}
	public static int solve(String s)
	{
		char [] a = s.toCharArray();
		int sum=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(a[i]>='0' && a[i]<='9')
			{
				sum = sum +a[i]-48;
				//System.out.println(sum);
			}
		}
		return sum;	
	}
}
