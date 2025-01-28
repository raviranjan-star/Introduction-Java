package stringCode;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age="20";
		String arrgument ="true";
		String num="20.91";
		String charcter="c";
		
		int new_age=Integer.parseInt(age);
		boolean new_arr=Boolean.parseBoolean(arrgument);
		float new_num=Float.parseFloat(num);
		char c=charcter.charAt(0);
		
		System.out.println(new_age+" , "+new_arr+" , "+new_num+" , "+c);
		}

}
