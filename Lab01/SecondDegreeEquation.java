import java.util.Scanner;
import java.lang.Math;
public class SecondDegreeEquation {

	public static void main(String[] args) {
		double a, b, c;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Program calculate ax^2+bx+c=0. Enter a: ");
		a = keyboard.nextDouble();
		while (a == 0) {
			System.out.print("Please enter a different from 0: ");
			 a = keyboard.nextDouble();
		}
		System.out.print("Enter b: ");
		b = keyboard.nextDouble();
		System.out.print("Enter c: ");
		c = keyboard.nextDouble();
		double delta = Math.pow(b, 2) - 4*a*c;
		if (delta < 0) System.out.println("The equation has no real root");
		else if (delta == 0) System.out.println("This equation has one root: " + -b/(2*a));
		else {
			System.out.println("This equation has two roots: ");
			System.out.println("x1 = " + (-b-Math.sqrt(delta))/(2*a));
			System.out.println("x2 = " + (-b+Math.sqrt(delta))/(2*a));
		}
	}
}
