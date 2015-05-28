package algo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ArraysSort {

	
	public static void main(String[] args) {
		int len = 100;
		int range =100;
		Integer[] t = new Integer[len];
		Random r = new Random();
		for(int i=0;i<len;i++) {
			t[i] = (Integer) r.nextInt(range);
		}
		
		for(int i=0;i<len;i++) {
			System.out.print(t[i]+",");
		}
		System.out.println("");
		
		Arrays.sort(t, new Comparator<Integer>(){
			
			public int compare(Integer i, Integer j) {
				if(i<j) {
					return -1;
				}
				if(i>j) {
					return 1;
				}
				return 0;
			}
		
		});
		
		for(int i=0;i<len;i++) {
			System.out.print(t[i]+",");
		}

	}
	
	
}
