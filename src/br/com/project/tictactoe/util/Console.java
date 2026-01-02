package br.com.project.tictactoe.util;

import java.util.Scanner;

public class Console {

	private static final Scanner scanner = new Scanner(System.in);

	public static String readString() {
		return scanner.nextLine();
	}

	public static int readInt() {
		return scanner.nextInt();
	}

	public static double readDouble() {
		return scanner.nextDouble();
	}
}
