package oops;

public class SuperKeyWordUse extends SuperKeywordUseParent{

	SuperKeyWordUse()
	{
		super();//implicitly call the parent constructor
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyWordUse sku=new SuperKeyWordUse();
		sku.display();
		
	}
	public void display()
	{
		//super(); cannot call from method
		System.out.println(super.name);
	}

}
