
import java.util.*;

public class AlgorithmPractices {
	
	public static void main(String[] args) {
		
	}
	
	// Written by Kidus @1/29/2017 10:25pm
	
	// This method takes a list of integers, check numbers by a pair and removes corrupted data.
	// The data is considered corrupted when the left side(#) of the pair is less 
	// than the right one & the last number on the odd size list. 
	public static void clearCorruptData(ArrayList<Integer> list) {
		if (list.size() % 2 != 0) {
			list.remove(list.size() -1 );
		} else {
			for (int i = 0; i < list.size()-1; i+=2) {
				if (list.get(i) < list.get(i+1)) {
					list.remove(i);
					list.remove(i);
				}
			}
		}
	}
	
	// It takes in a list of integers and calculates a range of that list. 
	public static int range(ArrayList<Integer> list){
		if(list.size() > 0){
			int min = list.get(0); 
	        int max = list.get(0); 
	        for(int i = 0; i < list.size(); i++){
	           min = Math.min(min,list.get(i));
	           max = Math.max(max,list.get(i));
	        }
	        return max-min + 1; 
	     } else {
	        return 0; 
	     }
	}
	
	// This method takes a row and column & prints a grid of numbers. 
	public static void printGrid(int row, int col){
	     for(int i = 1; i <= row; i++){
	        System.out.print(i);
	        for(int j = row + 1; j <= col; j++){
	           System.out.print(", " + j);
	        }
	        System.out.println();
	     }
    }
}

