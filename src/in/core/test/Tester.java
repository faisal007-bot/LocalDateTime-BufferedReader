package in.core.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number");
		int num = Integer.parseInt(br.readLine());
		System.out.println("enter the name");
		String name = br.readLine();
		System.out.println(num);
		System.out.println(name);

	}
}
