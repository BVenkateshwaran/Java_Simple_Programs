package String;
import java.util.*;

public class ReverseOnlyCharacterInString
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = "hi@how#you";
		System.out.println(s);
		String s1 = solve(s);
		System.out.println(s1);
	}
	public static String solve(String s)
	{
		char ch [] = s.toCharArray();
		int l=0,r=ch.length-1;
		while(l<r)
		{
			if(Character.isLetter(ch[l]) && Character.isLetter(ch[r]))
			{
				char temp = ch[l];
				ch[l] = ch[r];
				ch[r] = temp;
				l++;
				r--;
			}
			if(Character.isLetter(ch[l]) == false)
				l++;
			if(Character.isLetter(ch[r]) == false)
				r--;
		}
		String s1 = new String(ch);
		return s1;
	}
}
