import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Year :" );
		int x=s.nextInt();
		System.out.println(x);
		if((x%400==0) || (x%4==0 && x%100 !=0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Ordinary Year");
		}
		s.close();
	}

}
