package com.bl.logicalprograms;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {

		// class object
		StopWatch stopwatch = new StopWatch();
		stopwatch.calculateTime();

	}

	void calculateTime() {
		Scanner sc = new Scanner(System.in);
		long time1 = 0, time2 = 0; // variables to store times of clicks

		System.out.println("Press the \"Enter\" the key twice two measure the time difference between them");

		String input = sc.nextLine(); // stores user input

		if (input.isEmpty()) { // enter key pressed
			time1 = System.currentTimeMillis();
		}

		input = sc.nextLine();
		if (input.isEmpty()) { // enter key pressed
			time2 = System.currentTimeMillis();
		}

		sc.close();
		System.out.println("Diffrence between two clicks is: " + ((int) (time2 - time1) / 1000) + " seconds.");
	}
}
