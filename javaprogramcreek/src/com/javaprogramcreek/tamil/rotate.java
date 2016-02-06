package com.javaprogramcreek.tamil;

import java.util.Arrays;



public class rotate {
	
	/**
	 * @author http://www.programcreek.com/2015/03/rotate-array-in-java/
	 * O(n)Space and O(n)time
	 */
	public void rotate1(int[] nums, int k) {
	    if(k > nums.length){ 
	        k=k%nums.length;
	        System.out.println("Shift mod value is " + k);
	    }    
	    
	    int[] result = new int[nums.length];
	 
	    for(int i=0; i < k; i++){
	        result[i] = nums[nums.length-k+i];
	        System.out.println("\n 0 to k-1: \n");
	        System.out.println(Arrays.toString(result));
	    }
	 
	    int j=0;
	    for(int i=k; i<nums.length; i++){
	        result[i] = nums[j];
	        j++;
	        System.out.println("\n k to n-1: \n");
	        System.out.println(Arrays.toString(result));
	    }
	 
	    System.arraycopy( result, 0, nums, 0, nums.length );
	    System.out.println("\n Final Result!!! \n");
	    System.out.println(Arrays.toString(nums));
	}
	
	/**
	 * @author tkarunan
	 * Bubble rotate
	 * O(1) Space and O(n*k) time
	 */
	
	public static void rotate2(int[] arr, int order) {
		if (arr == null || order < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		for (int i = 0; i < order; i++) {
			System.out.println("\n\n ******************** \n\n");
			System.out.println("\n print order loop no. :" + i);
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				System.out.println("\n array step by step result \n");
			    System.out.println(Arrays.toString(arr));
			}
		}
	}
		/**
		 * author Reversal
		 * O(1) space and O(n)time
		 * 1. Divide the array two parts: 1,2,3,4 and 5, 6
		 * 2. Rotate first part: 4,3,2,1,5,6
		 * 3. Rotate second part: 4,3,2,1,6,5
		 * 4. Rotate the whole array: 5,6,1,2,3,4
		 */
		public static void reverse(int[] arr, int left, int right){
			if(arr == null || arr.length == 1) 
				return;
		 
			while(left < right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
				System.out.println(Arrays.toString(arr));
			}	
		}
		public static void rotate3(int[] arr, int order) {
			order = order % arr.length;
		 
			if (arr == null || order < 0) {
				throw new IllegalArgumentException("Illegal argument!");
			}
		 
			//length of first part
			int a = arr.length - order; 
		 
			reverse(arr, 0, a-1);
			reverse(arr, a, arr.length-1);
			reverse(arr, 0, arr.length-1);
		 
		}
		 
		
		
	
	
	
	public static void main(String args[]){
		rotate r = new rotate();
		int[] b =new int[]{1,2,3,4,5,6,7,8,9,10,11};
		r.rotate3(b,12);
		
	}
}
