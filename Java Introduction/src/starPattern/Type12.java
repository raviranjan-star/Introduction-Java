package starPattern;
/*
Print following Pattern:
1
12
123
1234
12345
 
 */
public class Type12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)
		{
			int temp=1;
			for(int j=i;j>=0;j--)
			{
				System.out.print(temp);
				temp++;
			}
			System.out.println();
		}
	}

}
