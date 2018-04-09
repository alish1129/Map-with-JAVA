// Alish Dhamala
// w0675205

package programmingAssignment02;
import java.util.ArrayList; 
import java.util.Scanner;

public class forBonus {
	static ArrayList < String > noteList = new ArrayList < String > ();
	
	public static void addPosition (int x , int y) {
		
		noteList.add ("(" + x + "," + y + ")"); //Storing the coordinates for future tracing.
       
		mapAssignment.whatNext(x, y); // Returning to whatNext after storing the coordinates. 
        
	}
	public static void keepNotes (int x, int y) {
		 Scanner input = new Scanner(System.in);
	       
		 System.out.print("Please enter the note here: "); // Taking note as an Input.
	     String note = input.nextLine(); 

	       noteList.add("Note: " + note); //Adding the input in the noteList array.
	       
	       mapAssignment.whatNext(x, y); //Returning to whatNext after storing the notes.
	        
	        input.close();
	}
	public static void stepTrace(int x,int y) {
		
		System.out.println("The coordinates you have been to are: ");
		
		for (int i = 0; i < noteList.size(); i++ ) //Printing the ArrayList 
			System.out.println(noteList.get(i) );
		
     
        mapAssignment.whatNext(x,y); // Returning to whatNext after printing the step traced. 
		
	}
}