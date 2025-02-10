package in.ineuron.hard;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LBP294 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String dobStr = sc.next(); // Read input as string (format: DD/MM/YYYY)

		// Define date format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		// Parse date of birth
		LocalDate dob = LocalDate.parse(dobStr, formatter);
		LocalDate today = LocalDate.now();

		// Calculate age
		long age = ChronoUnit.YEARS.between(dob, today);

		// Determine the vaccination stage
		int stage = (age > 60) ? 1 : (age >= 18) ? 2 : 3;
		System.out.println(stage);

		sc.close();

	}

}
/*
 * Currently government is taking lot of measures to control the spread of
 * Coronavirus. As we have caccine now, many campaigns are done to vaccination.
 * Health dept is identifying the people in each area and
 * recommended/vaccination of them. They are planning three stages stage1: above
 * 60 years stage2: between 18 and 60 stage3: below 18 years
 * 
 * Implement a program to read date of birth of the person and decide he belong
 * to which stage.
 * 
 * Input Format
 * 
 * date of birth
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * 1 or 2 or 3
 * 
 * Sample Input 0
 * 
 * 13/05/1952 Sample Output 0
 * 
 * 1 Sample Input 1
 * 
 * 03/12/1972 Sample Output 1
 * 
 * 2
 */