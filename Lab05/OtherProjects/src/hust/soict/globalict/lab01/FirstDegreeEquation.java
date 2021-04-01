package hust.soict.globalict.lab01;
import java.util.Scanner;
public class FirstDegreeEquation {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Program calculate ax+b=0. Enter a: ");
		double a = keyboard.nextDouble();
		System.out.print("Enter b: ");
		double b = keyboard.nextDouble();
		if (a == 0) {
			if (b == 0) System.out.println("The equation has infinite roots");
			else System.out.println("The equation has no root");
		}
		else System.out.println("Root of the equation: " + -b/a);
	}
}
