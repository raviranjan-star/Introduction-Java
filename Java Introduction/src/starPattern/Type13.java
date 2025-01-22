package starPattern;
/*
Print following Pattern:
1
2 3
4 5 6 
7 8 9 
10 11 12
 
 */
public class Type13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=1;
		for(int i=0;i<5;i++)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}

}
