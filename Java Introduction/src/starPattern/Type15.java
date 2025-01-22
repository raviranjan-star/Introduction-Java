package starPattern;
/*
Print following Pattern:
5 4 3 2 1
5 4 3 2
5 4 3 
5 4 
5
 
 */
public class Type15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)
		{
			int temp=5;
			for(int j=(5-i);j>0;j--)
			{
				System.out.print(temp+" ");
				temp--;
			}
			System.out.println();
		}
	}

}
