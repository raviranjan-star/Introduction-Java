package arraysCode;

import java.util.Arrays;

public class ArrayCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[3];										//1st Method
		arr[0]=20;
		arr[1]=23;
		arr[2]=98;
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr1=new int[] {23,5,6,8,66,45,35,24};				//2nd Method
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2={23,5,6,8,66,45,35,24};							//3nd Method
		System.out.println(Arrays.toString(arr2));
		
	}

}
