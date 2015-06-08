public class QuickSelect {

	
	public static void main(String[] args) {
				
		int[] t = {2,3,9,1,0,4,6,8,7,5};

		for(int i=0;i<10;i++) {
			System.out.print(t[i]+",");
		}
		System.out.println("");
		
		int re = quickselect(t, 0, 9, 1);
		System.out.println(re);

	}
	
	public static int quickselect(int[] t, int first, int last,int k) {
		
		if (first == last) {
			return t[first];
		}
		
	    int pivot = partition(t, first, last, k);
	    int length = pivot-first+1;
	    
	    if (length==k) {
	    	return t[pivot];
	    } else if (k<length) {
	    	return quickselect(t, first, pivot-1, k);
	    } else {
	    	return quickselect(t, pivot+1, last, k-length);
	    }
	    
	}
	
	public static int partition(int[] t, int first, int last, int k) {
		int i = first-1;
		int j = last;
		
		if(first<last) {
			int index = first + 1;
			int p = t[index];
			
			t[index] = t[last];
			t[last] = p;
			
			do{
				do {
					i++;
				}while(t[i] < p);
					
				do {
					j--;
				}while(t[j] > p && j>first);
				
				if (i < j) {
					swap(t, i, j);
				}
				
			} while(i<j);
			
			t[last] = t[i];
			t[i] = p;
			
		}
		return i;
		
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
