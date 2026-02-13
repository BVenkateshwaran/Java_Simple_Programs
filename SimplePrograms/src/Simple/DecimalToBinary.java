package Simple;
import java.util.Scanner;

public class DecimalToBinary
{
	static Scanner sc = new Scanner(System.in);
	
	public static int decimalToBinary(int d)
	{
		int b [] = new int [100];
		int binary = 0;
		int i=0;
		while(d!=0)
		{
			b[i] = d%2;
			d = d/2;
			i++;
		}
		
		for(int j = i-1;j>=0;j--)
		{
//			System.out.print(b[j]);
			binary = binary*10;
			binary = binary + b[j];
//			System.out.println("Binary : "+binary);
		}
		
		return binary;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter a decimal number : ");
		int d = sc.nextInt();
		int b = decimalToBinary(d);
		System.out.println("Decimal "+d+" : "+b+" Binary");
	}

}
