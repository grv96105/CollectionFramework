package com.collections.framework.ComparableAndComparator;

import java.util.Arrays;
import java.util.Collections;

public class Array2DComparator {

	public static void main(String[] args) {
		
		//	Given: 2D array and assume its a symmetric 2D array 3x3, 4x4, 5x5
		int a[][] = {{5,3,7,9}, 
					 {5,3,7,2}, 
					 {2,5,6,4},
					 {2,3,4,5}};

	
	
		// Ques 1: Sort the 2D array on the basis of its first Element
		// solution : Bcoz we have int array we have to use Array.sort 
		Arrays.sort(a, (arr1, arr2)->{
			return arr1[0]-arr2[0];
		});
		
		System.out.println("Ques 1 Solution : ");
		for(int i[] : a) {
			for(int e : i) {
				System.out.print(e+",");
			}
			System.out.println();
		}
		
	/*
	 * Ques 2: Sort the 2D array on the basis of its first Element and if first
	 * element is equal then sort by 2nd element and so on.
	 */
		
		Arrays.sort(a, (arr1, arr2)->{
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i]==arr2[i]) {
					for(int j=i+1; j< arr1.length; j++) {
						if(arr1[j]!=arr2[j]) {
							return arr1[j] - arr2[j];
						}
					}
				} else {
					return arr1[i] - arr2[i];
				}
			}
			return 0;
		});
		
		System.out.println("Ques 2 Solution : ");
		for(int i[] : a) {
			for(int e : i) {
				System.out.print(e+",");
			}
			System.out.println();
		}
	}
}
