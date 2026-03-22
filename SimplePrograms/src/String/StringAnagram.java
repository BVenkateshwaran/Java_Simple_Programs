package String;
import java.util.*;
public class StringAnagram {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s1 = "Race";
		String s2 = "Care";
		s1 = s1.trim().toLowerCase();
		s2 = s2.trim().toLowerCase();
		char [] a = s1.toCharArray();
		char [] b = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean flag = Arrays.equals(a, b);
		if(flag)
			System.out.println("It is an Anagram");
		else
			System.out.println("It is not an Anagram");
	}
}
