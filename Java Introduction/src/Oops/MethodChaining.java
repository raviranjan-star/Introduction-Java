package Oops;

public class MethodChaining {
	int x;
	int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodChaining mc=new MethodChaining();
		mc.run(12,24).display();
	}
	public MethodChaining run(int x,int y) {
		this.x=x;
		this.y=y;
		return this;
	}
	public void display() {
		System.out.print("Method Chaining Addition : "+(x+y));
	}
}