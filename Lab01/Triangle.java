import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter height: ");
		int height = keyboard.nextInt();
		for (int i = 0; i < height; i++) {
			   for (int j = 0; j < height - i; j++)
			    System.out.print(" ");
			   for (int k = 0; k < (2 * i + 1); k++)
			    System.out.print("*");
			   System.out.println();
			  }
	}
}
