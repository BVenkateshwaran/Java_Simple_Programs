package Simple;

import java.util.Scanner;

public class HappyNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to check : ");
		int n = sc.nextInt();
		int temp=n,l=0,sum=0;
		while(sum!=1)
		{	
			sum=0;
			while(temp>0)
			{
				l=temp%10;
				sum = sum + (l*l);
				temp=temp/10;
			}
			System.out.println(sum);
			temp=sum;
		}
		if(sum == 1)
			System.out.println(n+" is a Happy Number");
		else
			System.out.println(n+" is not a Happy Number");

	}

}
