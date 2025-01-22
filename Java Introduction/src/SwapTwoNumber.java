import java.util.Scanner;
public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Two Number : ");
		int x=s.nextInt();
		int y=s.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Swapped Number is : "+x+" "+y);
		s.close();
	}
}
