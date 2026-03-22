package String;
import java.util.*;
public class StringPalindromeCheck
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = "malayalam",rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev += s.charAt(i);
		if(s.equals(rev))
			System.out.println("String Palindrome");
		else
			System.out.println("String is not Palindrome");
	}
}
