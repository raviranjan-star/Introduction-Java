package simpleCoding;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int x=s.nextInt(),temp=x,rem,rev=0;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.print("Reverse Number is : "+rev);
		s.close();
	}

}
