package sortingProgram;

public class BubbleSortString {

	public static void main(String[] args) {
			String[] arr={"Ravi","Ranjan","Rohit","Apple"};
			for(int i=0;i<arr.length-1;i++)
			{
				boolean flag=false;
				for(int j=0;j<arr.length-1-i;j++)
				{
					if(arr[j].compareTo(arr[j+1])>0)
					{
						String temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						flag=true;
					}
				}
				if(flag==false)
				{
					break;
				}
			}
			for(int k=0;k<arr.length;k++)
			{
				System.out.print(arr[k]+" ");
			}
	}

}
