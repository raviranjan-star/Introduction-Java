package starPattern;
/*
Print following Pattern:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 
 */
public class Type10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)
		{
			int temp=1;
			for(int j=i;j>=0;j--)
			{
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}

}
