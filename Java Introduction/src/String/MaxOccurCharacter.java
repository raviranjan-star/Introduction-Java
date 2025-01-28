package String;
import java.util.Scanner;
public class MaxOccurCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Word : ");
		String word=s.nextLine();
		int[] arr=new int[127];
		for(int i=0;i<word.length();i++)
		{
			arr[word.charAt(i)]=arr[word.charAt(i)]+1;
		}
		for(int j=0;j<word.length();j++)
		{
			System.out.println(word.charAt(j)+" : "+arr[word.charAt(j)]);
		}
		s.close();
	}
}
