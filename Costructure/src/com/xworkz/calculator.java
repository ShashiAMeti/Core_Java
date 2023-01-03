package com.xworkz;

import java.util.Scanner;

public class calculator {

		public static void main(String[] args) {

			calculator calculator = new calculator();
			Scanner input = new Scanner(System.in);
			System.out.println("entr the operator ");
			String operater = input.nextLine();
			System.out.println(operater);
			System.out.println("entr the firstNumber ");
			double firstNumber = input.nextDouble();
			System.out.println("entr the secondNuber ");
			double secondNuber = input.nextDouble();
			if (operater.equals("-") || operater.equals("+") || operater.equals("*") || operater.equals("/")) {
				// double result = calculator.operation(operater , firstNumber, secondNuber);
				System.out.println(calculator.operation(operater, firstNumber, secondNuber));
			} else {
				System.out.println("choose the correct operator for mathametical operation");
				System.out.println(operater = " <= its a worng ");
			}

		}

		public double operation(String s, double f1, double f2) {

			if (s.equals("-")) {
				System.out.println("Subtraction operation done for given number");
				double result1 = f1 - f2;
				return result1;
			}
			if (s.equals("+")) {
				System.out.println("Addition operation done for given number");

				double result = f1 + f2;
				return result;
			}
			if (s.equals("*")) {
				System.out.println("Multiplication operation done for given number");

				return f1 * f2;
			}
			if (s.equals("/")) {
				System.out.println("Division operation done for given number");

				return f1 / f2;
			}
			return 0;

		}

	}