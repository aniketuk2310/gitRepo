import java.util.Arrays;
// 1. Calculate the average of given array.
/*
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
*/

// 2. Find the second largest number in the given array. 
/*
class Practice{
	public static void main(String...args){
		//int arr[] = {10,10,10,10,10};
		//int arr[] = {10,20,30,40,50};
		int arr[] = {10,42,33,4,50};
		
		Arrays.sort(arr);
		
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]!=arr[arr.length-1]){
				System.out.println(arr[i]+" is 2nd largest");
				return;
			}
		}
	}
}
*/
// 3. Find the second minimum number in the given array. 
/*
class Practice{
	public static void main(String...args){
		//int arr[] = {10,10,10,10,10};
		//int arr[] = {10,20,30,40,50};
		int arr[] = {10,42,33,4,50};
		
		Arrays.sort(arr);
		int x = arr[1];
		System.out.println(x+"2nd minimum");
		
	}
}
*/
/*
class Practice{
	public static void main(String...args){
		
		int arr[] = {10,42,33,4,50};
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-(1+i);j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		int x = arr[1];
		System.out.println(x+" 2nd minimum");
	}
}
*/

// 4. Find the missing Number in the given array of 1 to N.
/*
class Practice{
	public static void main(String...args){
		
		int arr[] = {1,2,3,5};
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		
		int n = arr.length+1;
		
		int sum1 = n*(n+1)/2;
		
		System.out.println(sum1);
		
		System.out.println("diff : "+(sum1-sum));
	}
}
*/

// 5. Write a Java Program to find the Intersection of two arrays.
/*
class Practice{
	public static void main(String...args){
		
		int arr1[] = {1,2,3,5};
		int arr2[] = {6,2,9,5};
		int sum = 0;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
*/

//6. Write a Java Program to find the Intersection of Two Sortedarrays. 
/*
class Practice{
	public static void main(String...args){
		
		int arr1[] = {1,2,3,5};
		int arr2[] = {3,5,6,7,8};
		int sum = 0;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
*/

// 7. Write a Java Program to find the Union of Two Arrays (UnSorted Array). 

import java.util.*;

//Use Hashset ==> unique values(distinct),null not allowed, sorted

/*
class Practice{
	
	public static void main(String...args){
		
		int arr1[] = {1,4,3,5};
		int arr2[] = {3,6,9,5};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i< arr1.length;i++){
			set.add(arr1[i]);
		}
		for(int i=0; i< arr2.length;i++){
			set.add(arr2[i]);
		}
		
		System.out.println(set.toString());	//[1, 3, 4, 5, 6, 9]
	}
}
*/

/*
// HashMaps are in order according to the key.
class Practice{
	
	public static void main(String...args){
		
		int arr1[] = {1,4,3,5};
		int arr2[] = {3,6,9,5};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i< arr1.length;i++){
			map.put(arr1[i],i);
		}
		for(int i=0; i< arr2.length;i++){
			map.put(arr2[i],i);
		}
		
		for(Map.Entry mapElement : map.entrySet()){
			
			System.out.print(mapElement.getKey() + " ");
         
			// mp will contain only distinct
			// elements from array a and b
		}
	}
}
*/

// 8. Write a Java Program to find the Union of Two Arrays (Sorted Arrays). 


//Use Hashset ==> unique values(distinct),null not allowed, sorted

/*
class Practice{
	
	public static void main(String...args){
		
		int arr1[] = {1,2,3,5};
		int arr2[] = {3,5,6,7,8};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i< arr1.length;i++){
			set.add(arr1[i]);
		}
		for(int i=0; i< arr2.length;i++){
			set.add(arr2[i]);
		}
		
		System.out.println(set.toString());
	}
}
*/
/*
// HashMaps are in order according to the key.
class Practice{
	
	public static void main(String...args){
		
		int arr1[] = {1,2,3,5};
		int arr2[] = {3,5,6,7,8};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i< arr1.length;i++){
			map.put(arr1[i],i);
		}
		for(int i=0; i< arr2.length;i++){
			map.put(arr2[i],i);
		}
		
		for(Map.Entry mapElement : map.entrySet()){
			
			System.out.print(mapElement.getKey() + " ");
         
			// mp will contain only distinct
			// elements from array a and b
		}
	}
}
*/


// 10. Write a Java Program to Move all Zero to End of the Array.
/*
class Practice{
	
	public static void shift(int arr[],int n){
		
		int count = 0;
		
		for(int i=0;i<n;i++){
			if(arr[i] != 0 ){
				arr[count] = arr[i];
				count++	;			
			}
		}// [2, 5, 3, 6, 7, 8, 6, 7, 8]
		
		while(count<n){
			arr[count] = 0;
			count++;
		}// [2, 5, 3, 6, 7, 8, 0, 0, 0]
	}
	
	public static void main(String...args){
		
		int arr[] = {0,2,0,5,3,0,6,7,8};

		shift(arr,arr.length);
		
		System.out.println(Arrays.toString(arr));	//[2, 5, 3, 6, 7, 8, 0, 0, 0]
	}
}
*/


// 11. Write a Java Program to Move all Zeros to Start of the Array.

class Practice{
	
	public static void shift(int arr[],int n){
		
		int count = n;
		
		for(int i=n;i>0;i--){
			if(arr[i] != 0 ){
				arr[count] = arr[i];
				count--	;			
			}
		}// [0, 2, 0, 2, 5, 3, 6, 7, 8]
		
		while(count>0){
			arr[count] = 0;
			count--;
		}	// [0, 0, 0, 2, 5, 3, 6, 7, 8]
	}
	
	public static void main(String...args){
		
		int arr[] = {0,2,0,5,3,0,6,7,8};

		shift(arr,arr.length-1);
		
		System.out.println(Arrays.toString(arr));	// [0, 0, 0, 2, 5, 3, 6, 7, 8]
	}
}













