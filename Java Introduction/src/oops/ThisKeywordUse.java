/*
 * Usage
The this keyword is primarily used in the following scenarios:

To refer to the current class instance variable.
To invoke the current class method.
To invoke the current class constructor.
To pass the current object as a parameter to a method.
To return the current object from a method.
To pass the current object as a parameter to a constructor.
To access the outer class instance from an inner class.
 */

package oops;

public class ThisKeywordUse {
	String name;
	int age;
	String cource;
	int roll_no;
	
	ThisKeywordUse(Object obj)
	{
		System.out.println("Object Method");
	}
	ThisKeywordUse(String name)
	{
		System.out.println("Parametrised Constructor");
	}
	ThisKeywordUse()
	{
		this("parametrized");//To invoke the current class constructor.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordUse tku=new ThisKeywordUse();
		tku.initData("Ravi",30,"B.ed",12345);
		
	}
	public void initData(String name,int age,String cource,int roll_no)
	{
		this.name=name;//To refer to the current class instance variable.
		this.age=age;
		this.cource=cource;
		this.roll_no=roll_no;
		System.out.println("Initialized instance variable : "+"Name : "+name);
		this.run();//To invoke the current class method.
		run(this);//To pass the current object as a parameter to a method.
		System.out.println(runMethod());
		
	}
	public void run()
	{
		System.out.println("This Method Called from this keyword");
	}
	public void run(Object ob)
	{
		System.out.println("To pass the current object as a parameter to a method");
	}
	public Object runMethod()
	{
		return this;//To return the current object from a method.
	}

}
