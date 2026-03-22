package String;
import java.util.*;
public class ReverseString {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = "hello";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev += s.charAt(i);
		}
		System.out.println(rev);
	}
}
