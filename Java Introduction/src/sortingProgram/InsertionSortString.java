package sortingProgram;

public class InsertionSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {77,57,82,38,23,55,35,87,33};
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[j];
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
