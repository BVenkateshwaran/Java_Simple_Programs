package String;
import java.util.*;
public class String_Check
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		String s = "Hello";
		System.out.println("Enter string data to check : ");
		String s1 = sc.nextLine();
		if(s1 == s)
			System.out.println("String Address is the same");
		else
			System.out.println("String address is not the same");
		
		if(s.equals(s1))
			System.out.println("String values are the same");
		else
			System.out.println("String values are not the same");
	}
}