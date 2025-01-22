package starPattern;
/*
Print following Pattern:
1 2 3
6 5 4
7 8 9
12 11 10
13 14 15
 
 */
public class Type16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=1;
		for(int i=0;i<5;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(temp+" ");
					temp++;
				}
			}
			else
			{
				int temp2=temp+2;
				for(int j=0;j<3;j++)
				{
					System.out.print(temp2+" ");
					temp2--;
					temp++;
				}
			}
			System.out.println();
		}
	}

}
