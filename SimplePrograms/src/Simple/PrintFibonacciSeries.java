package Simple;
import java.util.Scanner;

public class PrintFibonacciSeries
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 1,second = 1,third = 0;
		
		System.out.println("Enter the number of terms you wanted : ");
		int n = sc.nextInt();
		
		System.out.print(first+" ");
		System.out.print(second+" ");
		
		for(int i=1;i<=n-2;i++)
		{
			third = first+second;
			System.out.print(third+" ");
			first = second;
			second = third;
		}
	}

}
