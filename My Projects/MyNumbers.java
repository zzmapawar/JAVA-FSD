
import java.util.Scanner;
class MyNumbers{
	public static void main(String[] args) {
		Scanner Scan = new Scanner ( System.in);
		System.out.println (" Please enter the number");
		int number = Scan.nextInt();
		switch (number){
		  case 0: System.out.println ("Even");break;
		  case 1: System.out.println ( "Odd");break;
		  case 2: System.out.println ("Even");break;
		  case 3: System.out.println ("Odd");break;
		  case 4: System.out.println ("Even");break;
		  case 5: System.out.println ("Odd");break;
	     default: System.out.println ("Wrong Option");break;
		}
	}
}