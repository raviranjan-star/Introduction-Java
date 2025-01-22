package simpleCoding;
import java.util.Scanner;
public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int x=s.nextInt();
		for(int i=1;i<=12;i++)
		{
			System.out.println(x+" * "+i+" = "+(x*i));
		}
		s.close();
	}

}
