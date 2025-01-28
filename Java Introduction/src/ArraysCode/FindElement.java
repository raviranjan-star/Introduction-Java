package ArraysCode;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {244,56,68,54,436,78,365,58,435,67};
		int no=79;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==no)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(no+" is present in the Array");
		}
		else
		{
			System.out.println(no+" is not present in the Array");
		}
	}

}
