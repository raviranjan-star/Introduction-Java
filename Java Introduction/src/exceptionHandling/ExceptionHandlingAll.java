package exceptionHandling;

public class ExceptionHandlingAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=20;
		int no2=2;
		try
		{
			System.out.println("Division :"+(no1/no2));
			System.out.println("Division :"+(no1/0));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.print("Printing by method :"+e.toString());
			System.out.println("Cannot divite by 0");
		}
		finally
		{
			System.out.println("Exception handling Example");
		}
	}

}
