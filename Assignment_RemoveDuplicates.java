package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment_RemoveDuplicates {

	public static void main(String[] args) {			
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		ArrayList<String> val = new ArrayList<String>(Arrays.asList(split));
				
		Set<String>str = new LinkedHashSet<String>(val);
		
		for (String word :split) {
			str.add(word);
			
			}
		String string = str.toString();
		System.out.println(string.replace(",", " "));
		}
		
		
	} 
