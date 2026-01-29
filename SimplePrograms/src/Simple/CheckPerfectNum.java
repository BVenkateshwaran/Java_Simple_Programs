package Simple;

import java.util.Scanner;

public class CheckPerfectNum {
	static Scanner sc = new Scanner(System.in);
	
	public static boolean check(int num)
	{
		int sum=0;
		if(num == 1)
		{
			return false;
		}
		
		for (int i = 1; i < num; i++)
		{	
			if(num%i == 0)
			{
				System.out.println(i);
				sum = sum+i;
				System.out.println("The sum is : "+sum);
			}
		}
		if(sum == num)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a num : ");
		int num = sc.nextInt();
		boolean flag = check(num);
		if(flag)
		{
			System.out.println("It is a perfect number!");
		}
		else
		{
			System.out.println("It is not a perfect number!");
		}

	}

}
