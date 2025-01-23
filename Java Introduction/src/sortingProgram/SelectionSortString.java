package sortingProgram;

public class SelectionSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"Ravi","Ranjan","Rohit","Apple"};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}

}
