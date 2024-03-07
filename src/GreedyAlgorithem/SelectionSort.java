package GreedyAlgorithem;

import java.lang.reflect.Array;

public class SelectionSort {

	
	public static void main(String[] args) {
	int arr []= {10,5,4,-1,500,-2,-500};
	getArraySorted(arr);
	System.out.print("{");
	for(int a:arr) {
		
		System.out.print(a);
		System.out.print(",");
	}
	System.out.print("}");
	
	}

	 static void getArraySorted(int[] arr) {
		 
		 for(int i=0;i<arr.length;i++) {
				 for(int j=i+1;j<arr.length;j++) {
					 if(arr[i]>arr[j]) {
						 int temp=arr[j];
						 arr[j]=arr[i];
						arr[i]=temp;
					 }
				 }
		 	}
	
	}

}
