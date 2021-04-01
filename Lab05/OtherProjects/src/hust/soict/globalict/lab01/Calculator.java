package hust.soict.globalict.lab01;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		double sum, sub, mul, div;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = keyboard.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = keyboard.nextDouble();
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		System.out.println("Sum = " + sum);
		System.out.println("Difference: " + sub);
		System.out.println("Product: " + mul);
		if (num2 == 0) System.out.println("Quotient error");
		else System.out.println("Quotient: " + div);
	}
}
