import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Word : ");
		String x=s.next(),temp="";
		for(int i=x.length()-1;i>=0;i--)
		{
			temp=temp+x.charAt(i);
		}
		System.out.print("Reverse Word is : "+temp);
		s.close();
	}

}
