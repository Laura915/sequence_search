package com.sequence.sequence_search;

import java.util.*;

//write a Java code to find the longest increasing subsequence 
//from a list of random numbers

public class App 
{
	
	
    public static void main( String[] args )
    {
    	int[] numbers1 = {5,7,9,4,7,94,45,6};
    
      selectionSort(numbers1); 
      removeDuplicates(numbers1);
        
    }
   
    static void selectionSort(int[] numbers ) {
        // Put the number in incrementing order
        // Loop through our numbers
        for (int i = 0; i < numbers.length ; i++) {

            // This is one of those numbers
            int outer = numbers[i];

            // Lets find if we can go lower?
            int lowest = outer;
            int key = i;
            for (int k = i + 1; k < numbers.length; k++) {
                int inner = numbers[k];
                if (inner < lowest) {
                    lowest = inner;
                    key = k;
                }

            }
            // Swap them out
            numbers[i] = lowest;
            numbers[key] = outer;

        }

        for(int i: numbers) {
            System.out.println("Number: " + i);
        }

    }
    
    static void removeDuplicates(int[] numbers ) {
    	ArrayList<Integer> newNums = new ArrayList<Integer>(); // Create an ArrayList object
        
    	for (int j = 1; j < numbers.length ; j++) {
        	if (numbers[j]!= numbers[j-1]) {
        		newNums.add(numbers[j]);
        		}
        	}
    	//Prints integer list w/o duplicates      		
    	for (Integer i : newNums) {
    	      System.out.println(i);
    	    }
    }
    
}
