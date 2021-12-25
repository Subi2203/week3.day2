package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Assignment_PrintDuplicatesinArray {

	public static void main(String[] args) {
				
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		
		Set<Integer>s = new HashSet<Integer>();
		
		for (Integer dup : num) {
			if (s.add(dup)==false) {
				System.out.println("Duplicate number(s) is : "+dup);
				
			}
			
		}	
		

	}

}
