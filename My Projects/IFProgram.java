
import java.util.Scanner;

class IfProgram{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println (" Pleas Enter Your Age: ");
		int age = in.nextInt();

		if(age>=21 & < 40){
			System.out.println( " You are eligible to get married");
		}
		else if(age>=41){
			System.out.println( "You are eligible to get married !");
		}
		
		else {
			System.out.println (" You are not eligible to get married!");
		}
	}
}