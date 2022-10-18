
import java.util.Scanner;

class IfElseDemo{
	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println (" Pleas Enter Your Age: ");
		int age = Scan.nextInt();

		if(age>=60){
			System.out.println( " You are not eligible to get married");
		}
		else if(age>=21){
			System.out.println( "You are eligible to get married !");
		}
		
		else {
			System.out.println (" You are not eligible to get married!");
		}
	}
}