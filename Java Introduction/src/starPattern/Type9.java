package starPattern;
/*
Print following Pattern:
 *       *
  *     *
   *   *
    * *
     *
    * *
   *   *
  *     *
 *       *
 */
public class Type9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(i==j ||(i+j)==8)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
