package algo;

import java.util.Random;

public class QuickSort {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		int len = 100;
		int range = 100;
		Random r = new Random();
		Comparable[] t = new Comparable[len];
		for(int i=0;i<len;i++) {
			t[i] = (Comparable) r.nextInt(range);
		}
		for(int i=0;i<len;i++) {
			System.out.print(t[i]+",");
		}
		System.out.println("");
		sort(t, 0, t.length-1);
		for(int i=0;i<len;i++) {
			System.out.print(t[i]+",");
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sort(Comparable[] t, int low, int high) {
		if(low < high) {
			int index = low+1;
			Comparable pivot = t[index];
			
			t[index] = t[high];
			t[high] = pivot;
			
			int i = low-1;
			int j = high;
			
			do{
				do{
					i++;
				} while(t[i].compareTo(pivot)<0);
				do{
					j--;
				} while(t[j].compareTo(pivot)>0 && j>low);
				
				if (i<j) {
					swap(t, i, j);
				}
			} while(i<j);
			
			
			
			sort(t, low, i-1);
			sort(t, i+1, high);
		}
		
	}

	
	@SuppressWarnings("rawtypes")
	public static void swap(Comparable[] arr, int i, int j){
		Comparable temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
