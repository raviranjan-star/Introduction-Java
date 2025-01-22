package starPattern;
/*
Print following Pattern:
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 
 */
public class Type17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)
		{
			int temp=i+1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(temp+" ");
				temp=temp+(4-j);
			}
			System.out.println();
		}
	}

}
