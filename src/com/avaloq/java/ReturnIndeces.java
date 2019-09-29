package com.avaloq.java;

public class ReturnIndeces {
	public static void main(String[] args) {
		int[] Array = {2,7,11,15};
		int target = 9;
		int[] result = returnIndeces(Array,target);
		System.out.println(result[0] + " And " + result[1]);
	}
	public static int[] returnIndeces(int[] intArray, int target) {
		 int complement;
	        for (int x = 0; x<intArray.length; x++) {
	            complement = target - intArray[x];
	            for (int y = 0; y<intArray.length; y++) {
	                if (x ==  y) {
	                	continue;
	                }
	                if (intArray[y] == complement) {
	                    return new int[] {x, y};
	                }
	            }
	        }
			return null;
	    }
}
