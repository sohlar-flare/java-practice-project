
package javaPractice
import java.util.Scanner;

public class main
{
	public static void main(String[] args){
	System.out.println("Select chapter: ");
	
	Scanner userResponse = new Scanner(System.in);
	int chapterResponse = userResponse.nextInt();
	
	switch(chapterResponse)
		case 1:
			System.out.println("Select problem: ");
			int chapterResponse = userResponse.nextInt();
			
				switch(chapterResponse)
				
					case 1:
					break;
			
			break;
			
		case 2:
			System.out.println("Still under maintenance :)");
			break;
			
	
	}
}

