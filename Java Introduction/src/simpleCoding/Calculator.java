package simpleCoding;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print ("Enter Two Number with Space :");
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.print("Enter the Operator: ");
		String ope=s.next();
		switch(ope)
		{
			case "+": System.out.println("Addition of two Number :"+(x+y) );break;
			case "-": System.out.println("Subtraction of two Number :"+(x-y) );break;
			case "*": System.out.println("Multiplication of two Number :"+(x*y) );break;
			case "/": System.out.println("Division of two Number :"+(x/y) );break;
			case "%": System.out.println("Remainder of two Number :"+(x%y) );break;
			
			default : System.out.println("Invalid Data");
		}
		s.close();
	}

}
