import java.util.Arrays;
// 1. Calculate the average of given array.

class Practice{
	public static void main(String...args){
		//int arr[] = {10,10,10,10,10};
		int arr[] = {10,20,30,40,50};
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		System.out.println("Average : "+sum/arr.length);
	}
}










