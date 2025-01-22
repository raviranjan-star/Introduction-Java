package simpleCoding;

public class TribonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a=0;
				int b=0;
				int c=1;
				int d;
				for(int i=1;i<=10;i++)
				{
					System.out.print(a+" ");
					d=a+b+c;
					a=b;
					b=c;
					c=d;
				}
	}

}
