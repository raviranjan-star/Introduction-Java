import java.util.Scanner;
public class LargerOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Two Number with Space :  ");
		int x=s.nextInt();
		int y=s.nextInt();
		if(x>y)
		{
			System.out.println(x+" is Greater than "+y);
		}
		else if(y>x)
		{
			System.out.println(y+" is Greater than "+x);
		}
		else
		{
			System.out.println("Both Number are Equal");
		}
		s.close();
	}

}
