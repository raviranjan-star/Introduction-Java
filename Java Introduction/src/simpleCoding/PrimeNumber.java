package simpleCoding;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number :");
		int x=s.nextInt(),temp=0;
		for(int i=x-1;i>2;i--)
		{
			 if(x%i==0)
			 {
				 temp++;
				 break;
			 }
		}
		if(temp==0)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Ordinary/Non prime Number");
		}
		s.close();
		
	}

}
