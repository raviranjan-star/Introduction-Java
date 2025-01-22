package starPattern;
/*
Print following Pattern:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 
 */
public class Type11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)
		{
			int temp=1+i;
			for(int j=i;j>=0;j--)
			{
				System.out.print(temp+" ");
			}
			System.out.println();
		}
	}

}
