package encapsulation;

public class Demo extends AbstractDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		System.out.println("Name : "+d.getterMethod());
		d.settermethod("Demo");
		System.out.print("Name : "+d.getterMethod());
		
	}

}
