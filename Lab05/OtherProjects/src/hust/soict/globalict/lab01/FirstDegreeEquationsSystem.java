package hust.soict.globalict.lab01;
import java.util.Scanner;
public class FirstDegreeEquationsSystem {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Calculating the system of two equations: a11x1 + a12x2 = b1 and a21x1 + a22x2 = b2");
		System.out.print("Enter a11, a12, b1, a21, a22, b2: ");
		double a11 = keyboard.nextDouble();
		double a12 = keyboard.nextDouble();
		double b1 = keyboard.nextDouble();
		double a21 = keyboard.nextDouble();
		double a22 = keyboard.nextDouble();
		double b2 = keyboard.nextDouble();
		double det, det1, det2;
		det = a11*a22-a21*a12;
		det1 = b1*a22-b2*a12;
		det2 = a11*b2-a21*b1;
		if (det != 0) {
			System.out.println("x1 = " + det1/det);
			System.out.println("x2 = " + det2/det);
		}
		else {
			if (det1 != 0 || det2 != 0) System.out.println("No solution");
			if (det1 == 0 && det2 == 0) System.out.println("Infinite solution");
		}
	}
}
