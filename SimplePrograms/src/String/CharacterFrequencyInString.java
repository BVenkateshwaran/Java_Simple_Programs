package String;
import java.util.*;

public class CharacterFrequencyInString
{
	static Scanner sc = new Scanner(System.in);
	public static void solve(String s)
	{
		s = s.toLowerCase();
		char [] a = s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == ' ')
				continue;
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					count++;
					a[j] =' ';
				}
			}
			System.out.println(a[i]+" : "+count);
		}
	}
	public static void solve2(String s)
	{
		s = s.toLowerCase();
		char [] a = s.toCharArray();
		Map<Character, Integer> f = new HashMap<Character,Integer>();
		for(int i=0;i<a.length;i++)
		{
			f.put(a[i], f.getOrDefault(a[i], 0)+1);
		}
		for(Map.Entry<Character,Integer> entry : f.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("---------------------------------------");
		f.forEach((key,value) -> System.out.println(key+":"+value));
	}
	public static void solve3(String s)
	{
		Map<Character,Integer> m = new LinkedHashMap<Character, Integer>();
		for(Character c: s.toCharArray())
		{
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : m.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	public static void main(String[] args) {
		String s = "hello";
		solve3(s);
	}
}
