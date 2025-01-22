import java.util.Scanner;
public class OddAndEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int x=s.nextInt();
		if(x%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
		s.close();
	}

}
