/**
 * Created by gzhou on 6/8/15.
 */
public class BoyerMoore {
    public static void main(String[] args) {

        System.out.println(search("This is a simple example;", "simple"));

    }

    public static int search(String source, String pattern) {
        int N = source.length();
        int M = pattern.length();

        int[] lastIndex = new int[256];

        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }
        for (int i = 0; i < M; i++) {
            lastIndex[pattern.charAt(i)] = i;
        }

        int skip;

        for (int i = 0; i < N - M; i += skip) {
            skip = 0;
            for (int j = M - 1; j >= 0; j--) {
                // the index in source string should be i + j
                if (pattern.charAt(j) != source.charAt(i + j)) {
                    skip = Math.max(1, j - lastIndex[pattern.charAt(j)]);
                    break;
                }
            }
            if (skip == 0) {
                return i;
            }
        }

        return -1;
    }
}
