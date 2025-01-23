package Oops;

public class InitializeObject {

	String name;
	int age;
	char gender;
	
	InitializeObject(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		System.out.println("Name : "+name);//initialized by Constructor
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializeObject io=new InitializeObject("Ravi Ranjan");
		io.age=30;//initialized by instance 
		System.out.println("Age : "+io.age);
		io.run('m');
	}
	void run(char gender)
	{
		this.gender=gender;
		System.out.println("Gender : "+this.gender);
	}

}
