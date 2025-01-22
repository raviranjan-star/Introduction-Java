package starPattern;
/*
Print following Pattern:
1
1 2 1
1 2 3 2 1 
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 
 */
public class Type14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)
		{
			int temp=0;
			for(int j=i;j>=0;j--)
			{
				temp++;
				System.out.print(temp+" ");
				
			}
			for(int k=i;k>0;k--)
			{
				temp--;
				System.out.print(temp+" ");
			}
			System.out.println();
		}
	}

}
