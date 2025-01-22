package simpleCoding;
import java.util.Scanner;

public class LargerOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Three Differnt Number with Space :  ");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		if(x>y)
		{
			if(x>z)
			{
				System.out.println(x+" is Greater than "+z+" and "+y);
			}
			else
			{
				System.out.println(z+" is Greater than "+x+" and "+y);
			}
			
		}
		else
		{
			if(y>z)
			{
				System.out.println(y+" is Greater than "+x+" and "+y);
			}
			else
			{
				System.out.println(z+" is Greater than "+x+" and "+y);
			}
		}
		
		s.close();
	}

}
