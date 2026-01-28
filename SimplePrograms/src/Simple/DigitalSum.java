package Simple;

import java.util.Scanner;

// Digital Sum

public class DigitalSum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0,l;
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		while(num!=0)
		{
			l = num%10;
			sum = sum+l;
			num = num/10;
		}
		System.out.println("The sum of the digits : "+sum);
	}

}
