package String;
import java.util.*;
public class StringPangram {
	static Scanner sc = new Scanner(System.in);
	
	public static boolean checkPangram(String s)
	{
		s = s.toLowerCase();
		char [] a = s.toCharArray();
		boolean [] alpha = new boolean[26];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] >= 'a' && a[i]<='z')
			{
				int index = a[i]-97;
				alpha[index] = true;
			}
		}
		
		System.out.println(Arrays.toString(alpha));
		
		for(int i=0;i<alpha.length;i++)
		{
			if(alpha[i] == false)
				return false;
		}
		
		return true;
	}
	
	public static boolean checkPangramUsingIndexOf(String s)
	{
		s = s.toLowerCase();
		for(char ch='a';ch<='z';ch++)
		{
			if(s.indexOf(ch) == -1)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkPangramUsingHashSet(String s)
	{
		s=s.toLowerCase();
		char [] a = s.toCharArray();
		HashSet <Character> hs = new HashSet<Character>();
		for(char ch:a)
		{
			if(ch >= 'a' && ch <= 'z' )
				hs.add(ch);
		}
		return hs.size() == 26;
	}
	
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		//boolean flag = checkPangram(s);
		//boolean flag = checkPangramUsingIndexOf(s);
		boolean flag = checkPangramUsingHashSet(s);
		if(flag)
			System.out.println("It is a Pangram");
		else
			System.out.println("It is not a Pangram");
	}
}
