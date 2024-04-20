package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class assignment2 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int rNumber = random.nextInt(100 + 1);

		
		System.out.println("Welcome to the numbers game. Choose a number between 1 and 100!");

		for (int amtGuess = 1; amtGuess < 6; amtGuess++) {

			System.out.println("Choose a number between 1 and 100: ");
			int guess = scanner.nextInt();

			if (guess == rNumber) {
				System.out.println("***YOU WIN***");
				break;
			} else if (amtGuess == 5) {
				System.out.println("GAME OVER! The correct number was " + rNumber);

			} else if (guess < 1 || guess > 100) {
				System.out.println("OOOPs! Please make a guess within range");
				amtGuess--;
			} else if (guess > rNumber) {
				System.out.println("lower!");
			} else if (guess < rNumber) {
				System.out.println("higher");
			} else {
				break;
			}

		}

		scanner.close();

	}
}
