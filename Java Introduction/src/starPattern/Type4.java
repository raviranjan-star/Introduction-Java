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
public class Type4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int l=1;l<=4;l++)
		{
			for(int m=l;m>0;m--)
			{
				System.out.print(" ");
			}
			for(int n=5-l;n>0;n--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
