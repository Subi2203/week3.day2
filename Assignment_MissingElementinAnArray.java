package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment_MissingElementinAnArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
	
		Set<Integer> num = new LinkedHashSet <Integer>();
		
		for (int i = arr[0]; i < arr[arr.length - 1]; i++) {
	        num.add(i);
	    }

	    for (int i = 0; i < arr.length; i++) {
	        num.remove(arr[i]);
	    }

	    for (int x : num) {
	        System.out.print(x + " is the missing element");
	    }			
		
	}

}