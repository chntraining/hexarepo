package com.hexaware.mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEg {

	public static void main(String[] args) throws IOException {
		System.out.println("Main Started");

		try {
			int z = 0;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter a");
			int a = Integer.parseInt(br.readLine());
			System.out.println("Enter b");
			int b = Integer.parseInt(br.readLine());

			z = a / b;
			System.out.println(z);
		} catch (NumberFormatException nfe) {
			System.out.println("DOnt give character input");
		} catch (ArithmeticException ae) {
			System.out.println("DOnt divide by 0");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally block executed....");
		}
		System.out.println("Main Ends");
	}

}
