package String;

import java.util.*;

public class PrintFirstSingleCharacterFrequency {

	public static Character solve(String s)
	{
		Map<Character, Integer> m = new LinkedHashMap<Character,Integer>();
		
		for(Character c : s.toCharArray())
		{
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : m.entrySet())
		{
			if(entry.getValue() == 1)
			{
				return entry.getKey();
			}
		}
		
		return null;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s = "geeksforgeeks";
		Character c = solve(s);
		
		if(c!=null)
			System.out.println("The First non-repeating character : "+c);
		else
			System.out.println("No non-repeating character is present");

	}

}
