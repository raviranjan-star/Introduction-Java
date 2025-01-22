package starPattern;
/*
Print following Pattern:
 *********
  *******
   *****
    ***
     *
 
 */
public class Type2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=(4-i)*2+1;k>0;k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
