package bookExercises;

import javax.swing.JOptionPane;

public class Ex61 {

	public static void main(String[] args) {

		int userInput;

		int[] a = new int[10];

		int[] b = new int[10];

		int[] c = new int[10];

		String userAnswer;

		do {

			for (int i = 0; i < a.length; i++) {

				userInput = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Enter the index " + i + " value of array A"));

				a[i] = userInput;

				System.out.print(a[i] + " ");

			}

			System.out.println();

			for (int i = 0; i < b.length; i++) {

				userInput = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Enter the index " + i + " value of array B"));

				b[i] = userInput;

				System.out.print(b[i] + " ");

			}

			System.out.println();

			int value = c.length - 1;

			for (int i = 0; i < c.length; i++) {

				c[i] = a[i] + b[value];

				value--;

			}

			System.out.println();

			for (int i = 0; i < c.length; i++) {

				System.out.print(c[i] + " ");
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

	}

}
