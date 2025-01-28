package String;
import java.util.Scanner;
public class ChracterOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Word : ");
		String word=s.nextLine();
		int[] arr=new int[127];
		for(int i=0;i<word.length();i++)
		{
			arr[word.charAt(i)]=arr[word.charAt(i)]+1;
		}
		char maxOccur=word.charAt(0);
		for(int j=0;j<word.length();j++)
		{
			if(arr[word.charAt(j)]>arr[maxOccur])
			{
				maxOccur=word.charAt(j);
			}
		}
		System.out.println("Max Occur Charater : "+maxOccur);
		s.close();
	}
}
