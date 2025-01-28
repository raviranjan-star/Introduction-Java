package abstraction;

public class Demo extends AbstractDemo {

	void run() {
		System.out.println("Run method");
	}
	void display() {
		System.out.println("Display method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.run();
		d.display();
	}

}
