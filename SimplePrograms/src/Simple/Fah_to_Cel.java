package Simple;
import java.util.Scanner;
public class Fah_to_Cel {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Fahrenheit in temperature : ");
		double fah = sc.nextDouble();
		double cel = (fah-32) * (5.0/9.0);
		System.out.println(fah+" Fahrenheit = "+cel+" Celsius");
	}

}
