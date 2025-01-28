package oops;

public class SuperKeywordUseParent {
	String name="Ravi Ranjan";
	
	SuperKeywordUseParent()
	{
		System.out.println("SuperKeywordUseParent Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordUseParent skp= new SuperKeywordUseParent();
		skp.run();
	}
	public void run()
	{
		System.out.println("Run Method Parent Class");
	}

}
