package simpleCoding;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int x=s.nextInt(),temp=x;
		for(int i=x-1;i>1;i--)
		{
			x=x*i;
		}
		System.out.print("Factorial of "+temp+" is "+x);
		s.close();
	}

}
