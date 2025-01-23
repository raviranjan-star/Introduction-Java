package exceptionHandling;

public class ThrowsThrowUse extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ThrowsThrowUse(String msg)
	{
		super(msg);
	}
	public static void main(String [] args) throws InterruptedException
	{
		ThrowsThrowUse ttu=new ThrowsThrowUse("Ravi");
		Thread.sleep(1000);
		ttu.run();
	}
	void run()
	{
		throw new ThrowsThrowUse("Exception thrown by user");
	}
	
}
