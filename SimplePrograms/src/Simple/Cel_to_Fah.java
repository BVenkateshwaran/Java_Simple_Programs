package Simple;
import java.util.Scanner;
public class Cel_to_Fah {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter temperature in Celsius : ");
		double cel = sc.nextDouble();
		double fah = (cel * 9.0/5.0) + 32 ;
		System.out.println(cel+" Celsius = "+fah+" Fahrenheit");
	}

}
