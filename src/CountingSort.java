import java.util.Random;

public class CountingSort {

	
	public static void main(String[] args) {
		int range = 100;
		int len = 50;
		int[] t = new int[len];
		Random r = new Random();
		for(int i=0;i<len;i++) {
			t[i] = r.nextInt(range);
		}
		
		for(int i=0;i<len;i++) {
			System.out.print(t[i]+",");
		}
		System.out.println("");
		
		int[] result = sort(t, range);
		
		for(int i=0;i<len;i++) {
			System.out.print(result[i]+",");
		}
	}
	
	public static int[] sort(int[] t, int range) {

		int len = t.length;
		int[] counts = new int[range];
		int[] output = new int[len];
		
		for(int i=0;i<len;i++) {
			counts[t[i]]++;
		}
		
		int index = 0;
		for(int j=0;j<range;j++) {
			int c = counts[j];
			counts[j] = index;
			index += c;
		}
		
		for(int k=0;k<len;k++) {
			output[counts[t[k]]] = t[k];
			counts[t[k]]++;
		}
		
		return output;
	}

}
