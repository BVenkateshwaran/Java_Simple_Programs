package String;
import java.util.*;
public class String_case_conversion {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = "Ab$23#Cd";
		String s1 = solve(s);
		System.out.println(s);
		System.out.println(s1);
	}
	public static String solve(String s)
	{
		char [] a = s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='A' && a[i]<='Z')
			{
				a[i] += 32;
			}
			else if(a[i]>='a' && a[i]<='z')
			{
				a[i] -= 32;
			}
		}
		return new String(a);
	}
}
