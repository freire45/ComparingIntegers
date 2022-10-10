package br.com.erickfreire.comparingintegers;

import java.util.Scanner;

public class ComparingIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("Program that compares two integer values: ");
		System.out.print("Enter the first value: ");
		number1 = input.nextInt();
		
		System.out.print("Enter the second value: ");
		number2 = input.nextInt();
		
		if(number1 > number2)
			System.out.printf("The number %d is largest!", number1);
		
		if(number1 < number2)
			System.out.printf("The number %d is largest!", number2);
		
		if(number1 == number2)
			System.out.printf("The numbers %d and %d are equals!", number1, number2);

	}

}
