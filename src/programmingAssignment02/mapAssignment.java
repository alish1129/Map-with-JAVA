// Alish Dhamala
// w0675205
package programmingAssignment02;

import java.util.Scanner;

public class mapAssignment {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		initialValue();
		in.close();

	}

	public static void initialValue() {

		Scanner in = new Scanner(System.in);

		System.out.println("Welcome! What coordinates are you at?");

		System.out.print("Please Enter the X-cordinate:");
		int x = in.nextInt();

		System.out.print("Please enter the Y-cordinate:");
		int y = in.nextInt();
		forBonus.addPosition(x, y);
		whatNext(x, y);

		in.close();
	}

	public static void whatNext(int x, int y) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("\n Okay, you are at position" + " (" + x + "," + y + ")" + ", what would you like to do now?\n"
				+ "1. Move to a new position.\n" + "2. Calculate the direction of a new position.\n"
				+ "3. Make a note about the current position.\n" + "4. Retrace your steps.\n" + "5. Exit");
		int choice = in.nextInt();

		if (choice == 1)
			enterInput.moveMaker();
		if (choice == 2)
			enterInput.calDirection(x, y);	
		if (choice ==3)
			forBonus.keepNotes(x, y);
		if(choice ==4)
			forBonus.stepTrace(x,y);
		if (choice ==5)
			System.out.println("Thank you! Have a nice day!");
		in.close();

	}
}