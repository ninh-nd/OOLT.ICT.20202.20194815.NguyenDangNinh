package hust.soict.globalict.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ConcatAndStringBuffer {
	public static String readFile(String fileName) throws Exception {
		String input = "";
		input = new String(Files.readAllBytes(Paths.get(fileName)));
		return input;
	}
	public static void main(String[] args) throws Exception {
		//Using concatenation
		long start = System.currentTimeMillis();
		String input = readFile("C:\\Users\\admin\\Desktop\\Eclipse-workspace\\OtherProjects\\src\\hust\\soict\\globalict\\garbage\\textfile.txt");
		String output = "";
		for (int i=0; i<input.length(); i++) {
			char a = input.charAt(i);
			output += a;
		}
		System.out.println(System.currentTimeMillis() - start);
		//Using string buffer
		start = System.currentTimeMillis();
		StringBuilder outputByBuffer = new StringBuilder();
		input = readFile("C:\\Users\\admin\\Desktop\\Eclipse-workspace\\OtherProjects\\src\\hust\\soict\\globalict\\garbage\\textfile.txt");
		for (int i=0; i<input.length(); i++) {
			char a = input.charAt(i);
			outputByBuffer.append(a);
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}

