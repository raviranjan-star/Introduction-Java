package starPattern;
/*
Print following Pattern:
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 
 */
public class Type3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=1;k<=4;k++)
		{
			for(int l=5-k;l>0;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
