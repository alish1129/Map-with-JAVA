// Alish Dhamala
// w0675205
package programmingAssignment02;

import java.util.Scanner;

public class enterInput {

	public static void moveMaker() {
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter your x-cordinate you want to travel to");
		int x = in.nextInt(); 

		System.out.println("Please enter your y-cordinate you want to travel to");
		int y = in.nextInt();
		
		forBonus.addPosition(x, y); // Storing the coordinates to trace it if the user chooses option 4 on whatNext method. 
		
		in.close();
		

	}

	public static void calDirection(int x, int y) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the x coordinate of the position you’d like to find the direction to:");
		int c = in.nextInt(); 

		System.out.println("Enter the y coordinate of the position you’d like to find the direction to:");
		int d = in.nextInt();
		
		String answer="";
		
		int a = c - x; // Subtracting the x-coordinates, where x is the current coordinate and c is the coordinate where the user is traveling to. 
		int b = d - y; // Subtracting the y-coordinates, where y is the current coordinate and d is the coordinate where the user is traveling to.
		
		if (b < 0) //  b-
			answer += "South";
		if (b > 0) //  b+
			answer += "North";
		if (a > 0)  // a+ 
			answer+= "East";
		if (a < 0) // a- 
			answer += "West";
		
		System.out.println("To travel from (" + x + "," + y + ") to (" + c + "," + d + ") you need to move: " + answer);
		
		mapAssignment.whatNext(x,y); // Restarting it from whatNext method. 
		
		in.close();
	}

	
}	